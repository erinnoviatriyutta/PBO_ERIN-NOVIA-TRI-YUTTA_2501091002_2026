/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;
import java.io.BufferedReader;  //baris 6-8 merupakah sebuah library
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class hasilRentalMobil { //hasilRentalMobil adalah nama sebuah class sbg tempat menjalankan program
    public static void main(String[] args) {    //ini adalah method utama 

     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  //ini juga sebuah object namun object bawaan dari java

                                                                                    
        rentalMobil rentalMobil = new rentalMobil();    //object yang khusus kita buat sendiri sebagai wadah data harus sama dengan nama class utama
        
        try {   //sebagai pembungkus program jika menggunakan java.io.IOException (BLOK PROTEKSI EROR)
        
          //dari baris 25-35 merupakan proses mengambil input data 
        System.out.print("Masukkan ID Sewa                             : ");    
        rentalMobil.setIdSewa(reader.readLine());

        System.out.print("Masukkan Nama Penyewa                         : ");   
        rentalMobil.setNamaPenyewa(reader.readLine());

        System.out.print("Masukkan Jenis Mobil Avanza/Innova/Fortuner   : ");
        rentalMobil.setJenisMobil(reader.readLine());

        System.out.print("Masukkan Lama Sewa                            : ");
        rentalMobil.setLamaSewa(Integer.parseInt(reader.readLine()));
        //fungsi Integer.parseInt untuk mengubah (mengonversi) data bertipe teks (String) menjadi angka bulat bertipe (int).
        //reader.readLine() selalu menghasilkan data bertipe String.
        
        rentalMobil.hitungBiaya();  //berfungsi untuk memanggil method yang ada di class rentalMobil
        
        //proses menampilkan output
        System.out.println("");
        System.out.println("DATA RENTAL MOBIL");
        System.out.println("======================");
        System.out.println("ID Sewa           : " + rentalMobil.getIdSewa());
        System.out.println("Nama Penyewa      : " + rentalMobil.getNamaPenyewa());
        System.out.println("Jenis Mobil       : " + rentalMobil.getJenisMobil());
        System.out.println("Lama Sewa         : " + rentalMobil.getLamaSewa() + " hari");
        System.out.println("Harga Sewa/Hari   : Rp " + rentalMobil.getHargaSewa());
        System.out.println("Biaya Sewa        : Rp " + rentalMobil.getBiayaSewa());
        System.out.println("Diskon            : Rp " + rentalMobil.getBiayaTambahan());
        System.out.println("Total Bayar       : Rp " + rentalMobil.getTotalBayar());
        
        
        } catch (IOException e) {   //ini blok penutup yang membuangkus semuah perintah
            System.out.println("Terjadi kesalahan teknis pada sistem input: " );
        }
    }
}