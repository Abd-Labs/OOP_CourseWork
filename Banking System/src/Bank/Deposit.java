/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bank;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Deposit extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
    public Deposit() {
        initComponents();
    }
    ArrayList<Account> data;
    int ind=0;
    Deposit(ArrayList<Account> List, int index) {
        this();
        data =List;
        ind= index;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NewBalance = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Amount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 98, 90, 39));

        Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AmountKeyPressed(evt);
            }
        });
        getContentPane().add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 103, 186, 32));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setText("Deposit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 155, 102, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setText("New Balance");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 228, 127, 35));

        NewBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBalanceActionPerformed(evt);
            }
        });
        getContentPane().add(NewBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 228, 189, 43));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 84, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bank/depositWithdrawPic.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if (Character.isDigit(c) || Character.isISOControl(c)) {
            Amount.setEditable(true);
        }
        else Amount.setEditable(false);
    }//GEN-LAST:event_AmountKeyPressed

    private void NewBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBalanceActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NewBalanceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new options().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double balance = data.get(ind).getBalance();
        data.get(ind).setBalance(balance + Double.parseDouble(Amount.getText()));
        
        NewBalance.setText(String.valueOf(data.get(ind).getBalance()));
        NewBalance.setEditable(false);
        
        FileOutputStream fout;
            ObjectOutputStream obj;
            try{
             fout = new FileOutputStream(new File("Accounts.txt"));
             obj = new ObjectOutputStream(fout);
             obj.writeObject(data);
             fout.close(); obj.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
            
            Amount.setText(null);
            JOptionPane.showMessageDialog(Deposit.this,"Successfully Deposited!!!");
            
            try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
            new options().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField NewBalance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}