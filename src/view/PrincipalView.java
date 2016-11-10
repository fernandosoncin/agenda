package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import model.UsuarioM;

public class PrincipalView extends javax.swing.JFrame {

    UsuarioM usuarioAtivo = new UsuarioM();
    
    public PrincipalView(UsuarioM usuario) {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.usuarioAtivo = usuario;
        /*if(usuario.isAdmin() == false){
             mnuCadastrar.setEnabled(false);
             mniAdicionarUsuario.setEnabled(false);
        }*/
        URL url = this.getClass().getResource("/view/icones/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jMenu2 = new javax.swing.JMenu();
        pnlPrincipal = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mmuCadastrar = new javax.swing.JMenu();
        mmiFuncionario = new javax.swing.JMenuItem();
        mniDepartamento = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1216, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(56, 48));

        mmuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/arquivo.png"))); // NOI18N
        mmuCadastrar.setText("Arquivos");
        mmuCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mmuCadastrar.setHideActionText(true);

        mmiFuncionario.setText("Funcionários");
        mmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiFuncionarioActionPerformed(evt);
            }
        });
        mmuCadastrar.add(mmiFuncionario);

        mniDepartamento.setText("Setor");
        mniDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDepartamentoActionPerformed(evt);
            }
        });
        mmuCadastrar.add(mniDepartamento);

        jMenuBar2.add(mmuCadastrar);

        mnuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/pesquisa.png"))); // NOI18N
        mnuConsulta.setText("Consulta");
        mnuConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnuConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuConsultaMouseClicked(evt);
            }
        });
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenuBar2.add(mnuConsulta);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiFuncionarioActionPerformed
    FuncionarioView contato = new FuncionarioView();
    pnlPrincipal.removeAll();
    pnlPrincipal.add(contato);
    pnlPrincipal.updateUI();
    }//GEN-LAST:event_mmiFuncionarioActionPerformed

    private void mniDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDepartamentoActionPerformed
    SetorView departamento = new SetorView();
    pnlPrincipal.removeAll();
    pnlPrincipal.add(departamento);
    pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniDepartamentoActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed

    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void mnuConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuConsultaMouseClicked
    ConsultaView pesquisa = new ConsultaView();
    pnlPrincipal.removeAll();
    pnlPrincipal.add(pesquisa);
    pnlPrincipal.updateUI();
    }//GEN-LAST:event_mnuConsultaMouseClicked




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JMenuItem mmiFuncionario;
    private javax.swing.JMenu mmuCadastrar;
    private javax.swing.JMenuItem mniDepartamento;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
