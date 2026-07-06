/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin040626;

/**
 *
 * @author user
 */ //class student merupakan subclass dari person
public class Student extends Person{ //extends fungsinya untuk penanda pewarisan dari Person
    public Student() { 
    super("Anna", "Padang");  
        System.out.println("Inside Student:Constructor"); 
    }  
    @Override //tanda  nama getname ini juga ada di superclass
    public String getName() {
        System.out.println("getName() Student");
        return name;
    }
    
    public static void main (String[] args){
        Student Anna = new Student();
        System.out.println(Anna.name);
        System.out.println(Anna.address);
    }
}
