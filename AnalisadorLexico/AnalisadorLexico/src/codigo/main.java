/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;

/**
 *
 * @author fabri
 */
public class main {

    public static void main(String[] args) {
        String caminho = "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorLexico/src/codigo/Lexer.flex";
        GerarLexer(caminho);
    }

    public static void GerarLexer(String caminho) {
        File arquivo = new File(caminho);
        JFlex.Main.generate(arquivo);

    }

}
