package TrabalhoRegex;

import java.util.Scanner;

/*
___________________________________________
|    Código de referência: Cidade/Região  |
|    Centro-oeste        200 até 299      |
|    Nordeste            300 até 399      |
|    Norte               400 até 499      |
|    Sudeste             001 até 099      |
|    Sul                 100 até 199      |
|_________________________________________|

033         |  334     |       555           |       999      |  001
ORIGEM         DESTINO   COD. TRANSPORTADORA   COD. VENDEDOR     JÓIAS
_____________________________
|    Tipo do Produto Código |
|       Jóias       001     |
|       Livros      111     |
|       Eletrônicos 333     |
|       Bebidas     555     |
|       Brinquedos  888     |
|___________________________|
* 
_____________________________________________________
|                   Exemplo:                        |
|       Código: 033 334 555 999 001                 |     
|   Região de origem: Cidade 33, região Sudeste     |
|   Região de destino: Cidade 334, região Nordeste  |     
|   Código Transportadora: 555                      |
|   Código do vendedor do produto: 999              |
|   Tipo do produto: Jóias                          |
|___________________________________________________|
EXEMPLOS DE CODIGOS
288355555123888
335333555584333
002111555874555
111333555123333
034311555874001
-- Linguagem usada: Java | IDE usada: Visual Studio Code / IDEA 
*/
public class TrabalhoRegex {
    public static void main(String[] args) {

        ExibirCaracteristicaProjeto();

        System.out.println("Entrar com codigo de barra do Pacote: ");
        Scanner scan = new Scanner(System.in);
        String codigoLido = scan.next();
        String regioesInvalidas = "([5-9][0-9][0-9])";
        String RegioesInexistente = codigoLido.substring(0, 3);
        Boolean RegiaoQueNaoExiste = Boolean.valueOf(String.valueOf(RegioesInexistente.matches(regioesInvalidas)));
        String regioesInvalidasDestino = "([5-9][0-9][0-9])";
        String RegioesInexistenteDestino = codigoLido.substring(3, 6);
        Boolean RegiaoQueNaoExisteDestino = Boolean
                .valueOf(String.valueOf(RegioesInexistenteDestino.matches(regioesInvalidasDestino)));
        if (RegiaoQueNaoExiste || RegiaoQueNaoExisteDestino) {
            System.out.println("Esse codigo de região origem pode não existir   -> "
                    + RegioesInexistente + ".\n Esse codigo de região destino pode não existir-> "
                    + RegioesInexistenteDestino);
            System.out.println("O intervalo valido [1,499] para origem e destino");
        }

        origemCentroOeste(codigoLido);
        origemNordeste(codigoLido);
        origemNorte(codigoLido);
        origemSudeste(codigoLido);
        origemSul(codigoLido);
        destinoCentroOeste(codigoLido);
        destinoNordeste(codigoLido);
        destinoNorte(codigoLido);
        destinoSudeste(codigoLido);
        destinoSul(codigoLido);

        String codigoTransportadora = codigoLido.substring(6, 9);
        System.out.println("Código Da Transportadora: " + codigoTransportadora);
        String codigoDoVendedor = codigoLido.substring(9, 12);

        boolean codigoDoVendedorInvalido = Boolean.parseBoolean(String.valueOf(codigoDoVendedor.matches("367")));
        if (codigoDoVendedorInvalido) {
            System.out.println("O vendedor 367 está com seu CNPJ inativo, considerados inválidos.");
        }
        System.out.println("Código do vendedor do produto: " + codigoDoVendedor);
        tipoDeProduto(codigoLido);
        scan.close();
        RegrasDoProjeto();
    }

    private static void RegrasDoProjeto() {
        System.out.println("\t\t_Regra das Regiões/Cidade ORIGEM e DESTINO_\t\t\n"
                + "\t|    Código de referência: Cidade/Região  |\t\n"
                + "\t|    Sudeste             001 até 099      |\t\n"
                + "\t|    Sul                 100 até 199      |\t\n"
                + "\t|    Centro-oeste        200 até 299      |\t\n"
                + "\t|    Nordeste            300 até 399      |\t\n"
                + "\t|    Norte               400 até 499      |\t\n"
                + "\t|_________________________________________|\t\n");

        System.out.println(" \t\t_Regras Para Tipos de Produtos_\t\t\n"
                + "\t\t|    Tipo do Produto Código |\t\t\n"
                + "\t\t|       Jóias       001     |\t\t\n"
                + "\t\t|       Livros      111     |\t\t\n"
                + "\t\t|       Eletrônicos 333     |\t\t\n"
                + "\t\t|       Bebidas     555     |\t\t\n"
                + "\t\t|       Brinquedos  888     |\t\t\n"
                + "\t\t|___________________________|\t\t\n");
        System.out.println("Observações: O COD. VENDEDOR 367 está inativo e só aceita o intervalo [1,499] de ORIGEM e DESTINO.");
                
    }

