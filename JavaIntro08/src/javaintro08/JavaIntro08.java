/*
    Escriba un programa que valide si una nota está entre 0 y 10,
    si no está entre 0 y 10 la nota se pedirá de nuevo
    hasta que la nota sea correcta.
 */
package javaintro08;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro08 {

    public static void main(String[] args) {
        byte grade;
        Scanner scanFor;

        System.out.println("Por favor, ingrese una nota entre 0 y 10...");

        scanFor = new Scanner(System.in);
        grade = scanFor.nextByte();

        while (grade < 0 || grade > 10) {
            System.out.println("Por favor, ingrese una nota entre 0 y 10...");
            grade = scanFor.nextByte();
        }

        System.out.println("Gracias. La nota es: " + grade);
    }

}
