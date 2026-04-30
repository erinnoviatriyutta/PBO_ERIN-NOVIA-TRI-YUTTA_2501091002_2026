/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;
/**
 *
 * @author user
 */
public class rentalMobil {
    private String idSewa;
    private String namaPenyewa;
    private String jenisMobil;
    private int lamaSewa;
    private double hargaSewa;
    private double biayaSewa;
    private double biayaTambahan;
    private double totalBayar;

    public String getIdSewa() {
        return idSewa;
    }

    public void setIdSewa(String idSewa) {
        this.idSewa = idSewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public double getBiayaSewa() {
        return biayaSewa;
    }

    public double getBiayaTambahan() {
        return biayaTambahan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void hitungBiaya() {

        if (jenisMobil.equalsIgnoreCase("Avanza")) {
            hargaSewa = 300000;
        } else if (jenisMobil.equalsIgnoreCase("Innova")) {
            hargaSewa = 500000;
        } else if (jenisMobil.equalsIgnoreCase("Fortuner")) {
            hargaSewa = 800000;
        } else {
            hargaSewa = 0;
        }

        biayaSewa = hargaSewa * lamaSewa;

        if (lamaSewa > 5) {
            biayaTambahan = biayaSewa * 0.10;
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }
}