/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package main;

public class Main {

    public static void main(String[] args) {
        int n = 3;
        int[][] matrixA = new int[n][n];
        int[][] matrixB = new int[n][n];

        fillMatrix(matrixA);
        printMatrix(matrixA);
        
        rotateMatrix(matrixA, matrixB);
        System.out.println("\nReverse Matrix\n");
        printMatrix(matrixB);
    }

    static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
            }
        }
    }
    
    static void rotateMatrix(int [][] matrix, int [][] xirtam) {
        for (int i = 0; i < xirtam.length; i++) {
            for (int j = 0; j < xirtam.length; j++) {
                xirtam[i][j] = matrix[j][i];
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
