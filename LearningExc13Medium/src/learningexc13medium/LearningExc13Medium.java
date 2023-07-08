/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 */
package learningexc13medium;

import java.util.Scanner;

public class LearningExc13Medium {

    public static void main(String[] args) {
        Scanner scanFor = new Scanner(System.in);
        System.out.println("Cantidad de elementos");
        int rows = scanFor.nextInt();

        square(rows);
    }

    static void square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
