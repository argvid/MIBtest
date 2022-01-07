/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arvid
 */
package Start;


import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import DBtest.LogIn;
import DBtest.RegistreraAlien;
import DBtest.Validation;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Start {

    private static InfDB idb;

    public static void main(String[] args) throws InfException {
        

        
    try {
        idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        
        new LogIn(idb).setVisible(true);
    } catch (InfException ex) {
        Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
}