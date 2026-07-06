/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin12032026;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class KataTerakhirJOptionPane {
     public static void main(String[] args) {
       
        String word1;
        String word2;
        String word3;
    
        word1 = JOptionPane.showInputDialog("Enter word1:");
        word2 = JOptionPane.showInputDialog("Enter word2:");
        word3 = JOptionPane.showInputDialog("Enter word3:");
        
        String message = word1 + " " + word2 + " " + word3;
        
        JOptionPane.showMessageDialog(null, message);
        
        
        }
}
