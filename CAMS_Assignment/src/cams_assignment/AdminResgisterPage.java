
package cams_assignment;

import javax.swing.JOptionPane;


public class AdminResgisterPage extends javax.swing.JFrame {


    public AdminResgisterPage() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResgisterLabel = new javax.swing.JLabel();
        AdminIDLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PLabel = new javax.swing.JLabel();
        CPLabel = new javax.swing.JLabel();
        AdminIDTextField = new javax.swing.JTextField();
        NameTextField = new javax.swing.JTextField();
        AdminPasswordField = new javax.swing.JPasswordField();
        AdminCPasswordField = new javax.swing.JPasswordField();
        SPCheckBox = new javax.swing.JCheckBox();
        SubmitButton = new javax.swing.JButton();
        SignUpLabel = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMS_AdminResgister");

        ResgisterLabel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        ResgisterLabel.setText("Resgister");

        AdminIDLabel.setText("Admin ID :");

        NameLabel.setText("Name :");

        PLabel.setText("Password:");

        CPLabel.setText("Confrim Password:");

        SPCheckBox.setText("Show Password");
        SPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPCheckBoxActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SignUpLabel.setText("Alrealdy has a Account ? Sign in Click Here");
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CPLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminIDLabel)
                            .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PLabel))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SPCheckBox))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(AdminCPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AdminIDTextField)
                                .addComponent(ResgisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NameTextField)
                                .addComponent(AdminPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(SubmitButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CancelButton)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(SignUpLabel)))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ResgisterLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminIDLabel)
                    .addComponent(AdminIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLabel)
                            .addComponent(AdminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPLabel)
                            .addComponent(AdminCPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SPCheckBox)
                            .addComponent(ClearButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CancelButton)
                            .addComponent(SubmitButton))))
                .addGap(50, 50, 50)
                .addComponent(SignUpLabel)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
        AdminLoginPage ALP = new AdminLoginPage();
        ALP.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpLabelMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPCheckBoxActionPerformed
        if(SPCheckBox.isSelected()){
            AdminPasswordField.setEchoChar((char)0);
            AdminCPasswordField.setEchoChar((char)0);
        }else{
            AdminPasswordField.setEchoChar('*');
            AdminCPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_SPCheckBoxActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        AdminIDTextField.setText(null);
        NameTextField.setText(null);
        AdminPasswordField.setText(null);
        AdminCPasswordField.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        String AdminID  = AdminIDTextField.getText();
        String Name  = NameTextField.getText();
        String Password = new String(AdminPasswordField.getPassword());
        String CPassword = new String(AdminCPasswordField.getPassword());
        DBFile db = new DBFile();
        Admin a = new Admin();
        if(AdminID.equals("")){
            JOptionPane.showMessageDialog(null, "Please insert your Admin ID !");
        }else if(!db.CheckAdminID(AdminID)){
            JOptionPane.showMessageDialog(null, AdminID +" had been Register !");
        }else if(db.CheckAdminIDList(AdminID)){
            JOptionPane.showMessageDialog(null, "unvalid Admin ID !");
        }else{
            if(Name.equals("")){
                JOptionPane.showMessageDialog(null, "Please insert your Name !");
            }else if(Password.equals("")){
                JOptionPane.showMessageDialog(null, "Please insert your Password !");
            }else if(Password.length()< 8 || Password.length() > 12){
                JOptionPane.showMessageDialog(null, "Password Requiment Password must in 8- 12 !");
            }else if(!Password.matches(".*[A-Z].*")|| !Password.matches(".*[a-z].*")){
                JOptionPane.showMessageDialog(null, "Password Requiment Password must contain at least one Uppercase and Lowercase letter");
            }else if(!Password.matches(".*\\d.*") || !Password.matches(".*[^\\w\\s].*")){
                JOptionPane.showMessageDialog(null, "Password Requiment Password must contain at least one digit and symbol(!@#$%^&*)");
            }else if(!Password.equals(CPassword)){
                JOptionPane.showMessageDialog(null, "the Password Doesn`t match !");
            }else{
                JOptionPane.showMessageDialog(null, "Register Successful");
                a.Resgister(AdminID, Name, Password);
                AdminLoginPage ALP = new AdminLoginPage();
                ALP.setVisible(true);
                this.dispose();
            }
        }

        
    }//GEN-LAST:event_SubmitButtonActionPerformed


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
            java.util.logging.Logger.getLogger(AdminResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminResgisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AdminCPasswordField;
    private javax.swing.JLabel AdminIDLabel;
    private javax.swing.JTextField AdminIDTextField;
    private javax.swing.JPasswordField AdminPasswordField;
    private javax.swing.JLabel CPLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PLabel;
    private javax.swing.JLabel ResgisterLabel;
    private javax.swing.JCheckBox SPCheckBox;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
