/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.Usuario;
import controller.UsuarioController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciana
 */
public class BuscarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form BuscarUsuario
     */
    public BuscarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    String flag;
    UsuarioController controller = new UsuarioController();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buscar = new javax.swing.JButton();
        selectNome = new javax.swing.JRadioButton();
        selectPront = new javax.swing.JRadioButton();
        campo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(selectNome);
        selectNome.setText("Nome");
        selectNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(selectPront);
        selectPront.setText("Prontuário");

        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 0, 36)); // NOI18N
        jLabel2.setText("Buscar Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(selectNome)
                                .addGap(56, 56, 56)
                                .addComponent(selectPront)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNome)
                    .addComponent(selectPront))
                .addGap(18, 18, 18)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(buscar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(flag.equals("buscar")) {
            this.buscar();
        } else if(flag.equals("editar")) {
            //GerenciarUsuario gu = new GerenciarUsuario();
            //gu.setVisible(true);
            //this.setVisible(false);
        } else if(flag.equals("remover")) {
            this.remover();
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void selectNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectNomeActionPerformed
    
    private void buscar() {
        boolean tmp = false;
        Usuario user = null;
        List<Usuario> userList = new ArrayList<Usuario>();
        String filtro = "";
        
        if(selectNome.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a pesquisa.");
            } else {
                user = controller.buscarPorNome(campo.getText());
                //filtro = "nome (" + campo.getText() + ")";
                tmp = true;
            }
        } else if(selectPront.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a pesquisa.");
            } else {
                user = controller.buscarPorProntuario(campo.getText());
                //filtro = "prontuário (" + campo.getText() + ")";
                tmp = true;
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum filtro selecionado. Buscando todos os registros...");
            userList = controller.buscarTodos();
            tmp = true;
        }
        
        if(tmp == true && (user != null || !userList.isEmpty())) {
            if(user != null) {
                ExibirUsuario eu = new ExibirUsuario();
                eu.preencherTabela(user);
                eu.setVisible(true);
                this.setVisible(false);
            } else if(!userList.isEmpty()) {
                ExibirUsuario eu = new ExibirUsuario();
                eu.preencherTabela((ArrayList<Usuario>) userList);
                eu.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    
    private void remover() {
        Usuario assist = null;
        List<Usuario> listAssist = new ArrayList<Usuario>();

        if(selectNome.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a exclusão.");
            } else {
                listAssist = controller.buscarPorListaNome(campo.getText());
                JOptionPane.showMessageDialog(null,"Esta ação removerá o usuário "+listAssist.get(0).getPessoa().getNome()+" \ne todos os atendimentos que o envolvem.");
                controller.removerPorNome(listAssist.get(0));
                this.dispose();
            }
        } else if(selectPront.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a exclusão.");
            } else {
                assist = controller.buscarPorProntuario(campo.getText());
                JOptionPane.showMessageDialog(null,"Esta ação removerá o usuário "+assist.getPessoa().getNome()+" \ne todos os atendimentos que o envolvem.");
                controller.removerPorProntuario(assist);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum filtro selecionado!");
        }
    }
    
    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    public void setButton(String acao) {
        this.buscar.setText(acao);
    }
    
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
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton selectNome;
    private javax.swing.JRadioButton selectPront;
    // End of variables declaration//GEN-END:variables
}
