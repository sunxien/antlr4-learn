grammar CSVFile;

options {
    // tokenVocab=CSVLexer;
}

import CSVLexer;

@header{
package org.apache.antlr4;
}

file : header? rows ;

header : fields ;
rows : fields* ;

fields : field (COMMA field)* NEWLINE? ;

field : PLAIN_TEXT
      | STRING_VALUE
      ;
