/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin07042026;

/**
 *
 * @author user
 */
public class StudentRecordSample {
    public static void  main (String[] args){
        StudentRecord Ali = new StudentRecord();
        Ali.setName("Ali");
        Ali.setaddress("Padang");
        Ali.setage(20);
        Ali.setmathGrade(70);
        Ali.setenglishGrade(80);
        Ali.setscienceGrade(90);
        
        StudentRecord Ani = new StudentRecord();
        Ani.setName("Ani");
        Ani.setaddress("Jakarta");
        Ani.setage(18);
        Ani.setmathGrade(80);
        Ani.setenglishGrade(90);
        Ani.setscienceGrade(75);
        
        System.out.println("Data Ali Safiansyah");
        System.out.println("Nama                :    "+Ali.getname());
        System.out.println("Alamat              :    "+Ali.getaddress());
        System.out.println("Umur                :    "+Ali.getage());
        System.out.println("Matematika          :    "+Ali.getmathGrade());
        System.out.println("Inggris             :    "+Ali.getenglishGrade());
        System.out.println("Ilmu pengetahuan    :    "+Ali.getscienceGrade());
        System.out.println("Rata-rata           :    "+Ali.getaverage());
        
        System.out.println();
        
        System.out.println("Data Anisa Putri");
        System.out.println("Nama                :    "+Ani.getname());
        System.out.println("Alamat              :    "+Ani.getaddress());
        System.out.println("Umur                :    "+Ani.getage());
        System.out.println("Matematika          :    "+Ani.getmathGrade());
        System.out.println("Inggris             :    "+Ani.getenglishGrade());
        System.out.println("Ilmu pengetahuan    :    "+Ani.getscienceGrade());
        System.out.println("Rata-rata           :    "+Ani.getaverage());
        
        
        
        
       
        
        
        
    }   
    
}
