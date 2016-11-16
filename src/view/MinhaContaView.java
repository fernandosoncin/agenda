
package view;

import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioM;
import util.LimiteDigitos;



public class MinhaContaView extends javax.swing.JInternalFrame {

   public UsuarioM usuario = new UsuarioM();
    public MinhaContaView(UsuarioM usuario) {
        initComponents();
        this.setVisible(true);
        this.usuario = usuario;
        
        tfdUsuario.setDocument(new LimiteDigitos(20));
        tfdSenha.setDocument(new LimiteDigitos(20));
        tfdNome.setDocument(new LimiteDigitos(45));
        tfdContato.setDocument(new LimiteDigitos(45));
        
        iniciaUsuario(usuario);
    }

    UsuarioDAO usuarioDAO = new UsuarioDAO();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTipoDeConta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdContato = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfdUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfdSenha = new javax.swing.JTextField();
        tfdConfirmaSenha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Minha Conta");

        jLabel1.setText("Detalhes da Conta");

        jLabel2.setText("Tipo de Conta:");

        lblTipoDeConta.setText("TipoDeConta");

        jLabel3.setText("ID");

        tfdId.setEnabled(false);

        jLabel4.setText("Nome");

        tfdNome.setEnabled(false);

        tfdContato.setEnabled(false);

        jLabel5.setText("Contato");

        jLabel6.setText("Usuário");

        tfdUsuario.setEnabled(false);
        tfdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Senha");

        tfdSenha.setEnabled(false);

        tfdConfirmaSenha.setEnabled(false);

        jLabel8.setText("Confirma Senha");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoDeConta)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lblTipoDeConta))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdUsuarioActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     if ( tfdNome.getText().isEmpty() || tfdContato.getText().isEmpty() || tfdUsuario.getText().isEmpty() || tfdSenha.getText().isEmpty() || tfdConfirmaSenha.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Prencha todos os campos.", "Erro", JOptionPane.WARNING_MESSAGE);
            tfdNome.requestFocusInWindow();
        }else {
             if(tfdSenha.getText().equals(tfdConfirmaSenha.getText())){
                
                usuario.setNome(tfdNome.getText());
                usuario.setContato(tfdContato.getText());
                usuario.setUsuario(tfdUsuario.getText());
                usuario.setSenha(tfdSenha.getText());
                try {
                    usuarioDAO.alterar(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    desativaCampos();
                } catch (SQLException ex) {
                          if (ex.getErrorCode() == 1062) {
                        JOptionPane.showMessageDialog(null, "Usuario com nome já existente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
            }

        }else{
                 JOptionPane.showMessageDialog(null, "Senhas não coincidem.", "Erro", JOptionPane.WARNING_MESSAGE);
             }
         }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
    ativaCampos();
    preparaSalvar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     iniciaUsuario(usuario); //quando clica cancelar volta as informações iniciais
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

     public void iniciaUsuario(UsuarioM usuario){
       
         
       tfdNome.setText(usuario.getNome());
       tfdContato.setText(usuario.getContato());
       tfdUsuario.setText(usuario.getUsuario());
       tfdSenha.setText(usuario.getSenha());
       tfdConfirmaSenha.setText(usuario.getSenha());
        if(usuario.isAdmin() == true){
        lblTipoDeConta.setText("Administrador");
        }else{
        lblTipoDeConta.setText("Convidado");
        }
      
    }

  
    public void desativaCampos(){

        tfdNome.setEnabled(false);
        tfdContato.setEnabled(false);
        tfdUsuario.setEnabled(false);
        tfdSenha.setEnabled(false);
        tfdConfirmaSenha.setEnabled(false);
        
       btnAlterar.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
    }
    
    public void ativaCampos(){
        tfdNome.setEnabled(true);
        tfdContato.setEnabled(true);
        tfdUsuario.setEnabled(true);
        tfdSenha.setEnabled(true);
        tfdConfirmaSenha.setEnabled(true);
    }
    public void preparaSalvar(){
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblTipoDeConta;
    private javax.swing.JTextField tfdConfirmaSenha;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
