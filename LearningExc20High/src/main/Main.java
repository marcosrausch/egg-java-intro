/*
Un cuadrado mágico es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y
determine si este cuadrado es mágico o no.

El programa deberá comprobar que los números introducidos son correctos,
es decir, están entre el 1 y el 9.
 */
package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String instructions = "Entre 1 y 9 —inclusive— ingrese"
                + "de izquierda a derecha y de abajo hacia arriba"
                + "los nueve números del cubo:";
        int[][] matrix = new int[3][3];

        System.out.println(instructions);
        fillMatrix(matrix);
        printMatrix(matrix);

        isItAMagicMatrix(matrix);

    }

    static void fillMatrix(int[][] matrix) {
        Scanner scanFor = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int input = scanFor.nextInt();
                if (input > 0 && input < 10) {
                    matrix[i][j] = input;
                } else {
                    System.out.println("El número debe ser entre 1 y 9,"
                            + " inclusive");
                    matrix[i][j] = 9;
                }
            }
        }
    }

    static void isItAMagicMatrix(int[][] matrix) {
        if (sum(matrix, "row") == sum(matrix, "col") && sum(matrix, "col") == sum(matrix, "diag")) {
            System.out.println("Es una matriz mágica");
        } else {
            System.out.println("No es una matriz mágica");
        }
    }

    static int sum(int[][] matrix, String sum) {
        int result = 0;
        switch (sum) {
            case "row":
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        result += matrix[i][j];
                    }
                }
                break;
            case "col":
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < 1; j++) {
                        result += matrix[i][j];
                    }
                }
                break;
            case "diag":
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        if (i == j) {
                            result += matrix[i][j];
                        }
                    }
                }
                break;
            default:
                System.out.println("No e suna opción válida");
        }

        return result;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("[" + matrix[i][j] + "]" + "\t");
            }
            System.out.println();
        }
    }

}
