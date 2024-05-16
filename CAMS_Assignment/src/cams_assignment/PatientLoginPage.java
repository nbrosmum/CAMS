
package cams_assignment;

import javax.swing.JOptionPane;

public class PatientLoginPage extends javax.swing.JFrame {


    public PatientLoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        RegisterLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        UserPasswordLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        SPCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMS_PatientLogin");

        LoginLabel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        LoginLabel.setText("Login");

        RegisterLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        RegisterLabel.setText("Click Here ! Create a New Account ?");
        RegisterLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterLabelMouseClicked(evt);
            }
        });

        UsernameLabel.setText("Email :");

        UserPasswordLabel.setText("Password :");

        BackButton.setText("Cancel");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserPasswordLabel)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LoginButton)
                                .addGap(42, 42, 42)
                                .addComponent(BackButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SPCheckBox)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LoginLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(BackButton))
                .addGap(30, 30, 30)
                .addComponent(RegisterLabel)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMouseClicked
        ResgisterPage rp = new ResgisterPage();
        rp.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterLabelMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String Email = Username.getText();
        String Password = new String(PasswordField.getPassword());
        
        User u = new User();
        if(Email.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Email !");
        }else if(Password.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Password !");
        }else if(u.Login(Email, Password)){
            JOptionPane.showMessageDialog(null, "Login Successful !");
            UserPage Up = new UserPage(u);
            Up.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Email & Password !");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void SPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPCheckBoxActionPerformed
        if(SPCheckBox.isSelected()){
            PasswordField.setEchoChar((char)0);
        }else{
            PasswordField.setEchoChar('*'); 
        }
    }//GEN-LAST:event_SPCheckBoxActionPerformed

 
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
            java.util.logging.Logger.getLogger(PatientLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JCheckBox SPCheckBox;
    private javax.swing.JLabel UserPasswordLabel;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel UsernameLabel;
    // End of variables declaration//GEN-END:variables
}
