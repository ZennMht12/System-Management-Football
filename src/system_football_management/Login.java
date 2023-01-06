/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system_football_management;
import javax.swing.JOptionPane;
/**
 *
 * @author ZAINI M
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
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
        bg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Subject1 = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        icon_user = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        icon_User = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        subject1 = new javax.swing.JLabel();
        btn_login1 = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        subject3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Downloads\\corner-ball-6566084_1280.jpg")); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, 0, 880, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 610));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Subject1.setBackground(new java.awt.Color(52, 73, 94));
        Subject1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 36)); // NOI18N
        Subject1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Pictures\\New Folder\\icons8_home_48.png")); // NOI18N
        Subject1.setText("LOGIN");
        jPanel2.add(Subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, -1));

        Password.setBackground(new java.awt.Color(52, 73, 94));
        Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password.setText("PASSWORD");
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 110, -1));

        icon_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Pictures\\New Folder\\icons8_key_16.png")); // NOI18N
        jPanel2.add(icon_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 20, 30));

        Username.setBackground(new java.awt.Color(52, 73, 94));
        Username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Username.setText("USERNAME");
        jPanel2.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        icon_User.setIcon(new javax.swing.ImageIcon("C:\\Users\\ZAINI M\\Pictures\\New Folder\\icons8_user_16.png")); // NOI18N
        jPanel2.add(icon_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 20, 30));

        txt_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 290, -1));

        txt_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, 20));

        subject1.setBackground(new java.awt.Color(52, 73, 94));
        subject1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subject1.setText("Sign up to see Menu System");
        jPanel2.add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 170, -1));

        btn_login1.setBackground(new java.awt.Color(126, 214, 223));
        btn_login1.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 14)); // NOI18N
        btn_login1.setText("LOGIN");
        btn_login1.setBorder(null);
        btn_login1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_login1MouseClicked(evt);
            }
        });
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 100, 30));

        btn_exit.setBackground(new java.awt.Color(235, 47, 6));
        btn_exit.setFont(new java.awt.Font("JetBrains Mono ExtraBold", 1, 20)); // NOI18N
        btn_exit.setText("X");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 40, 30));

        subject3.setBackground(new java.awt.Color(52, 73, 94));
        subject3.setForeground(new java.awt.Color(204, 204, 204));
        subject3.setText("Terms, Data Policy and Cookies Policy");
        jPanel2.add(subject3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 0, 440, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_login1ActionPerformed
    
   
    private void btn_login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_login1MouseClicked
        // TODO add your handling code here:
        String username = txt_username.getText();
        String password = String.valueOf(txt_password.getPassword());
        
        if(username.isEmpty() && password.isEmpty()){
             JOptionPane.showMessageDialog(null, "Username and password are required", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if((username.isEmpty() || username.isBlank()) && password != null){
             JOptionPane.showMessageDialog(null, "Username are required", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else if((password.isEmpty() || password.isBlank()) && username != null){
             JOptionPane.showMessageDialog(null, "Passsword are required", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            if(username.equals("admin") && password.equals("admin")){
                Home h = new Home();
                this.setVisible(false);
                h.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(null, "DATA INVALID", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
                    
                   
        
    }//GEN-LAST:event_btn_login1MouseClicked

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Subject1;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login1;
    private javax.swing.JLabel icon_User;
    private javax.swing.JLabel icon_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel subject1;
    private javax.swing.JLabel subject3;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
