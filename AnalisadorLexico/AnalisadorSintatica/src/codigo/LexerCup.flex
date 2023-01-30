package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espaços em Branco */
{espaco} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Aspas */
( "\"" ) {return new Symbol(sym.Aspas, yychar, yyline, yytext());}

/* Tipos de dados */
( byte | int | char | long | float | double | bool) {return new Symbol(sym.T_dado, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.cadeiraString, yychar, yyline, yytext());}

/* Palavra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palavra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palavra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palavra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palavra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Soma */
( "+" ) {return new Symbol(sym.Soma, yychar, yyline, yytext());}

/* Operador Resto */
( "-" ) {return new Symbol(sym.Resto, yychar, yyline, yytext());}

/* Operador Multiplicacao */
( "*" ) {return new Symbol(sym.Multiplicacao, yychar, yyline, yytext());}

/* Operador Divisao */
( "/" ) {return new Symbol(sym.Divisao, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operador Relacional */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribuicao */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribuicao, yychar, yyline, yytext());}

/* Operadores Incremento e decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Abertura do Parentes */
( "(" ) {return new Symbol(sym.Paren_A, yychar, yyline, yytext());}

/* Fechamento do Parentes */
( ")" ) {return new Symbol(sym.Paren_F, yychar, yyline, yytext());}

/* Abertura da Chave  */
( "{" ) {return new Symbol(sym.Chave_A, yychar, yyline, yytext());}

/* Fechamento da Chave */
( "}" ) {return new Symbol(sym.Chave_F, yychar, yyline, yytext());}

/*  Abertura do colchete */
( "[" ) {return new Symbol(sym.Colchete_A, yychar, yyline, yytext());}

/* Fechamento do colchete */
( "]" ) {return new Symbol(sym.Colchete_F, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "begin" ) {return new Symbol(sym.Begin, yychar, yyline, yytext());}

/* Ponto e vergula */
( ";" ) {return new Symbol(sym.Ponto_V, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}