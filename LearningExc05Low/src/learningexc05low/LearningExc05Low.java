/*
    Escribir un programa que lea un número entero por teclado
    y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package learningexc05low;

import java.util.Scanner;

public class LearningExc05Low {

    public static void main(String[] args) {
        int n;
        Scanner scanFor;
      
        System.out.println("Por favor, ingrese un número:");
        scanFor = new Scanner(System.in);
        n = scanFor.nextInt();
        
        System.out.println("El doble de " + n + "es: " + n * 2);
        System.out.println("El triple de " + n + "es: " + n * 3);
        System.out.println(
                "La raíz cuadrada de " + n + "es: " + Math.sqrt(n)
        );
    }
    
}
