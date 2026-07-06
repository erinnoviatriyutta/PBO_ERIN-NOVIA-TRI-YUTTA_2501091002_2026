/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin16042026;

/**
 *
 * @author user
 */
public class BukuAlamat { //nama class cetakan
    
    private String nama; // baris 13-16 adalah atribut arau variable atau properti
    private String alamat;
    private String telepon;
    private String email;
    
    public BukuAlamat(){ //constructor namun tidak ada parameter di dalamnya
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

  
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String Telepon) {
        this.telepon = Telepon;
    }

 
    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
}