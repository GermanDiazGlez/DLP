grammar Pmm;	

program: (expression | statement)+ EOF
       ;

type: 'int' | 'char' | 'double'
            ;
cast: '(' type ')' expression
            ;

expression: '(' expression ')'
            | expression '[' expression ']'
            | expression '.' ID
            | cast
            | '!' expression
            | expression ('*' | '/' | '%') expression
            | expression ('+' | '-') expression
            | expression ('<' | '>' | '<=' | '>=' | '!=' | '==') expression
            | expression ('&&' | '||') expression
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            ;

assignment: expression '=' expression ';'
            ;

statement: assignment
            | definition
            | function
            ;

definition: ID (','ID)* ':' type ';'
            ;

funDefinition: (ID':' type(','ID':' type)*)?
            ;

funCall: ID '(' (expression (','expression)*)? ')' ';'
            ;

returnType: 'return' expression ';'
            ;

function: 'def' ID'(' funDefinition ')' ':' type? '{' (definition | funCall | assignment)* returnType?'}'
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
