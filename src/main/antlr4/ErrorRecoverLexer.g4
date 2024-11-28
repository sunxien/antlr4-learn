lexer grammar ErrorRecoverLexer;


@header{
package org.apache.antlr4;
}

WS : [ \r\t\n]+ -> skip ;


XOR_SYMBOL : '^' ;

L_ROUND_BRACKET : '(' ;
R_ROUND_BRACKET : ')' ;

L_SQUARE_BRACKET : '[' ;
R_SQUARE_BRACKET : ']' ;


ID : LETTER+ ;
INT : DIGIT+ ;


fragment DIGIT : [0-9] ;
fragment LETTER : [a-zA-Z] ;