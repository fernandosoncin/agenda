package view;

import com.sun.istack.internal.logging.Logger;
import dao.FuncionarioDAO;
import dao.SetorDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.FuncionarioM;
import model.SetorM;


public class FuncionarioView extends javax.swing.JInternalFrame {
    //Declaração variáveis de acesso.
    FuncionarioM funcionario = new FuncionarioM();
    
    List<FuncionarioM> listaFuncionario;
    List<SetorM> listaSetor;
    SetorDAO setorDAO;
    FuncionarioDAO funcionarioDAO;
    public FuncionarioView() {
    
        //Intansciação das váriaves de acesso na classe
        this.funcionarioDAO = new FuncionarioDAO();
        this.setorDAO = new SetorDAO();  
        this.listaSetor = new ArrayList<>();
        this.listaFuncionario = new ArrayList<>();
        
        //Inicia componentes
        initComponents();
        this.setVisible(true);
        
        //Chamada de Métodos
        atualizaBoxSetor();
        atualizaTabelaFuncionario();
        desativarCampos();
    }

  
    public void atualizaBoxSetor(){
       
        cbxSetor.removeAllItems();
        cbxSetor.addItem("--Selecione--");
        try{
            listaSetor = setorDAO.listaTodos();
        }catch(SQLException ex){    
            Logger.getLogger(FuncionarioView.class.getClass()).log(Level.SEVERE,null,ex);
        }
         String dados[][] = new String[listaSetor.size()][5];
        for (SetorM setor : listaSetor) {
            cbxSetor.addItem(setor.getNome());
        }
    } 
    
    
    
     
     public void atualizaTabelaFuncionario(){
        funcionario = new FuncionarioM();
        try {
            listaFuncionario = funcionarioDAO.listaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
 
        }
        
        String dados[][] = new String[listaFuncionario.size()][18];
            int i = 0;
            for (FuncionarioM funcionario : listaFuncionario) {
                dados[i][0] = String.valueOf(funcionario.getId());
                dados[i][1] = funcionario.getNome();
                dados[i][2] = funcionario.getEndereco();
                dados[i][3] = funcionario.getCidadeestado();
                dados[i][4] = funcionario.getTelresidencial();
                dados[i][5] = funcionario.getTelcomercial1();
                dados[i][6] = funcionario.getTelcomercial2();
                dados[i][7] = funcionario.getCelular1();
                dados[i][8] = funcionario.getCelular2();
                dados[i][9] = funcionario.getCelular3();
                dados[i][10] = funcionario.getEmail();
                dados[i][11] = funcionario.getSetor().getNome();
                dados[i][12] = String.valueOf(funcionario.getSetor().getRamal());
                dados[i][13] = funcionario.getDia();
                dados[i][14] = funcionario.getHorario();
                dados[i][15] = funcionario.getObservacao();
                dados[i][16] = String.valueOf(funcionario.getDocente());
                dados[i][17] = String.valueOf(funcionario.getInativo());
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Endereço","Cidade/Estado", "Tel Residencial", "Tel Comercial","Tel Comercial", "Celular 1", "Celular 2", "Celular 3", "E-mail", "Setor","Ramal", "Dia", "Horario","Observação", "Docente", "Inativo"};
            DefaultTableModel tabelaFuncionario = new DefaultTableModel();
            tabelaFuncionario.setDataVector(dados, tituloColuna);
            tbeFuncionario.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tbeFuncionario.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbeFuncionario.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbeFuncionario.getColumnModel().getColumn(2).setPreferredWidth(50);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tbeFuncionario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tbeFuncionario.setRowHeight(25);
            tbeFuncionario.updateUI();
    }
    
    
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
        tbeFuncionario = new javax.swing.JTable();
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
        btnProximo = new javax.swing.JButton();
        tfdCidadeEstado = new javax.swing.JTextField();
        tfdEmail = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        cbxSetor = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        tfdNome = new javax.swing.JTextField();
        BOTAOSETAR = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome");

        tfdEndereco.setEnabled(false);

        jLabel2.setText("Endereço");

        jLabel3.setText("Cidade/Estado");

        tfdTelResidencial.setEnabled(false);

        jLabel4.setText("Tel Residêncial");

        jLabel5.setText("Tel Comercial (1)");

        tfdTelComercial1.setEnabled(false);

        tfdTelComercial2.setEnabled(false);

        jLabel6.setText("Tel Comercial (2)");

        tfdCelular1.setEnabled(false);

        jLabel7.setText("Celular (1)");

        jLabel8.setText("Celular (2)");

        tfdCelular2.setEnabled(false);

        tfdCelular3.setEnabled(false);

        jLabel9.setText("Celular (3)");

        jLabel10.setText("Email");

        jLabel11.setText("Setor");

        jLabel12.setText("Ramal");

        tfdRamal.setEnabled(false);

        tfdDia.setEnabled(false);

        jLabel13.setText("Dia");

        jLabel14.setText("Observação");

        jLabel15.setText("Filtro");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbeFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Leonardo Barcelos", "Rua das Flores 278", "Frutal/MG", "34 3423-4523", "34 3423-9874", "34 3423-5429", "17 99652-3217", "34 8125-3645", "11 98452-3674", "leonardo@uemg.br", "Informática", "2563", "Segunda/Quarta/Sexta", "19:00 as 22:40", "Sem observação"},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Endereço", "Cidade/Estado", "Tel Residêncial", "Tel Comercial (1)", "Tel Comercial (2)", "Celular (1)", "Celular (2)", "Celular (3)", "Email", "Setor", "Ramal", "Dia", "Horário", "Observação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeFuncionario);

        cbxDocente.setText("Docente");
        cbxDocente.setEnabled(false);

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

        btnAnterior.setText("<<");

        jLabel16.setText("0/0");

        jLabel17.setText("Ir para:");

        tfdbusca.setPreferredSize(new java.awt.Dimension(6, 23));

        tfdHorario.setEnabled(false);

        jLabel18.setText("Horário");

        taaObservacao.setColumns(20);
        taaObservacao.setRows(5);
        jScrollPane2.setViewportView(taaObservacao);

        cbxInativo.setText("Inativo");
        cbxInativo.setEnabled(false);

        btnProximo.setText(">>");

        tfdCidadeEstado.setEnabled(false);

        tfdEmail.setEnabled(false);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Setor" }));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(95, 23));

        jLabel19.setText("ID");

        tfdId.setEditable(false);
        tfdId.setEnabled(false);

        cbxSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSetor.setEnabled(false);
        cbxSetor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSetorItemStateChanged(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tfdNome.setEnabled(false);

        BOTAOSETAR.setText("SETAR");
        BOTAOSETAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOSETARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BOTAOSETAR)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(3, 3, 3)
                                .addComponent(tfdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(284, 284, 284)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tfdId)
                                    .addGap(5, 5, 5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(cbxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(524, 524, 524)
                    .addComponent(btnAnterior)
                    .addGap(10, 10, 10)
                    .addComponent(jLabel16)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnProximo)
                    .addContainerGap(710, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnSalvar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir)
                            .addComponent(btnNovo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxDocente)
                                    .addComponent(cbxInativo))
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BOTAOSETAR)
                                .addContainerGap(26, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(6, 6, 6)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(690, 690, 690)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAnterior)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(btnProximo)))))
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbeFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeFuncionarioMouseClicked
        tfdId.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),0).toString());
        tfdNome.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),1).toString());
        tfdEndereco.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),2).toString());
        tfdCidadeEstado.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),3).toString());
        tfdTelResidencial.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),4).toString());
        tfdTelComercial1.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),5).toString());
        tfdTelComercial2.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),6).toString());
        tfdCelular1.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),7).toString());
        tfdCelular2.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),8).toString());
        tfdCelular3.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),9).toString());
        tfdEmail.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),10).toString());
        cbxSetor.setSelectedItem(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),11).toString());
        tfdRamal.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),12).toString());
        tfdDia.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),13).toString());
        tfdHorario.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),14).toString());
        taaObservacao.setText(tbeFuncionario.getValueAt(tbeFuncionario.getSelectedRow(),15).toString());
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_tbeFuncionarioMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(tfdNome.getText().isEmpty() || tfdEndereco.getText().isEmpty() || tfdCidadeEstado.getText().isEmpty() || tfdTelResidencial.getText().isEmpty() || tfdTelComercial1.getText().isEmpty() ||
            tfdTelComercial1.getText().isEmpty() || tfdTelComercial2.getText().isEmpty() || tfdCelular1.getText().isEmpty() || tfdCelular2.getText().isEmpty() || tfdCelular3.getText().isEmpty() ||
            tfdEmail.getText().isEmpty() || tfdDia.getText().isEmpty() || tfdHorario.getText().isEmpty() || taaObservacao.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "erro", JOptionPane.WARNING_MESSAGE);
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
            funcionario.setDia(tfdDia.getText());
            funcionario.setHorario(tfdHorario.getText());
            funcionario.setObservacao(taaObservacao.getText());
            funcionario.setSetor(pegaSetor());
            funcionario.setDocente(cbxDocente.isSelected());
            funcionario.setInativo(cbxInativo.isSelected());
            
            try{
                FuncionarioDAO.salvar(funcionario);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                tfdNome.requestFocusInWindow();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }

            atualizaTabelaFuncionario();
            prepararSalvareCancelar();
            desativarCampos();
            limparCamposFuncionario();
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
            funcionario.setDia(tfdDia.getText());
            funcionario.setHorario(tfdHorario.getText());
            funcionario.setObservacao(taaObservacao.getText());
            funcionario.setSetor(pegaSetor());
            funcionario.setDocente(cbxDocente.isSelected());
            funcionario.setInativo(cbxInativo.isSelected());
        
        try{
            FuncionarioDAO.alterar(funcionario);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        atualizaTabelaFuncionario();
        prepararSalvareCancelar();
        desativarCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tfdId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Funcionario", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else{
            funcionario.setId(Integer.parseInt(tfdId.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ tfdNome.getText());
            if(confirma ==0){
                try{
                    funcionarioDAO.excluir(funcionario);
                    limparCamposFuncionario();
                    tfdNome.requestFocusInWindow();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                }
                atualizaTabelaFuncionario();
                prepararExcluir();
            }
        }
        
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
     limparCamposFuncionario();
     prepararNovo();
     ativarCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    limparCamposFuncionario();
    prepararSalvareCancelar();
    desativarCampos();
    cbxFiltro.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        prepararAlterar();
        ativarCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void BOTAOSETARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTAOSETARActionPerformed
    
       tfdNome.setText("Fernando Soncin");
       tfdEndereco.setText("Delfino Nunes 188 Centro");
       tfdCidadeEstado.setText("Frutal");
       tfdTelResidencial.setText("32813053");
       tfdTelComercial1.setText("4566816");
       tfdTelComercial2.setText("78921651");
       tfdCelular1.setText("996587412");
       tfdCelular2.setText("452178561");
       tfdCelular3.setText("774584564");
       tfdEmail.setText("fernando@gmail");
       cbxSetor.setSelectedItem("2");
       tfdDia.setText("123");
       tfdHorario.setText("123");
       taaObservacao.setText("TESTE TESTE TESTE  TESTE");
    }//GEN-LAST:event_BOTAOSETARActionPerformed

    private void cbxSetorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSetorItemStateChanged
    if(cbxSetor.getSelectedIndex()>=1){
        tfdRamal.setText(Integer.toString(pegaSetor().getRamal()));
    }
    }//GEN-LAST:event_cbxSetorItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        funcionario = new FuncionarioM();
        if(cbxFiltro.getSelectedItem() == null)
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(cbxFiltro.getSelectedItem() == "Nome")
        {
            
            atualizaTabelaFuncionario();
            
        }
        else if(cbxFiltro.getSelectedItem() == "Setor"){
                        
           /* try{
                
                
                
                atualizaTabelaFuncionario();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog( null, "Erro: "+ex);
            }*/
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
   
    public SetorM pegaSetor(){
        try{
            if(cbxSetor.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Slecione um setor.", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                return setorDAO.buscaNome(cbxSetor.getSelectedItem().toString());
            }
        }catch(SQLException ex){
            Logger.getLogger(FuncionarioView.class.getClass()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    
    // DECLARAÇÃO DE MÉTODOS DE CONTROLE DE BOTÕES
   public void limparCamposFuncionario(){
       tfdId.setText("");
       tfdNome.setText("");
       tfdEndereco.setText("");
       tfdCidadeEstado.setText("");
       tfdTelResidencial.setText("");
       tfdTelComercial1.setText("");
       tfdTelComercial2.setText("");
       tfdCelular1.setText("");
       tfdCelular2.setText("");
       tfdCelular3.setText("");
       tfdEmail.setText("");
       cbxSetor.setSelectedItem("");
       tfdDia.setText("");
       tfdHorario.setText("");
       taaObservacao.setText("");
       cbxDocente.setText("");
       cbxInativo.setText("");
       cbxFiltro.setSelectedItem("");
       tfdbusca.setText("");
       atualizaBoxSetor();
   }
   
   public void ativarCampos(){
       tfdNome.setEnabled(true);
       tfdEndereco.setEnabled(true);
       tfdCidadeEstado.setEnabled(true);
       tfdTelResidencial.setEnabled(true);
       tfdTelComercial1.setEnabled(true);
       tfdTelComercial2.setEnabled(true);
       tfdCelular1.setEnabled(true);
       tfdCelular2.setEnabled(true);
       tfdCelular3.setEnabled(true);
       tfdEmail.setEnabled(true);
       cbxSetor.setEnabled(true);
       tfdDia.setEnabled(true);
       tfdHorario.setEnabled(true);
       taaObservacao.setEnabled(true);
       cbxDocente.setEnabled(true);cbxDocente.setText("Docente");
       cbxInativo.setEnabled(true);cbxInativo.setText("Inativo");
       cbxFiltro.setEnabled(true);
   }

   public void desativarCampos(){
       tfdNome.setEnabled(false);
       tfdEndereco.setEnabled(false);
       tfdCidadeEstado.setEnabled(false);
       tfdTelResidencial.setEnabled(false);
       tfdTelComercial1.setEnabled(false);
       tfdTelComercial2.setEnabled(false);
       tfdCelular1.setEnabled(false);
       tfdCelular2.setEnabled(false);
       tfdCelular3.setEnabled(false);
       tfdEmail.setEnabled(false);
       cbxSetor.setEnabled(false);
       tfdDia.setEnabled(false);
       tfdHorario.setEnabled(false);
       taaObservacao.setEnabled(false);
       cbxDocente.setEnabled(false);cbxDocente.setText("Docente");
       cbxInativo.setEnabled(false);cbxInativo.setText("Inativo");

   }
   
   public void prepararNovo() {
       btnNovo.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnCancelar.setEnabled(true);
       tbeFuncionario.setEnabled(false);
       tbeFuncionario.clearSelection();
       atualizaBoxSetor();
   }
   
   public void prepararSalvareCancelar() {
       btnNovo.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnCancelar.setEnabled(false);
       tbeFuncionario.setEnabled(true);
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
       tbeFuncionario.setEnabled(false);
       tbeFuncionario.clearSelection();
   }
   
   public void prepararExcluir(){
       btnExcluir.setEnabled(false);
       btnAlterar.setEnabled(false);
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOTAOSETAR;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
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
    private javax.swing.JTable tbeFuncionario;
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
