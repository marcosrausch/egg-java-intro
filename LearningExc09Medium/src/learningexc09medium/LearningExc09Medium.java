/*
    Escriba un programa que pida una frase o palabra y valide si la primera
    letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
    se deberá de imprimir un mensaje por pantalla que
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package learningexc09medium;

import java.util.Scanner;

public class LearningExc09Medium {

    public static void main(String[] args) {
        Scanner scanFor;
        String w;

        System.out.println("Ingrese una palabra o frase");
        scanFor = new Scanner(System.in);
        w = scanFor.nextLine();
        
        startsWithAnA(w);
    }

    public static void startsWithAnA(String word) {
        final char A = '\u0041';
        char match = getFirstChar(word);
        
        if (match == A) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static char getFirstChar(String word) {
        char character = word.charAt(0);
        return Character.toUpperCase(character);
    }
}
