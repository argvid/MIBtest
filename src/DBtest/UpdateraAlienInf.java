/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author arvid
 */
public class UpdateraAlienInf extends javax.swing.JFrame {

    private static InfDB idb;
    private String enData;
    private String valdAlien;

    public UpdateraAlienInf(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillAlienCmb();
        fillTextFields();

    }

    private void fillAlienCmb() {
        try {
            ArrayList<String> aliens = new ArrayList<String>();
            String alienFraga = "SELECT namn FROM alien";
            aliens = idb.fetchColumn(alienFraga);
            for (String alien : aliens) {
                alienCmb.addItem(alien);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alienCmb = new javax.swing.JComboBox<>();
        losenordField = new javax.swing.JTextField();
        regField = new javax.swing.JTextField();
        telField = new javax.swing.JTextField();
        platsField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        namnField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ansCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alienCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienCmbActionPerformed(evt);
            }
        });

        jButton1.setText("Uppdatera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("L??senord:");

        jLabel2.setText("Ansvarig agent:");

        jLabel3.setText("Registrerad:");

        jLabel4.setText("Telefonnummer:");

        jLabel5.setText("Plats:");

        jLabel6.setText("Alien ID:");

        jLabel7.setText("Namn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(losenordField)
                    .addComponent(regField)
                    .addComponent(telField)
                    .addComponent(platsField)
                    .addComponent(idField)
                    .addComponent(namnField)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(alienCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1))
                    .addComponent(ansCmb, 0, 165, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(alienCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(losenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ansCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(platsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienCmbActionPerformed
        // TODO add your handling code here:
        valdAlien = alienCmb.getSelectedItem().toString();
        System.out.println(valdAlien);
        fillTextFields();
    }//GEN-LAST:event_alienCmbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean rattInputLosenord = false;
        boolean rattInputNamn = false;
        boolean rattInputAns = false;

        try {
            String namn = namnField.getText();
            if (namn.length() != 0) {
                rattInputNamn = true;
            } else {
                JOptionPane.showMessageDialog(null, "Du m??ste fylla i ett nytt namn");
            }
            String losenord = losenordField.getText();
            if (losenord.length() < 7) {
                rattInputLosenord = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ditt nya l??senord m??ste vara mindre ??n 7 tecken");
            }
            String ansvarig = ansCmb.getSelectedItem().toString();
            String ansFraga = "SELECT agent_ID FROM agent where namn = '"+ansvarig+"'";
            String ansvarigAgentID = idb.fetchSingle(ansFraga);
            //ta ut id:t fr??n den agent som ??r ansvarig f??r att f?? in r??tt i databasen
            System.out.println(ansvarigAgentID);

            String reg = regField.getText();
            String plats = platsField.getText();
            //ta ut id:t fr??n den plats som anges f??r att det ska bli r??tt i databasen
            String platsIDFraga = "SELECT Plats_ID from plats inner join alien a on plats.Plats_ID = a.Plats WHERE Benamning = '" + plats + "' LIMIT 1";
            String platsID = idb.fetchSingle(platsIDFraga);

            String id = idField.getText();
            String tel = telField.getText();
            String updateraAlienFraga = "UPDATE alien SET Alien_ID = '" + id + "', Registreringsdatum = '" + reg + "', Losenord = '" + losenord + "',\n"
                    + "Namn = '" + namn + "', Telefon = '" + tel + "', Plats = '" + platsID + "', Ansvarig_Agent = '" + ansvarigAgentID + "' where namn = '" + namn + "'";
            idb.update(updateraAlienFraga);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void fillTextFields() {
        try {

            String fraga = "SELECT * FROM alien WHERE namn = '" + valdAlien + "'";
            HashMap<String, String> varden = new HashMap<String, String>();
            varden = idb.fetchRow(fraga);
            int i = 0;
            namnField.setText(valdAlien);
            for (String data : varden.values()) {
                enData = data;
                while (i <= varden.size()) {
                    if (i == 1) {
                        losenordField.setText(enData);
                    }                    
                    if(i == 2){
                        ArrayList<String> agentNamn = new ArrayList<String>();
                        String ansAgentFraga = "SELECT namn FROM agent ORDER BY namn ASC";
                        agentNamn = idb.fetchColumn(ansAgentFraga);
                        for(String namn: agentNamn)
                        {
                            ansCmb.addItem(namn);
                        }
                        
                    }
                    if (i == 3) {
                        regField.setText(enData);
                    }
                    if (i == 4) {
                        telField.setText(enData);
                    }
                    if (i == 5) {
                        String platsFraga = "SELECT plats.benamning FROM plats\n"
                                + "inner join alien a on plats.Plats_ID = a.Plats\n"
                                + "where Plats = '" + enData + "' LIMIT 1";
                        String plats = idb.fetchSingle(platsFraga);
                        platsField.setText(plats);
                    }
                    if (i == 6) {
                        idField.setText(enData);
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
            java.util.logging.Logger.getLogger(UpdateraAlienInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateraAlienInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateraAlienInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateraAlienInf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateraAlienInf(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> alienCmb;
    private javax.swing.JComboBox<String> ansCmb;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField losenordField;
    private javax.swing.JTextField namnField;
    private javax.swing.JTextField platsField;
    private javax.swing.JTextField regField;
    private javax.swing.JTextField telField;
    // End of variables declaration//GEN-END:variables
}
