/*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente
    en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package learningexc04low;

import java.util.Scanner;

public class LearningExc04Low {

    public static void main(String[] args) {
        float t;
        Scanner scanFor;
        
        System.out.println("Ingrese la temperatura en Celsius: ");
        scanFor = new Scanner(System.in);
        t = scanFor.nextInt();
        t = toFahrenheit(t);
        
        System.out.println("La temperatura en Fahrenheit es de: " + t);
    }

    public static float toFahrenheit(float t) {
        return 32 + (9 * t / 5);
    }
}
