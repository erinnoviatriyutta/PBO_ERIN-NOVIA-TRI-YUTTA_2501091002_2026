/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin23042026;

/**
 *
 * @author user
 */
public class Pegawai {
  
    private String nip;
    private String nama;
    private String golongan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double gajiBersih;
    private static int JumlahPegawai;
    
     public Pegawai(){
        JumlahPegawai++;
    }

    public Pegawai(String nip, String nama, String golongan) {
        JumlahPegawai++;
        this.nip = nip;
        this.nama = nama;
        setGolongan(golongan); 
    }

    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan.toUpperCase();
        hitungGaji(); 
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public double getTunjangan() {
        return tunjangan;
    }

    public double getPotongan() {
        return potongan;
    }

    public double getGajiBersih() {
        return gajiBersih;
    }
    
     public static int getJumlahPegawai() {
        return JumlahPegawai;
    }

    private void hitungGaji() {
        switch (this.golongan) {
            case "3A": this.gajiPokok = 2000000; break;
            case "3B": this.gajiPokok = 2500000; break;
            case "3C": this.gajiPokok = 3000000; break;
            default  : this.gajiPokok = 0; break;
        }

        this.tunjangan = 0.10 * this.gajiPokok;
        double totalKotor = this.gajiPokok + this.tunjangan;
        this.potongan = 0.02 * totalKotor;
        this.gajiBersih = totalKotor - this.potongan;
        
    }
}
 

   