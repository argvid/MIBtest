/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DBtest;

import java.io.File;
import oru.inf.InfDB;

/**
 *
 * @author arvid
 */
public class AdminPage extends javax.swing.JFrame {

    private static InfDB idb;
    private static String anvandare;

    /**
     * Creates new form AdminPage
     */
    public AdminPage(InfDB iidb, String anvandare) {
        initComponents();
        updateLabel(anvandare);
        this.anvandare = anvandare;
        idb = iidb;
        System.out.println(new File(".").getAbsolutePath());
    }
    // Uppdaterar titeln med namn
    private void updateLabel(String anvandare) {
        label.setText("Adminfunktioner för " + anvandare);
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

        label = new javax.swing.JLabel();
        regAlienButton = new javax.swing.JButton();
        andraInfAlien = new javax.swing.JButton();
        laggTillAgentButton = new javax.swing.JButton();
        andraAgentButton = new javax.swing.JButton();
<<<<<<< Updated upstream
        taBortAlien = new javax.swing.JButton();
        taBortUtrustning = new javax.swing.JButton();
        geAdmin = new javax.swing.JButton();
        seInformation = new javax.swing.JButton();
        andraOmradesChef = new javax.swing.JButton();
        andraKontorsChef = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
=======
        taBortAlienButton = new javax.swing.JButton();
        taBortUtrustning = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
>>>>>>> Stashed changes

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(label);
        label.setBounds(670, 6, 394, 106);

        regAlienButton.setText("Registrera Alien");
        regAlienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAlienButtonActionPerformed(evt);
            }
        });
        getContentPane().add(regAlienButton);
        regAlienButton.setBounds(99, 130, 463, 29);

        andraInfAlien.setText("Ändra information på Alien");
        andraInfAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraInfAlienActionPerformed(evt);
            }
        });
        getContentPane().add(andraInfAlien);
        andraInfAlien.setBounds(99, 177, 463, 29);

        laggTillAgentButton.setText("Registrera Agent");
        laggTillAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillAgentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(laggTillAgentButton);
        laggTillAgentButton.setBounds(99, 224, 463, 29);

        andraAgentButton.setText("Ändra information på Agent");
        andraAgentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAgentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(andraAgentButton);
        andraAgentButton.setBounds(99, 271, 463, 29);

<<<<<<< Updated upstream
        taBortAlien.setText("Ta bort alien");
        taBortAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienActionPerformed(evt);
            }
        });
        getContentPane().add(taBortAlien);
        taBortAlien.setBounds(99, 365, 463, 29);
=======
        taBortAlienButton.setText("Ta bort alien");
        taBortAlienButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienButtonActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        taBortUtrustning.setText("Ta bort utrustning");
        taBortUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortUtrustningActionPerformed(evt);
            }
        });
<<<<<<< Updated upstream
        getContentPane().add(taBortUtrustning);
        taBortUtrustning.setBounds(99, 459, 463, 29);
=======
>>>>>>> Stashed changes

        geAdmin.setText("Ge Agent admin status");
        geAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geAdminActionPerformed(evt);
            }
        });
        getContentPane().add(geAdmin);
        geAdmin.setBounds(99, 412, 463, 29);

        seInformation.setText("Se information på Agent");
        seInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seInformationActionPerformed(evt);
            }
        });
        getContentPane().add(seInformation);
        seInformation.setBounds(99, 318, 463, 29);

<<<<<<< Updated upstream
        andraOmradesChef.setText("Ändra områdeschef");
        andraOmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraOmradesChefActionPerformed(evt);
            }
        });
        getContentPane().add(andraOmradesChef);
        andraOmradesChef.setBounds(99, 506, 463, 29);

        andraKontorsChef.setText("Ändra kontorschef");
        andraKontorsChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKontorsChefActionPerformed(evt);
            }
        });
        getContentPane().add(andraKontorsChef);
        andraKontorsChef.setBounds(99, 553, 463, 29);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Administratör");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(194, 29, 379, 83);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/rainbow-colors-153443_1280.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 670);
=======
        jButton9.setText("Ta bort Agent ur systemet");

        jButton10.setText("jButton10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taBortAlienButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taBortUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(andraAgentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                            .addComponent(regAlienButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(andraInfAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regAlienButton)
                .addGap(18, 18, 18)
                .addComponent(andraInfAlien)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(andraAgentButton)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(taBortAlienButton)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(taBortUtrustning)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(21, Short.MAX_VALUE))
        );
>>>>>>> Stashed changes

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Väljer vad man vill göra på admin sidan
    private void regAlienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAlienButtonActionPerformed
        // TODO add your handling code here:
        new RegistreraAlien(idb).setVisible(true);
    }//GEN-LAST:event_regAlienButtonActionPerformed

    private void andraInfAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraInfAlienActionPerformed
        // TODO add your handling code here:
        new UpdateraAlienInf(idb).setVisible(true);
    }//GEN-LAST:event_andraInfAlienActionPerformed

    private void laggTillAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillAgentButtonActionPerformed
        // TODO add your handling code here:
        new LaggTillAgent(idb).setVisible(true);
    }//GEN-LAST:event_laggTillAgentButtonActionPerformed

    private void andraAgentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAgentButtonActionPerformed
        // TODO add your handling code here:
        new andraInfoAgent(idb).setVisible(true);
    }//GEN-LAST:event_andraAgentButtonActionPerformed

    private void seInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seInformationActionPerformed
        // TODO add your handling code here:
        new SeInformationAgent(idb).setVisible(true);
    }//GEN-LAST:event_seInformationActionPerformed

    private void geAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geAdminActionPerformed
        // TODO add your handling code here:
        new GeAdminStatus(idb).setVisible(true);
    }//GEN-LAST:event_geAdminActionPerformed

    private void andraOmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraOmradesChefActionPerformed
        // TODO add your handling code here:
        new AndraOmradesChef(idb).setVisible(true);
    }//GEN-LAST:event_andraOmradesChefActionPerformed

    private void andraKontorsChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKontorsChefActionPerformed
        // TODO add your handling code here:
        new AndraKontorsChef(idb).setVisible(true);
    }//GEN-LAST:event_andraKontorsChefActionPerformed

    private void taBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        new TaBortUtrustning(idb).setVisible(true);
    }                                                

    private void taBortAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienActionPerformed
        // TODO add your handling code here:
        new TaBortAlien(idb).setVisible(true);
    }//GEN-LAST:event_taBortAlienActionPerformed

    private void taBortAlienButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienButtonActionPerformed

        new TaBortAlien(idb).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_taBortAlienButtonActionPerformed

    private void taBortUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortUtrustningActionPerformed
        new TaBortUtrustning(idb).setVisible(true);        
// TODO add your handling code here:
    }//GEN-LAST:event_taBortUtrustningActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage(idb, anvandare).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andraAgentButton;
    private javax.swing.JButton andraInfAlien;
<<<<<<< Updated upstream
    private javax.swing.JButton andraKontorsChef;
    private javax.swing.JButton andraOmradesChef;
    private javax.swing.JButton geAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
=======
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
>>>>>>> Stashed changes
    private javax.swing.JLabel label;
    private javax.swing.JButton laggTillAgentButton;
    private javax.swing.JButton regAlienButton;
<<<<<<< Updated upstream
    private javax.swing.JButton seInformation;
    private javax.swing.JButton taBortAlien;
=======
    private javax.swing.JButton taBortAlienButton;
>>>>>>> Stashed changes
    private javax.swing.JButton taBortUtrustning;
    // End of variables declaration//GEN-END:variables
}
