/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin16042026;

/**
 *
 * @author user
 */
public class BukuAlamatExample {
    public static void main (String[]args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat bukuAlamat = new BukuAlamat();
        bukuAlamat.setNama("Ali");
        bukuAlamat.setAlamat("Padang");
        bukuAlamat.setTelepon("082386487370");
        bukuAlamat.setEmail("ali@coba.com");
        data.insert(bukuAlamat, 0);
        
        bukuAlamat = new BukuAlamat();
        bukuAlamat.setNama("Budi");
        bukuAlamat.setAlamat("Padang");
        bukuAlamat.setTelepon("08347885648");
        bukuAlamat.setEmail("budi@coba.com");
        data.insert(bukuAlamat, 1);
  
        data.view();
    }
}
