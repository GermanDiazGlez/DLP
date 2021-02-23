grammar Pmm;	

program: (expression | statement)+ EOF
       ;

type: 'int' | 'char' | 'double'
            ;

structDef: (ID ':' type ';')*
            ;

vector: ID ':' ('[' INT_CONSTANT ']')+ type ';'
            ;

vectorAssign: ID ('[' INT_CONSTANT ']')+ '=' expression
            ;

struct: ID ':' 'struct' '{' structDef '}' ';'
            ;
cast: '(' type ')' expression
            ;

comparator: ('<' | '>' | '<=' | '>=' | '!=' | '==')
            ;

condition: expression comparator expression
            ;

expression: '(' expression ')'
            | expression '[' expression ']'
            | expression '.' ID
            | cast
            | '!' expression
            | expression ('*' | '/' | '%') expression
            | expression ('+' | '-') expression
            | expression comparator expression
            | expression ('&&' | '||') expression
            | INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            ;

assignment: expression '=' expression ';'
            ;

definition: ID (','ID)* ':' type ';'
            ;

funDefinition: (ID':' type(','ID':' type)*)?
            ;

funCall: ID '(' (expression (','expression)*)? ')' ';'
            ;

returnType: 'return' expression ';'
            ;

function: 'def' ID'(' funDefinition ')' ':' type? '{' (definition | funCall | assignment | struct)* returnType?'}'
            ;

bucleW: 'while' condition ':' '{' (bucleW | definition | funCall | assignment | struct)* '}'
            ;

statement: assignment
            | struct
            | definition
            | function
            | vector
            | vectorAssign
            | bucleW
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
