
package view;

import dao.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.UsuarioM;


public class UsuarioView extends javax.swing.JInternalFrame {
    UsuarioM usuarioM;
    List<UsuarioM> listaUsuario;
   
    public UsuarioView() {
        listaUsuario = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        atualizaTabelaUsuario();
    }
    
    
     public void atualizaTabelaUsuario() {

        try {
            // REMOVE DA LISTA OS USUARIOS OCULTOS CONVIDADO CONVIDADO, A A, ROOT ROOT.
            listaUsuario = UsuarioDAO.listaTodos(); 
            
            UsuarioM usuario0 = listaUsuario.get(0);
            UsuarioM usuario1 = listaUsuario.get(1);
            UsuarioM usuario2 = listaUsuario.get(2);
            listaUsuario.remove(usuario1);
            listaUsuario.remove(usuario2);
            listaUsuario.remove(usuario0);
            
                
        } catch (SQLException ex){
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        String dados[][] = new String[listaUsuario.size()][4];
        int i = 0;
        for (UsuarioM usuario : listaUsuario) {
                    dados[i][0] = String.valueOf(usuario.getId());
                    dados[i][1] = usuario.getNome();
                    dados[i][2] = usuario.getUsuario();
                    dados[i][3] = usuario.getContato();
                    i++;
        }
        String tituloColuna[] = {"ID", "Nome", "Usuario", "Contato"};
        
        DefaultTableModel tabelaUsuario = new DefaultTableModel();
        tabelaUsuario.setDataVector(dados, tituloColuna);
        tbeUsuario.setModel(new DefaultTableModel(dados, tituloColuna) {
            boolean[] canEdit = new boolean[]{
                  false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tbeUsuario.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbeUsuario.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbeUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbeUsuario.getColumnModel().getColumn(3).setPreferredWidth(300);

        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbeUsuario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbeUsuario.setRowHeight(25);
        tbeUsuario.updateUI();

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeUsuario = new javax.swing.JTable();
        tfdConfirmaSenha = new javax.swing.JPasswordField();
        tfdSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        tfdContato = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuário");

        jLabel1.setText("ID");

        tfdId.setEditable(false);
        tfdId.setEnabled(false);

        jLabel2.setText("Nome");

        tfdNome.setEnabled(false);

        jLabel3.setText("Nome de usuário");

        tfdUsuario.setEnabled(false);

        jLabel4.setText("Senha");

        jLabel5.setText("Confirmar senha");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tbeUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeUsuario);

        tfdConfirmaSenha.setEnabled(false);
        tfdConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdConfirmaSenhaActionPerformed(evt);
            }
        });

        tfdSenha.setEnabled(false);

        jLabel6.setText("Contato");

        tfdContato.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdNome)
                    .addComponent(jSeparator1)
                    .addComponent(tfdUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(4, 4, 4)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(tfdContato)
                    .addComponent(tfdSenha)
                    .addComponent(tfdConfirmaSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfdConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdConfirmaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdConfirmaSenhaActionPerformed

    private void tbeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeUsuarioMouseClicked

        tfdId.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 0).toString());
        tfdNome.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 1).toString());
        tfdUsuario.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 2).toString());
        tfdContato.setText(tbeUsuario.getValueAt(tbeUsuario.getSelectedRow(), 3).toString());
       
        
        // Bloco senha para pegar a senha direto do banco
        try {
        usuarioM = UsuarioDAO.BuscaPorId(Integer.parseInt(tfdId.getText()));

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        tfdSenha.setText(usuarioM.getSenha());
        tfdConfirmaSenha.setText(usuarioM.getSenha());
        // Fim bloco senha
        
       preparaSelecaoTabela();
    }//GEN-LAST:event_tbeUsuarioMouseClicked

            // INÍCIO MÉTODOS DE CONTROLE DE BOTÕES
    
    public void preparaSalvareCancelar() {
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tbeUsuario.setEnabled(true);
    }
    
    public void limpaCamposUsuario() {
        
        tfdId.setText("");
        tfdNome.setText("");
        tfdContato.setText("");
        tfdUsuario.setText("");        
        tfdSenha.setText("");       
        tfdConfirmaSenha.setText("");  

    }
    
    public void ativaCampos() {
        tfdNome.setEnabled(true);
        tfdContato.setEnabled(true);
        tfdUsuario.setEnabled(true);   
        tfdSenha.setEnabled(true);    
        tfdConfirmaSenha.setEnabled(true);
       
    }
    
    public void desativaCampos(){
        tfdId.setText("");
        tfdId.setEnabled(false);
        tfdId.setEditable(false);
        tfdUsuario.setText("");
        tfdUsuario.setEnabled(false);
        tfdSenha.setText("");
        tfdSenha.setEnabled(false);
        tfdConfirmaSenha.setText("");
        tfdConfirmaSenha.setEnabled(false);
        tfdNome.setText("");
        tfdNome.setEnabled(false);
        tfdContato.setText("");
        tfdContato.setEnabled(false);

    } 
   
    public void preparaNovo() {
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        tbeUsuario.setEnabled(false);
        tbeUsuario.clearSelection();
    }
    public void preparaAlterar() {
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tbeUsuario.setEnabled(false);
        tbeUsuario.clearSelection();
    }
    
    public void preparaExcluir() {
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }
    
    public void preparaSelecaoTabela(){
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);
    }
    
    // FIM MÉTODOS DE CONTROLE DE BOTÕES

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbeUsuario;
    private javax.swing.JPasswordField tfdConfirmaSenha;
    private javax.swing.JTextField tfdContato;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JPasswordField tfdSenha;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
