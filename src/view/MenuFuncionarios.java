/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Carlos
 */
public class MenuFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form GerenciarAssistente
     */
    public MenuFuncionarios() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adicionarAssist = new javax.swing.JButton();
        editarAssist = new javax.swing.JButton();
        buscarAssist = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        adicionarAdmin = new javax.swing.JButton();
        buscarAdmin = new javax.swing.JButton();
        editarAdmin = new javax.swing.JButton();
        removerAssist = new javax.swing.JButton();
        removerAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        adicionarAssist.setText("Adicionar Assistente");
        adicionarAssist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAssistActionPerformed(evt);
            }
        });

        editarAssist.setText("Editar Assistente");
        editarAssist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAssistActionPerformed(evt);
            }
        });

        buscarAssist.setText("Buscar Assistente");
        buscarAssist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAssistActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 0, 36)); // NOI18N
        jLabel2.setText("Funcionários");

        adicionarAdmin.setText("Adicionar Administrativo");
        adicionarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarAdminActionPerformed(evt);
            }
        });

        buscarAdmin.setText("Buscar Administrativo");
        buscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAdminActionPerformed(evt);
            }
        });

        editarAdmin.setText("Editar Administrativo");
        editarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarAdminActionPerformed(evt);
            }
        });

        removerAssist.setText("Remover Assistente");
        removerAssist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAssistActionPerformed(evt);
            }
        });

        removerAdmin.setText("Remover Administrativo");
        removerAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editarAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adicionarAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(adicionarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removerAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removerAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscarAssist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adicionarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicionarAssist, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarAssist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removerAssist, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(removerAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarAssistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAssistActionPerformed
        GerenciarFuncionario gf = new GerenciarFuncionario();
        gf.setFlag1("add");
        gf.setFlag2("assist");
        gf.setVisible(true);
    }//GEN-LAST:event_adicionarAssistActionPerformed

    private void editarAssistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAssistActionPerformed
        BuscarAssistente bf = new BuscarAssistente();
        bf.setFlag("editar");
        bf.setVisible(true);
    }//GEN-LAST:event_editarAssistActionPerformed

    private void buscarAssistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAssistActionPerformed
        BuscarAssistente bf = new BuscarAssistente();
        bf.setFlag("buscar");
        bf.setVisible(true);
    }//GEN-LAST:event_buscarAssistActionPerformed

    private void adicionarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarAdminActionPerformed
        GerenciarFuncionario gf = new GerenciarFuncionario();
        gf.setFlag1("add");
        gf.setFlag2("admin");
        gf.setVisible(true);
    }//GEN-LAST:event_adicionarAdminActionPerformed

    private void buscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAdminActionPerformed
        BuscarAdministrativo bf = new BuscarAdministrativo();
        bf.setFlag("buscar");
        bf.setVisible(true);
    }//GEN-LAST:event_buscarAdminActionPerformed

    private void editarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarAdminActionPerformed
        BuscarAdministrativo bf = new BuscarAdministrativo();
        bf.setFlag("editar");
        bf.setVisible(true);
    }//GEN-LAST:event_editarAdminActionPerformed

    private void removerAssistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAssistActionPerformed
        BuscarAssistente bf = new BuscarAssistente();
        bf.setFlag("remover");
        bf.setButton("Remover");
        bf.setVisible(true);
    }//GEN-LAST:event_removerAssistActionPerformed

    private void removerAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerAdminActionPerformed
        BuscarAdministrativo bf = new BuscarAdministrativo();
        bf.setFlag("remover");
        bf.setButton("Remover");
        bf.setVisible(true);
    }//GEN-LAST:event_removerAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarAdmin;
    private javax.swing.JButton adicionarAssist;
    private javax.swing.JButton buscarAdmin;
    private javax.swing.JButton buscarAssist;
    private javax.swing.JButton editarAdmin;
    private javax.swing.JButton editarAssist;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton removerAdmin;
    private javax.swing.JButton removerAssist;
    // End of variables declaration//GEN-END:variables
}
