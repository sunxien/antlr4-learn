grammar SimpleJavaFile;

options {
    // tokenVocab=CSVLexer;
}

import SimpleJavaLexer;

prog : classDef+ ;


classDef : CLASS ID L_CURLY_BRACKET member* R_CURLY_BRACKET
           {
               System.out.println("class: " + $ID.getText());
           }
         ;


member : INT_TYPE ID SEMICOLON
         {
             System.out.println("found member: int " + $ID.getText() + ";");
         }
       | INT_TYPE f=ID L_ROUND_BRACKET INT_TYPE ID R_ROUND_BRACKET L_CURLY_BRACKET stat* R_CURLY_BRACKET
         {
             System.out.println("found member: int " + $f.getText() + "(int " + $ID.getText() + ")");
         }
       ;


// $stat.text (Note: Antlr4.3+ $ctx.getText())
stat : expr SEMICOLON
       {
           System.out.println("found expr: " + $ctx.getText());
       }
     | ID ASSIGN expr SEMICOLON
       {
           System.out.println("found assign: " + $ctx.getText());
       }
     ;

expr : INT
     | ID L_ROUND_BRACKET INT R_ROUND_BRACKET
     ;