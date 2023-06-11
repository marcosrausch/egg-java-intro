/*
   Escriba un programa que lea 20 números. Si el número leído es igual a cero,
    se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".

    El programa deberá calcular y mostrar el resultado de la suma de los 
    números leídos, pero si el número es negativo no debe sumarse.

    Nota: recordar el uso de la sentencia break.
 */
package javaintro09;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro09 {

    public static void main(String[] args) {
        int n, sum;
        byte acc;
        Scanner scanFor;
        final byte ZERO, TWENTY;

        scanFor = new Scanner(System.in);
        ZERO = 0;
        TWENTY = 20;
        acc = 0;
        sum = 0;

        do {
            System.out.println("Por favor, ingrese un número");
            n = scanFor.nextInt();
            acc += 1;

            if (n == ZERO) {
                System.out.println("Se capturó el número cero");
                break;
            }

            if (n < ZERO) {
                continue;
            }

            sum = sum + n;

        } while (acc <= TWENTY);

        System.out.println("La suma de los números ingresados es: " + sum);

    }

}
