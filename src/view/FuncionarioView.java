package view;

import javax.swing.JFrame;


public class FuncionarioView extends javax.swing.JInternalFrame {


    public FuncionarioView() {
        initComponents();
        this.setVisible(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdEndereco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdCidadeEstado = new javax.swing.JTextField();
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
        tfdEmail = new javax.swing.JTextField();
        tfdSetor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfdRamal = new javax.swing.JTextField();
        tfdDia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbxFiltro = new javax.swing.JComboBox();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        cbxDocente = new javax.swing.JCheckBox();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
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

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(null);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 14, 27, 14);

        tfdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfdNome);
        tfdNome.setBounds(19, 34, 405, 20);
        getContentPane().add(tfdEndereco);
        tfdEndereco.setBounds(19, 80, 405, 20);

        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(19, 60, 45, 14);

        jLabel3.setText("Cidade/Estado");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(19, 106, 70, 14);

        tfdCidadeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCidadeEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(tfdCidadeEstado);
        tfdCidadeEstado.setBounds(19, 126, 405, 20);
        getContentPane().add(tfdTelResidencial);
        tfdTelResidencial.setBounds(19, 172, 405, 20);

        jLabel4.setText("Tel Residêncial");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 152, 70, 14);

        jLabel5.setText("Tel Comercial (1)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(19, 198, 80, 14);
        getContentPane().add(tfdTelComercial1);
        tfdTelComercial1.setBounds(19, 218, 405, 20);
        getContentPane().add(tfdTelComercial2);
        tfdTelComercial2.setBounds(19, 264, 405, 20);

        jLabel6.setText("Tel Comercial (2)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 244, 80, 14);
        getContentPane().add(tfdCelular1);
        tfdCelular1.setBounds(19, 310, 405, 20);

        jLabel7.setText("Celular (1)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(19, 290, 50, 14);

        jLabel8.setText("Celular (2)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(19, 336, 50, 14);
        getContentPane().add(tfdCelular2);
        tfdCelular2.setBounds(19, 356, 405, 20);
        getContentPane().add(tfdCelular3);
        tfdCelular3.setBounds(19, 402, 405, 20);

        jLabel9.setText("Celular (3)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(19, 382, 50, 14);

        jLabel10.setText("Email");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(19, 428, 24, 14);

        tfdEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfdEmail);
        tfdEmail.setBounds(19, 448, 405, 20);
        getContentPane().add(tfdSetor);
        tfdSetor.setBounds(19, 494, 405, 20);

        jLabel11.setText("Setor");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(19, 474, 26, 14);

        jLabel12.setText("Ramal");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(19, 520, 29, 14);
        getContentPane().add(tfdRamal);
        tfdRamal.setBounds(19, 540, 405, 20);
        getContentPane().add(tfdDia);
        tfdDia.setBounds(19, 586, 405, 20);

        jLabel13.setText("Dia");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(19, 566, 15, 14);

        jLabel14.setText("Observação");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(19, 658, 58, 14);

        jLabel15.setText("Filtro");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(456, 14, 24, 14);

        cbxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Endereço", "Cidade/Estado", "Departamento", " " }));
        cbxFiltro.setPreferredSize(new java.awt.Dimension(95, 23));
        getContentPane().add(cbxFiltro);
        cbxFiltro.setBounds(484, 14, 265, 23);

        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(1028, 14, 82, 23);

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
        jScrollPane1.setViewportView(tblFuncionario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(456, 43, 1061, 657);

        cbxDocente.setText("Docente");
        getContentPane().add(cbxDocente);
        cbxDocente.setBounds(20, 730, 80, 23);

        btnNovo.setText("Novo");
        getContentPane().add(btnNovo);
        btnNovo.setBounds(450, 710, 77, 23);

        btnSalvar.setText("Salvar");
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(540, 710, 74, 23);

        btnExcluir.setText("Excluir");
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(620, 710, 76, 23);

        btnAlterar.setText("Alterar");
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(700, 710, 85, 23);

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProximo);
        btnProximo.setBounds(1031, 718, 49, 23);

        btnAnterior.setText("<<");
        getContentPane().add(btnAnterior);
        btnAnterior.setBounds(946, 718, 49, 23);

        jLabel16.setText("0/0");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(1005, 722, 16, 14);

        jLabel17.setText("Ir para:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1270, 720, 37, 20);
        getContentPane().add(tfdPaginas);
        tfdPaginas.setBounds(1310, 720, 53, 20);

        tfdbusca.setPreferredSize(new java.awt.Dimension(6, 23));
        getContentPane().add(tfdbusca);
        tfdbusca.setBounds(759, 14, 263, 23);
        getContentPane().add(tfdHorario);
        tfdHorario.setBounds(19, 632, 405, 20);

        jLabel18.setText("Horário");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(19, 612, 35, 14);

        taaObservacao.setColumns(20);
        taaObservacao.setRows(5);
        jScrollPane2.setViewportView(taaObservacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(19, 678, 405, 50);

        cbxInativo.setText("Inativo");
        getContentPane().add(cbxInativo);
        cbxInativo.setBounds(100, 730, 59, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdNomeActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProximoActionPerformed

    private void tfdCidadeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCidadeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCidadeEstadoActionPerformed

    private void tfdEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdEmailActionPerformed


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
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdPaginas;
    private javax.swing.JTextField tfdRamal;
    private javax.swing.JTextField tfdSetor;
    private javax.swing.JTextField tfdTelComercial1;
    private javax.swing.JTextField tfdTelComercial2;
    private javax.swing.JTextField tfdTelResidencial;
    private javax.swing.JTextField tfdbusca;
    // End of variables declaration//GEN-END:variables
}
