/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin040626;

/**
 *
 * @author user
 */
public class PolimorfismeExample {
    public static void main(String[]args){
        Student student = new Student();
        Employee employee = new Employee();
        printInformation(student);
        employee.name = "Budi";
        employee.address = "Padang";
        printInformation(employee);
    }
    
    public static void printInformation( Person p ){
        System.out.println("Nama    :"+ p.getName());
        System.out.println("Alamat   :"+ p.getAddress());
    }
    
}
