/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin02042026;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_2_Bufferedrader_Nomor_terbesar {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        int max = Integer.MIN_VALUE;

        try {
            System.out.println("Masukkan 10 angka:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Angka ke-" + (i + 1) + ": ");
                angka[i] = Integer.parseInt(reader.readLine());
               
                if (angka[i] > max) {
                    max = angka[i];
                }
            }

            System.out.println("---------------------------");
            System.out.println("Input terbesar adalah: " + max);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input.");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}