/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin11062026;

/**
 *
 * @author LAB-SI-PC
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Line line1 = new Line(1, 5, 1, 5);
        Line line2 = new Line(1, 5, 1, 5);
        Relations line = new Line();
        System.out.println(line.isEqual(line1, line2));
    }
    
}
