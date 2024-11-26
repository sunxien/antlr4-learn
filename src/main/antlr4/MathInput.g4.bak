grammar MathInput;

import MathLexer;

// 1. visitor with Label
// 2. define stack in Listener
// 3. annotated ```returns [int value]```
expr returns [int value]
     : expr (MUL | DIV) expr NEWLINE? # Mul_Div
     | expr (ADD | SUB) expr NEWLINE? # Add_Sub
     | INT # Get_Int
     ;