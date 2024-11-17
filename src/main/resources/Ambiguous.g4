grammar Ambiguous;

@header{
package org.apache.antlr4;
}

LEFT_PARENTHESIS : '(' ;
RIGHT_PARENTHESIS : ')' ;

EQUAL : '=' ;

SEMICOLON : ';' ;

// Both Lexer and Parser will generate ambigous problem.
// How does Antlr4 resolve ambigous rule??? Always match the first/longest rule!!!
// The most common ambigous is KEYWORD VS LITERAL. (See at Section 5.5) e.g:
BEGIN : 'begin' ; // match [b-e-g-i-n] sequences

ID : [a-z]+ ; // match all (lower case) letters

INT : [0-9]+ ;

// warn: match an assignment; can match "f();"
//stat : ID EQUAL expr SEMICOLON
//     | ID EQUAL expr SEMICOLON
//     ;
//
//expr : INT ;

// redefine rule like below:

stat : expr SEMICOLON
     | ID '('  ')' SEMICOLON
     ;

expr : ID '(' ')' SEMICOLON
     | INT
     ;

// The ambigous case: 1 + 2 * 3
// In smalltak, program will consume the expr from left to right.
// But antlr4 will recognize this expr with priority. (See at Section 5.4)

// The ambigous case: i * j
// In Clang, this maybe a expr or a pointer declare. (See at Chapter 11)