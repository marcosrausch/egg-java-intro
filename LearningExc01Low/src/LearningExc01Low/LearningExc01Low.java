/*
    Escribir un programa que pida dos números enteros por teclado y calcule
    la suma de los dos. El programa deberá después mostrar el resultado.
 */
package LearningExc01Low;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class LearningExc01Low {

    public static void main(String[] args) {
        int n1, n2;
        Scanner scanFor;
        
        System.out.println("Por favor, ingrese dos números:");
        scanFor = new Scanner(System.in);
        n1 = scanFor.nextInt();
        n2 = scanFor.nextInt();
        
        sum(n1, n2);
    }
    
    public static void sum(int n, int m) {
        System.out.println("La suma de ambos números es: " + (n + m));
    }
}
