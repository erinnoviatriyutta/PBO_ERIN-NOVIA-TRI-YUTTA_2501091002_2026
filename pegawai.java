/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin14042026;

/**
 *
 * @author user
 */
public class pegawai {
    
    private String nip;
    private String nama;
    private String golongan;
    private double gajipokok;
    private double potongan;
    private double gajiBersih;
    private double tunjangan;
    private static int JumlahPegawai;

    public pegawai(){
        JumlahPegawai++;
    }
    
    public pegawai(String temp){
        this.nama = temp;
        JumlahPegawai++;
    }

    public pegawai(String nip, String nama, String golongan){
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
        JumlahPegawai++;
    }
    
    public pegawai(double potongan){
        this.potongan = potongan;
    }

    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getGolongan(){
        return golongan;
    }
    
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    
    public double getPotongan(){
        return potongan;
    }
    
    public void setPotongan(double potongan){
        this.potongan = potongan;
    }

    public void setGajiPokok() {
        if (golongan.equalsIgnoreCase("IA")) {
            gajipokok = 2000000;
        } else if (golongan.equalsIgnoreCase("IB")) {
            gajipokok = 3000000;
        } else if (golongan.equalsIgnoreCase("IC")) {
            gajipokok = 4000000;
        } else {
            gajipokok = 1000000;
        }
    }

    public double getGajiPokok() {
        return gajipokok;
    }

    public double getTunjangan() {
        return 0.1 * gajipokok;
    }

    public double getGajiBersih() {
        return gajipokok + getTunjangan() - potongan;
    }

    public static int getJumlahPegawai() {
        return JumlahPegawai;
    }

    public void print(String temp){
        System.out.println("NIP         : " + nip);
        System.out.println("Nama        : " + nama);
        System.out.println("Golongan    : " + golongan);
    }

    public void print(double potongan){
        setGajiPokok();
        this.potongan = potongan;

        System.out.println("Gaji Pokok  : " + gajipokok);
        System.out.println("Tunjangan   : " + getTunjangan());
        System.out.println("Potongan    : " + potongan);
        System.out.println("Gaji Bersih : " + getGajiBersih());
    }
}