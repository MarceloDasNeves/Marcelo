/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Veiw;

import java.awt.event.ItemEvent;


/**
 *
 * @author mucav
 */
public class Login extends javax.swing.JFrame {
       

    /**
     * Creates new form LoginFunc
     */
    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernamefunc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textPasswordfunc = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Entrarfunc = new javax.swing.JButton();
        chkShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BEM-VINDO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/imagens/3108285.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, 334));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 507));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_close_window_30px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 10, 27, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_user_20px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 30, -1));

        usernamefunc.setBackground(new java.awt.Color(0, 255, 255));
        usernamefunc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        usernamefunc.setForeground(new java.awt.Color(0, 0, 0));
        usernamefunc.setBorder(null);
        usernamefunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefuncActionPerformed(evt);
            }
        });
        jPanel2.add(usernamefunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Veiw/icons/icons8_lock_20px.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 30));

        textPasswordfunc.setBackground(new java.awt.Color(0, 255, 255));
        textPasswordfunc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        textPasswordfunc.setForeground(new java.awt.Color(0, 0, 0));
        textPasswordfunc.setBorder(null);
        textPasswordfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordfuncActionPerformed(evt);
            }
        });
        jPanel2.add(textPasswordfunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 180, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 13));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 180, 10));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Entrarfunc.setBackground(new java.awt.Color(0, 0, 0));
        Entrarfunc.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Entrarfunc.setForeground(new java.awt.Color(255, 255, 255));
        Entrarfunc.setText("Entrar");
        Entrarfunc.setBorder(null);
        jPanel2.add(Entrarfunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 114, 33));

        chkShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        chkShowPassword.setText("Mostrar senha");
        chkShowPassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkShowPasswordItemStateChanged(evt);
            }
        });
        jPanel2.add(chkShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 446, 507));

        setSize(new java.awt.Dimension(845, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textPasswordfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordfuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordfuncActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

         
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void chkShowPasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkShowPasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
        // Quando o checkbox é marcado, a senha é mostrada
        textPasswordfunc.setEchoChar((char) 0);
    } else {
        // Quando o checkbox é desmarcado, a senha é ocultada
        textPasswordfunc.setEchoChar('*'); // ou outro caractere de sua escolha
    }
    }//GEN-LAST:event_chkShowPasswordItemStateChanged

    private void usernamefuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefuncActionPerformed
        
    }//GEN-LAST:event_usernamefuncActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrarfunc;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField textPasswordfunc;
    private javax.swing.JTextField usernamefunc;
    // End of variables declaration//GEN-END:variables
}
