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
public class AndraKontorsChef extends javax.swing.JFrame {

    private static InfDB idb;

    public AndraKontorsChef(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillCmb();
    }

private void fillCmb() {
        try {
            String agentFraga = "SELECT namn FROM agent";
            ArrayList<String> agentLista = new ArrayList<String>();
            agentLista = idb.fetchColumn(agentFraga);
            for (String status : agentLista) {
                agentCmb.addItem(status);
            }
            String kontorFraga = "SELECT kontorsbeteckning FROM kontorschef";
            ArrayList<String> kontorLista = new ArrayList<String>();
            kontorLista = idb.fetchColumn(kontorFraga);
            for (String omrade : kontorLista) {
                kontorCmb.addItem(omrade);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentCmb = new javax.swing.JComboBox<>();
        kontorCmb = new javax.swing.JComboBox<>();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        getContentPane().add(agentCmb);
        agentCmb.setBounds(90, 50, 116, 27);

        getContentPane().add(kontorCmb);
        kontorCmb.setBounds(250, 50, 118, 27);

        okButton.setText("Ändra");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);
        okButton.setBounds(400, 50, 80, 29);

        jLabel1.setText("(Agent)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 30, 45, 16);

        jLabel2.setText("(Kontor)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 30, 50, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/rainbow-colors-153443_1280.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 550, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        try{
            String agent = agentCmb.getSelectedItem().toString();
            String kontor = kontorCmb.getSelectedItem().toString();
            String agentFraga = "SELECT Agent_ID FROM agent WHERE namn = '"+agent+"'";
            String agentID = idb.fetchSingle(agentFraga);
            
            //
            String setOmradesChef = "update Kontorschef set Agent_ID = '"+agentID+"' where Kontorsbeteckning = '"+kontor+"'";
            idb.update(setOmradesChef);
            
        }
        catch(Exception  ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraKontorsChef.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AndraKontorsChef(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> kontorCmb;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
