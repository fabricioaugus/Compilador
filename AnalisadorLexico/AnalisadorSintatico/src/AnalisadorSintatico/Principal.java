/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AnalisadorSintatico;

import AnalisadorSintatico.Telas.ExemplosCodigos;
import AnalisadorSintatico.Telas.SobreL;
import AnalisadorSintatico.Telas.TabelaTokens;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        LimparResultado = new javax.swing.JButton();
        btnAnalizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultadoSin = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        LimparAnalizarSin = new javax.swing.JButton();
        btnAnalizarSin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        LimparDigitado = new javax.swing.JButton();
        abrirArquivo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSobre = new javax.swing.JMenu();
        menuItemSobreL = new javax.swing.JMenuItem();
        TabelaTokens = new javax.swing.JMenuItem();
        menuItemExemplosCodigos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Análise Léxica:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        LimparResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LimparResultado.setText("Limpar");
        LimparResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparResultadoActionPerformed(evt);
            }
        });

        btnAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAnalizar.setText("Analizar");
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                        .addComponent(LimparResultado)))
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LimparResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizar))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Análise Sintática:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel3.setToolTipText("");

        txtResultadoSin.setColumns(20);
        txtResultadoSin.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtResultadoSin.setRows(5);
        jScrollPane3.setViewportView(txtResultadoSin);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        LimparAnalizarSin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LimparAnalizarSin.setText("Limpar");
        LimparAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAnalizarSinActionPerformed(evt);
            }
        });

        btnAnalizarSin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAnalizarSin.setText("Analizar Sin");
        btnAnalizarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSinActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAnalizarSin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(178, 178, 178)
                        .addComponent(LimparAnalizarSin)))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LimparAnalizarSin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalizarSin)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite um código da linguagem L:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        txtEntrada.setColumns(20);
        txtEntrada.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtEntrada.setRows(5);
        jScrollPane1.setViewportView(txtEntrada);

        LimparDigitado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LimparDigitado.setText("Limpar");
        LimparDigitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparDigitadoActionPerformed(evt);
            }
        });

        abrirArquivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        abrirArquivo.setText("Abrir Arquivo");
        abrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(abrirArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LimparDigitado))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abrirArquivo)
                    .addComponent(LimparDigitado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuSobre.setBorder(null);
        menuSobre.setText("Sobre");
        menuSobre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuSobre.setHideActionText(true);
        menuSobre.setMinimumSize(new java.awt.Dimension(35, 15));
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });

        menuItemSobreL.setText("Sobre L");
        menuItemSobreL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreLActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemSobreL);

        TabelaTokens.setText("Tabela de Tokens");
        TabelaTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaTokensActionPerformed(evt);
            }
        });
        menuSobre.add(TabelaTokens);

        menuItemExemplosCodigos.setText("Exemplo Código");
        menuItemExemplosCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExemplosCodigosActionPerformed(evt);
            }
        });
        menuSobre.add(menuItemExemplosCodigos);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
            try {
                analizar();
            }  catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void LimparResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparResultadoActionPerformed
       txtResultado.setText(null);
    }//GEN-LAST:event_LimparResultadoActionPerformed

    private void LimparDigitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparDigitadoActionPerformed
         txtEntrada.setText(null);
    }//GEN-LAST:event_LimparDigitadoActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSobreActionPerformed

    private void TabelaTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaTokensActionPerformed
        TabelaTokens tabela = new TabelaTokens();
       tabela.setVisible(true);
    }//GEN-LAST:event_TabelaTokensActionPerformed

    private void menuItemExemplosCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExemplosCodigosActionPerformed
            ExemplosCodigos exemplosCodigos = new ExemplosCodigos();
        exemplosCodigos.setVisible(true);
    }//GEN-LAST:event_menuItemExemplosCodigosActionPerformed

    private void menuItemSobreLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreLActionPerformed
       SobreL sobrel = new SobreL();
       sobrel.setVisible(true);
    }//GEN-LAST:event_menuItemSobreLActionPerformed

    private void abrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirArquivoActionPerformed
        File arq = new File("teste.txt");
        PrintWriter escrever;

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);

        File arquivo = new File(chooser.getSelectedFile().getAbsolutePath());
        try{

            String str = new String(Files.readAllBytes(arquivo.toPath()));
            txtEntrada.setText(str);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_abrirArquivoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //TERMINAR
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void LimparAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAnalizarSinActionPerformed
        txtResultadoSin.setText(null);
    }//GEN-LAST:event_LimparAnalizarSinActionPerformed

    private void btnAnalizarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSinActionPerformed
        String st = txtEntrada.getText();
        var s = new Sintax(new AnalisadorSintatico.LexerCup(new StringReader(st)));
        try {
            s.parse();
            txtResultadoSin.setText("Analizar Realizada Corretamente !!!");
            txtResultadoSin.setForeground(new Color(25,111,62));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtResultadoSin.setText("Error de Sintaxe. Linha: " + (sym.right+1) +" Coluna: " + (sym.left+1) + ", Texto: \""+sym.value + "\"");
            txtResultadoSin.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnAnalizarSinActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparAnalizarSin;
    private javax.swing.JButton LimparDigitado;
    private javax.swing.JButton LimparResultado;
    private javax.swing.JMenuItem TabelaTokens;
    private javax.swing.JButton abrirArquivo;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnAnalizarSin;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem menuItemExemplosCodigos;
    private javax.swing.JMenuItem menuItemSobreL;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JTextArea txtEntrada;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextArea txtResultadoSin;
    // End of variables declaration//GEN-END:variables

    private void analizar() throws IOException {
        File arquivo = new File("arquivoTeste.txt");
       PrintWriter escrever;
        int cont = 1;
        try {
            escrever = new PrintWriter(arquivo);
            escrever.print(txtEntrada.getText());
            escrever.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Reader leitor = new BufferedReader(new FileReader("arquivoTeste.txt"));
            Lexer lexer = new Lexer(leitor);
            String resultado = "";
            while(true){
                Tokens tokens = lexer.yylex();
                if(tokens == null){
                    resultado += "ANALIZADO TODOS TOKENS";
                    txtResultado.setText(resultado);
                    return;
                }
               
                switch (tokens) {
                   
                case TIPO_VAR:
                    resultado += "Linha: "+lexer.line+" - Coluna:"+lexer.column+"Token<"+tokens.TIPO_VAR+", "+lexer.lexeme+">" + "\n";
                    break;
                case VAR:
                    resultado +=  "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.VAR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case IFSULDEMINAS:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.IFSULDEMINAS+", "+lexer.lexeme+">" + "\n";
                    break;
                 case INICIO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.INICIO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case FIM:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.FIM+", "+lexer.lexeme+">" + "\n";
                    break;
                 case COMPILADORES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.COMPILADORES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case BUSCAR:
                    resultado +=  "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.BUSCAR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case EM:
                    resultado +=  "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.EM+", "+lexer.lexeme+">" + "\n";
                    break;
                 case SUBSTITUIR:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.SUBSTITUIR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case POR:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.POR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case EXTRAIR:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.EXTRAIR+", "+lexer.lexeme+">" + "\n";;
                    break;
                 case DE:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.DE+", "+lexer.lexeme+">" + "\n";
                    break;
                 case ATE:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ATE+", "+lexer.lexeme+">" + "\n";
                    break;
                 case COMPRIMENTO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.COMPRIMENTO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case CONCATENAR:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.CONCATENAR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case COMPARAR:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.COMPARAR+", "+lexer.lexeme+">" + "\n";
                    break;
                 case OP_ARITIMETICOS:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.OP_ARITIMETICOS+", "+lexer.lexeme+">" + "\n";
                    break;
                 case OP_ATRIBUICAO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.OP_ATRIBUICAO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case OP_RELACIONAL:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.OP_RELACIONAL+", "+lexer.lexeme+">" + "\n";
                    break;
                 case OP_INCREMENTO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.OP_INCREMENTO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case OP_LOGICO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.OP_LOGICO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case ABRE_PARENTESES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ABRE_PARENTESES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case FECHA_PARENTESES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.FECHA_PARENTESES+", "+lexer.lexeme+">" + "\n";
                    break;
                    
                 case ABRE_CHAVES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ABRE_CHAVES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case FECHA_CHAVES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.FECHA_CHAVES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case ABRE_COLCHETES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ABRE_COLCHETES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case FECHA_COLCHETES:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.FECHA_COLCHETES+", "+lexer.lexeme+">" + "\n";
                    break;
                 case  PONTO_VIRGULA:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.PONTO_VIRGULA+", "+lexer.lexeme+">" + "\n";
                    break;
                 case ENQUANTO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ENQUANTO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case PARA:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.PARA+", "+lexer.lexeme+">" + "\n";
                    break;
                 case COND_SE:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.COND_SE+", "+lexer.lexeme+">" + "\n";
                    break;
                 case COND_SENAO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.COND_SENAO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case VAL_BOOLEANO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.VAL_BOOLEANO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case VAL_INTEIRO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.VAL_INTEIRO+", "+lexer.lexeme+">" + "\n";
                    break;
                 case VAL_TEXTO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.VAL_TEXTO+", "+lexer.lexeme+">" + "\n";
                    break;
                    case ERRO:
                    resultado += "Linha: "+lexer.line+" - Coluna: "+lexer.column+" Token<"+tokens.ERRO+", "+lexer.lexeme+">" + "\n";
                    break;
                   
                 default:
                    resultado += "" +lexer.lexeme+ " >\n";
                    break;
                } 
                        
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
