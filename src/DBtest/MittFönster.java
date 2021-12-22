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
public class MittFönster extends javax.swing.JFrame {

    private static InfDB idb;
    private String id;
    private String select;
    private static String anvandareInput;

    /**
     * Creates new form MittFönster
     */
    public MittFönster(InfDB iidb) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        textPane.setBorder(null);
        textPane.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textPaneComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(textPane);

        button.setText("ok");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Användarnamn:");

        jLabel2.setText("Lösenord:");

        passwordField.setBorder(null);

        checkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox.setText("Visa Lösenord");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(button)
                        .addGap(45, 45, 45)
                        .addComponent(checkBox))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(passwordField))))
                .addGap(53, 53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button)
                    .addComponent(checkBox))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:  
        try {
            boolean agent = false;
            boolean alien = false;
            boolean admin = false;
            anvandareInput = textPane.getText();
            String inputLosenord = new String(passwordField.getPassword());
            ArrayList<String> agenter = new ArrayList<String>();
            String fragaNamn = "Select namn from agent";
            agenter = idb.fetchColumn(fragaNamn);
            for (String agentSpecifik : agenter) {
                if (agentSpecifik.contentEquals(anvandareInput)) {                   
                    String fragaAdmin = "Select administrator from agent where namn = '" + anvandareInput + "'";
                    String admins = idb.fetchSingle(fragaAdmin);
                    if(admins.equals("J")){
                        admin = true;
                    }

                    agent = true;
                }
            }
            ArrayList<String> aliens = new ArrayList<String>();
            String alienFraga = "SELECT namn FROM alien";
            aliens = idb.fetchColumn(alienFraga);
            for (String alienSpecifik : aliens) {
                if (alienSpecifik.contentEquals(anvandareInput)) {
                    alien = true;
                }
            }
            if (agent) {
                ArrayList<String> losenord = new ArrayList<String>();
                String losenordFraga = "Select Losenord from Agent where Namn = '" + anvandareInput + "'";
                losenord = idb.fetchColumn(losenordFraga);
                for (String losenordet : losenord) {

                    if (losenordet.contentEquals(inputLosenord)) {
                        //öppnar ett nytt fönster ifall lösenordet stämmer
                        if(admin){
                            new AdminPage(idb, anvandareInput).setVisible(true);
                        }
                        else{
                        new AgentPage(idb, anvandareInput).setVisible(true);
                        }

                    }

                }
            } else if (alien = true) {
                ArrayList<String> losenord = new ArrayList<String>();
                String losenordFraga = "Select Losenord from alien where Namn = '" + anvandareInput + "'";
                losenord = idb.fetchColumn(losenordFraga);
                for (String losenordet : losenord) {

                    if (losenordet.contentEquals(inputLosenord)) {
                        //öppnar ett nytt fönster ifall lösenordet stämmer
                        new AlienPage(idb, anvandareInput).setVisible(true);

                    }

                }

            } else {
                System.out.println("hej");
            }

            /*ArrayList<String> anvandare = new ArrayList<String>();
            String fraga = "Select namn from agent";
            anvandare = idb.fetchColumn(fraga);

            for (String anvandarNamn : anvandare) {
                if (anvandarNamn.contentEquals(anvandareInput)) {
                    //skapa en arraylist med databas värden.
                    ArrayList<String> losenord = new ArrayList<String>();
                    String losenordFraga = "Select Losenord from Agent where Namn = '" + anvandareInput + "'";
                    losenord = idb.fetchColumn(losenordFraga);
                    //loopa databasvärdena
                    for (String losenordet : losenord) {

                        if (losenordet.contentEquals(inputLosenord)) {
                            //öppnar ett nytt fönster ifall lösenordet stämmer
                            new AgentPage(idb, anvandareInput).setVisible(true);

                        }

                    }

                }

            }
             */
        } catch (Exception ex) {
            System.out.println(ex);
        }
        /*textPane.setText("");
        System.out.println(select);
            
            try
            {
                
                
                ArrayList<String> telefonLista = new ArrayList<String>();
                String tel = "select Agent.Telefon from Agent where agent.Namn = '" + select + "'";
                telefonLista = idb.fetchColumn(tel);
                System.out.println(select);
                for(String tele : telefonLista)
                {
                    
                    textPane.setText(tele);
                }
                
                
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        
         */
    }//GEN-LAST:event_buttonActionPerformed

    private void textPaneComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textPaneComponentAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_textPaneComponentAdded

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
            java.util.logging.Logger.getLogger(MittFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MittFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MittFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MittFönster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MittFönster(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextPane textPane;
    // End of variables declaration//GEN-END:variables
}
