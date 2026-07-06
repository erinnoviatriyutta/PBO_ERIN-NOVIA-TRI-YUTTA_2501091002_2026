/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin18062026;

/**
 *
 * @author user
 */
public class MahasiswaExample {
    public static void main(String[] args){
        MahasiswaNilai m = new MahasiswaNilai();
                m.setNim("2501091002");
                m.setNama("Erin");
                m.setAlamat("Padang");
                m.setTugas(60.0);
                m.setUts(50.0);
                m.setUas(40.0);
                
               System.out.println("Nim         :" + m.getNim());
               System.out.println("Nim         :" + m.getNama());
               System.out.println("Alamat      :" + m.getAlamat());
               System.out.println("Tugas       :" + m.getTugas());
               System.out.println("UTS         :" + m.getUts());
               System.out.println("UAS         :" + m.getUas());
               System.out.println("Nilai Angka :" + m.getNilaiAngka());
               System.out.println("Nilai Huruf :" + m.getNilaiHuruf());

                        
    }
}
