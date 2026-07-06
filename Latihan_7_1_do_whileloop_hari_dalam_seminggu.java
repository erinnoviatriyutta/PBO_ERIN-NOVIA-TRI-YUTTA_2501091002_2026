/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin02042026;

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_1_do_whileloop_hari_dalam_seminggu { //nama class
    public static void main(String[] args) {    //method utama
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; //ini adalah array dengan tipe data string dan namanya days
        
        int i = 0; //variable counter atau penghitung
                   //Membuat variabel pencatat bernama i bertipe integer dengan nilai awal 0. Variabel i ini akan bertindak sebagai penunjuk nomor 
                   //index Array sekaligus pengontrol jalannya perulangan agar tidak berjalan selamanya tanpa henti (infinite loop).
       
        //Perulangan do-while memiliki sifat unik: Lakukan dulu perintahnya minimal 1 kali, baru cek kondisinya di akhir.   
        do { //ini menandakan awal dari blok perulangan
            
            System.out.println(days[i]); //Perintah untuk mencetak data hari ke layar. Komputer membaca isi di dalam days[index ke-i]. 
                                        //Karena di awal i = 0, maka yang tercetak pertama kali adalah "Monday".
                                        
            i++; //Disebut juga Increment. Fungsinya untuk menambah nilai variabel i sebanyak 1 angka setiap kali baris ini dilewati. 
                //Jadi, setelah mencetak "Monday", nilai i yang tadinya 0 berubah menjadi 1 (bersiap untuk hari berikutnya).
                
        } while (i < days.length); //penutup blok perulangan
        //days.length adalah fitur otomatis Java untuk menghitung jumlah total isi Array (dalam kasus ini nilainya adalah 7).
       //Komputer akan mengecek: "Apakah nilai i sekarang masih lebih kecil dari 7?". Jika Benar (True), komputer akan melompat kembali ke atas 
       //(ke baris do) untuk mencetak "Tuesday". Proses ini terus berulang hingga i mencapai angka 7. Ketika i = 7, kondisi 7 < 7 bernilai Salah (False), 
       //sehingga perulangan otomatis berhenti.
    }
}
