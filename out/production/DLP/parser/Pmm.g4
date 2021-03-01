grammar Pmm;	

program: (funDefinition | varDefinition)+
       ;

type: 'int' | 'char' | 'double'
            ;

varDefinition: ID (','ID)* ':' type ';'
            ;

funParam: ID':' type(','ID':' type)*
            ;

funCall: ID '(' expList? ')' ';'
            ;

returnType: 'return' expression ';'
            ;

funcBody: statement*
            ;

funDefinition: 'def' ID'(' funParam? ')' ':' type? '{' funcBody '}'
            ;

arrayDef: ID ':' ('[' INT_CONSTANT ']')+ type ';'
            ;

array: ID ':' ('[' INT_CONSTANT ']')+ ';'
            ;

arrayAssign: ID ('[' INT_CONSTANT ']')+ '=' expression ';'
            ;

struct: ID ':' 'struct' '{' varDefinition* '}' ';'
            ;

cast: '(' type ')' expression
            ;

unaryMinus: '-' expression
            ;

negation: '!' expression
            ;

expList: expression (','expression)*
            ;

comparator: ('<' | '>' | '<=' | '>=' | '!=' | '==')
            ;

andOr: ('&&' | '||')
            ;

expression: '(' expression ')'
            | '[' expression ']'
            | ID '(' expList? ')'
            | expression '.' ID
            | expression '[' expression ']'
            | cast
            | unaryMinus
            | negation
            | expression ('*' | '/' | '%') expression
            | expression ('+' | '-') expression
            | expression comparator expression
            | expression andOr expression
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            ;

assignment: <assoc=right>expression '=' expression ';'
            ;

bucleW: 'while' expression ':' '{' (varDefinition | statement | funDefinition)* '}'
            ;

ifElse: 'if'  expression (andOr expression)* ':' statement? ('else' statement)?
            ;

printInput: ('print' | 'input') expList ';'
            ;

statement: assignment
            | struct
            | varDefinition
            | funDefinition
            | funCall
            | arrayDef
            | array
            | arrayAssign
            | bucleW
            | ifElse
            | printInput
            | returnType
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
