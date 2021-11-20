/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author DJ RSK
 */
public class DetailsPanel extends javax.swing.JPanel {
    PreparedStatement pst;
    ResultSet rs;
    String usr,fullnm,emaill;
    /**
     * Creates new form DetailsPanel
     */
    public DetailsPanel() {
        initComponents();
        details();
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        pswd2.setVisible(false);
        pswd3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        pswd3 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pswd2 = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        usrnm2 = new javax.swing.JTextField();
        flnm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 255));
        setMaximumSize(new java.awt.Dimension(837, 468));
        setMinimumSize(new java.awt.Dimension(837, 468));
        setPreferredSize(new java.awt.Dimension(837, 468));
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit Details");
        add(jLabel5);
        jLabel5.setBounds(230, 30, 180, 60);

        pswd3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswd3KeyPressed(evt);
            }
        });
        add(pswd3);
        pswd3.setBounds(320, 320, 120, 30);

        jLabel11.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("New Password");
        add(jLabel11);
        jLabel11.setBounds(200, 320, 110, 30);

        jCheckBox1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jCheckBox1.setText("Change Password");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1);
        jCheckBox1.setBounds(190, 240, 140, 25);

        jLabel8.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Full Name");
        add(jLabel8);
        jLabel8.setBounds(200, 110, 76, 30);

        jLabel10.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("Username");
        add(jLabel10);
        jLabel10.setBounds(200, 150, 71, 30);

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Email");
        add(jLabel9);
        jLabel9.setBounds(200, 190, 41, 30);

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Old Password");
        add(jLabel7);
        jLabel7.setBounds(200, 280, 110, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_127px.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(40, 110, 130, 150);

        jButton3.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(60, 270, 90, 25);

        jButton4.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 51, 51));
        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(60, 320, 90, 25);

        pswd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswd2KeyPressed(evt);
            }
        });
        add(pswd2);
        pswd2.setBounds(320, 280, 120, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        add(email);
        email.setBounds(320, 190, 120, 30);

        usrnm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrnm2ActionPerformed(evt);
            }
        });
        add(usrnm2);
        usrnm2.setBounds(320, 150, 120, 30);

        flnm.setMinimumSize(new java.awt.Dimension(8, 20));
        flnm.setPreferredSize(new java.awt.Dimension(8, 20));
        flnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flnmActionPerformed(evt);
            }
        });
        add(flnm);
        flnm.setBounds(320, 110, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prj.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 852, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void details(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymed","root","");
            String sql="select * from userdata";
            PreparedStatement pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                fullnm = rs.getString("FullName");
                usr = rs.getString("UserName");
                emaill = rs.getString("Email");
                flnm.setText(fullnm);
                usrnm2.setText(usr);
                email.setText(emaill);
                
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pd=pswd.getText();   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymed","root","");
        if((pswd2.getText().trim().length()!=0)&&(pswd3.getText().trim().length()>=6)){
            String st= "select * from userdata where Password=?";
            PreparedStatement pst = conn.prepareStatement(st);
            pst.setString(1,pd);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Password Changed Successfully ");
                String newpwd="update userdata set Password="
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
    
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        flnm.setText("");
        usrnm2.setText("");
        email.setText("");
        pswd2.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            flnm.setText("");
            usrnm2.setText("");
            email.setText("");
            pswd2.setText("");
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void pswd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswd2KeyPressed
    
    }//GEN-LAST:event_pswd2KeyPressed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usrnm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnm2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrnm2ActionPerformed

    private void flnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flnmActionPerformed

    private void pswd3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswd3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswd3KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
            if(jCheckBox1.isSelected()==true){
                jLabel7.setVisible(true);
                jLabel11.setVisible(true);
                pswd2.setVisible(true);
                pswd3.setVisible(true);
            }
            else{
                jLabel7.setVisible(false);
                jLabel11.setVisible(false);
                pswd2.setVisible(false);
                pswd3.setVisible(false);
            }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
     // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField flnm;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pswd2;
    private javax.swing.JPasswordField pswd3;
    private javax.swing.JTextField usrnm2;
    // End of variables declaration//GEN-END:variables
}
