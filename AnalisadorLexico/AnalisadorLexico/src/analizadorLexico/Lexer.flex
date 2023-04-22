import static analizadorLexico.Tokens.*;
import java_cup.runtime.*;
%%
%class Lexer
%type Tokens
%line 
%column 

LETTER=[a-zA-Z_]+
DIGIT=[0-9]+
%{
   
 public String lexeme; 
 public int line;
 public int column;   
%}

%%


("#"(.|\n)*"#" )                { /* ignore comments */ }
[ \t]+                          { /* ignore whitespace */ }
\n                              { /* ignore Line */ }
(numero|booleano|texto)         { lexeme=yytext();line=yyline;column=yycolumn; return TIPO_VAR; }
(verdade|falso)                 { lexeme=yytext();line=yyline;column=yycolumn; return VAL_BOOLEANO; }
(e|ou)                          { lexeme=yytext();line=yyline;column=yycolumn; return OP_LOGICO; }
("+" | "-" | "*" | "%")         { lexeme=yytext();line=yyline;column=yycolumn; return OP_ARITIMETICOS; }
("++" | "--")                   { lexeme=yytext();line=yyline;column=yycolumn; return OP_INCREMENTO; }
( "\"" )                        { lexeme=yytext();line=yyline;column=yycolumn; return ASPAS; }
;                               { lexeme=yytext();line=yyline;column=yycolumn; return PONTO_VIRGULA; }
\[                              { lexeme=yytext();line=yyline;column=yycolumn; return ABRE_COLCHETES; }
\]                              { lexeme=yytext();line=yyline;column=yycolumn; return FECHA_COLCHETES; }
\{                              { lexeme=yytext();line=yyline;column=yycolumn; return ABRE_CHAVES; }
\}                              { lexeme=yytext();line=yyline;column=yycolumn; return FECHA_CHAVES; }
\(                              { lexeme=yytext();line=yyline;column=yycolumn; return ABRE_PARENTESES; }
\)                              { lexeme=yytext();line=yyline;column=yycolumn; return FECHA_PARENTESES; }
=                               { lexeme=yytext();line=yyline;column=yycolumn; return OP_ATRIBUICAO; }
senao                           { lexeme=yytext();line=yyline;column=yycolumn; return COND_SENAO; }
se                              { lexeme=yytext();line=yyline;column=yycolumn; return COND_SE; }
para                            { lexeme=yytext();line=yyline;column=yycolumn; return PARA; }
INICIO                          { lexeme=yytext();line=yyline;column=yycolumn; return INICIO; }
FIM                             { lexeme=yytext();line=yyline;column=yycolumn;  return FIM; }
buscar                          { lexeme=yytext();line=yyline;column=yycolumn; return BUSCAR; }
em                              { lexeme=yytext();line=yyline;column=yycolumn; return EM; }
substituir                      { lexeme=yytext();line=yyline;column=yycolumn; return SUBSTITUIR; }
enquanto                        { lexeme=yytext();line=yyline;column=yycolumn; return ENQUANTO; }
por                             { lexeme=yytext();line=yyline;column=yycolumn; return POR; }
extrair                         { lexeme=yytext();line=yyline;column=yycolumn; return EXTRAIR; }
de                              { lexeme=yytext();line=yyline;column=yycolumn; return DE; }
ate                             { lexeme=yytext();line=yyline;column=yycolumn; return ATE; }
comprimento                     { lexeme=yytext();line=yyline;column=yycolumn; return COMPRIMENTO; }
concatenar                      { lexeme=yytext();line=yyline;column=yycolumn; return CONCATENAR; }
comparar                        { lexeme=yytext();line=yyline;column=yycolumn; return COMPARAR; }
IFSULDEMINAS                    { lexeme=yytext();line=yyline;column=yycolumn; return IFSULDEMINAS; }
COMPILADORES                    { lexeme=yytext();line=yyline;column=yycolumn; return COMPILADORES; }
("=="|"!="|"<="|">="|"<"|">")   { lexeme=yytext();line=yyline;column=yycolumn; return OP_RELACIONAL; }
{LETTER}({LETTER}|{DIGIT})*     { lexeme=yytext();line=yyline;column=yycolumn; return VAR;}
("(-"{DIGIT}+")")|{DIGIT}+      { lexeme=yytext();line=yyline;column=yycolumn; return VAL_INTEIRO;}
\"[^\"]*\"                      { lexeme=yytext();line=yyline;column=yycolumn; return VAL_TEXTO; }
 .                             { lexeme=yytext() ;line=yyline;column=yycolumn; return ERRO;}


