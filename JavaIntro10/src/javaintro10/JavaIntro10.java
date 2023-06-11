/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
    e imprima el número ingresado seguido de tantos asteriscos como
    indique su valor. Por ejemplo:
    5 *****
    3 ***
    11 ***********
    2 **
 */
package javaintro10;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro10 {

    public static void main(String[] args) {
        byte n, acc;
        Scanner scanFor;
        char star;
        final byte FOUR;

        FOUR = 4;
        acc = 0;
        scanFor = new Scanner(System.in);
        star = '*';

        do {
            System.out.println("Por favor, ingrese un número entre 1 y 20:");
            n = scanFor.nextByte();

            if (n < 1 || n > 20) {
                System.out.println("Número fuera de rango");
                continue;
            }

            System.out.print(n + " ");
            
            for (byte i = 0; i < n; i++) {
                System.out.print(star);
            }
            
            System.out.print("\n");

            acc++;
        } while (acc <= FOUR);

    }

}
