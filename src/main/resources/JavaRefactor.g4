grammar JavaRefactor;

options {
    caseInsensitive = true;
    // tokenVocab = CommonLexer;
}

import CommonLexer;

// /** this is a javadoc comment */
// package com.example;
//
// import java.util.List;
// import java.util.Map;
// /** this is a javadoc comment */
// [public|private|protected|default] [static] [final] [abstract] class Student[<String>] [extends Object] [implements Cloneable,Serializable] {
//
// }
classFileDefinition : (packageDeclaration? importDeclaration* classDeclaration) EOF
                    ;


// package com.example;
packageDeclaration : PACKAGE QUALIFIER_NAME SEMICOLON
                   ;


// import java.util.List;
// import java.util.Map;
importDeclaration : IMPORT QUALIFIER_NAME SEMICOLON
                  ;


// /**
//  * This is a comment
//  */
// public [final|abstract] class Student<T>
// protected [final|abstract] class Student<T>
// private [final|abstract] class Student<T> [extends Object] [implements Cloneable,Serializable]
classDeclaration : (PUBLIC|PRIVATE|PROTECTED)? (FINAL|ABSTRACT)? CLASS ID genericType? deriveDeclaration? classBody
                 ;

// List<String>
// List<java.lang.String>
genericType : javaType L_ANGLE_BRACKET javaType R_ANGLE_BRACKET
            ;

// extends Object
// implements Cloneable,Serializable
deriveDeclaration : EXTENDS javaType
                  | IMPLEMENTS javaType (COMMA javaType)*
                  ;

// {
//     int a = 1;
//     public static void hi() {
//     }
// }
classBody : L_BRACE globalVariableDeclaration* methodDeclaration* R_BRACE
          ;

// [public|private|protected] final int a = 0;
// [public|private|protected] static int b = 1;
// [public|private|protected] static final int c = 3;
// [public|private|protected] static int d;
globalVariableDeclaration : (PUBLIC|PRIVATE|PROTECTED)? STATIC FINAL variableDeclaration
                          | (PUBLIC|PRIVATE|PROTECTED)? (FINAL|STATIC)? variableDeclaration
                          ;


// /*
//    This is a comment
//  */
// public static void hi() throws IOException, SQLException
methodDeclaration : annotationDeclaration? (PUBLIC|PRIVATE|PROTECTED)? STATIC FINAL javaType ID methodArguments exceptionDeclaration? methodBody
                  | annotationDeclaration? (PUBLIC|PRIVATE|PROTECTED)? (STATIC|FINAL)? javaType ID methodArguments exceptionDeclaration? methodBody
                  ;

// @Override
// @Deprecated
annotationDeclaration : AT_SYMBOL ID (NEW_LINE AT_SYMBOL ID)*
                      ;


// ()
// (int a, int b)
methodArguments : L_PARENTHESIS R_PARENTHESIS
                | L_PARENTHESIS javaType ID (COMMA javaType ID)* R_PARENTHESIS
                ;


// throws IOException, SQLException
// throws java.io.Closeable
exceptionDeclaration : THROWS javaType (COMMA javaType)
                     ;


// {
//    code snippets
// }
methodBody : L_BRACE codeSnippets R_BRACE
           ;

// declare statement
// condition statement
// return statement
// ... and other statement
codeSnippets : localVariableDeclaration*
             | otherStatements*
             ;

// int a;
// int b = 0;
// final int c = 0;
localVariableDeclaration : FINAL? variableDeclaration
                         ;


// declare statement
// condition statement
// loop statement
// return statement
// ... and other statements
otherStatements : STRING_LITERAL SEMICOLON
                | RETURN (STRING_LITERAL|NULL)? SEMICOLON
                ;


// int a;
// int b = 0;
// String c = "hello";
// char d = '1';
// int e = search("eric", "er');
variableDeclaration : javaType ID SEMICOLON
                    | javaType ID ASSIGN stringValue SEMICOLON
                    ;


// Basic types(int/short) and Boxed Types(Integer/Long)
// Simple Name: List
// Qualifier Name: java.util.List<String>
javaType : VOID
         | ARRAY_TYPE
         ;

stringValue : DOUBLE_QUOTA STRING_LITERAL DOUBLE_QUOTA
            ;