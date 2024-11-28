grammar JSONFile;

options {
    // tokenVocab=JSONLexer;
}

import JSONLexer;

//@header{
//package org.apache.antlr4;
//}

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

value : TRUE            # Atomic_Val
      | FALSE           # Atomic_Val
      | NULL            # Atomic_Val
      | STRING_VALUE    # String_Val
      | NUMBER_VALUE    # Number_Val
      | object          # Object_Val
      | array           # Array_Val
      ;