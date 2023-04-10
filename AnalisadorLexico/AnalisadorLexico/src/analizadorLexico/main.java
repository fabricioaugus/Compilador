package analizadorLexico;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String lexerFilePath = "CaminhoParaClasseGerarOLexerDoAnalizador";
                String lexerFilePath ="C:/Users/fabri/Desktop/com/Compilador/AnalisadorLexico/AnalisadorLexico/src/analizadorLexico/Lexer.flex";
		lexerGenerate(lexerFilePath);
		
	}
	
	public static void lexerGenerate(String lexerFilePath) {
		File lexerFile = new File(lexerFilePath);
		JFlex.Main.generate(lexerFile);
	}

}
