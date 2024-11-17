// You can't open this comment!!!
/* parser */ grammar Expression;

// Aways use common lexer
import CommonLexer;

//ID : [a-z]+ ;
//
//DIGIT : [0-9]+ ;
//NEW_LINE : '\r'?'\n' ;
//
//ADD : '+' ;
//SUB : '-' ;
//MUL : '*' ;
//DIV : '/' ;
//
//EQUAL : '=' ;
//
//LEFT_PARENTHEIS : '(' ;
//RIGHT_PARENTHESIS : ')' ;

prog : stat +;

stat : expr NEW_LINE # Target_Label
     | ID EQUAL expr NEW_LINE # Assign_Label
     | NEW_LINE # None_Label
     ;

expr : expr (MUL | DIV) expr # MulAndDiv_Label
     | expr (ADD | SUB) expr # AddAndSub_Label
     | DIGIT # Number_Label
     | ID # Variable_Label
     | LEFT_PARENTHEIS expr RIGHT_PARENTHESIS # ComplexExpr_Label
     ;