/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiw;

import Controller.Validacao;
import Model.Funcionario;
import Model.FuncionarioDAO;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
   


/**
 *
 * @author mucav
 */
public class LoginAdmin extends javax.swing.JFrame {
   

    /**
     * Creates new form LoginFunc
     */
    public LoginAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usenameadmin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textPasswordadmin = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        Funcionario = new javax.swing.JLabel();
        chkShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BEM-VINDO");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/imagens/2895919.jpg"))); // NOI18N

        lblMensagem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblMensagem)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(lblMensagem)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/imagens/Marcelo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 187));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_close_window_30px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 27, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_user_20px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 30, -1));

        usenameadmin.setBackground(new java.awt.Color(0, 255, 255));
        usenameadmin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        usenameadmin.setForeground(new java.awt.Color(0, 0, 0));
        usenameadmin.setBorder(null);
        jPanel2.add(usenameadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_lock_20px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        textPasswordadmin.setBackground(new java.awt.Color(0, 255, 255));
        textPasswordadmin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPasswordadmin.setForeground(new java.awt.Color(0, 0, 0));
        textPasswordadmin.setBorder(null);
        textPasswordadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordadminActionPerformed(evt);
            }
        });
        jPanel2.add(textPasswordadmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 13));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 180, 10));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Entrar.setBackground(new java.awt.Color(0, 0, 0));
        Entrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setBorder(null);
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });
        jPanel2.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 114, 33));

        Funcionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_name_tag_30px.png"))); // NOI18N
        Funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FuncionarioMouseClicked(evt);
            }
        });
        jPanel2.add(Funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 33, 32));

        chkShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        chkShowPassword.setText("Mostrar senha");
        chkShowPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkShowPasswordItemStateChanged(evt);
            }
        });
        jPanel2.add(chkShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(845, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textPasswordadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordadminActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void FuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionarioMouseClicked
        this.setVisible(false);
        new LoginFunc().setVisible(true);
        
    }//GEN-LAST:event_FuncionarioMouseClicked

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void chkShowPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkShowPasswordItemStateChanged
          if (evt.getStateChange() == ItemEvent.SELECTED) {
        // Quando o checkbox é marcado, a senha é mostrada
        textPasswordadmin.setEchoChar((char) 0);
    } else {
        // Quando o checkbox é desmarcado, a senha é ocultada
        textPasswordadmin.setEchoChar('*'); 
    }
    }//GEN-LAST:event_chkShowPasswordItemStateChanged
//autenticacao da senha caso asenha seja a mesma da base de dados ele verfica tambem que tipo de usuario 
    //esta a entrar no sistema, caso seja o gestor ele abre a tela principal do gestor,
    //casso contrario ele abre a tela de funcionario simples
    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
    }//GEN-LAST:event_EntrarActionPerformed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        try {
        String usuario = usenameadmin.getText().trim();
        String senha = new String(textPasswordadmin.getPassword()).trim();
        if (Validacao.isCampoVazio(usuario) || Validacao.isCampoVazio(senha)) {
            lblMensagem.setText("Preencha todos os campos!");
            return;
        }
        if (!Validacao.isTamanhoSenhaValido(senha, 6)) {
            lblMensagem.setText("A senha deve ter no mínimo 6 caracteres!");
            return;
        }

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDAO.buscarPorUsuarioSenha(usuario, senha);

        
        if (funcionario != null && funcionario.getTipo().equals("Gestor")) {
            MenuPrincipalAdmin menuPrincipalGestor = new MenuPrincipalAdmin();
            menuPrincipalGestor.setVisible(true);
            this.dispose(); 
            
        } else if (funcionario != null) {
   
            MenuPrincipalFuncio menuPrincipalSimples = new MenuPrincipalFuncio();
            menuPrincipalSimples.setVisible(true);
            this.dispose();
        } else {
            lblMensagem.setText("Usuário ou senha incorretos!");
        }
    } /**catch (SQLException e) {
        // Exceções relacionadas a banco de dados, exibe a mensagem na JLabel
        lblMensagem.setText("Erro de conexão com o banco de dados: " + e.getMessage());
    } **/catch (Exception e) {
        // Outras exceções não previstas, exibe a mensagem na JLabel
        lblMensagem.setText("Ocorreu um erro inesperado: " + e.getMessage());
    }
    }//GEN-LAST:event_EntrarMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Funcionario;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JPasswordField textPasswordadmin;
    private javax.swing.JTextField usenameadmin;
    // End of variables declaration//GEN-END:variables
}
