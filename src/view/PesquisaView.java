package view;

import dao.FuncionarioDAO;
import dao.SetorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioM;
import model.SetorM;

public class PesquisaView extends javax.swing.JInternalFrame {

    FuncionarioM funcionario = new FuncionarioM();
    
    List<FuncionarioM> listaFuncionario;
    List<SetorM> listaSetor;
    SetorDAO setorDAO;
    FuncionarioDAO funcionarioDAO;
    
    public PesquisaView() {
        initComponents();
        this.setVisible(true);
        
        //Intansciação das váriaves de acesso na classe
        this.funcionarioDAO = new FuncionarioDAO();
        this.setorDAO = new SetorDAO();  
        this.listaSetor = new ArrayList<>();
        this.listaFuncionario = new ArrayList<>();
        
        atualizaTabelaFuncionario();
        PanelInfo.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbeConsulta = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        PanelBusca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRamal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbxDepartamento = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
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
        TextObs = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        LabelRamal = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelTelRes = new javax.swing.JLabel();
        LabelTel1 = new javax.swing.JLabel();
        LabelTel2 = new javax.swing.JLabel();
        LabelDep = new javax.swing.JLabel();
        LabelCel1 = new javax.swing.JLabel();
        LabelCel2 = new javax.swing.JLabel();
        LabelCel3 = new javax.swing.JLabel();
        LabelCidade = new javax.swing.JLabel();
        LabelEnd = new javax.swing.JLabel();
        LabelDia = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        tbeConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "..", ".Ramal", "Setor."
            }
        ));
        tbeConsulta.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tbeConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeConsulta);

        jLabel17.setText("Ir para:");

        PanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Busca"));

        jLabel2.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel12.setText("Ramal");

        jLabel11.setText("Setor");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        cbxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "NUPSI", "Informática", "Recepção", "Coordenação", "Serviços Gerais", "Administração" }));

        jCheckBox1.setText("Docentes");

        jCheckBox2.setText("Inativos");

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
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cbxDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PanelBuscaLayout.setVerticalGroup(
            PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaLayout.createSequentialGroup()
                .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        PanelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        jLabel1.setText("Nome");

        jLabel3.setText("Ramal");

        jLabel4.setText("Departamento");

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

        TextObs.setColumns(20);
        TextObs.setRows(5);
        jScrollPane2.setViewportView(TextObs);

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

        LabelNome.setBackground(new java.awt.Color(255, 255, 255));
        LabelNome.setText("----");

        LabelRamal.setText("-----");

        LabelEmail.setText("-----");

        LabelTelRes.setText("----");

        LabelTel1.setText("----");

        LabelTel2.setText("----");

        LabelDep.setText("----");

        LabelCel1.setText("----");

        LabelCel2.setText("----");

        LabelCel3.setText("----");

        LabelCidade.setText("----");

        LabelEnd.setText("----");

        LabelDia.setText("----");

        LabelHora.setText("----");

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
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCidade))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelEnd)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTelRes))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTel1))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelTel2))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelDia))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelRamal))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNome))
                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelEmail)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelHora)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInfoLayout.createSequentialGroup()
                                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelCel1))
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelCel2))
                                            .addGroup(PanelInfoLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LabelCel3))))
                                    .addGroup(PanelInfoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelDep)))
                                .addGap(60, 60, 60))))))
        );
        PanelInfoLayout.setVerticalGroup(
            PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LabelNome))
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LabelRamal))
                        .addGap(22, 22, 22)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(LabelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LabelTelRes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LabelTel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LabelTel2)))
                    .addGroup(PanelInfoLayout.createSequentialGroup()
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LabelDep))
                        .addGap(86, 86, 86)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LabelCel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LabelCel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(LabelCel3))))
                .addGap(44, 44, 44)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(LabelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(LabelEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(LabelDia)
                    .addComponent(LabelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(PanelObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1409, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(584, 584, 584))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelBusca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    
    public void atualizaTabelaFuncionario(){
        funcionario = new FuncionarioM();
        try {
            listaFuncionario = funcionarioDAO.listaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaFuncionario.size()][18];
            int i = 0;
            for (FuncionarioM funcionario : listaFuncionario) {
                dados[i][0] = funcionario.getNome();
                        
                dados[i][1] = funcionario.getSetor().getNome();
                dados[i][2] = String.valueOf(funcionario.getSetor().getRamal());
                dados[i][3] = funcionario.getCidadeestado();
                dados[i][4] = funcionario.getTelresidencial();
                dados[i][5] = funcionario.getTelcomercial1();
                dados[i][6] = funcionario.getTelcomercial2();
                dados[i][7] = funcionario.getCelular1();
                dados[i][8] = funcionario.getCelular2();
                dados[i][9] = funcionario.getCelular3();
                dados[i][10] = funcionario.getEmail();
                dados[i][11] = funcionario.getEndereco();
                dados[i][12] = String.valueOf(funcionario.getId());
                dados[i][13] = funcionario.getDia();
                dados[i][14] = funcionario.getHorario();
                dados[i][15] = funcionario.getObservacao();
                dados[i][16] = String.valueOf(funcionario.getDocente());
                dados[i][17] = String.valueOf(funcionario.getInativo());
               
                i++;
            }
            String tituloColuna[] = {"Nome", "Setor", "Ramal",};
            DefaultTableModel tabelaConsulta = new DefaultTableModel();
            tabelaConsulta.setDataVector(dados, tituloColuna);
            tbeConsulta.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, //false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tbeConsulta.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbeConsulta.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbeConsulta.getColumnModel().getColumn(2).setPreferredWidth(50);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tbeConsulta.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tbeConsulta.setRowHeight(25);
            tbeConsulta.updateUI();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        if(txtNome.getText().isEmpty() && txtRamal.getText().isEmpty() && cbxDepartamento.getSelectedItem().toString() == "Selecione")
        {
            // Mostrar todos os Funcionarios;
        }
        else if(txtNome.getText() != null)
        {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbeConsultaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tbeConsultaMouseClicked
    {//GEN-HEADEREND:event_tbeConsultaMouseClicked
        // Quando Clicado
        
        PanelInfo.setVisible(true);
        
        
        LabelNome.setText(tbeConsulta.getValueAt(tbeConsulta.getSelectedRow(),1).toString());
        LabelEnd.setText(tbeConsulta.getValueAt(tbeConsulta.getSelectedRow(),11).toString());
        LabelCidade.setText(tbeConsulta.getValueAt(tbeConsulta.getSelectedRow(),3).toString());
        /*LabelTelResidencial.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),4).toString());
        tfdTelComercial1.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),5).toString());
        tfdTelComercial2.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),6).toString());
        tfdCelular1.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),7).toString());
        tfdCelular2.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),8).toString());
        tfdCelular3.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),9).toString());
        tfdEmail.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),10).toString());
        cbxSetor.setSelectedItem(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),11).toString());
        tfdDia.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),12).toString());
        tfdHorario.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),13).toString());
        taaObservacao.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),14).toString());
        cbxDocente.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),15).toString());
        cbxInativo.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),16).toString());*/
    }//GEN-LAST:event_tbeConsultaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCel1;
    private javax.swing.JLabel LabelCel2;
    private javax.swing.JLabel LabelCel3;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelDep;
    private javax.swing.JLabel LabelDia;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelEnd;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelRamal;
    private javax.swing.JLabel LabelTel1;
    private javax.swing.JLabel LabelTel2;
    private javax.swing.JLabel LabelTelRes;
    private javax.swing.JPanel PanelBusca;
    private javax.swing.JPanel PanelInfo;
    private javax.swing.JPanel PanelObs;
    private javax.swing.JTextArea TextObs;
    private javax.swing.JComboBox<String> cbxDepartamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTable tbeConsulta;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRamal;
    // End of variables declaration//GEN-END:variables
}
