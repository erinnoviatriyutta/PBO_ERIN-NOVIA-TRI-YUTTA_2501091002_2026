/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin09042026;

/**
 *
 * @author user
 */
public class StudentRecordSample {
    public static void main(String[]args){
        StudentRecord AniRecord = new StudentRecord();  
        StudentRecord AliRecord = new StudentRecord(); 
        StudentRecord DeniRecord = new StudentRecord("Deni","Batusangkar", 10);
        DeniRecord.jenisKelamin = "L";
        DeniRecord.print("");
        
        System.out.println("");
        
        AliRecord.setName("Ali");
        AliRecord.setAddress("Padang");
        AliRecord.setAge(20);
        AliRecord.setMathGrade(80);
        AliRecord.setEnglishGrade(70);
        AliRecord.setScienceGrade(90);
        
        AniRecord.setName("Ani");
        AniRecord.setAddress("Jakarta");
        AniRecord.setAge(18);
        AniRecord.setMathGrade(80);
        AniRecord.setEnglishGrade(90);
        AniRecord.setScienceGrade(75);
        
        System.out.println("Data 1");
        System.out.println("Nama                :    "+AliRecord.getName());
        System.out.println("Alamat              :    "+AliRecord.getAddress());
        System.out.println("Umur                :    "+AliRecord.getAge());
        System.out.println("Matematika          :    "+AliRecord.getMathGrade());
        System.out.println("Inggris             :    "+AliRecord.getEnglishGrade());
        System.out.println("Ilmu pengetahuan    :    "+AliRecord.getScienceGrade());
        System.out.println("Rata-rata           :    "+AliRecord.getAverage());
        
        System.out.println();
        
        System.out.println("Data 2");
        System.out.println("Nama                :    "+AniRecord.getName());
        System.out.println("Alamat              :    "+AniRecord.getAddress());
        System.out.println("Umur                :    "+AniRecord.getAge());
        System.out.println("Matematika          :    "+AniRecord.getMathGrade());
        System.out.println("Inggris             :    "+AniRecord.getEnglishGrade());
        System.out.println("Ilmu pengetahuan    :    "+AniRecord.getScienceGrade());
        System.out.println("Rata-rata           :    "+AniRecord.getAverage());
        
        System.out.println();
        
        AniRecord.setName("Ane");
        AniRecord.setAddress("Pesel");
        AniRecord.setAge(15);
        AniRecord.setMathGrade(80);
        AniRecord.setEnglishGrade(70);
        AniRecord.setScienceGrade(90);
        AniRecord.print("");
        
        System.out.println("");
        
        System.out.println("jumlah siswa ="+ StudentRecord.getStudentCount());
    }
}
       
        
        
  

