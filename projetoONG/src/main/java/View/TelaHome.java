/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author ALUNO
 */
public class TelaHome extends javax.swing.JFrame {

    /**
     * Creates new form TelaHome1
     */
    public TelaHome() {
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

        painelPrincipal = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        botaoCalendario = new javax.swing.JButton();
        botaoDoacoes = new javax.swing.JButton();
        botaoRetirada = new javax.swing.JButton();
        botaoFuncionarios = new javax.swing.JButton();
        botaoRelatorios = new javax.swing.JButton();
        botapArquivos = new javax.swing.JButton();
        botaoProjetos = new javax.swing.JButton();
        botaoLixeira = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setBackground(new java.awt.Color(51, 255, 51));

        painelBotoes.setBackground(new java.awt.Color(153, 255, 153));

        botaoCalendario.setText("Calendário");
        botaoCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalendarioActionPerformed(evt);
            }
        });

        botaoDoacoes.setText("Entrada Doações");
        botaoDoacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDoacoesActionPerformed(evt);
            }
        });

        botaoRetirada.setText("Retirada de Doações");
        botaoRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetiradaActionPerformed(evt);
            }
        });

        botaoFuncionarios.setText("Funcionários ativos");
        botaoFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFuncionariosActionPerformed(evt);
            }
        });

        botaoRelatorios.setText("Relatórios");
        botaoRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatoriosActionPerformed(evt);
            }
        });

        botapArquivos.setText("Internos e Externos");
        botapArquivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botapArquivosActionPerformed(evt);
            }
        });

        botaoProjetos.setText("Projetos");
        botaoProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProjetosActionPerformed(evt);
            }
        });

        botaoLixeira.setText("Lixeira");
        botaoLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLixeiraActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ALUNO\\Downloads\\curved-arrow-pointing-left (1).png")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoDoacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoRetirada, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(botaoFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botapArquivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(botaoCalendario)
                .addGap(27, 27, 27)
                .addComponent(botaoDoacoes)
                .addGap(27, 27, 27)
                .addComponent(botaoRetirada)
                .addGap(36, 36, 36)
                .addComponent(botaoFuncionarios)
                .addGap(32, 32, 32)
                .addComponent(botaoRelatorios)
                .addGap(28, 28, 28)
                .addComponent(botapArquivos)
                .addGap(26, 26, 26)
                .addComponent(botaoProjetos)
                .addGap(26, 26, 26)
                .addComponent(botaoLixeira)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(718, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalendarioActionPerformed
Calendario telaPrincipal = new Calendario();
telaPrincipal.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_botaoCalendarioActionPerformed

    private void botaoRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRetiradaActionPerformed

    private void botaoRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatoriosActionPerformed
Relatorios telaPrincipal = new Relatorios();
telaPrincipal.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_botaoRelatoriosActionPerformed

    private void botapArquivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botapArquivosActionPerformed
InternoeExterno telaPrincipal = new InternoeExterno();
telaPrincipal.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_botapArquivosActionPerformed

    private void botaoProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProjetosActionPerformed
      
        Projetos telaPrincipal = new Projetos();
               
       telaPrincipal.setVisible(true);  
       dispose();
       
       // TODO add your handling code here:
    }//GEN-LAST:event_botaoProjetosActionPerformed

    private void botaoDoacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDoacoesActionPerformed
EntradaDoacoes telaPrincipal = new EntradaDoacoes();
telaPrincipal.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_botaoDoacoesActionPerformed

    private void botaoFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFuncionariosActionPerformed
FuncionariosAtivos telaPrincipal = new FuncionariosAtivos();
telaPrincipal.setVisible(true);
 dispose();// TODO add your handling code here:
    }//GEN-LAST:event_botaoFuncionariosActionPerformed

    private void botaoLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLixeiraActionPerformed
Lixeira telaPrincipal = new Lixeira();
telaPrincipal.setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_botaoLixeiraActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
TelaCadastro telaPrincipal = new TelaCadastro();
telaPrincipal.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

                
     
    /**
     * 
     * @param args 
     */
     public static void main (String args[]){
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
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalendario;
    private javax.swing.JButton botaoDoacoes;
    private javax.swing.JButton botaoFuncionarios;
    private javax.swing.JButton botaoLixeira;
    private javax.swing.JButton botaoProjetos;
    private javax.swing.JButton botaoRelatorios;
    private javax.swing.JButton botaoRetirada;
    private javax.swing.JButton botapArquivos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
