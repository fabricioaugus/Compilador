import static analizadorLexico.Tokens.*;
%%
%class Lexer
%type Tokens
LETTER=[a-zA-Z_]+
DIGIT=[0-9]+
%{
    public String lexeme;
%}
%%


\/\/[^\n]*      	{ /* ignore comments */ }
[ \t]+          	{ /* ignore whitespace */ }
\n                              { return QUEBRA_LINHA; }
(numero|booleano|texto)            { lexeme=yytext(); return TIPO_VAR; }
(verdade|falso)                    { lexeme=yytext(); return VAL_BOOLEANO; }
(e|ou)                          { lexeme=yytext(); return OP_LOGICO; }
("+" | "-" | "*" | "%")         { lexeme=yytext(); return OP_ARITIMETICOS; }
("++" | "--")                   { lexeme=yytext(); return OP_INCREMENTO; }
( "\"" )                        { lexeme=yytext(); return ASPAS; }
;                               { lexeme=yytext(); return PONTO_VIRGULA; }
\[                              { lexeme=yytext(); return ABRE_COLCHETES; }
\]                              { lexeme=yytext(); return FECHA_COLCHETES; }
\{                              { lexeme=yytext(); return ABRE_CHAVES; }
\}                              { lexeme=yytext(); return FECHA_CHAVES; }
\(                              { lexeme=yytext(); return ABRE_PARENTESES; }
\)                              { lexeme=yytext(); return FECHA_PARENTESES; }
=                               { lexeme=yytext(); return OP_ATRIBUICAO; }
senao                       { lexeme=yytext(); return COND_SENAO; }
se                          { lexeme=yytext(); return COND_SE; }
para                        { lexeme=yytext(); return PARA; }
INICIO                      { lexeme=yytext(); return INICIO; }
FIM                         { lexeme=yytext();  return FIM; }
buscar                    { lexeme=yytext(); return BUSCAR; }
em                          { lexeme=yytext(); return EM; }
substituir                      { lexeme=yytext(); return SUBSTITUIR; }
por                             { lexeme=yytext(); return POR; }
extrair                         { lexeme=yytext(); return EXTRAIR; }
de                              { lexeme=yytext(); return DE; }
ate                             { lexeme=yytext(); return ATE; }
comprimento                     { lexeme=yytext(); return COMPRIMENTO; }
concatenar                      { lexeme=yytext(); return CONCATENAR; }
comparar                        { lexeme=yytext(); return COMPARAR; }
IFSULDEMINAS                    { lexeme=yytext(); return IFSULDEMINAS; }
COMPILADORES                    { lexeme=yytext(); return COMPILADORES; }
("=="|"!="|"<="|">="|"<"|">")   { lexeme=yytext(); return OP_RELACIONAL; }
{LETTER}({LETTER}|{DIGIT})*     {lexeme=yytext(); return VAR;}
("(-"{DIGIT}+")")|{DIGIT}+      {lexeme=yytext(); return VAL_INTEIRO;}
\"[^\"]*\"                      {lexeme=yytext(); return VAL_TEXTO; }





