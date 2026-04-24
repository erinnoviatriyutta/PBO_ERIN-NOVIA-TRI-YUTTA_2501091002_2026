/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin23042026;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
   public class PegawaiHasil {
    private static ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN PEGAWAI ===");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. View Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1: insertData(); break;
                case 2: updateDataByNomor(); break;
                case 3: deleteDataByNomor(); break;
                case 4: viewData(); break;
                case 0: System.out.println("Keluar dari sistem..."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void insertData() {
        System.out.println("\n--- Input Data Pegawai ---");
        System.out.print("Masukkan NIP: ");
        String nip = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Golongan (3A/3B/3C): ");
        String gol = input.nextLine();

        daftarPegawai.add(new Pegawai(nip, nama, gol));
        System.out.println("Data berhasil disimpan!");
    }

    private static void updateDataByNomor() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\n[!] Tidak ada data untuk diupdate.");
            return;
        }
        
        viewData(); 
        System.out.print("Pilih Nomor Pegawai yang akan diubah: ");
        int no = input.nextInt();
        input.nextLine(); 

        if (no > 0 && no <= daftarPegawai.size()) {
            Pegawai p = daftarPegawai.get(no - 1); 
            System.out.println("Mengubah data untuk: " + p.getNama());
            
            System.out.print("NIP Baru: ");
            p.setNip(input.nextLine());
            System.out.print("Nama Baru: ");
            p.setNama(input.nextLine());
            System.out.print("Golongan Baru (3A/3B/3C): ");
            p.setGolongan(input.nextLine());
            
            System.out.println("Data pegawai nomor " + no + " berhasil diperbarui!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    private static void deleteDataByNomor() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\n[!] Tidak ada data untuk dihapus.");
            return;
        }

        viewData();
        System.out.print("Pilih Nomor Pegawai yang akan dihapus: ");
        int no = input.nextInt();
        input.nextLine();

        if (no > 0 && no <= daftarPegawai.size()) {
            daftarPegawai.remove(no - 1);
            System.out.println("Data pegawai nomor " + no + " berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    private static void viewData() {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\n[!] Belum ada data pegawai.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("          DAFTAR DATA PEGAWAI         ");
        System.out.println("========================================");

        for (int i = 0; i < daftarPegawai.size(); i++) {
            Pegawai p = daftarPegawai.get(i);
            System.out.println("PEGAWAI NOMOR: " + (i + 1)); 
            System.out.println("----------------------------------------");
            System.out.printf("NIP          : %s\n", p.getNip());
            System.out.printf("Nama         : %s\n", p.getNama());
            System.out.printf("Golongan     : %s\n", p.getGolongan());
            System.out.printf("Gaji Pokok   : Rp%,.0f\n", p.getGajiPokok());
            System.out.printf("Tunjangan    : Rp%,.0f\n", p.getTunjangan());
            System.out.printf("Potongan     : Rp%,.0f\n", p.getPotongan());
            System.out.printf("Gaji Bersih  : Rp%,.0f\n", p.getGajiBersih());
            System.out.println("----------------------------------------\n");
        }
        System.out.println("Total Pegawai: " + daftarPegawai.size());
        System.out.println("========================================");
    }
}