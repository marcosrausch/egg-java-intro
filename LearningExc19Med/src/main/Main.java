/* Realice un programa que compruebe si una matriz dada es anti simétrica.
Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia
traspuesta, pero cambiada de signo.
Es decir, A es anti simétrica si A = -AT.
La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];
        int[][] negativeMatrixA = new int[n][n];

        fillMatrix(matrixA);
        printMatrix(matrixA);

        rotateMatrix(matrixA, matrixB);
        System.out.println("\nReverse Matrix\n");
        printMatrix(matrixB);

        System.out.println("\nAnti-symetric Matrix\n");
        negativeMatrix(matrixA, negativeMatrixA);
        printMatrix(negativeMatrixA);

    }

    static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(30 + 10) - 10;
            }
        }
    }

    static void rotateMatrix(int[][] matrix, int[][] xirtam) {
        for (int i = 0; i < xirtam.length; i++) {
            for (int j = 0; j < xirtam.length; j++) {
                xirtam[i][j] = matrix[j][i];
            }
        }
    }

    static void negativeMatrix(int[][] matrix, int[][] negativeMatrix) {
        for (int i = 0; i < negativeMatrix.length; i++) {
            for (int j = 0; j < negativeMatrix.length; j++) {
                negativeMatrix[i][j] = -matrix[i][j];
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
