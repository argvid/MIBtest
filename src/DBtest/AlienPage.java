/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class AlienPage extends javax.swing.JFrame {

    private static InfDB idb;
    private static String anvandare;

    public AlienPage(InfDB iidb, String anvandare) {
        initComponents();
        updateLabel(anvandare);
        this.anvandare = anvandare;
        idb = iidb;

    }

    private void updateLabel(String anvandare) {
        label.setText("Välkommen till Jorden, " + anvandare);
        System.out.print(anvandare);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        checkBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Se info om mitt områdes områdeschef");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(133, 226, 273, 29);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 377, 0, 0);
        getContentPane().add(passwordField);
        passwordField.setBounds(169, 107, 188, 26);

        jLabel2.setText("Ändra Lösenord:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 109, 103, 16);

        okButton.setText("Ändra");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);
        okButton.setBounds(363, 104, 94, 29);

        checkBox.setText("Visa Lösenord");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox);
        checkBox.setBounds(203, 139, 126, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setText("Alien");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 20, 200, 50);

        label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/grass-green-color-solid-background-1920x1080.png")); // NOI18N
        getContentPane().add(label);
        label.setBounds(0, 0, 550, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        new infoOmradesChef(idb, anvandare).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        try {
            String losenord = new String(passwordField.getPassword());
            Validation validation = new Validation(losenord);
            boolean test = validation.kollaLosen(losenord);
            if (test) {
                String losenordFraga = "update alien set Losenord = '" + losenord + "' where Namn = '" + anvandare + "'";
                idb.update(losenordFraga);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        // TODO add your handling code here:
        if (checkBox.isSelected()) {
            passwordField.setEchoChar((char) 0);
        } else {
            passwordField.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AlienPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienPage(idb, anvandare).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel label;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
