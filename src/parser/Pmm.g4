grammar Pmm;

@header{
import ast.*;
import ast.expression.*;
import ast.program.*;
import ast.statement.*;
}

/*

program: (funDefinition | varDefinition)+
       ;

*/

program returns [Expression ast]: expression { $ast = $expression.ast; }
            ;

type: builtinType
       | '[' INT_CONSTANT ']' type
       | 'struct' '{' varDefinition* '}'
            ;

builtinType: 'int' | 'char' | 'double'
            ;

varDefinition: ID (','ID)* ':' builtinType ';'
            ;

funParam: ID':' builtinType(','ID':' builtinType)*
            ;

funCall: ID '(' expList? ')' ';'
            ;

funDefinition: 'def' ID'(' funParam? ')' ':' builtinType? '{' statement* '}'
            ;

expList: expression (','expression)*
            ;

expression returns [Expression ast]: '(' expression ')'
            | ID '(' expList? ')'
            | expression '.' ID
            | expression '[' expression ']'
            | '(' type ')' expression
            | '-' expression
            | '!' expression
            | expression ('*' | '/' | '%') expression
            | exp1=expression OP=('+' | '-') exp2=expression { $ast = new Arithmetic(
                          $exp1.ast.getLine(),
                          $exp1.ast.getColumn(),
                          $exp1.ast,
                          $OP.text,
                          $exp2.ast); }
            | expression ('<' | '>' | '<=' | '>=' | '!=' | '==') expression
            | expression ('&&' | '||') expression
            | INT_CONSTANT { $ast = new IntLiteral($INT_CONSTANT.getLine(),
                          $INT_CONSTANT.getCharPositionInLine()+1,
                          LexerHelper.lexemeToInt($INT_CONSTANT.text)); }
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID { $ast = new Variable($ID.getLine(), $ID.getCharPositionInLine()+1, $ID.text); }
            ;


assignment: <assoc=right>expression '=' expression ';'
            ;

ifElse: 'if'  expression ':' (statement | statement*) ('else' statement | statement*)?
            ;

statement: ifElse
            | 'while' expression ':' '{' statement* '}'
            | 'return' expression ';'
            | 'print' expList ';'
            | 'input' expList ';'
            | assignment
            | funCall
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
