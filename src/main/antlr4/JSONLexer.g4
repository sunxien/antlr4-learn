lexer grammar JSONLexer;

WS : [ \r\t\n]+ -> skip ;

NEWLINE : '\r'?'\n' ;

ADD : '+' ;
SUB : '-' ;

DOT : '.' ;
COMMA : ',' ;
COLON : ':' ;
DOUBLE_QUOTA : '"' ;

SLASH : '/' ;
BACK_SLASH : '\\' ;

L_ROUND_BRACKET : '(' ;
R_ROUND_BRACKET : ')' ;
L_SQUARE_BRACKET : '[' ;
R_SQUARE_BRACKET : ']' ;
L_CURLY_BRACKET : '{' ;
R_CURLY_BRACKET : '}' ;

NULL : 'null' ;
TRUE : 'true' ;
FALSE : 'false' ;

//PLAIN_TEXT : ~[,\r\n"'\\]+ ;

NUMBER_VALUE : (ADD|SUB)? DIGIT DOT DIGIT EXP?
             | (ADD|SUB)? DIGIT EXP?
             | (ADD|SUB)? DIGIT
             ;

// what is nongreedy subrule?
// e.g: ('\'\''|~'\'')*    and   ('\'\''|~'\'')*?
STRING_VALUE : DOUBLE_QUOTA (ESC_CHAR | ~["\\])* DOUBLE_QUOTA
             ;

fragment DIGIT : ZERO | [1-9] [0-9]*;
fragment ZERO : '0' ;
fragment EXP : [Ee] [+\-]? DIGIT ;
fragment ESC_CHAR : '\\' ([rntbf\\"/] | UNICODE) ;
fragment UNICODE : 'u'HEX_CHAR HEX_CHAR HEX_CHAR HEX_CHAR;
fragment HEX_CHAR : [0-9a-fA-F] ;
