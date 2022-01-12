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
public class TaBortUtrustning extends javax.swing.JFrame {

    private static InfDB idb;

    public TaBortUtrustning(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillCmb();
    }

    private void fillCmb() {
        try {
            String utrustningFraga = "SELECT benamning FROM utrustning";
            ArrayList<String> utrustningLista = new ArrayList<String>();
            utrustningLista = idb.fetchColumn(utrustningFraga);
            for (String utrustning : utrustningLista) {
                utrustningCmb.addItem(utrustning);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        utrustningCmb = new javax.swing.JComboBox<>();
        taBortButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        getContentPane().add(utrustningCmb);
        utrustningCmb.setBounds(104, 108, 117, 27);

        taBortButton.setText("Ta bort");
        taBortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortButtonActionPerformed(evt);
            }
        });
        getContentPane().add(taBortButton);
        taBortButton.setBounds(281, 107, 89, 29);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Ta bort utrustning");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 30, 250, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/rainbow-colors-153443_1280.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 510, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taBortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortButtonActionPerformed
        // TODO add your handling code here:
        try{
        String utrustning = utrustningCmb.getSelectedItem().toString();
        String taBortFraga = "DELETE FROM utrustning where benamning = '"+utrustning+"';";
        idb.delete(taBortFraga);
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
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
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortUtrustning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortUtrustning(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton taBortButton;
    private javax.swing.JComboBox<String> utrustningCmb;
    // End of variables declaration//GEN-END:variables
}
