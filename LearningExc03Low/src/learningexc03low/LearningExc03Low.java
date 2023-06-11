/*
    Escribir un programa que pida una frase y la muestre toda en
    mayúsculas y después toda en minúsculas.
 */
package learningexc03low;

import java.util.Scanner;

public class LearningExc03Low {

    public static void main(String[] args) {
        String text;
        Scanner scanFor;

        System.out.println("Ingrese una frase: ");
        scanFor = new Scanner(System.in);
        text = scanFor.nextLine();

        upperCase(text);
        lowerCase(text);
    }

    public static void upperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    public static void lowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

}
