grammar JSONFile;

options {
    // tokenVocab=JSONLexer;
}

import JSONLexer;

@header{
package org.apache.antlr4;
}

json : object NEWLINE*
     | array NEWLINE*
     ;

object : L_CURLY_BRACKET pair (COMMA pair)* R_CURLY_BRACKET
       | L_CURLY_BRACKET R_CURLY_BRACKET // empty object. e.g: {}
       ;

array : L_SQUARE_BRACKET value (COMMA value)* R_SQUARE_BRACKET
      | L_SQUARE_BRACKET R_SQUARE_BRACKET // empty array. e.g: []
      ;

pair : key COLON value
     ;

key : STRING_VALUE ;

value : TRUE
      | FALSE
      | NULL
      | STRING_VALUE
      | NUMBER_VALUE
      | object
      | array
      ;