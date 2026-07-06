/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin07042026;

/**
 *
 * @author user
 */
public class StudentRecord {
    
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    
    private static int studentCount;
    
    public String getname(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
        
    }

    public String getaddress(){
        return address;
    }
    
    public void setaddress(String address){
        this.address = address;
        
    }
    
    public int getage(){
        return age;
    }
    
    public void setage(int age){
        this.age = age;
        
    }
    
     public double getmathGrade(){
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
        
    }
    
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
        
    }
    
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
        
    }
    
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    
    public void setaverage(double average){
        this.average = average;
        
    }
    
    
}
    

    