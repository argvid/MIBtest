/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class TaBortAlien extends javax.swing.JFrame {

    private static InfDB idb;
    private static String alienInput;

    public TaBortAlien(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillAlienCmb();
    }

    private void fillAlienCmb() {
        try {
            ArrayList<String> namnLista = new ArrayList<String>();
            String namnFraga = "SELECT Namn FROM Alien";
            namnLista = idb.fetchColumn(namnFraga);
            for (String namnet : namnLista) {
                alienCmb.addItem(namnet);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alienCmb = new javax.swing.JComboBox<>();
        taBortButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        getContentPane().add(alienCmb);
        alienCmb.setBounds(100, 87, 120, 40);

        taBortButton.setText("Ta bort");
        taBortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortButtonActionPerformed(evt);
            }
        });
        getContentPane().add(taBortButton);
        taBortButton.setBounds(250, 90, 89, 29);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Ta bort Alien");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 200, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/rainbow-colors-153443_1280.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taBortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortButtonActionPerformed
        // TODO add your handling code here:
        try {
            alienInput = alienCmb.getSelectedItem().toString();
            String deleteAlien = "DELETE FROM Alien WHERE Namn = '" + alienInput + "'";
            idb.delete(deleteAlien);

        } catch (Exception ex) {
            System.out.println(ex);
        }  // TODO add your handling code here:
    
    }//GEN-LAST:event_taBortButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAlien

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAlien

.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortAlien(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alienCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton taBortButton;
    // End of variables declaration//GEN-END:variables
}
