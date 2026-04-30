/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class hasilRentalMobil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        rentalMobil rentalMobil = new rentalMobil();

        System.out.print("Masukkan ID Sewa                              : ");
        rentalMobil.setIdSewa(input.nextLine());

        System.out.print("Masukkan Nama Penyewa                         : ");
        rentalMobil.setNamaPenyewa(input.nextLine());

        System.out.print("Masukkan Jenis Mobil Avanza/Innova/Fortuner   : ");
        rentalMobil.setJenisMobil(input.nextLine());

        System.out.print("Masukkan Lama Sewa                            : ");
        rentalMobil.setLamaSewa(input.nextInt());

        rentalMobil.hitungBiaya();
        
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
    }
}