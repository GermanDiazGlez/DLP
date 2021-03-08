grammar Pmm;

@header{
import ast.*;
import ast.expression.*;
import ast.program.type.*;
import ast.program.definition.*;
import ast.statement.*;
}


program returns [Program ast]: d=definitions m=mainMethod EOF
                { $ast = new Program($d.start.getLine(), $d.start.getCharPositionInLine()+1, $d.ast, $m.ast); }
       ;

mainMethod returns [FuncDefinition ast]: d='def' m='main' '(' ')' ':' '{' v=varDefinitions s=statements '}'
        {$ast = new FuncDefinition($d.getLine(), $d.getCharPositionInLine()+1, $v.ast, $s.ast);}
    ;

definitions returns [List<Definition> ast = new ArrayList<>()]:
            ( vd=varDefinition {$ast.addAll($vd.ast);}
            | fd=funDefinition {$ast.add($fd.ast);})*
    ;
/*
program: (funDefinition | varDefinition)*
        'def' 'main' '(' ')' ':' '{' varDefinition* statement* '}'
        EOF
       ;

program returns [Expression ast]: expression { $ast = $expression.ast; }
            ;
*/



type returns [Type ast]: (bt=builtinType { $ast = $bt.ast; }
       | '[' a=INT_CONSTANT ']' t=type { $ast = new ArrayType($a.getLine(),
                                         $a.getCharPositionInLine()+1,
                                         $t.ast,
                                         LexerHelper.lexemeToInt($a.text));}
       | s='struct' '{' f=fields '}' { $ast = new StructType($s.getLine(),
                                         $s.getCharPositionInLine()+1,
                                         $f.ast); } )
            ;

fields returns [List<RecordField> ast = new ArrayList<>()]: (i=ids ':' bt=builtinType ';'
        { for(String id : $i.ast) {
            $ast.add(new RecordField($i.start.getLine(), $i.start.getCharPositionInLine()+1, id, $bt.ast));}
        })*
    ;

builtinType returns [Type ast]: ('int' { $ast = IntType.getInstance(); }
                                | 'char' { $ast = CharType.getInstance(); }
                                | 'double' { $ast = DoubleType.getInstance(); })
            ;

varDefinitions returns [List<VarDefinition> ast = new ArrayList<>()]: (v=varDefinition {$ast.addAll($v.ast);})*
         ;

varDefinition returns [List<VarDefinition> ast = new ArrayList<>()]:
            (i=ids ':' t=type ';' {
                for(String id : $i.ast) {
                    $ast.add(new VarDefinition($i.start.getLine(),
                    $i.start.getCharPositionInLine()+1,
                    $t.ast,
                    id));
                }
            })
            ;

ids returns [List<String> ast = new ArrayList<String>()]: i=ID {$ast.add($i.text);} (','j=ID {$ast.add($j.text);})*
    ;

param returns [VarDefinition ast]: i=ID ':' bt=builtinType
        { $ast = new VarDefinition($i.getLine(), $i.getCharPositionInLine() + 1, $bt.ast, $i.text);}
    ;

funParam returns [List<VarDefinition> ast = new ArrayList<>()]:
            '('p1=param {$ast.add($p1.ast);} (','p2=param {$ast.add($p2.ast);})*')'
            | '('')'
            ;

giveParams returns [List<Expression> ast = new ArrayList<>()]:
                    '('exp1=expression {$ast.add($exp1.ast);} (','exp2=expression {$ast.add($exp2.ast);})*')'
                    | '('')'
                    ;

statements returns [List<Statement> ast = new ArrayList<>()]: (s=statement {$ast.addAll($s.ast);})*
    ;

funDefinition returns [FuncDefinition ast]:
            d='def' i=ID p=funParam c=':' {Type type = VoidType.getInstance();}  (bt=builtinType {type = $bt.ast;})? '{' vd=varDefinitions st=statements '}'
            { $ast = new FuncDefinition($d.getLine(), $d.getCharPositionInLine()+1,
            new FunctionType($c.getLine(), $c.getCharPositionInLine()+1, type, $p.ast),
            $i.text, $vd.ast, $st.ast); }
            ;

/*
funDefinition returns [FuncDefinition ast]:
            d='def' i=ID p=funParam ':' bt=builtinType? '{' vd=varDefinitions st=statements '}'
            { $ast = new FuncDefinition($d.getLine(), $d.getCharPositionInLine()+1,
            new FunctionType($d.getLine(), $d.getCharPositionInLine()+1, $bt.ast, $p.ast),
            $i.text, $vd.ast, $st.ast); }

            | d='def' i=ID p=funParam ':' '{' vd=varDefinitions st=statements'}'
            {$ast = new FuncDefinition($d.getLine(), $d.getCharPositionInLine() + 1,
            new FunctionType($d.getLine(), $d.getCharPositionInLine() + 1, VoidType.getInstance(), $p.ast),
            $i.text, $vd.ast, $st.ast);}
            ;

expList returns [List<Expression> ast = new ArrayList<>()]:
                    (exp1=expression (','expression)* { $ast.add($exp1.ast); } )
            ;
*/

