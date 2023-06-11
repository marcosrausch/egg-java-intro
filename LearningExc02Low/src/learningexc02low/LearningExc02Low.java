/*
    Escribir un programa que pida tu nombre, lo guarde en una variable y
    lo muestre por pantalla.
 */
package learningexc02low;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class LearningExc02Low {

    public static void main(String[] args) {
        String name;
        Scanner scanFor;
                
        System.out.println("¿Cuál es tu nombre?");
        scanFor = new Scanner(System.in);
        name = scanFor.nextLine();
        
        System.out.println("¡Hola, " + name + "!");
    }
    
}
