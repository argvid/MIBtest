/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class andraInfoAgent extends javax.swing.JFrame {

    private static InfDB idb;
    private String enData;
    private static String valdAgent;

    public andraInfoAgent(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillAgentCmb();
        fillTextFields();
    }

    private void fillAgentCmb() {
        try {
            ArrayList<String> agenter = new ArrayList<String>();
            String alienFraga = "SELECT namn FROM agent";
            agenter = idb.fetchColumn(alienFraga);
            for (String agent : agenter) {
                agentCmb.addItem(agent);
            }
            ArrayList<String> omraden = new ArrayList<String>();
            String omradeFraga = "SELECT Benamning FROM omrade";
            omraden = idb.fetchColumn(omradeFraga);
            for (String omrade : omraden) {
                omradeCmb.addItem(omrade);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namnField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        losenordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adminCmb = new javax.swing.JComboBox<>();
        omradeCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        agentCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Uppdatera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lösenord:");

        jLabel4.setText("Telefonnummer:");

        jLabel7.setText("Namn");

        jLabel8.setText("Admin");

        adminCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));
        adminCmb.setToolTipText("");
        adminCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCmbActionPerformed(evt);
            }
        });

        jLabel2.setText("Område");

        agentCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agentCmb, 0, 165, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(omradeCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(losenordField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(telField)
                        .addComponent(namnField)
                        .addComponent(adminCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(agentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(adminCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradeCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean rattInputLosenord = false;
        boolean rattInputNamn = false;
        boolean rattInputAns = false;

        try {
            String namn = namnField.getText();
            Validation validation = new Validation(namn);
            boolean namnTest = validation.testaString(namn);

            String losenord = losenordField.getText();
            Validation validation2 = new Validation(losenord);
            boolean losenTest = validation.kollaLosen(losenord);

            String adminStatus = adminCmb.getSelectedItem().toString();
            if (adminStatus.equals("Ja")) {
                adminStatus = "J";
            } else if (adminStatus.equals("Nej")) {
                adminStatus = "N";
            }

            String valtOmrade = omradeCmb.getSelectedItem().toString();
            String specifiktOmradeFraga = "SELECT omrades_ID FROM omrade WHERE benamning = '" + valtOmrade + "'";
            String omradeID = idb.fetchSingle(specifiktOmradeFraga);

            String tel = telField.getText();
            Validation validation3 = new Validation(tel);
            boolean telTest = validation3.kollaInt(tel);
            if (namnTest == true && losenTest == true && telTest == true) {
                String updateraAgentFraga = "UPDATE agent SET Losenord = '" + losenord + "', Namn = '" + namn + "', Administrator = '" + adminStatus + "', Telefon = '" + tel + "', Omrade = '" + omradeID + "' where namn = '" + namn + "'";
                idb.update(updateraAgentFraga);
                setVisible(false);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adminCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminCmbActionPerformed

    private void agentCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentCmbActionPerformed
        // TODO add your handling code here:
        valdAgent = agentCmb.getSelectedItem().toString();
        fillTextFields();
    }//GEN-LAST:event_agentCmbActionPerformed
    private void fillTextFields() {
        try {

            String fraga = "SELECT losenord, telefon FROM agent WHERE namn = '" + valdAgent + "'";
            HashMap<String, String> varden = new HashMap<String, String>();
            varden = idb.fetchRow(fraga);
            int i = 0;
            namnField.setText(valdAgent);
            for (String data : varden.values()) {
                enData = data;
                while (i <= varden.size()) {
                    if (i == 0) {
                        telField.setText(enData);
                    }
                    if (i == 1) {
                        losenordField.setText(enData);
                    }

                    break;
                }
                i++;
            }

        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

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
            java.util.logging.Logger.getLogger(andraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(andraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(andraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(andraInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new andraInfoAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adminCmb;
    private javax.swing.JComboBox<String> agentCmb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField losenordField;
    private javax.swing.JTextField namnField;
    private javax.swing.JComboBox<String> omradeCmb;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables
}
