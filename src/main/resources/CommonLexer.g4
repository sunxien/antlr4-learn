lexer grammar CommonLexer;

@header{
package org.apache.antlr4;
}

ID : [a-zA-Z]+ ;

DIGIT : [0-9]+ ;
NEW_LINE : '\r'?'\n' ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

EQUAL : '=' ;

LEFT_PARENTHEIS : '(' ;
RIGHT_PARENTHESIS : ')' ;