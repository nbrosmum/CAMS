
package cams_assignment;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;


public class ResgisterPage extends javax.swing.JFrame {


    public ResgisterPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderbGroup = new javax.swing.ButtonGroup();
        GenderLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        BODLabel = new javax.swing.JLabel();
        CPasswordField = new javax.swing.JPasswordField();
        PLabel = new javax.swing.JLabel();
        SPCheckBox = new javax.swing.JCheckBox();
        CPLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        SignUpLabel = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        CancelButton = new javax.swing.JButton();
        ResgisterLabel = new javax.swing.JLabel();
        FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        BODateChooser = new com.toedter.calendar.JDateChooser();
        ContactLabel = new javax.swing.JLabel();
        HpTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        ClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CAMS_Resgister");

        GenderLabel.setText("Gender :");

        BODLabel.setText("DOB :");

        PLabel.setText("Password:");

        SPCheckBox.setText("Show Password");
        SPCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPCheckBoxActionPerformed(evt);
            }
        });

        CPLabel.setText("Confrim Password:");

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

        GenderbGroup.add(MaleRadioButton);
        MaleRadioButton.setText("Male");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ResgisterLabel.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        ResgisterLabel.setText("Resgister");

        GenderbGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");

        jLabel1.setText("Age :");

        NameLabel.setText("Name :");

        ContactLabel.setText("Contact Number :");

        jLabel2.setText("Email :");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(SignUpLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BODLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BODateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(EmailTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(PLabel))
                                    .addComponent(CPLabel))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SPCheckBox))
                            .addComponent(PasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(HpTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPasswordField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubmitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CancelButton)))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(133, 133, 133)
                    .addComponent(ResgisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenderLabel)
                    .addComponent(MaleRadioButton)
                    .addComponent(FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BODLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BODateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContactLabel)
                    .addComponent(HpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPLabel)
                    .addComponent(CPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPCheckBox)
                    .addComponent(ClearButton))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(CancelButton))
                .addGap(40, 40, 40)
                .addComponent(SignUpLabel)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ResgisterLabel)
                    .addContainerGap(579, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SPCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPCheckBoxActionPerformed
        if(SPCheckBox.isSelected()){
            PasswordField.setEchoChar((char)0);
            CPasswordField.setEchoChar((char)0);
        }else{
            PasswordField.setEchoChar('*');
            CPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_SPCheckBoxActionPerformed
    
    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
        PatientLoginPage PLP = new PatientLoginPage();
        PLP.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpLabelMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        MainPage mp = new MainPage();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        try{
            SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String genderDefine = "";
            if(MaleRadioButton.isSelected()){
                genderDefine = "Male";
            }else if (FemaleRadioButton.isSelected()){
                genderDefine = "Female";
            }
            String Name = NameTextField.getText();
            String Email = EmailTextField.getText();
            String Gender = genderDefine;
            //https://www.youtube.com/watch?v=f-XsbZuCRtQ
            String Age = AgeTextField.getText();
            String BOD = DateFormat.format(BODateChooser.getDate());
            String Contact = HpTextField.getText();
            String Password = new String(PasswordField.getPassword());
            String CPassword = new String(CPasswordField.getPassword());
            DBFile db = new DBFile();
            if(!db.CheckEmail(Email)){
                JOptionPane.showMessageDialog(null, "Email had been Use !");
            }else{
                if(Name.equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert your Name !");
                }else if(Email.equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert your Email !");
                }else if(!Email.matches(".*[^\\w\\s].*")){
                    JOptionPane.showMessageDialog(null, "Wrong Email Format !");
                }else if(Gender.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Select Your Gender !!!");
                }else if(Age.equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert your Age !!!");
                }else if(Contact.equals("")){
                    JOptionPane.showMessageDialog(null, "Please insert your Contact Number !");
                }else if(!db.CheckContact(Contact)){
                    JOptionPane.showMessageDialog(null, "Wrong Phone number format !");
                }else if(Password.isBlank()){
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
                    JOptionPane.showMessageDialog(null, "Resgister Successful !");
                    User user = new User();
                    user.Resgister(Name, Email, Gender, Age, BOD, Contact, Password);
                    PatientLoginPage PLP = new PatientLoginPage();
                    PLP.setVisible(true);
                    this.dispose();
                
                }
            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please insert your compelete information to Resgister!");
        }

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        NameTextField.setText(null);
        EmailTextField.setText(null);
        GenderbGroup.clearSelection();
        AgeTextField.setText(null);
        BODateChooser.setDate(null);
        HpTextField.setText(null);
        PasswordField.setText(null);
        CPasswordField.setText(null);
    }//GEN-LAST:event_ClearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResgisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResgisterPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JLabel BODLabel;
    private com.toedter.calendar.JDateChooser BODateChooser;
    private javax.swing.JLabel CPLabel;
    private javax.swing.JPasswordField CPasswordField;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel ContactLabel;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.ButtonGroup GenderbGroup;
    private javax.swing.JTextField HpTextField;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel PLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel ResgisterLabel;
    private javax.swing.JCheckBox SPCheckBox;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
