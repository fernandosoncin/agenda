package view;

import com.sun.istack.internal.logging.Logger;
import dao.FuncionarioDAO;
import java.util.List;
import javax.swing.JFrame;
import model.SetorM;
import dao.SetorDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import model.FuncionarioM;
import sun.util.logging.PlatformLogger;


public class FuncionarioView extends javax.swing.JInternalFrame {
    FuncionarioM funcionario = new FuncionarioM();
    List<SetorM> listasetor;
    public FuncionarioView() {
        initComponents();
        this.setVisible(true);
        
    }

    /*public void atualizaBoxSetor(){
       
        cbxSetor.removeAllItems();
        cbxSetor.addItem("--Selecione");
        try{
            listasetor = SetorDAO.;    corrigir
        }catch(SQLException ex){
            
            Logger.getLogger(FuncionarioView.class.getClass()).log(Level.SEVERE,null,ex);
        }
         String dados[][] = new String[listaSetor.size()][5];
        int i = 0;
        for (SetorM gra : listaSetor) {
            cbxSetor.addItem(gra.getId());
        }
    }*/
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdTelResidencial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfdTelComercial1 = new javax.swing.JTextField();
        tfdTelComercial2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfdCelular1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfdCelular2 = new javax.swing.JTextField();
        tfdCelular3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdRamal = new javax.swing.JTextField();
        tfdDia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        cbxDocente = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tfdPaginas = new javax.swing.JTextField();
        tfdbusca = new javax.swing.JTextField();
        tfdHorario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taaObservacao = new javax.swing.JTextArea();
        cbxInativo = new javax.swing.JCheckBox();
        tfdNome = new javax.swing.JTextField();
        btnProximo = new javax.swing.JButton();
        tfdCidadeEstado = new javax.swing.JTextField();
        tfdEmail = new javax.swing.JTextField();
        cbxSetor = new javax.swing.JComboBox();
        cbxFiltro = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1440, 900));

        jLabel1.setText("Nome");

        jLabel2.setText("Endereço");

        jLabel3.setText("Cidade/Estado");

        jLabel4.setText("Tel Residêncial");

        jLabel5.setText("Tel Comercial (1)");

        jLabel6.setText("Tel Comercial (2)");

        jLabel7.setText("Celular (1)");

        jLabel8.setText("Celular (2)");

        jLabel9.setText("Celular (3)");

        jLabel10.setText("Email");

        jLabel11.setText("Setor");

        jLabel12.setText("Ramal");

        jLabel13.setText("Dia");

        jLabel14.setText("Observação");

        jLabel15.setText("Filtro");

        btnBuscar.setText("Buscar");

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Leonardo Barcelos", "Rua das Flores 278", "Frutal/MG", "34 3423-4523", "34 3423-9874", "34 3423-5429", "17 99652-3217", "34 8125-3645", "11 98452-3674", "leonardo@uemg.br", "Informática", "2563", "Segunda/Quarta/Sexta", "19:00 as 22:40", "Sem observação"},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Endereço", "Cidade/Estado", "Tel Residêncial", "Tel Comercial (1)", "Tel Comercial (2)", "Celular (1)", "Celular (2)", "Celular (3)", "Email", "Departamento", "Ramal", "Dia", "Horário", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionario);

        cbxDocente.setText("Docente");

        btnNovo.setText("Novo");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");

        btnAnterior.setText("<<");

        jLabel16.setText("0/0");

        jLabel17.setText("Ir para:");

        tfdbusca.setPreferredSize(new java.awt.Dimension(6, 23));

        jLabel18.setText("Horário");

        taaObservacao.setColumns(20);
        taaObservacao.setRows(5);
        jScrollPane2.setViewportView(taaObservacao);

        cbxInativo.setText("Inativo");

        btnProximo.setText(">>");

        cbxSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Endereço", "Cidade/Estado", "Departamento", " " }));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(95, 23));

        jLabel19.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cbxInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfdEndereco)
                    .addComponent(tfdTelResidencial)
                    .addComponent(tfdTelComercial1)
                    .addComponent(tfdTelComercial2)
                    .addComponent(tfdCelular1)
                    .addComponent(tfdCelular2)
                    .addComponent(tfdCelular3)
                    .addComponent(tfdRamal)
                    .addComponent(tfdDia)
                    .addComponent(tfdHorario)
                    .addComponent(jScrollPane2)
                    .addComponent(tfdCidadeEstado)
                    .addComponent(tfdEmail)
                    .addComponent(cbxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfdId, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(btnAnterior)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProximo)
                        .addGap(190, 190, 190)
                        .addComponent(jLabel17)
                        .addGap(3, 3, 3)
                        .addComponent(tfdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(tfdTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(tfdTelComercial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(tfdTelComercial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(tfdCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)
                        .addComponent(tfdCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(tfdCelular3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(tfdRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)
                        .addComponent(tfdDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addGap(6, 6, 6)
                        .addComponent(tfdHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxDocente)
                            .addComponent(cbxInativo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir)
                            .addComponent(btnAlterar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnAnterior))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(btnProximo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tfdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    if(tfdNome.getText().isEmpty() || tfdEndereco.getText().isEmpty() || tfdCidadeEstado.getText().isEmpty() || tfdTelResidencial.getText().isEmpty() || tfdTelComercial1.getText().isEmpty() || 
            tfdTelComercial1.getText().isEmpty() || tfdTelComercial2.getText().isEmpty() || tfdCelular1.getText().isEmpty() || tfdCelular2.getText().isEmpty() || tfdCelular3.getText().isEmpty() ||
            tfdEmail.getText().isEmpty() || tfdDia.getText().isEmpty() || tfdHorario.getText().isEmpty() || taaObservacao.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
          tfdNome.requestFocusInWindow(); 
    }
    else if(tfdId.getText().isEmpty()){
        
        funcionario.setNome(tfdNome.getText());
        funcionario.setEndereco(tfdEndereco.getText());
        funcionario.setCidadeestado(tfdCidadeEstado.getText());
        funcionario.setTelresidencial(tfdTelResidencial.getText());
        funcionario.setTelcomercial1(tfdTelComercial1.getText());
        funcionario.setTelcomercial2(tfdTelComercial2.getText());
        funcionario.setCelular1(tfdCelular1.getText());
        funcionario.setCelular2(tfdCelular2.getText());
        funcionario.setCelular3(tfdCelular3.getText());
        funcionario.setEmail(tfdEmail.getText());
        funcionario.setSetor(cbxSetor.getSelectedItem().toString());
        funcionario.setDia(tfdDia.getText());
        funcionario.setHorario(tfdHorario.getText());
        funcionario.setObservacao(taaObservacao.getText());
        funcionario.setDocente(cbxDocente.isSelected());
        funcionario.setInativo(cbxInativo.isSelected());
        try{
            FuncionarioDAO.salvar(funcionario);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
            tfdNome.requestFocusInWindow();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        //atualizarTabelaFuncinario();
        //prepararSalvareCancelar();
        //desativarCampos();
        //limpaCamposSetor();
    }
    else{
        funcionario.setId(Integer.parseInt(tfdId.getText()));
        funcionario.setNome(tfdNome.getText());
        funcionario.setEndereco(tfdEndereco.getText());
        funcionario.setCidadeestado(tfdCidadeEstado.getText());
        funcionario.setTelresidencial(tfdTelResidencial.getText());
        funcionario.setTelcomercial1(tfdTelComercial1.getText());
        funcionario.setTelcomercial2(tfdTelComercial2.getText());
        funcionario.setCelular1(tfdCelular1.getText());
        funcionario.setCelular2(tfdCelular2.getText());
        funcionario.setCelular3(tfdCelular3.getText());
        funcionario.setEmail(tfdEmail.getText());
        funcionario.setSetor(cbxSetor.getSelectedItem().toString());
        funcionario.setDia(tfdDia.getText());
        funcionario.setHorario(tfdHorario.getText());
        funcionario.setObservacao(taaObservacao.getText());
        funcionario.setDocente(cbxDocente.isSelected());
        funcionario.setInativo(cbxInativo.isSelected());
    }
    try{
        FuncionarioDAO.alterar(funcionario);
        JOptionPane.showMessageDialog(null, "alterado com sucesso!");
    }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
    }
    //atualizarTabelaFuncionario();
    //prepararSalvareCancelar();
    //desativarCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
    tfdId.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),0).toString());
    tfdNome.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),1).toString());
    tfdEndereco.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),2).toString());
    tfdCidadeEstado.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),3).toString());
    tfdTelResidencial.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),4).toString());
    tfdTelComercial1.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),5).toString());
    tfdTelComercial2.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),6).toString());
    tfdCelular1.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),7).toString());
    tfdCelular2.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),8).toString());
    tfdCelular3.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),9).toString());
    tfdEmail.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),10).toString());
    cbxSetor.setSelectedItem(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),11).toString());
    tfdDia.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),12).toString());
    tfdHorario.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),13).toString());
    taaObservacao.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),14).toString());
    cbxDocente.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),15).toString());
    cbxInativo.setText(tblFuncionario.getValueAt(tblFuncionario.getSelectedRow(),16).toString());

    }//GEN-LAST:event_tblFuncionarioMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbxDocente;
    private javax.swing.JComboBox cbxFiltro;
    private javax.swing.JCheckBox cbxInativo;
    private javax.swing.JComboBox cbxSetor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTextArea taaObservacao;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField tfdCelular1;
    private javax.swing.JTextField tfdCelular2;
    private javax.swing.JTextField tfdCelular3;
    private javax.swing.JTextField tfdCidadeEstado;
    private javax.swing.JTextField tfdDia;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdHorario;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdPaginas;
    private javax.swing.JTextField tfdRamal;
    private javax.swing.JTextField tfdTelComercial1;
    private javax.swing.JTextField tfdTelComercial2;
    private javax.swing.JTextField tfdTelResidencial;
    private javax.swing.JTextField tfdbusca;
    // End of variables declaration//GEN-END:variables
}
