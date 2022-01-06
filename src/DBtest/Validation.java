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
        boolean rattString = true;
        if (input.equals("")) {
            JOptionPane.showMessageDialog(null, "Du måste fylla i fönstret!");
            rattString = false;

        }
        return rattString;

    }
}

