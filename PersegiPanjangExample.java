/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin11062026;

/**
 *
 * @author LAB-SI-PC
 */
public class PersegiPanjangExample {
   public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(8, 4); 
        PersegiPanjang p2 = new PersegiPanjang(5, 6);

        System.out.println("Luas p1 = " + p1.getLuas());
        System.out.println("Luas p2 = " + p2.getLuas());

        System.out.println("p1 > p2 : " + p1.isGreater(p1, p2));
        System.out.println("p1 < p2 : " + p1.isLess(p1, p2));
        System.out.println("p1 = p2 : " + p1.isEqual(p1, p2));
    }

}
