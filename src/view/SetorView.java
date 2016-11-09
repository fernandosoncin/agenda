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
        tblSetor = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfdSetor = new javax.swing.JTextField();
        tfdRamal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Setor");

        jLabel1.setText("ID");

        tfdId.setEditable(false);
        tfdId.setEnabled(false);

        tblSetor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSetor);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfdSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfdId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
           if (tfdSetor.getText().isEmpty() || tfdRamal.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
          tfdSetor.requestFocusInWindow();          
      }
      else{
          
          setor.setNome(tfdSetor.getText());
          setor.setRamal(Integer.parseInt(tfdRamal.getText()));
      }
      try{
          SetorDAO.salvar(setor);
          JOptionPane.showMessageDialog(null, "Gravado com sucesso!");   
          limparCamposSetor();
          tfdSetor.requestFocusInWindow();
         }
      catch (SQLException ex){
          JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
      }
      atualizarTabelaSetor();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblSetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSetorMouseClicked
      tfdId.setText(tblSetor.getValueAt(tblSetor.getSelectedRow(), 0).toString());
      tfdSetor.setText(tblSetor.getValueAt(tblSetor.getSelectedRow(), 1).toString());
      tfdRamal.setText(tblSetor.getValueAt(tblSetor.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tblSetorMouseClicked

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
           }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
     limparCamposSetor();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       if (tfdId.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Selecione um setor!");
       }
       else {
           setor.setId(Integer.parseInt(tfdId.getText()));
           setor.setNome(tfdSetor.getText());
           setor.setRamal(Integer.parseInt(tfdRamal.getText()));
       }
       try{
           SetorDAO.alterar(setor);
       }
       catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
       atualizarTabelaSetor();
       
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            tblSetor.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblSetor.getColumnModel().getColumn(0).setPreferredWidth(25);
            tblSetor.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblSetor.getColumnModel().getColumn(2).setPreferredWidth(50);
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblSetor.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblSetor.setRowHeight(25);
            tblSetor.updateUI();


    }
 
   public void limparCamposSetor(){
       tfdId.setText("");
       tfdSetor.setText("");
       tfdRamal.setText("");
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSetor;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdRamal;
    private javax.swing.JTextField tfdSetor;
    // End of variables declaration//GEN-END:variables
}
