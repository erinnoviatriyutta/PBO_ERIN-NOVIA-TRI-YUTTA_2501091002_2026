/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin02042026;

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_1_whileloop_hari_dalam_seminggu {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }
    }
}