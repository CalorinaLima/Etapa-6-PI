package projetointegradorativ4;

public class Sugestao extends javax.swing.JFrame {


    public Sugestao() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoAjuda = new javax.swing.JLabel();
        TextoRealizarPedido = new javax.swing.JLabel();
        TextoVerificarPedido = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        BotaoSimPedido = new javax.swing.JButton();
        BotaoSimVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        CampoAjuda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CampoAjuda.setText("No que posso lhe ajudar?");

        TextoRealizarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoRealizarPedido.setText("Deseja realizar pedido?");

        TextoVerificarPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextoVerificarPedido.setText("Deseja verificar um pedido?");

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        BotaoSimPedido.setText("Sim ");
        BotaoSimPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSimPedidoActionPerformed(evt);
            }
        });

        BotaoSimVerificar.setText("Sim");
        BotaoSimVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSimVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoAjuda)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotaoSimVerificar)
                                .addComponent(TextoRealizarPedido)
                                .addComponent(TextoVerificarPedido)
                                .addComponent(BotaoSimPedido))
                            .addComponent(BotaoVoltar))
                        .addGap(172, 172, 172))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CampoAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(TextoRealizarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoSimPedido)
                .addGap(18, 18, 18)
                .addComponent(TextoVerificarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoSimVerificar)
                .addGap(27, 27, 27)
                .addComponent(BotaoVoltar)
                .addGap(30, 30, 30))
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

    private void BotaoSimPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimPedidoActionPerformed
       abrirTelaEmissao();
    }//GEN-LAST:event_BotaoSimPedidoActionPerformed

    private void BotaoSimVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSimVerificarActionPerformed
        abrirTelaVerificacao();
    }//GEN-LAST:event_BotaoSimVerificarActionPerformed

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        voltarParaTelaInicial();
    }//GEN-LAST:event_BotaoVoltarActionPerformed

private void abrirTelaEmissao() {
    Emissao telaEmissao = new Emissao();
    telaEmissao.setVisible(true);
    this.dispose(); // Fecha a tela atual
}

private void abrirTelaVerificacao() {
    Verificacao telaVerificacao = new Verificacao();
    telaVerificacao.setVisible(true);
    this.dispose(); // Fecha a tela atual
}

private void voltarParaTelaInicial() {
    TelaInicial telaInicial = new TelaInicial();
    telaInicial.setVisible(true);
    this.dispose(); // Fecha a tela atual
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
            java.util.logging.Logger.getLogger(Sugestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sugestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sugestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sugestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sugestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSimPedido;
    private javax.swing.JButton BotaoSimVerificar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JLabel CampoAjuda;
    private javax.swing.JLabel TextoRealizarPedido;
    private javax.swing.JLabel TextoVerificarPedido;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
