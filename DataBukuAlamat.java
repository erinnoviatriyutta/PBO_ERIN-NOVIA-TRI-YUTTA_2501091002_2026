/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin16042026;

/**
 *
 * @author user
 */
public class DataBukuAlamat {
    BukuAlamat [] data = new BukuAlamat[5];
    
    public void insert(BukuAlamat bukuAlamat, int index){
        data[index] = bukuAlamat;
    }
    
        public void update(BukuAlamat bukuAlamatBaru, int index){
         data[index] = bukuAlamatBaru;
    }
        
         public void delete(int index){
         data[index] = null;
    }
         
         public void view (){
         for(int i=0;i<data.length;i++) {
             if (data[i] !=null){
                System.out.println("Data ke-->"+ (i+1));
                System.out.println("Nama              :" + data[i].getNama());
                System.out.println("Alamat            :" + data[i].getAlamat());
                System.out.println("Telpon            :" + data[i].getTelepon());
                System.out.println("Email             :" + data[i].getEmail());
                System.out.println("---------------------------");
         }
    }
  }
}