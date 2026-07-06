/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin26032026;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class Latihan1_Nilai_BufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            System.out.print("Masukkan Nilai Ujian 1: ");
            double nilai1 = Double.parseDouble(reader.readLine());
            
            System.out.print("Masukkan Nilai Ujian 2: ");
            double nilai2 = Double.parseDouble(reader.readLine());
            
            System.out.print("Masukkan Nilai Ujian 3: ");
            double nilai3 = Double.parseDouble(reader.readLine());
            
            double rataRata = (nilai1 + nilai2 + nilai3) / 3;
            
            System.out.print("Rata-rata: " + rataRata + " ");
            
            if (rataRata >= 60) {
                System.out.println(":)");
            } else {
                System.out.println(":-(");
            }
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
        }
    }
}
    
