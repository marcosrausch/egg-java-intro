/*
    Define una variable de tipo boolean, double y char.
    Guarda información en ellas a través del Scanner.
 */

package javaintro05;

import java.util.Scanner;

public class JavaIntro05 {

    public static void main(String[] args) {
        boolean b;
        double d;
        char c;
        Scanner scanFor = new Scanner(System.in);
        
        b = scanFor.nextBoolean();
        d = scanFor.nextDouble();
        c = scanFor.next().charAt(0);
        
        System.out.println(c);
    }
    
}

