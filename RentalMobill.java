/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;

/**
 *
 * @author user
 */
public class RentalMobill { //ini merupakan sebuah class
    private String IdSewa;  //dari baris 12-19 merupakan sebuah atribut atau variable atau properti
    private String NamaPenyewa;
    private String JenisMobil;
    private int LamaSewa;
    private double HargaSewa;
    private double BiayaSewa;
    private double BiayaTambahan;
    private double TotalBayar;
    
    public RentalMobill(String IdSewa, String NamaPenyewa, String JenisMobil, int LamaSewa){    //constructor dan yang di dalam kurung adalah parameter
        this.IdSewa= IdSewa;    //fungsi this memberi tahu komputer untuk mengambil data dari parameter (inputan luar) dan memasukkannya langsung 
                                //ke dalam atribut private milik kelas ini.
        this.NamaPenyewa= NamaPenyewa;
        this.JenisMobil= JenisMobil;
        this.LamaSewa= LamaSewa;
        hitungBiaya();  //Memanggil method perhitungan secara otomatis di dalam constructor.
     
    }
    public void hitungBiaya(){  //ini merupakan method logika dan perhitungan
        if(JenisMobil.equalsIgnoreCase("Avanza")){
            HargaSewa=300000;
        } else if(JenisMobil.equalsIgnoreCase("Innova")){
            HargaSewa=500000;
        } else if(JenisMobil.equalsIgnoreCase("Fortuner")){
            HargaSewa=800000;  
        } 
        BiayaSewa= HargaSewa * LamaSewa;
        if(LamaSewa > 5){
            BiayaTambahan = 0.10 * BiayaSewa;
        } else {
            BiayaTambahan = 0;
        }
        TotalBayar = BiayaSewa - BiayaTambahan;
    }
      //proses menampilkan output
    public void tampilData(){
        System.out.println("===== DATA PENYEWA =====");
        System.out.println("ID Sewa         :" +IdSewa);
        System.out.println("Nama Penyewa    :" +NamaPenyewa);
        System.out.println("Jenis Mobil     :" +JenisMobil);
        System.out.println("Lama Sewa       :" +LamaSewa);
        System.out.println("Harga Sewa      :" +HargaSewa);
        System.out.println("Biaya Sewa      :" +BiayaSewa);
        System.out.println("Biaya Tambahan  :" +BiayaTambahan);
        System.out.println("Total Bayar     :" +TotalBayar);
                 
    }
}

