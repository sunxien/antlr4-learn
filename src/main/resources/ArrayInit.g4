grammar ArrayInit;

@header{
package org.apache.antlr4;
}

LEFT_BRACE : '{' ;
RIGHT_BRACE : '}' ;

COMMA : ',' ;

DIGIT : [0-9]+ ;

init : LEFT_BRACE value (COMMA value)* RIGHT_BRACE ;

value : init
      | DIGIT
      ;

WS : [ \t\r\n] -> skip ;