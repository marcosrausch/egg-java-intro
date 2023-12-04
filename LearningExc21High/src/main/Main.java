/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10
y la matriz P de 3x3, se solicita escribir un programa en el cual
se compruebe si la matriz P está contenida dentro de la matriz M.

Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas,
existe al menos una que coincida con la matriz P.

En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] matrixM = new int[10][10];
        int[][] matrixP = new int[3][3];

        fillMatrix(matrixM);
        printMatrix(matrixM);
        System.out.println();
        fillMatrix(matrixP);
        printMatrix(matrixP);
        containsMatrix(matrixM, matrixP);
    }

    static void containsMatrix(int[][] bigMatrix, int[][] smallMatrix) {
        boolean match = true;
        for (int i = 0; i <= bigMatrix.length - 3; i++) {
            for (int j = 0; j <= bigMatrix.length - 3; j++) {
                for (int k = 0; k < smallMatrix.length; k++) {
                    for (int l = 0; l < smallMatrix.length; l++) {
                        if (bigMatrix[i + k][j + l] != smallMatrix[k][l]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    System.out.println("La submatriz P está "
                            + "contenida en la matriz M.");
                    System.out.println("Fila de inicio: " + i);
                    System.out.println("Columna de inicio: " + j);
                }
            }
        }
    }

    static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
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
