grammar CymbolFile;

import CymbolLexer;

WS : [ \r\t\n]+ -> skip ;

file : (variableDec | functionDec)+ ;

variableDec :  type ID (ASSIGN expr)? SEMICOLON ;

type : FLOAT_TYPE | INT_TYPE | VOID_TYPE ;

functionDec : type ID L_ROUND_BRACKET formal_parameters? R_ROUND_BRACKET block ; // void f(int x) {...}

formal_parameters : formal_parameter (COMMA formal_parameter)* ;

formal_parameter : type ID ;

block : L_CURLY_BRACKET statement* R_CURLY_BRACKET ;

statement : block
          | variableDec
          | if_statement
          | return_statement
          | assign_statement
          | call_statement
          ;

if_statement : IF expr THEN statement (ELSE statement)? ;
return_statement : RETURN expr SEMICOLON ;
assign_statement : expr ASSIGN expr SEMICOLON ;
call_statement : expr SEMICOLON ;


expr : ID L_ROUND_BRACKET exprList? R_ROUND_BRACKET
     | expr L_SQUARE_BRACKET expr R_SQUARE_BRACKET
     | SUB expr
     | EXCLAMATION_MARK expr
     | expr STAR_MARK expr
     | expr (ADD | SUB) expr
     | expr EQUAL expr
     | ID
     | INT
     | L_ROUND_BRACKET expr R_ROUND_BRACKET
     ;

exprList : expr (COMMA expr)* ;