package view;


public class RelatorioView extends javax.swing.JInternalFrame {


    public RelatorioView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        PanelBusca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRamal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        cbxSetor = new javax.swing.JComboBox<String>();
        ckbDocente_Busca = new javax.swing.JCheckBox();
        ckbInativo_Busca = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        PanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca"));

        jLabel2.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel12.setText("Ramal");

        jLabel11.setText("Setor");

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        cbxSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "NUPSI", "Informática", "Recepção", "Coordenação", "Serviços Gerais", "Administração" }));

        ckbDocente_Busca.setText("Docentes");

        ckbInativo_Busca.setText("Inativos");

        javax.swing.GroupLayout PanelBuscaLayout = new javax.swing.GroupLayout(PanelBusca);
        PanelBusca.setLayout(PanelBuscaLayout);
        PanelBuscaLayout.setHorizontalGroup(
            PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(PanelBuscaLayout.createSequentialGroup()
                                .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckbDocente_Busca)
                                .addGap(18, 18, 18)
                                .addComponent(ckbInativo_Busca)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelBuscaLayout.setVerticalGroup(
            PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaLayout.createSequentialGroup()
                .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckbDocente_Busca)
                            .addComponent(ckbInativo_Busca))))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
    /*    funcionario = new FuncionarioM();
        if(txtNome.getText().isEmpty() && txtRamal.getText().isEmpty() && cbxSetor.getSelectedItem().toString() == "Selecione" && ckbDocente_Busca.isSelected() == false|| ckbInativo_Busca.isSelected() == false)
        {
              JOptionPane.showMessageDialog( null, "Por favor digite pelo menos um dos campos de pesquisa!");
             atualizaTabelaBusca();
            }
        if(txtNome.getText().length() > 0 || txtRamal.getText().length()>0 || cbxSetor.getSelectedItem().toString() != "Selecione")
        || ckbDocente_Busca.isSelected() == true || ckbInativo_Busca.isSelected() == true)
        {
            if(txtNome.getText().isEmpty() && txtRamal.getText().isEmpty() && cbxSetor.getSelectedItem().toString() == "Selecione")
            {
                atualizaTabelaFuncionario();
            }
            try
            {
                String Setor = (String) cbxSetor.getSelectedItem();
                NUPSI = 1
                Informática = 2
                Recepção = 3
                Coordenação = 4
                Serviços Gerais = 5
                Administração = 6

                Setor = Integer.parseInt((String) cbxSetor.getSelectedItem());

                listaFuncionario = FuncionarioDAO.buscaNome(txtNome.getText(), Setor, txtRamal.getText(), ckbDocente_Busca.isSelected(), ckbInativo_Busca.isSelected());

            }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog( null, "Erro: "+ex);
            }
            }

        atualizaTabelaBusca();*/
    }//GEN-LAST:event_btnBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBusca;
    private javax.swing.JButton btnBusca;
    private javax.swing.JComboBox<String> cbxSetor;
    private javax.swing.JCheckBox ckbDocente_Busca;
    private javax.swing.JCheckBox ckbInativo_Busca;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRamal;
    // End of variables declaration//GEN-END:variables
}
