
package cams_assignment;

import javax.swing.JOptionPane;


public class AdminLoginPage extends javax.swing.JFrame {

    public AdminLoginPage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminIDLabel = new javax.swing.JLabel();
        AdminID = new javax.swing.JTextField();
        AdminPasswordLabel = new javax.swing.JLabel();
        AdminLoginButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        AdminRegisterLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        SPCheckBox = new javax.swing.JCheckBox();
        AdminPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMS_AdminLogin");

        AdminIDLabel.setText("Admin ID : ");

        AdminPasswordLabel.setText("Password :");

        AdminLoginButton.setText("Login");
        AdminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginButtonActionPerformed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        LoginLabel.setText("Login");

        AdminRegisterLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        AdminRegisterLabel.setText("Click Here ! Create a New Account ?");
        AdminRegisterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminRegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminRegisterLabelMouseClicked(evt);
            }
        });

        BackButton.setText("Cancel");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        SPCheckBox.setText("Show Password");
        SPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AdminIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AdminLoginButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                            .addComponent(BackButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SPCheckBox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AdminPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AdminID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))
                    .addComponent(AdminRegisterLabel))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(LoginLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminPasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPCheckBox)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminLoginButton)
                            .addComponent(BackButton))
                        .addGap(18, 18, 18)
                        .addComponent(AdminRegisterLabel)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminRegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminRegisterLabelMouseClicked
        AdminResgisterPage ARP = new AdminResgisterPage();
        ARP.setVisible(true);
        dispose();
    }//GEN-LAST:event_AdminRegisterLabelMouseClicked

    private void AdminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginButtonActionPerformed
        String ID = AdminID.getText();
        String Password = new String(AdminPasswordField.getPassword());
        
        Admin a = new Admin();
        if(ID.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Admin ID !");
        }else if(Password.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Password !");
        }else if(a.Login(ID, Password)){
            JOptionPane.showMessageDialog(null, "Login Successful !");
            AdminPage ap = new AdminPage(a);
            ap.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Admin ID & Password !");
        }
        
    }//GEN-LAST:event_AdminLoginButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPCheckBoxActionPerformed
        if(SPCheckBox.isSelected()){
            AdminPasswordField.setEchoChar((char)0);
        }else{
            AdminPasswordField.setEchoChar('*');
        }
        //reference for https://www.youtube.com/watch?v=u1F1UpP7ZTY
    }//GEN-LAST:event_SPCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminID;
    private javax.swing.JLabel AdminIDLabel;
    private javax.swing.JButton AdminLoginButton;
    private javax.swing.JPasswordField AdminPasswordField;
    private javax.swing.JLabel AdminPasswordLabel;
    private javax.swing.JLabel AdminRegisterLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JCheckBox SPCheckBox;
    // End of variables declaration//GEN-END:variables
}
