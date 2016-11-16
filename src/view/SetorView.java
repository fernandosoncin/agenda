package view;

import com.sun.istack.internal.logging.Logger;
import dao.SetorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.SetorM;


public class SetorView extends javax.swing.JInternalFrame {

   SetorM setor;
   SetorDAO setorDAO;
   List<SetorM> listaSetor;
   
   
    public SetorView() {
        listaSetor = new ArrayList<>();
        setorDAO = new SetorDAO();
        setor = new SetorM();
        initComponents();
        this.setVisible(true);
        atualizarTabelaSetor();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeSetor = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfdSetor = new javax.swing.JTextField();
        tfdRamal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Setor");

        jLabel1.setText("ID");

        tfdId.setEditable(false);
        tfdId.setEnabled(false);

        tbeSetor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbeSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeSetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeSetor);

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

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

        jLabel2.setText("Setor");

        tfdSetor.setEnabled(false);

        tfdRamal.setEnabled(false);

        jLabel3.setText("Ramal");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfdId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tfdRamal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
           if (tfdSetor.getText().isEmpty() || tfdRamal.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
          tfdSetor.requestFocusInWindow();          
      }
           else if (tfdId.getText().isEmpty()){
          
          setor.setNome(tfdSetor.getText());
          setor.setRamal(Integer.parseInt(tfdRamal.getText()));
      
      try{
          SetorDAO.salvar(setor);
          JOptionPane.showMessageDialog(null, "Gravado com sucesso!");   
          
          tfdSetor.requestFocusInWindow();
         }
      catch (SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
      }
      atualizarTabelaSetor();
      prepararSalvareCancelar();
      desativarCampos();
      limparCamposSetor();
      }
      else{
           setor.setId(Integer.parseInt(tfdId.getText()));
           setor.setNome(tfdSetor.getText());
           setor.setRamal(Integer.parseInt(tfdRamal.getText()));
       }
       try{
           SetorDAO.alterar(setor);
           JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
       }
       catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
       atualizarTabelaSetor();
       prepararSalvareCancelar();
       desativarCampos();
       
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbeSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeSetorMouseClicked
      tfdId.setText(tbeSetor.getValueAt(tbeSetor.getSelectedRow(), 0).toString());
      tfdSetor.setText(tbeSetor.getValueAt(tbeSetor.getSelectedRow(), 1).toString());
      tfdRamal.setText(tbeSetor.getValueAt(tbeSetor.getSelectedRow(), 2).toString());
      prepararSelecaoTabela();
    }//GEN-LAST:event_tbeSetorMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if (tfdId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um setor!");
       }
       else {
           setor.setId(Integer.parseInt(tfdId.getText()));
           int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " + tfdSetor.getText());
           if (confirma == 0){
               try{
                   SetorDAO.excluir(setor);
                   limparCamposSetor();
                   tfdSetor.requestFocusInWindow();
               }
               catch (SQLException ex){
                   JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
               }
               atualizarTabelaSetor();
               prepararExcluir();
           }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
     limparCamposSetor();
     prepararNovo();
     ativarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        prepararAlterar();
        ativarCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    limparCamposSetor();
    prepararSalvareCancelar();
    desativarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

   public void atualizarTabelaSetor(){
        
        setor = new SetorM();
        try {
            listaSetor = setorDAO.ListaSetor();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaSetor.size()][3];
            int i = 0;
            for (SetorM setor : listaSetor) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = String.valueOf(setor.getRamal());
                i++;
            }
           String tituloColuna[] = {"ID", "Setor", "Ramal"};
            DefaultTableModel tabelaSetor = new DefaultTableModel();
            tabelaSetor.setDataVector(dados, tituloColuna);
            tbeSetor.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tbeSetor.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbeSetor.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbeSetor.getColumnModel().getColumn(2).setPreferredWidth(50);
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tbeSetor.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tbeSetor.setRowHeight(25);
            tbeSetor.updateUI();


    }
 
   public void limparCamposSetor(){
       tfdId.setText("");
       tfdSetor.setText("");
       tfdRamal.setText("");
   }
   
   public void ativarCampos(){
       tfdSetor.setEnabled(true);
       tfdRamal.setEnabled(true);
   }

   public void desativarCampos(){
       tfdSetor.setEnabled(false);
       tfdRamal.setEnabled(false);
   }
   
   public void prepararNovo() {
       btnNovo.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tbeSetor.setEnabled(false);
       tbeSetor.clearSelection();
   }
   
   public void prepararSalvareCancelar() {
       btnNovo.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       tbeSetor.setEnabled(true);
   }
   
   public void prepararSelecaoTabela(){
       btnNovo.setEnabled(true);
       btnExcluir.setEnabled(true);
       btnAlterar.setEnabled(true);
   }
   
   public void prepararAlterar(){
       btnNovo.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tbeSetor.setEnabled(false);
       tbeSetor.clearSelection();
   }
   
   public void prepararExcluir(){
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbeSetor;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdRamal;
    private javax.swing.JTextField tfdSetor;
    // End of variables declaration//GEN-END:variables
}
