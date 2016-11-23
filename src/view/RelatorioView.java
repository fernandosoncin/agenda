package view;

import dao.FuncionarioDAO;
import java.io.File;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.FuncionarioM;


public class RelatorioView extends javax.swing.JInternalFrame {

    FuncionarioM funcionario = new FuncionarioM();
    public RelatorioView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbeConsulta = new javax.swing.JTable();
        PanelInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PanelObs = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taaObs = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRamal = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelRes = new javax.swing.JLabel();
        lblTel1 = new javax.swing.JLabel();
        lbllTel2 = new javax.swing.JLabel();
        lblSetor = new javax.swing.JLabel();
        lblCel1 = new javax.swing.JLabel();
        lblCel2 = new javax.swing.JLabel();
        lblCel3 = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        ckbDocente = new javax.swing.JCheckBox();
        ckbInativo = new javax.swing.JCheckBox();
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
        jButton1 = new javax.swing.JButton();

        tbeConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Ramal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeConsulta.setFocusable(false);
        tbeConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeConsulta);

        PanelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Nome");

        jLabel3.setText("Ramal");

        jLabel4.setText("Setor");

        jLabel5.setText("Telefone Residencial");

        jLabel6.setText("Telefone Comercial 1");

        jLabel7.setText("Telefone Comercial 2");

        jLabel8.setText("Celular 1");

        jLabel9.setText("Celular 2");

        jLabel10.setText("Celular 3");

        jLabel13.setText("E-Mail");

        jLabel14.setText("Cidade/Estado");

        jLabel15.setText("Endereço");

        PanelObs.setBorder(javax.swing.BorderFactory.createTitledBorder("Observações"));

        taaObs.setColumns(20);
        taaObs.setRows(5);
        jScrollPane2.setViewportView(taaObs);

        javax.swing.GroupLayout PanelObsLayout = new javax.swing.GroupLayout(PanelObs);
        PanelObs.setLayout(PanelObsLayout);
        PanelObsLayout.setHorizontalGroup(
            PanelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        PanelObsLayout.setVerticalGroup(
            PanelObsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelObsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel18.setText("Dia");

        jLabel19.setText("Horário");

        lblNome.setBackground(new java.awt.Color(255, 255, 255));
        lblNome.setText("----");

        lblRamal.setText("-----");

        lblEmail.setText("-----");

        lblTelRes.setText("----");

        lblTel1.setText("----");

        lbllTel2.setText("----");

        lblSetor.setText("----");

        lblCel1.setText("----");

        lblCel2.setText("----");

        lblCel3.setText("----");

        lblCidade.setText("----");

        lblEnd.setText("----");

        lblDia.setText("----");

        lblHora.setText("----");

        ckbDocente.setText("Docente");
        ckbDocente.setEnabled(false);

        ckbInativo.setText("Inativo");
        ckbInativo.setEnabled(false);

        javax.swing.GroupLayout PanelInfoLayout = new javax.swing.GroupLayout(PanelInfo);
        PanelInfo.setLayout(PanelInfoLayout);
        PanelInfoLayout.setHorizontalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addComponent(PanelObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTelRes))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTel1))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbllTel2))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDia))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRamal))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNome))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHora)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCel1))
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCel2))
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblCel3))))
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSetor)))
                                .addGap(60, 60, 60))))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckbDocente)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCidade))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEnd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckbInativo)
                        .addGap(127, 127, 127))))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNome))
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblRamal))
                        .addGap(22, 22, 22)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblEmail))
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblTelRes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblTel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbllTel2)))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblSetor))
                        .addGap(86, 86, 86)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblCel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblCel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblCel3))))
                .addGap(44, 44, 44)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(lblDia)
                    .addComponent(lblHora))
                .addGap(27, 27, 27)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbDocente)
                    .addComponent(ckbInativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(PanelObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        jButton1.setText("Gerar Relatório");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(PanelBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbeConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeConsultaMouseClicked
        // Quando Clicado

        funcionario = new FuncionarioM();
        PanelInfo.setVisible(true);

        lblNome.setText(tbeConsulta.getValueAt(tbeConsulta.getSelectedRow(),0).toString());

        String integer = lblNome.getText();
        int id = Integer.parseInt(integer);
        funcionario.setId( id );
        try{
            funcionario = FuncionarioDAO.busca(id);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }

        lblNome.setText(funcionario.getNome());
        lblSetor.setText(funcionario.getSetor().getNome());
        lblRamal.setText(Integer.toString(funcionario.getSetor().getRamal()));
        lblCidade.setText(funcionario.getCidadeestado());
        lblTelRes.setText(funcionario.getTelresidencial());
        lblTel1.setText(funcionario.getTelcomercial1().toString());
        lbllTel2.setText(funcionario.getTelcomercial2().toString());
        lblCel1.setText(funcionario.getCelular1().toString());
        lblCel2.setText(funcionario.getCelular2().toString());
        lblCel3.setText(funcionario.getCelular3().toString());
        lblEmail.setText(funcionario.getEmail());
        lblEnd.setText(funcionario.getEndereco().toString());
        lblDia.setText(funcionario.getDia().toString());
        lblHora.setText(funcionario.getHorario().toString());
        taaObs.setText(funcionario.getObservacao());
        ckbDocente.setSelected(funcionario.getDocente());
        ckbInativo.setSelected(funcionario.getInativo());
    }//GEN-LAST:event_tbeConsultaMouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        funcionario = new FuncionarioM();
        //if(txtNome.getText().isEmpty() && txtRamal.getText().isEmpty() && cbxSetor.getSelectedItem().toString() == "Selecione" && ckbDocente_Busca.isSelected() == false|| ckbInativo_Busca.isSelected() == false)
        //{
            //  JOptionPane.showMessageDialog( null, "Por favor digite pelo menos um dos campos de pesquisa!");
            // atualizaTabelaBusca();
            //}
        //if(txtNome.getText().length() > 0 || txtRamal.getText().length()>0 || cbxSetor.getSelectedItem().toString() != "Selecione")
        //|| ckbDocente_Busca.isSelected() == true || ckbInativo_Busca.isSelected() == true)
        //{
            if(txtNome.getText().isEmpty() && txtRamal.getText().isEmpty() && cbxSetor.getSelectedItem().toString() == "Selecione")
            {
              //  atualizaTabelaFuncionario();
            }
          //  try
            {
                String Setor = (String) cbxSetor.getSelectedItem();
                /*NUPSI = 1
                Informática = 2
                Recepção = 3
                Coordenação = 4
                Serviços Gerais = 5
                Administração = 6*/

                //Setor = Integer.parseInt((String) cbxSetor.getSelectedItem());

                // = FuncionarioDAO.buscaNome(txtNome.getText(), Setor, txtRamal.getText(), ckbDocente_Busca.isSelected(), ckbInativo_Busca.isSelected());

          //  }catch(SQLException ex)
            {
                JOptionPane.showMessageDialog( null, "Erro: ");
            }
            //}
    }
      //  atualizaTabelaBusca();
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String nomediretorio = null;
        String nomepasta = "Relatorios Sala"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
        try {
            nomediretorio = "C:" + separador + nomepasta;
            if (!new File(nomediretorio).exists()) {
                (new File(nomediretorio)).mkdir();
            }
           // gerarDocumento();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBusca;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel PanelObs;
    private javax.swing.JButton btnBusca;
    private javax.swing.JComboBox<String> cbxSetor;
    private javax.swing.JCheckBox ckbDocente;
    private javax.swing.JCheckBox ckbDocente_Busca;
    private javax.swing.JCheckBox ckbInativo;
    private javax.swing.JCheckBox ckbInativo_Busca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCel2;
    private javax.swing.JLabel lblCel3;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRamal;
    private javax.swing.JLabel lblSetor;
    private javax.swing.JLabel lblTel1;
    private javax.swing.JLabel lblTelRes;
    private javax.swing.JLabel lbllTel2;
    private javax.swing.JTextArea taaObs;
    private javax.swing.JTable tbeConsulta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRamal;
    // End of variables declaration//GEN-END:variables
}
