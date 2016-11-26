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
        this.setVisible(true);
        
        //GroupButton de Tipos.
        buttonGroup1.add(radFuncionarios);
        buttonGroup1.add(radSetores);
        
        //GroupButton de Ordenação.
        buttonGroup2.add(radNome);
        buttonGroup2.add(radSetor);
        
        //GroupButton de Filtros.
        buttonGroup3.add(radTodos);
        buttonGroup3.add(radDocente);
        buttonGroup3.add(radInativo);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeConsulta = new javax.swing.JTable();
        PanelBusca = new javax.swing.JPanel();
        btnBusca = new javax.swing.JButton();
        pnlTipos = new javax.swing.JPanel();
        radFuncionarios = new javax.swing.JRadioButton();
        radSetores = new javax.swing.JRadioButton();
        btnRelatorio = new javax.swing.JButton();
        pnlOrdenacao = new javax.swing.JPanel();
        radNome = new javax.swing.JRadioButton();
        radSetor = new javax.swing.JRadioButton();
        pnlFiltro = new javax.swing.JPanel();
        radTodos = new javax.swing.JRadioButton();
        radDocente = new javax.swing.JRadioButton();
        radInativo = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setMaximizable(true);

        tbeConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", ""},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Ramal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbeConsulta.setFocusable(false);
        tbeConsulta.getTableHeader().setReorderingAllowed(false);
        tbeConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbeConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbeConsulta);
        if (tbeConsulta.getColumnModel().getColumnCount() > 0) {
            tbeConsulta.getColumnModel().getColumn(0).setResizable(false);
            tbeConsulta.getColumnModel().getColumn(0).setPreferredWidth(350);
            tbeConsulta.getColumnModel().getColumn(1).setResizable(false);
            tbeConsulta.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        PanelBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório"));
        PanelBusca.setName("Relatório"); // NOI18N

        btnBusca.setText("Buscar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        pnlTipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos"));
        pnlTipos.setPreferredSize(new java.awt.Dimension(220, 50));

        radFuncionarios.setText("Funcionarios");
        radFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFuncionariosActionPerformed(evt);
            }
        });

        radSetores.setText("Setores");
        radSetores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSetoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTiposLayout = new javax.swing.GroupLayout(pnlTipos);
        pnlTipos.setLayout(pnlTiposLayout);
        pnlTiposLayout.setHorizontalGroup(
            pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radSetores)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlTiposLayout.setVerticalGroup(
            pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTiposLayout.createSequentialGroup()
                .addGroup(pnlTiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radFuncionarios)
                    .addComponent(radSetores))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        btnRelatorio.setText("Gerar Relatório PDF");
        btnRelatorio.setEnabled(false);
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        pnlOrdenacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenação"));
        pnlOrdenacao.setPreferredSize(new java.awt.Dimension(176, 50));

        radNome.setText("Por Nome");
        radNome.setEnabled(false);

        radSetor.setText("Por Setor");
        radSetor.setEnabled(false);

        javax.swing.GroupLayout pnlOrdenacaoLayout = new javax.swing.GroupLayout(pnlOrdenacao);
        pnlOrdenacao.setLayout(pnlOrdenacaoLayout);
        pnlOrdenacaoLayout.setHorizontalGroup(
            pnlOrdenacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radSetor)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlOrdenacaoLayout.setVerticalGroup(
            pnlOrdenacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdenacaoLayout.createSequentialGroup()
                .addGroup(pnlOrdenacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radNome)
                    .addComponent(radSetor))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pnlFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        radTodos.setText("Todos");
        radTodos.setEnabled(false);

        radDocente.setText("Docentes");
        radDocente.setEnabled(false);

        radInativo.setText("Inativos");
        radInativo.setEnabled(false);

        javax.swing.GroupLayout pnlFiltroLayout = new javax.swing.GroupLayout(pnlFiltro);
        pnlFiltro.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radDocente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radInativo))
                    .addGroup(pnlFiltroLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(radTodos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFiltroLayout.setVerticalGroup(
            pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFiltroLayout.createSequentialGroup()
                .addComponent(radTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radDocente)
                    .addComponent(radInativo)))
        );

        javax.swing.GroupLayout PanelBuscaLayout = new javax.swing.GroupLayout(PanelBusca);
        PanelBusca.setLayout(PanelBuscaLayout);
        PanelBuscaLayout.setHorizontalGroup(
            PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBuscaLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(btnRelatorio)
                .addGap(18, 18, 18))
        );
        PanelBuscaLayout.setVerticalGroup(
            PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscaLayout.createSequentialGroup()
                .addComponent(pnlTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addComponent(pnlOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBuscaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
                            .addGroup(PanelBuscaLayout.createSequentialGroup()
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelBuscaLayout.createSequentialGroup()
                        .addComponent(pnlFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelBusca.getAccessibleContext().setAccessibleName("Relatorio");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbeConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbeConsultaMouseClicked
        // Quando Clicado



        
    }//GEN-LAST:event_tbeConsultaMouseClicked

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        funcionario = new FuncionarioM();
        
        if (radFuncionarios.isSelected()){
            if ((radNome.isSelected() || radSetor.isSelected()) && (radTodos.isSelected() || radDocente.isSelected() || radInativo.isSelected())){
            //Gera a lista de Funcionarios com os seus filtros selecionados.
            JOptionPane.showMessageDialog(null, "Teste. Mostrar Lista de Nomes");
            //Libera o Botao de GERAR PDF.
            btnRelatorio.setEnabled(true);
            }
        }
        else if (radSetores.isSelected()){
            //Gera a lista de SETORES ORDENADO
            JOptionPane.showMessageDialog(null, "Teste. Mostrar Lista de Setores");
            //Libera o botao GERAR PDF
            btnRelatorio.setEnabled(true);
        }
        else{
            btnRelatorio.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
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
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void radFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFuncionariosActionPerformed
        // Habilita e limpa os JRadioButtons necessarios na pesquisa.
        if (radFuncionarios.isSelected()){
            btnRelatorio.setEnabled(false);
            radNome.setEnabled(true);
            radSetor.setEnabled(true);
            radTodos.setEnabled(true);
            radDocente.setEnabled(true);
            radInativo.setEnabled(true);
            
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
        }
    }//GEN-LAST:event_radFuncionariosActionPerformed

    private void radSetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSetoresActionPerformed
        //Desabilita e limpa os JRadioButtons desnecessarios.
        if (radSetores.isSelected()){
            btnRelatorio.setEnabled(false);
            radNome.setEnabled(false);
            radSetor.setEnabled(false);
            radTodos.setEnabled(false);
            radDocente.setEnabled(false);
            radInativo.setEnabled(false);
            
            buttonGroup2.clearSelection();
            buttonGroup3.clearSelection();
        }
    }//GEN-LAST:event_radSetoresActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBusca;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFiltro;
    private javax.swing.JPanel pnlOrdenacao;
    private javax.swing.JPanel pnlTipos;
    private javax.swing.JRadioButton radDocente;
    private javax.swing.JRadioButton radFuncionarios;
    private javax.swing.JRadioButton radInativo;
    private javax.swing.JRadioButton radNome;
    private javax.swing.JRadioButton radSetor;
    private javax.swing.JRadioButton radSetores;
    private javax.swing.JRadioButton radTodos;
    private javax.swing.JTable tbeConsulta;
    // End of variables declaration//GEN-END:variables
}
