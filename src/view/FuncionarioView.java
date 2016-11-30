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
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
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
        tbeFuncionario.getTableHeader().setReorderingAllowed(false);
        atualizaBoxSetor();
        atualizaTabelaFuncionario();
        desativarCampos();
    }

    //Pega a lista de setores 
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
    
    
    
     //Atualiza todos os funcionario para a tabela
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
    //atualiza parcialmente os funcionarios a partir do que foi digitado na busca
    public void atualizaTabelaFiltro(){
        funcionario = new FuncionarioM();
        

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbeFuncionario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tfdCelular1 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        tfdCidadeEstado = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdTelResidencial = new javax.swing.JFormattedTextField();
        tfdTelComercial1 = new javax.swing.JFormattedTextField();
        cbxDocente = new javax.swing.JCheckBox();
        tfdTelComercial2 = new javax.swing.JFormattedTextField();
        tfdCelular2 = new javax.swing.JFormattedTextField();
        tfdCelular3 = new javax.swing.JFormattedTextField();
        tfdHorario = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taaObservacao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxInativo = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfdRamal = new javax.swing.JTextField();
        tfdDia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxSetor = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        BOTAOSETAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfdbusca = new javax.swing.JTextField();
        cbxFiltro = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel2.setToolTipText("");

        tfdCelular1.setFormatterFactory(setFormatoCelular());

        jLabel20.setText("* Campos Obrigatórios ");

        tfdCidadeEstado.setEnabled(false);

        jLabel19.setText("ID");

        tfdId.setEditable(false);
        tfdId.setEnabled(false);

        jLabel1.setText("Nome *");

        tfdEndereco.setEnabled(false);

        jLabel2.setText("Endereço *");

        jLabel3.setText("Cidade/Estado *");

        jLabel4.setText("Tel Residêncial*");

        jLabel7.setText("Celular (1) *");

        tfdNome.setEnabled(false);

        tfdTelResidencial.setFormatterFactory(setFormatoTelefone());

        tfdTelComercial1.setFormatterFactory(setFormatoTelefone());

        cbxDocente.setText("Docente");
        cbxDocente.setEnabled(false);

        tfdTelComercial2.setFormatterFactory(setFormatoTelefone());

        tfdCelular2.setFormatterFactory(setFormatoCelular());

        tfdCelular3.setFormatterFactory(setFormatoCelular());

        tfdHorario.setEnabled(false);

        jLabel18.setText("Horário");

        taaObservacao.setColumns(20);
        taaObservacao.setRows(5);
        jScrollPane2.setViewportView(taaObservacao);

        jLabel8.setText("Celular (2)");

        jLabel9.setText("Celular (3)");

        cbxInativo.setText("Inativo");
        cbxInativo.setEnabled(false);

        jLabel10.setText("E-Mail *");

        jLabel11.setText("Setor *");

        tfdEmail.setEnabled(false);

        jLabel12.setText("Ramal");

        tfdRamal.setEnabled(false);

        tfdDia.setEnabled(false);

        jLabel13.setText("Dia");

        cbxSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxSetor.setEnabled(false);
        cbxSetor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxSetorItemStateChanged(evt);
            }
        });

        jLabel14.setText("Observação");

        jLabel5.setText("Tel Comercial (1)");

        jLabel6.setText("Tel Comercial (2)");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        BOTAOSETAR.setText("SETAR");
        BOTAOSETAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTAOSETARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdTelComercial1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdCelular3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdTelComercial2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(jLabel12))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cbxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfdRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfdDia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(tfdHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(cbxDocente)
                .addGap(130, 130, 130)
                .addComponent(cbxInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BOTAOSETAR))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdCidadeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdTelComercial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdCelular3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdTelComercial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel14)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDocente)
                    .addComponent(cbxInativo))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTAOSETAR)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busca", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tfdbusca.setPreferredSize(new java.awt.Dimension(6, 23));
        tfdbusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfdbuscaKeyPressed(evt);
            }
        });

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Setor", "Inativo" }));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(95, 23));

        jLabel15.setText("Filtro");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel15)
                .addComponent(cbxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tfdbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnBuscar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(350, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Pega valores das colunas e transcreve para os campos de texto
    private void tbeFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeFuncionarioMouseClicked
        tbeFuncionario.getTableHeader().setReorderingAllowed(false);
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
        if(tfdNome.getText().isEmpty() || tfdEndereco.getText().isEmpty() || tfdCidadeEstado.getText().isEmpty() || tfdTelResidencial.getText().isEmpty()||
            tfdCelular1.getText().isEmpty() ||tfdEmail.getText().isEmpty() || cbxSetor.getSelectedIndex()!=0){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(tfdId.getText().isEmpty()){
            //Salva tudo digitado no campo de texto para o objeto e salva no banco de dados
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
            //Salva tudo que foi alterado nos campos de texto para o objeto e salva no banco de dados
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
    
    //O botão excluir é liberado após escolhido um funcionario na tabela
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
     btnAlterar.setEnabled(false);
     btnExcluir.setEnabled(false);
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

    //Quando o setor é selecionado, é transcrito para o campo de texto "Ramal"
    private void cbxSetorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxSetorItemStateChanged
    if(cbxSetor.getSelectedIndex()>=1){
        tfdRamal.setText(Integer.toString(pegaSetor().getRamal()));
    }
    }//GEN-LAST:event_cbxSetorItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    listaFuncionario = null;
        if(tfdbusca.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            atualizaTabelaFuncionario();
        }
        else if(cbxFiltro.getSelectedIndex()== 0)
        {
            try{
                
                listaFuncionario = FuncionarioDAO.buscaFiltroNome(tfdbusca.getText());
                if(listaFuncionario == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaFuncionario();
                    
                }else{
                    
                atualizaTabelaFiltro();
                
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else if(cbxFiltro.getSelectedIndex() == 1){
                        
            try{
                
                listaFuncionario = FuncionarioDAO.buscaFiltroSetor(tfdbusca.getText());
                if(listaFuncionario == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaFuncionario();
                    
                }else{
                    
                atualizaTabelaFiltro();
                
                }

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
        }else if(cbxFiltro.getSelectedIndex() == 2){
            
             try{
                
                listaFuncionario = FuncionarioDAO.buscaFiltroInativo(tfdbusca.getText());
                if(listaFuncionario == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    atualizaTabelaFuncionario();
                    
                }else{
                    
                atualizaTabelaFiltro();
                
                }

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfdbuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdbuscaKeyPressed
    
    }//GEN-LAST:event_tfdbuscaKeyPressed
   
    //Ao selecionario um setor, é chamada o dao para fazer a busca no banco de dados
    public SetorM pegaSetor(){
        try{
            if(cbxSetor.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Selecione um setor.", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                return setorDAO.buscaNome(cbxSetor.getSelectedItem().toString());
            }
        }catch(SQLException ex){
            Logger.getLogger(FuncionarioView.class.getClass()).log(Level.SEVERE,null,ex);
        }
        return null;
    }
    
    //Mascara que formata para regularizar como é inserido o telefone
    public static DefaultFormatterFactory setFormatoTelefone(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##) ####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    }
    
    //Mascara que formata para regularizar como é inserido o celular
    public static DefaultFormatterFactory setFormatoCelular(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##)9####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taaObservacao;
    private javax.swing.JTable tbeFuncionario;
    private javax.swing.JFormattedTextField tfdCelular1;
    private javax.swing.JFormattedTextField tfdCelular2;
    private javax.swing.JFormattedTextField tfdCelular3;
    private javax.swing.JTextField tfdCidadeEstado;
    private javax.swing.JTextField tfdDia;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdHorario;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdRamal;
    private javax.swing.JFormattedTextField tfdTelComercial1;
    private javax.swing.JFormattedTextField tfdTelComercial2;
    private javax.swing.JFormattedTextField tfdTelResidencial;
    private javax.swing.JTextField tfdbusca;
    // End of variables declaration//GEN-END:variables
}