    private static void ExibirCaracteristicaProjeto() {
        System.out.printf("\t\t-- Caracteristica Do Projeto --\t\t\n"
                + "Composto por 15 Caracteres e Todos Numero.\n"
                + "O intervalo [1,3] dos Caracteres representa a ORIGEM do produto.\n"
                + "O intervalo [4,6]dos Caracteres representa o DESTINO do produto.\n"
                + "O intervalo [7,9] dos Caracteres representa o COD. da TRANSPORTADORA.\n"
                + "O intervalo [10,12]dos Caracteres representa o COD. do VENDEDOR. \n"
                + "O intervalo [13,15]dos Caracteres representa o Tipo de Produto. \n");
    }

    public static void origemCentroOeste(String codigoLido) {
        String regraParaCentroOeste = "(2[0-9][0-9])";
        String novoSubstring = codigoLido.substring(0, 3);
        Boolean validacaoCentroOeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaCentroOeste)));
        if (validacaoCentroOeste) {
            System.out.println("Região de origem: Cidade " + novoSubstring + ", região Centro Oeste");
        }
    }

    public static void origemNordeste(String codigoLido) {

        String regraParaNordeste = "(3[0-9][0-9])";
        String novoSubstring = codigoLido.substring(0, 3);
        Boolean validacaoNordeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaNordeste)));
        if (validacaoNordeste) {
            System.out.println("Região de origem: Cidade " + novoSubstring + ", região Nordeste");
        }

    }

    public static void origemNorte(String codigoLido) {

        String regraParaNorte = "(4[0-9][0-9])";
        String novoSubstring = codigoLido.substring(0, 3);
        Boolean validacaoNorte = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaNorte)));
        if (validacaoNorte) {
            System.out.println("Região de origem: Cidade " + novoSubstring + ", região Norte");
        }

    }

    public static void origemSudeste(String codigoLido) {

        String regraParaSudeste = "(0[0-9][1-9])";
        String novoSubstring = codigoLido.substring(0, 3);
        Boolean validacaoSudeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaSudeste)));
        if (validacaoSudeste) {
            System.out.println("Região de origem: Cidade " + novoSubstring + ", região Sudeste");
        }
    }

    public static void origemSul(String codigoLido) {

        String regraParaSul = "(1[0-9][0-9])";
        String novoSubstring = codigoLido.substring(0, 3);
        Boolean validacaoSul = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaSul)));
        if (validacaoSul) {
            System.out.println("Região de origem: Cidade " + novoSubstring + ", região Sul");
        }
    }

    // DESTINO
    public static void destinoCentroOeste(String codigoLido) {

        String regraParaCentroOeste = "(2[0-9][0-9])";
        String novoSubstring = codigoLido.substring(3, 6);
        Boolean validacaoCentroOeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaCentroOeste)));
        if (validacaoCentroOeste) {
            System.out.println("Região de destino: Cidade " + novoSubstring + ", região Centro Oeste");
        }

    }

    public static void destinoNordeste(String codigoLido) {

        String regraParaNordeste = "(3[0-9][0-9])";
        String novoSubstring = codigoLido.substring(3, 6);
        Boolean validacaoNordeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaNordeste)));
        if (validacaoNordeste) {
            System.out.println("Região de destino: Cidade " + novoSubstring + ", região Nordeste");
        }
    }

    public static void destinoNorte(String codigoLido) {

        String regraParaNorte = "(4[0-9][0-9])";
        String novoSubstring = codigoLido.substring(3, 6);
        Boolean validacaoNorte = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaNorte)));
        if (validacaoNorte) {
            System.out.println("Região de destino: Cidade " + novoSubstring + ", região Norte");
        }

    }

    public static void destinoSudeste(String codigoLido) {

        String regraParaSudeste = "(0[0-9][1-9])";
        String novoSubstring = codigoLido.substring(3, 6);
        Boolean validacaoSudeste = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaSudeste)));
        if (validacaoSudeste) {
            System.out.println("Região de destino: Cidade " + novoSubstring + ", região Sudeste");
        }
    }

    public static void destinoSul(String codigoLido) {
        String regraParaSul = "(1[0-9][0-9])";
        String novoSubstring = codigoLido.substring(3, 6);
        Boolean validacaoSul = Boolean.valueOf(String.valueOf(novoSubstring.matches(regraParaSul)));
        if (validacaoSul) {
            System.out.println("Região de destino: Cidade " + novoSubstring + ", região Sul");
        }
    }

    public static void tipoDeProduto(String codigoLido) {
        String novoSubstring = codigoLido.substring(12, 15);
        boolean joias = Boolean.parseBoolean(String.valueOf(novoSubstring.matches("001")));
        boolean livros = Boolean.parseBoolean(String.valueOf(novoSubstring.matches("111")));
        boolean eletronicos = Boolean.parseBoolean(String.valueOf(novoSubstring.matches("333")));
        boolean bebidas = Boolean.parseBoolean(String.valueOf(novoSubstring.matches("555")));
        boolean brinquedos = Boolean.parseBoolean(String.valueOf(novoSubstring.matches("888")));
        if (joias)
            System.out.println("Tipo do produto: Jóias");
        else if (livros)
            System.out.println("Tipo do produto: Livros");
        else if (eletronicos)
            System.out.println("Tipo do produto: Eletrônicos");
        else if (bebidas)
            System.out.println("Tipo do produto: Bebidas");
        else if (brinquedos)
            System.out.println("Tipo do produto: Brinquedos");
        else {
            System.out.println("Esse produtos é invalido");
        }

    }

}
