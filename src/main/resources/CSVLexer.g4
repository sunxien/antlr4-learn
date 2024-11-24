lexer grammar CSVLexer;

NEWLINE : '\r'?'\n' ;

WS : [ \r\t\n]+ -> skip ;

DOT : '.' ;
COMMA : ',' ;
SINGLE_QUOTA : '\'' ;
DOUBLE_QUOTA : '"' ;

PLAIN_TEXT : ~[,\r\n"'\\]+ ;

// what is nongreedy subrule?
// e.g: ('\'\''|~'\'')*    and   ('\'\''|~'\'')*?
STRING_VALUE : SINGLE_QUOTA ('\'\'' | ~'\'')* SINGLE_QUOTA
             | DOUBLE_QUOTA ('\\"' | '""' | ~'"')* DOUBLE_QUOTA
             ;

