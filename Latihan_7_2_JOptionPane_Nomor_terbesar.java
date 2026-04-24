/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin02042026;
import javax.swing.JOptionPane;


/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_2_JOptionPane_Nomor_terbesar {
    public static void main(String[] args) {
        int[] angka = new int[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, 
                "Masukkan angka ke-" + (i + 1), 
                "Input Angka", 
                JOptionPane.QUESTION_MESSAGE);
            
            try {
                angka[i] = Integer.parseInt(input);
                
                if (angka[i] > max) {
                    max = angka[i];
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid, ulangi!");
                i--;
            }
        }

        JOptionPane.showMessageDialog(null, "Nilai terbesar yang Anda masukkan adalah: " + max);
    }
}

