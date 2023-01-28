/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fabri
 */
public class main {

    public static void main(String[] args) throws Exception {
        String caminho1 = "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/Lexer.flex";
        String caminho2 = "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/LexerCup.flex";
         String[] caminho = {"-parser","Sintax", "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/Sintax.cup"};
        Gerar(caminho1,caminho2,caminho);
       
    }

    public static void Gerar(String caminho1, String caminho2, String[] caminho ) throws IOException, Exception {
        
        File arquivo; 
        arquivo = new File(caminho1);
        
        JFlex.Main.generate(arquivo);
        arquivo = new File(caminho2);
        
        JFlex.Main.generate(arquivo);
        java_cup.Main.main(caminho);
       
       Path rotaSym = Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorLexico/src/codigo/sym.java");
       if(Files.exists(rotaSym)){
           Files.delete(rotaSym);
       }
       
       Files.move(
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/sym.java"),
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/sym.java")
       );
       
         Path rotaSin = Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/Sintax.java");
       if(Files.exists(rotaSin)){
           Files.delete(rotaSin);
       }
        Files.move(
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/Sintax.java"),
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatica/src/codigo/Sintax.java")
       );
    
    }
    
}
