lexer grammar MathLexer;

@header{
package org.apache.antlr4;
}

WS : [ \r\t\n]+ -> skip ;

NEWLINE : '\r'?'\n' ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;

ASSIGN : '=' ;

INT : DIGIT+ ;

fragment DIGIT : [0-9] ;