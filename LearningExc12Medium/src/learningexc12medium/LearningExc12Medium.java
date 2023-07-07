/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232,
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
de largo, el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera
incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas.
 */
package learningexc12medium;

import java.util.Scanner;

public class LearningExc12Medium {

    public static Scanner scanFor = new Scanner(System.in);
    public static final String FDE = "&&&&&";
    public static final char X = '\u0058';
    public static final char O = '\u004F';
    public static final int LENGTH = 5;

    public static String RS232;
    public static Character fc;
    public static Character lc;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Integer correct = 0;
        Integer incorrect = 0;

        do {
            System.out.println("Ingrese texto");
            RS232 = scanFor.nextLine();

            if (isValid(RS232)) {
                correct = Integer.sum(correct, 1);
            } else if (!RS232.equals(FDE)) {
                incorrect = Integer.sum(incorrect, 1);
            }
        } while (!RS232.equals(FDE));

        print(correct, incorrect);
        System.out.println("Adiós");
    }

    public static void print(Integer c, Integer i) {
        System.out.println(
                "lecturas correctas: " + c + "\n"
                + "lecturas incorrectas: " + i
        );
    }

    public static boolean isValid(String s) {
        fc = s.charAt(0);
        lc = s.charAt(s.length() - 1);

        return s.length() == LENGTH && fc == X && lc == O;
    }

}
