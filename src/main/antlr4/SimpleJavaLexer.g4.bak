lexer grammar SimpleJavaLexer;


@header{
package org.apache.antlr4;
}

WS : [ \r\t\n]+ -> skip ;



ASSIGN : '=';
SEMICOLON : ';' ;


L_ROUND_BRACKET : '(' ;
R_ROUND_BRACKET : ')' ;
L_CURLY_BRACKET : '{' ;
R_CURLY_BRACKET : '}' ;


CLASS : 'class' ;
INT_TYPE : 'int' ;
VOID_TYPE : 'void' ;


ID : LETTER+ ;
INT : DIGIT+ ;

fragment DIGIT : [0-9];
fragment LETTER : [a-zA-Z] ;


