/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class TaBortAgent extends javax.swing.JFrame {

    private static InfDB idb;
    private String agent;
    public TaBortAgent(InfDB iidb) {
        initComponents();
        idb = iidb;
        fillCmb();
    }

    private void fillCmb(){
        try {
            ArrayList<String> agenter = new ArrayList<String>();
            String alienFraga = "SELECT namn FROM agent";
            agenter = idb.fetchColumn(alienFraga);
            for (String agent : agenter) {
                agentCmb.addItem(agent);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentCmb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agentCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentCmbActionPerformed(evt);
            }
        });

        jButton1.setText("Ta Bort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(agentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agentCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentCmbActionPerformed
        // TODO add your handling code here:
        agent = agentCmb.getSelectedItem().toString();
    }//GEN-LAST:event_agentCmbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                ArrayList<String> ansvar = new ArrayList<String>();
                ArrayList<String> kontorsChefer = new ArrayList<String>();
                ArrayList<String> omradesChefer = new ArrayList<String>();
                boolean harAnsvar = false;
                boolean kontorsChef = false;
                boolean omradesChef = false;
                String agentId;

                agent = agentCmb.getSelectedItem().toString();
                String fraga1 = "SELECT Agent_ID FROM agent WHERE Namn = '" + agent + "';";
                String fraga2 = "SELECT Ansvarig_Agent FROM alien;";

                agentId = idb.fetchSingle(fraga1);
                ansvar = idb.fetchColumn(fraga2);
                //Här nedan kollar metoden ifall den angivna agenten finns registrerad som t.ex. kontorschef eller om agenten har ansvar över aliens.
                int i = 0;
                while (harAnsvar == false && i < ansvar.size()) {
                    String entry = ansvar.get(i);
                    if (entry.equals(agentId)) {
                        harAnsvar = true;
                    } else {
                        i++;
                    }
                }

                String fraga3 = "SELECT Agent_ID FROM kontorschef;";

                kontorsChefer = idb.fetchColumn(fraga3);

                int i2 = 0;
                while (kontorsChef == false && i2 < kontorsChefer.size()) {
                    String entry = kontorsChefer.get(i2);
                    if (entry.equals(agentId)) {
                        kontorsChef = true;
                    } else {
                        i2++;
                    }
                }

                String fraga4 = "SELECT Agent_ID FROM omradeschef;";

                omradesChefer = idb.fetchColumn(fraga4);

                int i3 = 0;
                while (omradesChef == false && i3 < omradesChefer.size()) {
                    String entry = omradesChefer.get(i3);
                    if (entry.equals(agentId)) {
                        omradesChef = true;
                    } else {
                        i3++;
                    }
                }
                // Om ansvar över aliens finns så måste dessa få en ny ansvarig agent först.
                if (harAnsvar == true) {

                    String respons;
                    respons = JOptionPane.showInputDialog(null, "Denna agent är ansvarig över en eller flera aliens." + "\n" + "Ange med namn den agent som skall ta över ansvaret för dessa.");


                    String fraga5 = "SELECT Agent_ID FROM agent WHERE Namn = '" + respons + "';";
                    String overtarAnsvar = idb.fetchSingle(fraga5);

                    String fraga6 = "UPDATE alien SET Ansvarig_Agent = " + " '" + overtarAnsvar + "' " + "WHERE Ansvarig_Agent = " + " '" + agentId + "';";
                    idb.update(fraga6);

                }
                // Om agenten är kontorschef så behöver en ny agent tillsättas som chef.
                if (kontorsChef == true) {

                    String respons2;
                    respons2 = JOptionPane.showInputDialog(null, "Denna agent är kontorschef för ett kontor." + "\n" + "Ange med namn den agent som skall ta över ansvaret för detta kontor.");

                    String nyKontorsChef = respons2;

                    String fraga7 = "SELECT Agent_ID FROM agent WHERE Namn = '" + nyKontorsChef + "';";
                    String nyKontorsChefId = idb.fetchSingle(fraga7);

                    String fraga8 = "UPDATE kontorschef SET Agent_ID = " + " '" + nyKontorsChefId + "' " + "WHERE Agent_ID = " + " '" + agentId + "';";
                    idb.update(fraga8);

                }
                // Om agenten är områdeschef så måste området få en ny chef först.
                if (omradesChef == true) {

                    String respons3;
                    respons3 = JOptionPane.showInputDialog(null, "Denna agent är områdeschef för ett kontor." + "\n" + "Ange med namn den agent som skall ta över ansvaret för detta kontor.");

                    String nyOmradesChef = respons3;

                    String fraga9 = "SELECT Agent_ID FROM agent WHERE Namn = '" + nyOmradesChef + "';";
                    String nyOmradesChefId = idb.fetchSingle(fraga9);

                    String fraga10 = "UPDATE omradeschef SET Agent_ID = " + "'" + nyOmradesChefId + "' " + "WHERE Agent_ID = " + " '" + agentId + "';";
                    idb.update(fraga10);

                }
                // Övriga tabeller som agenten kan vara kopplad till, isåfall raderas dessa rader i tabellen.
                String fraga11 = "DELETE FROM agent WHERE Namn = " + "'" + agent + "';";
                String taBortFaltAgent = "DELETE FROM faltagent WHERE Agent_ID = (SELECT Agent_ID FROM agent WHERE Namn ='" + agent + "');";
                String taBortInneharFordon = "DELETE FROM innehar_fordon WHERE Agent_ID =(SELECT Agent_ID FROM agent WHERE Namn ='" + agent + "');";
                String taBortInneharUtrustning = "DELETE FROM innehar_utrustning WHERE Agent_ID = (SELECT Agent_ID FROM agent WHERE Namn ='" + agent + "');";
                idb.delete(taBortInneharFordon);
                idb.delete(taBortInneharUtrustning);
                idb.delete(taBortFaltAgent);
                idb.delete(fraga11);
                JOptionPane.showMessageDialog(null, "Agenten borttagen!");
        }
        catch(Exception ex){
            System.out.println(ex);
        }
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
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaBortAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentCmb;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
