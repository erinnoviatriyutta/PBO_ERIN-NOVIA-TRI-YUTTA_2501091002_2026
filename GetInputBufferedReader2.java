/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin10032026;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author user
 */
public class GetInputBufferedReader2 {
     public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name   = "";
        String alamat = "";
        
        try {
            System.out.print("Nama   :");
            name = dataIn.readLine();
            System.out.print("Alamat :");
            alamat = dataIn.readLine();
        } catch (IOException e){
            System.out.println("Eror!");  
        }
        System.out.println("Nama :" + name);
        System.out.println("Alamat :" + alamat);
            }
}

