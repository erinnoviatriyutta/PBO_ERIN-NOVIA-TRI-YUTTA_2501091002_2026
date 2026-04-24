/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin07042026;

/**
 *
 * @author user
 */
public class Latihan10_1_hasil {
    public static void main(String[] args) {
        BukuAlamat data = new BukuAlamat("Budi Santoso", "Jl. Sudirman No. 10", "0812345", "budi@email.com");

        // Menampilkan data
        System.out.println("Data Buku Alamat");
        System.out.println("Nama    : " + data.getNama());
        System.out.println("Alamat  : " + data.getAlamat());
        System.out.println("Telepon : " + data.getNomorTelepon());
        System.out.println("Email   : " + data.getEmail());

        // Update nama menggunakan Mutator
        data.setNama("Budi Santoso, M.Kom");
        System.out.println("\nSetelah Update Nama:");
        System.out.println("Nama Baru: " + data.getNama());
    }
}

