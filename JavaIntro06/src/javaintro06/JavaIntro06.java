/*
    Implementar un programa que le pida dos números enteros a usuario
    y determine si ambos o alguno de ellos es mayor a 25.
 */
package javaintro06;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro06 {

    public static void main(String[] args) {
        int n1, n2;
        Scanner scanFor;
        
        scanFor = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese dos números enteros");
        n1 = scanFor.nextInt();
        n2 = scanFor.nextInt();
        
        if (n1 > 25 || n2 > 25) {
            System.out.println("Al menos uno de estos números es mayor"
                    + " a 25.");
        } else {
            System.out.println("Ninguno de los números que ingresó es mayor"
                + " a 25.");
        }
        
    }
    
}
