/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBtest;
        
/**
 *
 * @author arvid
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
import oru.inf.InfDB;
import oru.inf.InfException;



public class DBtest extends javax.swing.JFrame{
    
    
    private InfDB idb;

    public DBtest (InfDB idb){
        this.idb = idb;
        
    }
    

/*public void fyllCb(){
String fraga = "SELECT namn FROM Agent";

ArrayList<String> allaNamn;
try{
    

allaNamn = idb.fetchColumn(fraga);
for(String namn : allaNamn){
    combobox.addItem(namn);
  }          
}
catch(InfExeption ettUndantag){
    JOptionPane.showMessageDialog(null, "Databasfel!");
    System.out.println("fel");
}
}
*/
}