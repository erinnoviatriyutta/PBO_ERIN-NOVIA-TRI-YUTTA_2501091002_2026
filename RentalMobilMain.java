/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin30042026;

/**
 *
 * @author user
 */
public class RentalMobilMain {  //nama class baru
     public static void main(String [] args){   //method utama
         
         //pembuatan objek menggunakan konstruktor
        RentalMobill p1 = new RentalMobill("A001", "Dellia", "Innova", 7);
        //yang didlm kurung adalah Argument (data asli) yang dikirim masuk ke dalam Parameter milik Constructor RentalMobill.
        // p1 merupakan nama variable objek baru
        p1.tampilData(); //Perintah ini akan mengeksekusi barisan System.out.println yang ada di dalam kelas RentalMobill
    }
}

