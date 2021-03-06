/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.projetoCatalogo.view;

import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.DAO.FilmeDAO;
import br.com.projetoCatalogo.controller.CadastroFilmeController;
import br.com.projetoCatalogo.factory.ConnectionFactory;
import br.com.projetoCatalogo.model.Filme;
import br.com.projetoCatalogo.model.Filme;
import br.com.projetoCatalogo.model.Filme;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vinic
 */
public class TelaDeCadastroDeFilmes extends javax.swing.JFrame {

    private final CadastroFilmeController controller;

    /**
     * Creates new form TelaDeCadastroDeFilmes
     */
    public TelaDeCadastroDeFilmes() throws SQLException {
        initComponents();
        readTable();
        controller = new CadastroFilmeController(this);
        jTextFieldNome.setText("");
        jTextFieldPlataforma.setText("");
        jTextFieldCategoria.setText("");
        jTextFieldDiretor.setText("");
        jTextFieldDuracao.setText("");
    }
    
    public final void readTable() throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) TableFilmes.getModel();
        modelo.setNumRows(0);
        FilmeDAO filmedao = new FilmeDAO();
        
        for(Filme filme: filmedao.read()){
            modelo.addRow(new Object[]{
                filme.getId(),
                filme.getNome(),
                filme.getPlataforma(),
                filme.getCategoria(),
                filme.getDiretor(),
                filme.getDuracao()
            });
        }
    }

    public JTextField getjTextFieldCategoria() {
        return jTextFieldCategoria;
    }

    public void setjTextFieldCategoria(JTextField jTextFieldCategoria) {
        this.jTextFieldCategoria = jTextFieldCategoria;
    }

    public JTextField getjTextFieldDiretor() {
        return jTextFieldDiretor;
    }

    public void setjTextFieldDiretor(JTextField jTextFieldDiretor) {
        this.jTextFieldDiretor = jTextFieldDiretor;
    }

    public JTextField getjTextFieldDuracao() {
        return jTextFieldDuracao;
    }

    public void setjTextFieldDuracao(JTextField jTextFieldDuracao) {
        this.jTextFieldDuracao = jTextFieldDuracao;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }

    public JTextField getjTextFieldPlataforma() {
        return jTextFieldPlataforma;
    }

    public void setjTextFieldPlataforma(JTextField jTextFieldPlataforma) {
        this.jTextFieldPlataforma = jTextFieldPlataforma;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlataforma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDiretor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDuracao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFilmes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");

        jTextFieldNome.setText("jTextField1");

        jLabel2.setText("Plataforma");

        jTextFieldPlataforma.setText("jTextField2");

        jLabel3.setText("Categoria");

        jTextFieldCategoria.setText("jTextField3");

        jLabel4.setText("Diretor");

        jTextFieldDiretor.setText("jTextField4");

        jLabel5.setText("Duracao");

        jTextFieldDuracao.setText("jTextField5");
        jTextFieldDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracaoActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(452, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPlataforma, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextFieldDiretor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 210));

        TableFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Plataforma", "Categoria", "Diretor", "Duracao"
            }
        ));
        TableFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFilmesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableFilmes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 580, 240));

        jMenu1.setText("Menu");

        jMenuItem1.setText("Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controller.salvarFilmes();
        try {
            readTable();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaDeMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Filme filme = new Filme();
      FilmeDAO filmedao = new FilmeDAO();
      
      int index = TableFilmes.getSelectedRow();
        try {
            filme = filmedao.read().get(index);
            filmedao.delete(filme);
            readTable();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Filme filme = new Filme();
        FilmeDAO filmedao = new FilmeDAO();
        
        int index = TableFilmes.getSelectedRow();//Retrona o numero da linha selecionada
        
        try {
            filme = filmedao.read().get(index);//Retorna o objeto dentro da ArrayList
            
            //Set as novas informacoes para o objeto selecionado
            filme.setNome(jTextFieldNome.getText());
            filme.setPlataforma(jTextFieldPlataforma.getText());
            filme.setCategoria(jTextFieldCategoria.getText());
            filme.setDiretor(jTextFieldDiretor.getText());
            filme.setDuracao(jTextFieldDuracao.getText());
            //faz a alteracao no bd
            filmedao.update(filme);
            readTable();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TableFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFilmesMouseClicked
        Filme filme = new Filme();
       FilmeDAO filmedao = new FilmeDAO();
       
       int index = TableFilmes.getSelectedRow();
       
        try {
            filme = filmedao.read().get(index);
            
            jTextFieldNome.setText(String.valueOf(filme.getNome()));
            jTextFieldPlataforma.setText(String.valueOf(filme.getPlataforma()));
            jTextFieldCategoria.setText(String.valueOf(filme.getCategoria()));
            jTextFieldDiretor.setText(String.valueOf(filme.getDiretor()));
            jTextFieldDuracao.setText(String.valueOf(filme.getDuracao()));
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TableFilmesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaDeCadastroDeFilmes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TelaDeCadastroDeFilmes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableFilmes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCategoria;
    private javax.swing.JTextField jTextFieldDiretor;
    private javax.swing.JTextField jTextFieldDuracao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlataforma;
    // End of variables declaration//GEN-END:variables
}
