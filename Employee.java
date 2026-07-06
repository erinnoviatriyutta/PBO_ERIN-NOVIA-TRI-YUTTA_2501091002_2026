/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin040626;

/**
 *
 * @author user
 */
public class Employee extends Person{
     @Override //artinya sebagai tanda bahwa nama getname ini juga ada di superclass
    public String getName() {
        System.out.println("getName() Employee");
        return name;
    }
    
}
