package AnalisadorSintatico;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
 LETTER=[a-zA-Z_]+
 DIGIT=[0-9]+
   %{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

("#"(.|\n)*"#" )                { /* ignore comments */ }
[ \t\r]+                        { /* ignore whitespace */ }
[ \n]+                          { /* ignore  line break */  }
(numero|booleano|texto)         { return new Symbol(sym.TIPO_VAR, yychar, yyline, yytext()); }
(verdade|falso)                 { return new Symbol(sym.VAL_BOOLEANO, yychar, yyline, yytext());  }
(e|ou)                          { return new Symbol(sym.OP_LOGICO, yychar, yyline, yytext());}
("+" | "-" | "*" | "%")         { return new Symbol(sym.OP_ARITIMETICOS, yychar, yyline, yytext()); }
("++" | "--")                   { return new Symbol(sym.OP_INCREMENTO, yychar, yyline, yytext()); }
;                               { return new Symbol(sym.PONTO_VIRGULA, yychar, yyline, yytext()); }
\[                              { return new Symbol(sym.ABRE_COLCHETES, yychar, yyline, yytext()); }
\]                              { return new Symbol(sym.FECHA_COLCHETES, yychar, yyline, yytext()); }
\{                              { return new Symbol(sym.ABRE_CHAVES, yychar, yyline, yytext()); }
\}                              { return new Symbol(sym.FECHA_CHAVES, yychar, yyline, yytext()); }
\(                              { return new Symbol(sym.ABRE_PARENTESES, yychar, yyline, yytext()); }
\)                              { return new Symbol(sym.FECHA_PARENTESES, yychar, yyline, yytext()); }
=                               { return new Symbol(sym.OP_ATRIBUICAO, yychar, yyline, yytext()); }
senao                           { return new Symbol(sym.COND_SENAO, yychar, yyline, yytext()); }
se                              { return new Symbol(sym.COND_SE, yychar, yyline, yytext()); }
para                            { return new Symbol(sym.PARA, yychar, yyline, yytext());  }
INICIO                          { return new Symbol(sym.INICIO, yychar, yyline, yytext()); }
FIM                             { return new Symbol(sym.FIM, yychar, yyline, yytext()); }
buscar                          { return new Symbol(sym.BUSCAR, yychar, yyline, yytext()); }
em                              { return new Symbol(sym.EM, yychar, yyline, yytext()); }
substituir                      { return new Symbol(sym.SUBSTITUIR, yychar, yyline, yytext()); }
enquanto                        { return new Symbol(sym.ENQUANTO, yychar, yyline, yytext()); }
por                             { return new Symbol(sym.POR, yychar, yyline, yytext()); }
extrair                         { return new Symbol(sym.EXTRAIR, yychar, yyline, yytext()); }
de                              { return new Symbol(sym.DE, yychar, yyline, yytext());  }
ate                             { return new Symbol(sym.ATE, yychar, yyline, yytext()); }
comprimento                     { return new Symbol(sym.COMPRIMENTO, yychar, yyline, yytext()); }
concatenar                      { return new Symbol(sym.CONCATENAR, yychar, yyline, yytext()); }
comparar                        { return new Symbol(sym.COMPARAR, yychar, yyline, yytext()); }
IFSULDEMINAS                    { return new Symbol(sym.IFSULDEMINAS, yychar, yyline, yytext()); }
COMPILADORES                    { return new Symbol(sym.COMPILADORES, yychar, yyline, yytext()); }
("=="|"!="|"<="|">="|"<"|">")   { return new Symbol(sym.OP_RELACIONAL, yychar, yyline, yytext()); }
{LETTER}({LETTER}|{DIGIT})*     { return new Symbol(sym.VAR, yychar, yyline, yytext());}
(-{DIGIT}+)|{DIGIT}+            { return new Symbol(sym.VAL_INTEIRO, yychar, yyline, yytext());}
\"[^\"]*\"                      { return new Symbol(sym.VAL_TEXTO, yychar, yyline, yytext()); }
 .                              { return new Symbol(sym.ERRO, yychar, yyline, yytext()); }
