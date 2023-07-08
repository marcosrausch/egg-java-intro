/*
Realizar un algoritmo que rellene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package learningexc15low;

public class LearningExc15Low {

    public static void main(String[] args) {
        int[] integers = new int[100];
        
        for (int i = 0; i < integers.length; i++) {            
            integers[i] = Integer.sum(i, 1);
        }
        
        for (int i = integers.length; i > 0; i--) {
            System.out.print(i + "\t");
        }
    }
    
}
