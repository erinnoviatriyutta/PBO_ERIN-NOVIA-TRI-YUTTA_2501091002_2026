/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class OperasiAritmatikaArgumens {
     public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Gunakan format: java ArithmeticOperation <angka1> <angka2>");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
           
            int quotient = num1 / num2;
            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);

        } catch (NumberFormatException e) {
            System.out.println("Error: Pastikan input yang Anda masukkan adalah angka.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat membagi dengan angka nol.");
        }
    }
}

