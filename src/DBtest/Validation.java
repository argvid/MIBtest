/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBtest;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author arvid
 */
public class Validation {

    private String input;

    public Validation(String input) {

        this.input = input;

    }

    public boolean testaString(String input) {
        if (input.equals("")) {
            JOptionPane.showMessageDialog(null, "Du måste fylla i fönstret!");
            return false;
        }
        return true;
    }

    public boolean kollaInt(String str) {
        String regex = "[0-9]+";
        if (str.matches(regex) == false) {
            JOptionPane.showMessageDialog(null, "Telefonnummer kan endast innehålla siffror");
        }
        return str.matches(regex);
    }

    public boolean kollaLosen(String losenord) {
        if (losenord.length() > 6) {
            JOptionPane.showMessageDialog(null, "Ditt lösenord kan inte vara mer än 6 tecken");
        }
        
        else if(losenord.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ditt lösenord får inte vara tomt");
        }
        return losenord.length() < 7;

    }
}
