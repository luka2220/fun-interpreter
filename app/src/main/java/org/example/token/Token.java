package org.example.token;

public class Token {
    // NOTE:
    // All possible token types
    public static final String ILLEGAL = "ILLEGAL";
    public static final String EOF = "EOF";
    public static final String IDENT = "IDENT";
    public static final String INT = "INT";
    public static final String ASSIGN = "=";
    public static final String PLUS = "+";
    public static final String COMMA = ",";
    public static final String SEMICOLON = ":";
    public static final String LPAREN = "(";
    public static final String RPAREN = ")";
    public static final String LBRACE = "{";
    public static final String RBRACE = "}";
    public static final String FUNCTION = "FUNCTION";
    public static final String LET = "LET";

    String type;
    String literal;
}