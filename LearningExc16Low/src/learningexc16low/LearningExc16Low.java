/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios
y le pida al usuario un numero a buscar en el vector. El programa mostrará
dónde se encuentra el número y si se encuentra repetido.
 */
package learningexc16low;

import java.util.Scanner;

public class LearningExc16Low {

    public static void main(String[] args) {
        int n = 10;
        int find;
        int[] values = new int[n];
        Scanner scanFor = new Scanner(System.in);

        System.out.println("Ingrese un número a buscar");
        find = scanFor.nextInt();

        fillArray(values);
        printArray(values);
        findInValues(find, values);
        isValueRepeated(find, values);
    }

    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]" + " ");
        }
        System.out.print("\n");
    }

    static void findInValues(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("El número se encuentra en la posición " + i + ".");
                break;
            }
        }
    }

    static void isValueRepeated(int n, int[] array) {
        int times = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                times++;
            }
        }
        
        if (times > 1) {
            System.out.println("El número se encuentra repetido " + times + " veces.");
        } else {
            System.out.println("El número no se encuentra repetido.");
        }
    }
}
