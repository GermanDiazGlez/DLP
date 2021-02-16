grammar Pmm;	

program: 
       ;




INT_CONSTANT: '0' | [1-9]+[0-9]*
            ;
DOUBLE_CONSTANT: '0'?'.'[0-9]*
                 | [1-9]+'.'[0-9]*
                 | [1-9]*'.'[0-9]+
                 | [1-9]+'E''-'?[1-9]+
                 | '0'?'.'[0-9]*'E''-'?[1-9]+
                 | [1-9]+'.'[0-9]*'E''-'?[1-9]+
            ;
IDENTIFIER_CONSTANT: [a-zA-Z]*'_'?[a-zA-Z]*
            ;
COMMENT1 : '#'.*?'\r''\n'EOF-> skip
            ;
COMMENT2 : '"""'.*?'"""' -> skip
            ;

CHAR_CONSTANT : '\n' | '\t' | '\r'
            ;