/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin26032026;
 import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Latihan1_Nilai_JOptionPane {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Masukkan Nilai Ujian 1:");
        double nilai1 = Double.parseDouble(input1);
        
        String input2 = JOptionPane.showInputDialog("Masukkan Nilai Ujian 2:");
        double nilai2 = Double.parseDouble(input2);
        
        String input3 = JOptionPane.showInputDialog("Masukkan Nilai Ujian 3:");
        double nilai3 = Double.parseDouble(input3);
        
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        
        String pesan = "Rata-rata Anda: " + rataRata;
        
        if (rataRata >= 60) {
            pesan += " :)";
        } else {
            pesan += " :-(";
        }
        
        JOptionPane.showMessageDialog(null, pesan);
    }
}
    

