grammar ErrorRecoverFile;

options {
    // tokenVocab=CSVLexer;
}

import ErrorRecoverLexer;

group : L_SQUARE_BRACKET expr R_SQUARE_BRACKET
      | L_ROUND_BRACKET expr R_ROUND_BRACKET
      ;

expr : atom XOR_SYMBOL INT ;

atom : ID
     | INT
     ;