expression returns [Expression ast]: '(' exp=expression ')' { $ast = $exp.ast; }
            | i=ID gp=giveParams { $ast = new Function(
                          $i.getLine(),
                          $i.getCharPositionInLine()+1,
                          new Variable($i.getLine(), $i.getCharPositionInLine()+1, $i.text),
                          $gp.ast
                          );
            }
            | exp=expression '.' ID { $ast = new FieldAccess(
                          $exp.start.getLine(),
                          $exp.start.getCharPositionInLine()+1,
                          $exp.ast, $ID.text
                          );
            }
            | exp1=expression '[' exp2=expression ']' { $ast = new ArrayAccess(
                          $exp1.start.getLine(),
                          $exp1.start.getCharPositionInLine()+1,
                          $exp1.ast, $exp2.ast
                          );
            }
            | CH='(' t=builtinType ')' exp=expression { $ast = new Cast(
                          $CH.getLine(),
                          $CH.getCharPositionInLine()+1,
                          $exp.ast,
                          $t.ast
                          );
            }
            | CH='-' exp=expression { $ast = new UnaryMinus(
                          $CH.getLine(),
                          $CH.getCharPositionInLine()+1,
                          $exp.ast
                          );
            }
            | CH='!' exp=expression { $ast = new Not(
                          $CH.getLine(),
                          $CH.getCharPositionInLine()+1,
                          $exp.ast
                          );
            }
            | exp1=expression OP=('*' | '/' | '%') exp2=expression { $ast = new Arithmetic(
                          $exp1.start.getLine(),
                          $exp1.start.getCharPositionInLine()+1,
                          $exp1.ast, $OP.text, $exp2.ast
                          );
            }
            | exp1=expression OP=('+' | '-') exp2=expression { $ast = new Arithmetic(
                          $exp1.start.getLine(),
                          $exp1.start.getCharPositionInLine()+1,
                          $exp1.ast, $OP.text, $exp2.ast
                          );
            }
            | exp1=expression OP=('<' | '>' | '<=' | '>=' | '!=' | '==') exp2=expression { $ast = new Comparison(
                          $exp1.start.getLine(),
                          $exp1.start.getCharPositionInLine()+1,
                          $exp1.ast, $OP.text, $exp2.ast
                          );
            }
            | exp1=expression OP=('&&' | '||') exp2=expression { $ast = new Logical(
                          $exp1.start.getLine(),
                          $exp1.start.getCharPositionInLine()+1,
                          $exp1.ast, $OP.text, $exp2.ast
                          );
            }
            | INT_CONSTANT { $ast = new IntLiteral($INT_CONSTANT.getLine(),
                          $INT_CONSTANT.getCharPositionInLine()+1,
                          LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
            | REAL_CONSTANT { $ast = new DoubleLiteral($REAL_CONSTANT.getLine(),
                          $REAL_CONSTANT.getCharPositionInLine()+1,
                          LexerHelper.lexemeToReal($REAL_CONSTANT.text)); }
            | CHAR_CONSTANT { $ast = new CharLiteral($CHAR_CONSTANT.getLine(),
                          $CHAR_CONSTANT.getCharPositionInLine()+1,
                          LexerHelper.lexemeToChar($CHAR_CONSTANT.text)); }
            | ID { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
            ;

/*
statement returns [List<Statement> ast = new ArrayList<>()]:
            'if'  expression ':' block ('else' block)?
            | 'while' expression ':' block
            | 'return' expression ';'
            | 'print' expList ';'
            | 'input' expList ';'
            | <assoc=right>expression '=' expression ';'
            | ID '(' expList? ')' ';'
            ;

ifStatement returns [List<Statement> ast = new ArrayList<Statement>()]:
    i='if' exp=expression ':' '{' s1=statements '}' 'else' '{' s2=statements '}'
    {
        $ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine()+1, $exp.ast, $s1.ast, $s2.ast) );
    }

    | i='if' exp=expression ':' st1=statement 'else' st2=statement
    {
        $ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine() + 1, $exp.ast, $st1.ast, $st2.ast) );
    }

    | i='if' e=expression ':' '{' s1=statements '}' 'else' st2=statement
            {$ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine() + 1, $e.ast, $s1.ast, $st2.ast) );}

    | i='if' e=expression ':' st1=statement 'else' '{' s2=statements '}'
            {$ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine() + 1, $e.ast, $st1.ast, $s2.ast) );}

    | i='if' e=expression ':' '{' s1=statements '}'
        {$ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine() + 1, $e.ast, $s1.ast) );}

    | i='if' e=expression ':' st1=statement
        {$ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine() + 1, $e.ast, $st1.ast) );}
    ;


| wh='while' exp=expression ':' b=block
            {$ast.add(new WhileStatement($wh.getLine(), $wh.getCharPositionInLine()+1, $exp.ast, $b.ast));}

returnStatement returns [ReturnStatement ast]: r='return' e=expression ';'
        {$ast = new ReturnStatement($r.getLine(), $r.getCharPositionInLine() + 1, $e.ast);}
    ;

*/



statement returns [List<Statement> ast = new ArrayList<>()]:
    i=ifStatement
        {$ast.addAll($i.ast);}

    | w=whileStatement
        {$ast.addAll($w.ast);}

    | r='return' exp=expression ';'
        {$ast.add(new ReturnStatement($r.getLine(), $r.getCharPositionInLine()+1, $exp.ast));}

    | p='print' exp1=expression {$ast.add(new PrintStatement($p.getLine(), $p.getCharPositionInLine() + 1, $exp1.ast));}
            (','exp2=expression {$ast.add(new PrintStatement($p.getLine(), $p.getCharPositionInLine() + 1, $exp2.ast));})* ';'

    | p='input' exp1=expression {$ast.add(new InputStatement($p.getLine(), $p.getCharPositionInLine() + 1, $exp1.ast));}
            (','exp2=expression {$ast.add(new InputStatement($p.getLine(), $p.getCharPositionInLine() + 1, $exp2.ast));})* ';'

    | exp1=expression '=' exp2=expression ';'
        { $ast.add(new AssignmentStatement($exp1.start.getLine(), $exp1.start.getCharPositionInLine()+1, $exp1.ast, $exp2.ast));}

    | id=ID g=give_params';'
        {$ast.add(new Function($id.getLine(), $id.getCharPositionInLine()+1,
        new Variable($id.getLine(), $id.getCharPositionInLine()+1, $id.text),
        $g.ast));}
    ;

block returns [List<Statement> ast = new ArrayList<>()]: s1=statement {$ast.addAll($s1.ast);} | ('{' s2=statement* '}' {$ast.addAll($s2.ast);})*
            ;


ifStatement returns [List<Statement> ast = new ArrayList<Statement>()]:
    i='if' exp=expression ':' b1=block 'else' b2=block
    {
        $ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine()+1, $exp.ast, $b1.ast, $b2.ast) );
    }
    |
    i='if' exp=expression ':' b1=block
    {
        $ast.add(new IfElseStatement($i.getLine(), $i.getCharPositionInLine()+1, $exp.ast, $b1.ast) );
    }
;


whileStatement returns [List<Statement> ast = new ArrayList<>()]:
    wh='while' exp=expression ':' '{' st=statements '}'
        {$ast.add(new WhileStatement($wh.getLine(), $wh.getCharPositionInLine()+1, $exp.ast, $st.ast));}

    | wh='while' exp=expression ':' s=statement
        {$ast.add(new WhileStatement($wh.getLine(), $wh.getCharPositionInLine()+1, $exp.ast, $s.ast));}
    ;

give_params returns [List<Expression> ast = new ArrayList<Expression>()]:
                    '('exp1=expression {$ast.add($exp1.ast);} (','exp2=expression {$ast.add($exp2.ast);})*')'
                    | '('')'
                    ;


fragment LETTER: [a-zA-Z]
            ;

INT_CONSTANT: '0' | [1-9]+[0-9]*
            ;

REAL_CONSTANT: '0'?'.'[0-9]*
                 | [1-9]+'.'[0-9]*
                 | [1-9]*'.'[0-9]+
                 | [1-9]+('E'|'e')'-'?[1-9]+
                 | '0'?'.'[0-9]*('E'|'e')'-'?[1-9]+
                 | [1-9]+'.'[0-9]*('E'|'e')'-'?[1-9]+
            ;

ID: ('_' | LETTER)(LETTER | [0-9] | '_')*
            ;

CHAR_CONSTANT: '\''.'\''
                | '\'\\' [tn] '\''
                | '\'\\' INT_CONSTANT '\''
            ;

COMMENT1: '#'.*? ('\r'|'\n'|EOF) -> skip
            ;

COMMENT2: '"""'.*?~["""]'"""' -> skip
            ;

WHITESPACE:[ \n\r\t]+ -> skip
            ;
