package analizadorLexico;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class GeradorDaLinguagemL {

	public static void main(String[] args) {
		 String rootPath = Paths.get("").toAbsolutePath().toString();
                 System.out.println(" caminho "+rootPath);
                 String lexerFilePath = "/src/analizadorLexico/";
                 String file = rootPath + lexerFilePath + "Lexer.flex";
                 File lexerFile = new File(file);
                 JFlex.Main.generate(lexerFile);
	}

}
