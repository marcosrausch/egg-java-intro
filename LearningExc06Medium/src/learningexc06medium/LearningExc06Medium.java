/*
    Crear un programa que dado un numero determine si es par o impar.
 */
package learningexc06medium;

import java.util.Scanner;

public class LearningExc06Medium {

    public static void main(String[] args) {
        int n;
        Scanner scanFor;
        
        System.out.println("Por favor, ingrese un número");
        scanFor = new Scanner(System.in);
        n = scanFor.nextInt();
        
        even(n);
    }
    
    public static void even(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " es primo");
        } else {
            System.out.println(number + " no es primo");
        }
    }
}
