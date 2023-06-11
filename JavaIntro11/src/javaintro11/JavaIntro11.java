/*
    Escribir un programa que procese una secuencia de caracteres ingresada
    por teclado y terminada en punto, y luego codifique la palabra o frase
    ingresada de la siguiente manera: cada vocal se reemplaza por el carácter
    que se indica en la tabla y el resto de los caracteres (incluyendo a las
    vocales acentuadas) se mantienen sin cambios.

    a > @
    e > #
    i > $
    o > %
    u > *

    Por ejemplo, si el usuario ingresa: "Ayer, lunes, salimos a las once y 10".
    La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package javaintro11;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro11 {

    public static void main(String[] args) {
        String phrase;
        Scanner scanFor;
        
        System.out.println("Por favor, ingrese una frase:");
        scanFor = new Scanner(System.in);
        phrase = scanFor.nextLine();
        phrase = convert(phrase);
        
        System.out.println(phrase);
    }
    
    public static String convert(String str) {
        str = str.replaceAll("(?i)a", "@").
                  replace('e', '#').
                  replace('i', '$').
                  replace('o', '%').
                  replace('u', '*');
        return str;
    }
}
