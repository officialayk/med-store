/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Activity.ActivityMainFrame;
import Activity.DetailsPanel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author DJ RSK
 */
public class LoginFrame extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        this.setResizable(false);

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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pswd = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 300, 0, 0);

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login To Med Store");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 60, 191, 28);

        jLabel3.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Username");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 120, 71, 30);
        jPanel1.add(usrnm);
        usrnm.setBounds(220, 120, 120, 30);

        jLabel4.setFont(new java.awt.Font("Garamond", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 170, 67, 30);

        pswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswdKeyPressed(evt);
            }
        });
        jPanel1.add(pswd);
        pswd.setBounds(220, 170, 120, 30);

        jButton1.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 51));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 220, 79, 25);

        jButton2.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 220, 75, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-120, 0, 590, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pswdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymed","root","");
                String usr=usrnm.getText();
                String pd=pswd.getText();
                if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()!=0)){
                    String st= "select * from userdata where Username=? and Password=?";
                    PreparedStatement pst = conn.prepareStatement(st);
                    pst.setString(1,usr);
                    pst.setString(2,pd);
                    ResultSet rs=pst.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Logged In Successfully ");
                        new ActivityMainFrame().setVisible(true);
                        this.dispose();
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Username Or Password ");
                    }
                }
                else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()==0)){
                    JOptionPane.showMessageDialog(null,"Enter Username & Password ");
                }
                else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()!=0)){
                    JOptionPane.showMessageDialog(null,"Enter Username ");
                }
                else if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()==0)){
                    JOptionPane.showMessageDialog(null,"Enter Password ");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Enter Username & Password ");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_pswdKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymed","root","");
            String usr=usrnm.getText();
            String pd=pswd.getText();
            if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()!=0)){
                String st= "select * from userdata where Username=? and Password=?";
                PreparedStatement pst = conn.prepareStatement(st);
                pst.setString(1,usr);
                pst.setString(2,pd);
                ResultSet rs=pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null,"Logged In Successfully ");
                    new ActivityMainFrame().setVisible(true);
                    this.dispose();
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username Or Password ");
                }
            }
            else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()==0)){
                JOptionPane.showMessageDialog(null,"Enter Username & Password ");
            }
            else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()!=0)){
                JOptionPane.showMessageDialog(null,"Enter Username ");
            }
            else if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()==0)){
                JOptionPane.showMessageDialog(null,"Enter Password ");
            }
            else{
                JOptionPane.showMessageDialog(null,"Enter Username & Password ");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mymed","root","");
                String usr=usrnm.getText();
                String pd=pswd.getText();
                if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()!=0)){
                    String st= "select * from userdata where Username=? and Password=?";
                    PreparedStatement pst = conn.prepareStatement(st);
                    pst.setString(1,usr);
                    pst.setString(2,pd);
                    ResultSet rs=pst.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Logged In Successfully ");
                        new ActivityMainFrame().setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Username Or Password ");
                    }
                }
                else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()==0)){
                    JOptionPane.showMessageDialog(null,"Enter Username & Password ");
                }
                else if((usrnm.getText().trim().length()==0)&&(pswd.getText().trim().length()!=0)){
                    JOptionPane.showMessageDialog(null,"Enter Username ");
                }
                else if((usrnm.getText().trim().length()!=0)&&(pswd.getText().trim().length()==0)){
                    JOptionPane.showMessageDialog(null,"Enter Password ");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Enter Username & Password ");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        usrnm.setText("");
        pswd.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            usrnm.setText("");
            pswd.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    
    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
