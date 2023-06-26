/*
Realizar un programa que solo permita introducir sólo frases o palabras de 8
carcteres de largo. Si el usuario ingresa una frase o palabra de 8 caracteres
de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package learningexc08medium;

import java.util.Scanner;

public class LearningExc08Medium {

    public static void main(String[] args) {
        String w;
        Scanner scanFor;

        System.out.println("Por favor, ingrese una palabra o frase");
        scanFor = new Scanner(System.in);
        w = scanFor.nextLine();
        
        checkLength(w);
    }

    public static void checkLength(String word) {
        final int EIGHT;
        EIGHT = 8;
        
        if (word.length() == EIGHT) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
