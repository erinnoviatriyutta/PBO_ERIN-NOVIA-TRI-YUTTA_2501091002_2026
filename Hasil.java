/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin14042026;
/**
 *
 * @author user
 */
public class Hasil {
    public static void main(String[] args){

        pegawai p1 = new pegawai();
        pegawai p2 = new pegawai();

        p1.setNip("1002");
        p1.setNama("Budi");
        p1.setGolongan("IA");
        p1.setPotongan(200000);

        System.out.println("Data 1");
        System.out.println("NIP         : " + p1.getNip());
        System.out.println("Nama        : " + p1.getNama());
        System.out.println("Golongan    : " + p1.getGolongan());

        p1.setGajiPokok();
        System.out.println("Gaji Pokok  : " + p1.getGajiPokok());
        System.out.println("Tunjangan   : " + p1.getTunjangan());
        System.out.println("Potongan    : " + p1.getPotongan());
        System.out.println("Gaji Bersih : " + p1.getGajiBersih());

        p2.setNip("1003");
        p2.setNama("Beni");
        p2.setGolongan("IC");
        p2.setPotongan(300000);

        System.out.println("\nData 2");
        p2.print("");
        p2.setGajiPokok();

        System.out.println("Gaji Pokok  : " + p2.getGajiPokok());
        System.out.println("Tunjangan   : " + p2.getTunjangan());
        System.out.println("Potongan    : " + p2.getPotongan());
        System.out.println("Gaji Bersih : " + p2.getGajiBersih());

        System.out.println("\nJumlah Pegawai : " + pegawai.getJumlahPegawai());
    }
}