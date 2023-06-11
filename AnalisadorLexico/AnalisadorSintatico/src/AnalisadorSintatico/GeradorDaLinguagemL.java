package AnalisadorSintatico;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author fabri
 */
public class GeradorDaLinguagemL {

    public static void main(String[] args) throws Exception {
        String caminho1 = "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/Lexer.flex";
        String caminho2 = "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/LexerCup.flex";
         String[] caminho = {"-parser","Sintax", "C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/Sintax.cup"};
        Gerar(caminho1,caminho2,caminho);
       
    }

    public static void Gerar(String caminho1, String caminho2, String[] caminho ) throws IOException, Exception {
        
        File arquivo1 = new File(caminho1);
        JFlex.Main.generate(arquivo1);
        File arquivo2 = new File(caminho2);
        JFlex.Main.generate(arquivo2);
        
        java_cup.Main.main(caminho);
       
       Path rotaSym = Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/sym.java");
       if(Files.exists(rotaSym)){
           Files.delete(rotaSym);
       }
       
       Files.move(
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/sym.java"),
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/sym.java")
       );
       
         Path rotaSin = Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/Sintax.java");
       if(Files.exists(rotaSin)){
           Files.delete(rotaSin);
       }
        Files.move(
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/Sintax.java"),
        Paths.get("C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorSintatico/src/AnalisadorSintatico/Sintax.java")
       );
    
    }
    
}
