/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;
/**
 *
 * @author user
 */
public class rentalMobil {  //rentalMobil merupakan nama sebuah class sebagai cetakan
    private String idSewa;
    private String namaPenyewa; // baris 11-18 merupakan atribut atau variable atau properti
    private String jenisMobil;
    private int lamaSewa;
    private double hargaSewa;
    private double biayaSewa;
    private double biayaTambahan;
    private double totalBayar;

    public String getIdSewa() { //method getter fungsinya untuk mengambil atau melihat nilai
        return idSewa; //return pada method Getter untuk mengembalikan atau menyerahkan nilai dari sebuah atribut variabel kepada pihak luar yang memanggilnya.
    }

    public void setIdSewa(String idSewa) {  //Method Setter untuk mengisi atau mengubah nilai dengan data baru yang dimasukkan.
        this.idSewa = idSewa; //this fungsinya untuk mengacu pada atribut class
    }

    public String getNamaPenyewa() {    //method getter fungsinya untuk mengambil atau melihat nilai
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {    //Method Setter untuk mengisi atau mengubah nilai dengan data baru yang dimasukkan.
        this.namaPenyewa = namaPenyewa;
    }

    public String getJenisMobil() { //method getter fungsinya untuk mengambil atau melihat nilai
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {  //Method Setter untuk mengisi atau mengubah nilai dengan data baru yang dimasukkan.
        this.jenisMobil = jenisMobil;
    }

    public int getLamaSewa() {  //method getter fungsinya untuk mengambil atau melihat nilai
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) { //Method Setter untuk mengisi atau mengubah nilai dengan data baru yang dimasukkan.
        this.lamaSewa = lamaSewa;
    }

                                    //Empat method di bawah ini hanya memiliki Getter tanpa Setter. Artinya, nilai dari 
                                    //variabel-variabel ini tidak boleh diisi manual dari luar, melainkan nilainya otomatis 
                                    //didapatkan dari hasil perhitungan internal komputer (pada method hitungBiaya).
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

    
    
    public void hitungBiaya() { //ini termasuk kedalam sebuah method yaitu perhitungan
                                //Fungsinya adalah melakukan kalkulasi otomatis berdasarkan data yang sudah dimasukkan ke dalam objek.

        if (jenisMobil.equalsIgnoreCase("Avanza")) {    //fungsi equalsIgnoreCase memastikan program tetap mengenali kata meskipun ditulis dengan 
                                                        //huruf besar atau kecil (misal: "avanza", "AVANZA", atau "Avanza" tetap dianggap sama)
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
            biayaTambahan = biayaSewa * 0.10;   //disini biaya tambahan bertindak sebagai diskon
        } else {
            biayaTambahan = 0;
        }

        totalBayar = biayaSewa - biayaTambahan;
    }
}