grammar Pmm;	

program: 
       ;

fragment LETTER: [a-zA-Z]
            ;


INT_CONSTANT: '0' | [1-9]+[0-9]*
            ;
DOUBLE_CONSTANT: '0'?'.'[0-9]*
                 | [1-9]+'.'[0-9]*
                 | [1-9]*'.'[0-9]+
                 | [1-9]+('E'|'e')'-'?[1-9]+
                 | '0'?'.'[0-9]*('E'|'e')'-'?[1-9]+
                 | [1-9]+'.'[0-9]*('E'|'e')'-'?[1-9]+
            ;
IDENTIFIER_CONSTANT: (LETTER+'_'?LETTER*)+
            ;

CHAR_CONSTANT : '\''.'\''
                | '\'\\' [tn] '\''
                | '\'\\' INT_CONSTANT '\''
            ;

COMMENT1 : '#'.*? ('\r'|'\n'|EOF) -> skip
            ;
COMMENT2 : '"""'.*?'"""' -> skip
            ;
WHITESPACE: [ \n\r\t]+ -> skip
            ;
