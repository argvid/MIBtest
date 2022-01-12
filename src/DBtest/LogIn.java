package DBtest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author arvid
 */
public class LogIn extends javax.swing.JFrame {

    private static InfDB idb;
    private String id;
    private String select;
    private static String anvandareInput;

    /**
     * Creates new form MittFönster
     */
    public LogIn(InfDB iidb) {
        initComponents();

        idb = iidb;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        textPane = new javax.swing.JTextPane();
        button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        checkBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(label);
        label.setBounds(502, 86, 79, 0);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        textPane.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textPaneComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(textPane);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 160, 173, 20);

        button.setText("Logga in");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(270, 270, 98, 29);

        jLabel1.setText("Användarnamn:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 160, 98, 16);

        jLabel2.setText("Lösenord:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 87, 16);

        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(passwordField);
        passwordField.setBounds(230, 220, 173, 18);

        checkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox.setText("Visa Lösenord");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox);
        checkBox.setBounds(410, 220, 120, 23);

        jLabel4.setFont(new java.awt.Font("Al Nile", 1, 36)); // NOI18N
        jLabel4.setText("MIB Skandinavien");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 50, 320, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/dator/Desktop/cyan-blue-colour.jpeg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        //Knapp för att logga in  
        try {
            boolean agent = false;
            boolean alien = false;
            boolean admin = false;
            anvandareInput = textPane.getText();
            Validation validation = new Validation(anvandareInput);
            boolean test = validation.testaString(anvandareInput);
            //Testar om fältet är ifyllt
            if (test) {
                String inputLosenord = new String(passwordField.getPassword());
                ArrayList<String> agenter = new ArrayList<String>();
                String fragaNamn = "Select namn from agent";
                agenter = idb.fetchColumn(fragaNamn);
                for (String agentSpecifik : agenter) {
                    //kollar om agentens namn finns i databasen
                    if (agentSpecifik.contentEquals(anvandareInput)) {
                        //kollar ifall agenten är en ADMIN
                        String fragaAdmin = "Select administrator from agent where namn = '" + anvandareInput + "'";
                        String adminStatus = idb.fetchSingle(fragaAdmin);
                        if (adminStatus.equals("J")) {
                            admin = true;
                        }
                        agent = true;
                    }
                }
                //kollar om det är en alien som ska logga in

                ArrayList<String> aliens = new ArrayList<String>();
                String alienFraga = "SELECT namn FROM alien";
                aliens = idb.fetchColumn(alienFraga);
                //kollar om aliens namn finns inlagt i databasen
                for (String alienSpecifik : aliens) {
                    if (alienSpecifik.contentEquals(anvandareInput)) {
                        System.out.println("tja");
                        alien = true;
                    }
                }

                //om agentens boolean variabel = true, så kommer man logga in som agent
                if (agent) {
                    ArrayList<String> losenord = new ArrayList<String>();
                    String losenordFraga = "Select Losenord from Agent where Namn = '" + anvandareInput + "'";
                    losenord = idb.fetchColumn(losenordFraga);
                    //kolla ifall lösenordet stämmer
                    for (String losenordet : losenord) {
                        if (losenordet.contentEquals(inputLosenord)) {
                            //öppnar ett nytt fönster ifall lösenordet stämmer
                            if (admin) {
                                //öppnar admin fönster
                                new AgentPage(idb, anvandareInput, admin).setVisible(true);
                            } else {
                                //öppnar "vanligt" agent fönster
                                new AgentPage(idb, anvandareInput, admin).setVisible(true);
                            }
                        }
                    }
                    //ifall alien är true kommer man loggas in som alien istället
                } else if (alien == true) {
                    ArrayList<String> losenord = new ArrayList<String>();
                    String losenordFraga = "Select Losenord from alien where Namn = '" + anvandareInput + "'";
                    losenord = idb.fetchColumn(losenordFraga);
                    //kollar ifall det är rätt lösenord
                    for (String losenordet : losenord) {
                        if (losenordet.contentEquals(inputLosenord)) {
                            //öppnar ett nytt fönster ifall lösenordet stämmer
                            new AlienPage(idb, anvandareInput).setVisible(true);
                        }
                    }
                }
                //kollar om lösenord stämmer, om inte något blivit true kommer ett felmeddelande
                if (alien == false && agent == false && admin == false) {
                    JOptionPane.showMessageDialog(null, "Fel lösenord eller användarnamn!");

                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void textPaneComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textPaneComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_textPaneComponentAdded

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
//checkbox för att se lösenordet
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
