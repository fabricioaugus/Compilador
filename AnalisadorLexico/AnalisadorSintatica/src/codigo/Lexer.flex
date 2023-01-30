package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espaço Ignorado */
{espaco} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Quebra de Linha */
( "\n" ) {return Linha;}

/* Aspas */
( "\"" ) {lexeme=yytext(); return Aspas;}

/* Tipos de dados */
( byte | int | char | long | float | double | bool ) {lexeme=yytext(); return T_dado;}

/* Tipo de dado String */
( String ) {lexeme=yytext(); return cadeiraString;}

/* Palavra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palavra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palavra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palavra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palavra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Soma */
( "+" ) {lexeme=yytext(); return Soma;}

/* Operador Resto */
( "-" ) {lexeme=yytext(); return Resto;}

/* Operador Multiplicação */
( "*" ) {lexeme=yytext(); return Multiplicacao;}

/* Operador Divisão */
( "/" ) {lexeme=yytext(); return Divisao;}

/* Operadores Logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionais */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores de Atribuição */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribuicao;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/* Operadores Booleanos */
(true | false)      {lexeme = yytext(); return Op_booleano;}

/*  Fechamento do Parentes */
( "(" ) {lexeme=yytext(); return Paren_A;}

/* Fechamento do Parentes  */
( ")" ) {lexeme=yytext(); return Paren_F;}

/* abertura da chave */
( "{" ) {lexeme=yytext(); return Chave_A;}

/* fechamento da chave */
( "}" ) {lexeme=yytext(); return Chave_F;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_A;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_F;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Begin;}

/* Ponto e Virgula */
( ";" ) {lexeme=yytext(); return Ponto_V;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}