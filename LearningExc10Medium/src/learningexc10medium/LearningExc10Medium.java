/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */
package learningexc10medium;

import java.util.Scanner;

public class LearningExc10Medium {

    public static void main(String[] args) {
        Scanner scanFor;
        int limit, sum, n;
        
        scanFor = new Scanner(System.in);
        sum = 0;
        
        System.out.println("Por favor, ingrese un valor límite positivo");
        limit = scanFor.nextInt();
        
        
        System.out.println("Ahora ingrese números");
        do {            
            n = scanFor.nextInt();
            sum += n;                       
        } while (sum < limit);
        
        printSum(sum);
    }
    
    public static void printSum(int s) {
        System.out.println("La suma de los números que ingresó es: " + s);
    }
    
}
