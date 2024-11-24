lexer grammar BasicLexer;

DOUBLE_QUOTA : '"' ;
SINGLE_QUOTA : '\'' ;
DOT : '.' ;
COMMA : ',' ;
SEMICOLON : ';' ;
SLASH : '/' ;
BACK_SLASH : '\\' ;
ASSIGN : '=';
AT : '@' ;
COLON : ':' ;

ADD : '+' ;
SUB : '-' ;
MUL : ASTERISK ;
DIV : '/' ;
MOD : PERCENT ;

STAR_MARK : ASTERISK ;
DASH_MARK : '-' ;
NUMBER_MARK : '#' ;
TILDE_MARK : '~' ;
EXCLAMATION_MARK : '!' ;
AND_MARK : '&' ;
DOLLAR_MARK : '$' ;
PERCENT_MARK : PERCENT ;
QUESTION_MARK : '?' ;

NEWLINE : '\r'?'\n' ;

L_ROUND_BRACKET : '(' ;
R_ROUND_BRACKET : ')' ;

L_SQUARE_BRACKET : '[' ;
R_SQUARE_BRACKET : ']' ;

L_CURLY_BRACKET : '{' ;
R_CURLY_BRACKET : '}' ;

L_ANGLE_BRACKET : '<' ;
R_ANGLE_BRACKET : '>' ;

INT : DIGIT+ ;

FLOAT : DIGIT+ DOT DIGIT*
      | DOT DIGIT+
      ;

STRING : DOUBLE_QUOTA (ESC|.)*? DOUBLE_QUOTA  ;

SINGLE_LINE_COMMENT : '//' .*? NEWLINE -> skip ; // // this is single line comments
MULTIPLE_LINE_COMMENT : '/**' .*? '*/' -> skip ; // /** this is multiple line comments */
JAVA_DOC_COMMENT : '/*' .*? '*/' -> skip ; // /* this is multiple line comments */

WS : [ \r\t\n]+ -> skip ;
// WS : [ \r\t\n]+ -> channel(HIDDEN) ;

fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;
fragment ESC : '\\' [rtnb"\\] ;

fragment A : [aA] ;
fragment B : [bB] ;
fragment C : [cC] ;
fragment D : [dD] ;
fragment E : [eE] ;
fragment F : [fF] ;
fragment G : [gG] ;
fragment H : [hH] ;
fragment I : [iI] ;
fragment J : [jJ] ;
fragment K : [kK] ;
fragment L : [lL] ;
fragment M : [mM] ;
fragment N : [nN] ;
fragment O : [oO] ;
fragment P : [pP] ;
fragment Q : [qQ] ;
fragment R : [rR] ;
fragment S : [sS] ;
fragment T : [tT] ;
fragment U : [uU] ;
fragment V : [vV] ;
fragment W : [wW] ;
fragment X : [xX] ;
fragment Y : [yY] ;
fragment Z : [zZ] ;

fragment PERCENT : '%' ;
fragment ASTERISK : '*' ;