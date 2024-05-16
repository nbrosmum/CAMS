/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cams_assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nbros
 */
public class BookAppointmentPage extends javax.swing.JFrame {

    /**
     * Creates new form BookAppointmentPage
     */
    User u = new User();
    public BookAppointmentPage() {
        initComponents();
    }
    public BookAppointmentPage(User u) {
        initComponents();
        this.u = u;
        NTextField.setText(u.getName());
        HPTextField.setText(u.getContact());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TbuttonGroup = new javax.swing.ButtonGroup();
        TitleLabel = new javax.swing.JLabel();
        NLabel = new javax.swing.JLabel();
        HPLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NTextField = new javax.swing.JTextField();
        HPTextField = new javax.swing.JTextField();
        DateChooser = new com.toedter.calendar.JDateChooser();
        FirstRadioButton = new javax.swing.JRadioButton();
        ThirdRadioButton = new javax.swing.JRadioButton();
        SecondRadioButton = new javax.swing.JRadioButton();
        BookButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        RemindLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        TitleLabel.setText("Book Appointment");

        NLabel.setText("Name :");

        HPLabel.setText("Contact Number :");

        jLabel1.setText("Date :");

        jLabel2.setText("Time :");

        TbuttonGroup.add(FirstRadioButton);
        FirstRadioButton.setText("10.00 a.m. - 12.00 p.m.");

        TbuttonGroup.add(ThirdRadioButton);
        ThirdRadioButton.setText("4.00 p.m. - 6.00 p.m.");

        TbuttonGroup.add(SecondRadioButton);
        SecondRadioButton.setText("1.00p.m. - 3.00p.m.");

        BookButton.setText("Book");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RemindLabel.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        RemindLabel.setText("* the appointment must be book One Day before");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BookButton)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BackButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(NTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HPLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(RemindLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(HPTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(FirstRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ThirdRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SecondRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TitleLabel)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NLabel)
                    .addComponent(NTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HPLabel)
                    .addComponent(HPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemindLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FirstRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(SecondRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(ThirdRadioButton)))
                .addGap(29, 29, 29)
                .addComponent(BookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
        try{
            SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
            String time = "";
            if(FirstRadioButton.isSelected()){
                time = "10.00 a.m.-12.00 p.m.";
            }else if(SecondRadioButton.isSelected()){
                time = "1.00 p.m.-3.00 p.m.";
            }else{
                time = "4.00 p.m.-6.00 p.m.";
            }
            String Name = NTextField.getText();
            String Contact = HPTextField.getText();
            Date SelectedDate = DateChooser.getDate();
            String Date = DateFormat.format(SelectedDate);
            String Time = time;
            DBFile db = new DBFile();
            if(Name.equals("")){
                 JOptionPane.showMessageDialog(null, "Please insert the Name !");
            }else if(Contact.equals("")){
                 JOptionPane.showMessageDialog(null, "Please insert tht Contact Number !");
            }else if (!db.CheckContact(Contact)){
                JOptionPane.showMessageDialog(null, "Wrong Phone Number format!");
            }else if(Time.equals("")){
                JOptionPane.showMessageDialog(null, "Please select the time slot !");
            }else if(!db.CheckAppointmentAvailable(Date, Time)){
                JOptionPane.showMessageDialog(null, "The Date of the Time Slot had been Fully Booked !");
            }else if (!db.CheckDateValid(SelectedDate)){
                JOptionPane.showMessageDialog(null, "The Appointment can only be booked one day before !");
            }else{
                JOptionPane.showMessageDialog(null, "insert Successful !");
                u.BookAppointment(Name, Contact, Date, Time);
                UserPage up = new UserPage(u);
                up.setVisible(true);
                this.dispose();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please fill the information !");
        }
    }//GEN-LAST:event_BookButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        UserPage up = new UserPage(u);
        up.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookAppointmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAppointmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAppointmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAppointmentPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAppointmentPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BookButton;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JRadioButton FirstRadioButton;
    private javax.swing.JLabel HPLabel;
    private javax.swing.JTextField HPTextField;
    private javax.swing.JLabel NLabel;
    private javax.swing.JTextField NTextField;
    private javax.swing.JLabel RemindLabel;
    private javax.swing.JRadioButton SecondRadioButton;
    private javax.swing.ButtonGroup TbuttonGroup;
    private javax.swing.JRadioButton ThirdRadioButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}