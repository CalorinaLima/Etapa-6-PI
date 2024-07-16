
package projetointegradorativ4;

import javax.swing.JOptionPane;


public class Emissao extends javax.swing.JFrame {

    public Emissao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoEmissao = new javax.swing.JLabel();
        TextoNome = new javax.swing.JLabel();
        BotaoFinalizar = new javax.swing.JButton();
        CampoNome = new javax.swing.JTextField();
        TextoCPF = new javax.swing.JLabel();
        CampoCPF = new javax.swing.JTextField();
        TextoTelefone = new javax.swing.JLabel();
        CampoTelefone = new javax.swing.JTextField();
        TextoEMAIL = new javax.swing.JLabel();
        CampoEMAIL = new javax.swing.JTextField();
        TextoProduto = new javax.swing.JLabel();
        CampoProduto = new javax.swing.JTextField();
        TextoQuantidade = new javax.swing.JLabel();
        CampoQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        CampoEmissao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CampoEmissao.setText("Emissão de pedido");

        TextoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoNome.setText("• Nome:");

        BotaoFinalizar.setText("Finalizar");
        BotaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinalizarActionPerformed(evt);
            }
        });

        CampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeActionPerformed(evt);
            }
        });

        TextoCPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoCPF.setText("• CPF:");

        CampoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCPFActionPerformed(evt);
            }
        });

        TextoTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoTelefone.setText("• Telefone:");

        CampoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefoneActionPerformed(evt);
            }
        });

        TextoEMAIL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoEMAIL.setText("• E-mail:");

        CampoEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEMAILActionPerformed(evt);
            }
        });

        TextoProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoProduto.setText("• Produto:");

        CampoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoProdutoActionPerformed(evt);
            }
        });

        TextoQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoQuantidade.setText("• Quantidade:");

        CampoQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoQuantidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoFinalizar)
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(TextoProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextoNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextoTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoQuantidade)
                            .addComponent(TextoEMAIL)
                            .addComponent(TextoCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CampoEmissao)
                        .addGap(101, 101, 101)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CampoEmissao)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNome)
                    .addComponent(CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoTelefone)
                    .addComponent(CampoEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoEMAIL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoProduto)
                    .addComponent(CampoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BotaoFinalizar)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinalizarActionPerformed
        finalizarPedido();
    }//GEN-LAST:event_BotaoFinalizarActionPerformed

    private void CampoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFActionPerformed

    private void CampoEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEMAILActionPerformed

    private void CampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeActionPerformed

    private void CampoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefoneActionPerformed

    private void CampoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoProdutoActionPerformed

    private void CampoQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoQuantidadeActionPerformed

private void finalizarPedido() {
    String nome = CampoNome.getText().trim();
    String cpf = CampoCPF.getText().trim();
    String telefone = CampoTelefone.getText().trim();
    String email = CampoEMAIL.getText().trim();
    String produto = CampoProduto.getText().trim();
    String quantidade = CampoQuantidade.getText().trim();

    if (!nome.isEmpty() && !cpf.isEmpty() && !telefone.isEmpty() && !email.isEmpty() && !produto.isEmpty() && !quantidade.isEmpty()) {

        String mensagem = "Pedido realizado com sucesso!! \n\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + email + "\n" +
                "Produto: " + produto + "\n" +
                "Quantidade: " + quantidade;
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}

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
            java.util.logging.Logger.getLogger(Emissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emissao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoFinalizar;
    private javax.swing.JTextField CampoCPF;
    private javax.swing.JTextField CampoEMAIL;
    private javax.swing.JLabel CampoEmissao;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JTextField CampoProduto;
    private javax.swing.JTextField CampoQuantidade;
    private javax.swing.JTextField CampoTelefone;
    private javax.swing.JLabel TextoCPF;
    private javax.swing.JLabel TextoEMAIL;
    private javax.swing.JLabel TextoNome;
    private javax.swing.JLabel TextoProduto;
    private javax.swing.JLabel TextoQuantidade;
    private javax.swing.JLabel TextoTelefone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
