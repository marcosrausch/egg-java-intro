/*
    Crear un programa que pida una frase y si esa frase es igual a “eureka”
    el programa pondrá un mensaje de Correcto, si no mostrará un mensaje
    de Incorrecto.
 */
package learningexc07medium;

import java.util.Scanner;

public class LearningExc07Medium {

    public static void main(String[] args) {
        String w;
        Scanner scanFor;

        scanFor = new Scanner(System.in);
        System.out.println("Por favor, ingrese una frase");
        w = scanFor.nextLine();

        showMsg(w);
    }

    public static void showMsg(String word) {
        final String PHRASE = "eureka";
        final String CORRECT = "correcto";
        final String INCORRECT = "incorrecto";

        if (word.equals(PHRASE)) {
            System.out.println(CORRECT);
        } else {
            System.out.println(INCORRECT);
        }
    }
}
