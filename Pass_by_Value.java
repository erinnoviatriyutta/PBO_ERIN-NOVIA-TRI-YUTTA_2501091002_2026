/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin09042026;

/**
 *
 * @author user
 */
public class Pass_by_Value {
    public static void main( String[] args ){ 
        int i = 10; 
             System.out.println( i ); 
        test( i );
             System.out.println( 10 ); 
    }
    public static void test( int j ){ 
        j = 33;  
 } 
} 

