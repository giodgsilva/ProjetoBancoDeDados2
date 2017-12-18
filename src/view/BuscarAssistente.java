/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AssistenteSocial;
import controller.AdministrativoController;
import controller.AssistenteController;
import controller.PessoaController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciana
 */
public class BuscarAssistente extends javax.swing.JFrame {

    /**
     * Creates new form PesquisarFuncionario
     */
    public BuscarAssistente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private String flag;
    //private PessoaController pessoaController;
    private AssistenteController assistenteController = new AssistenteController();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        selectNome = new javax.swing.JRadioButton();
        selectMat = new javax.swing.JRadioButton();
        campo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 0, 36)); // NOI18N
        jLabel2.setText("Buscar Assistente");

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

        buttonGroup1.add(selectMat);
        selectMat.setText("Matrícula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(selectNome)
                        .addGap(59, 59, 59)
                        .addComponent(selectMat)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNome)
                    .addComponent(selectMat))
                .addGap(18, 18, 18)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(flag.equals("buscar")) {
            this.buscar();
        } else if(flag.equals("editar")) {
            //this.editar();
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
        AssistenteSocial assist = null;
        List<AssistenteSocial> listAssist = new ArrayList<AssistenteSocial>();
        
        
        if(selectNome.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a pesquisa.");
            } else {
                listAssist = assistenteController.buscarPorNome(campo.getText());
                tmp = true;
            }
        } else if(selectMat.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a pesquisa.");
            } else {
                assist = assistenteController.buscarPorMatricula(campo.getText());
                tmp = true;
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum filtro selecionado. Buscando todos os registros...");
            listAssist = assistenteController.buscarTodos();
            tmp = true;
        }
        
        if(tmp == true && (assist != null || !listAssist.isEmpty())) {
            if(assist == null) {
                ExibirFuncionario ef = new ExibirFuncionario();
                ef.preencherTabelaAssist(listAssist);
                ef.setVisible(true);
                this.setVisible(false);
            } else if(listAssist.isEmpty()) {
                ExibirFuncionario ef = new ExibirFuncionario();
                ef.preencherTabelaAssist(assist);
                ef.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    
    /*private void editar() {
        AssistenteSocial assist = null;
        //List<Administrativo> listAdmin = new ArrayList<Administrativo>();
        GerenciarFuncionario gf = new GerenciarFuncionario();
        gf.setFlag1("editar");
        gf.setFlag2("assist");
        
        if(selectNome.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a alteração.");
            } else {
                assist = assistenteController.buscarPorNome(campo.getText()).get(0);
                //gf.setFlag2("admin");
                gf.popularCampos(assist);
                gf.setVisible(true);
                this.setVisible(false);
            }
        } else if(selectMat.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a alteração.");
            } else {
                assist = assistenteController.buscarPorMatricula(campo.getText());
                //gf.setFlag2("admin");
                gf.popularCampos(assist);
                gf.setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Nenhum filtro selecionado!");
        }
    }*/
    
    private void remover() {
        //boolean tmp = false;
        AssistenteSocial assist = null;
        //List<AssistenteSocial> listAssist = new ArrayList<AssistenteSocial>();
        
        if(selectNome.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a exclusão.");
            } else {
                assist = assistenteController.buscarPorNome(campo.getText()).get(0);
                JOptionPane.showMessageDialog(null,"Esta ação removerá a assistente "+assist.getPessoa().getNome()+" \ne todos os atendimentos já feitos por ela. ");
                assistenteController.removerPorNome(assist);
                this.dispose();
            }
        } else if(selectMat.isSelected()) {
            if(campo.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Digite um dado no campo para fazer a exclusão.");
            } else {
                assist = assistenteController.buscarPorMatricula(campo.getText());
                JOptionPane.showMessageDialog(null,"Esta ação removerá a assistente "+assist.getPessoa().getNome()+" \ne todos os atendimentos já feitos por ela. ");
                assistenteController.removerPorMatricula(assist);
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
            java.util.logging.Logger.getLogger(BuscarAssistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAssistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAssistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAssistente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAssistente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton selectMat;
    private javax.swing.JRadioButton selectNome;
    // End of variables declaration//GEN-END:variables
}
