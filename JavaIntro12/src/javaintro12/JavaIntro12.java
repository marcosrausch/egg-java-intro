/*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
    usuario, validando que el primer numero sea múltiplo del segundo y e imprima
    si el primer numero es múltiplo del segundo, sino informe que no lo son.
 */
package javaintro12;

import java.util.Scanner;

public class JavaIntro12 {

    public static void main(String[] args) {
        Integer n1, n2;
        Scanner scanFor;
        
        System.out.println("Por favor, ingrese dos números:");
        scanFor = new Scanner(System.in);
        n1 = scanFor.nextInt();
        n2 = scanFor.nextInt();
        
        isAMultiple(n1, n2);
    }
    
    public static void isAMultiple(Integer m, Integer n) {
        if (m % n == 0) {
            System.out.println(m + " es múltiplo de " + n);
        } else {
            System.out.println(m + " no es múltiplo de " + n);
        }
    }
}
