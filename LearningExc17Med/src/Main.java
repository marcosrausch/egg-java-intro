
import java.util.Random;


/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] digits = new int[n];
        int[] values = new int[n];

        fillArrayRandomly(values);
        printArray(values);

        fillDigitsArray(values, digits);
        printArray(digits);

        printDigits(digits);
    }

    static void fillArrayRandomly(int[] array) {
        Random random = new Random();
        int upperbound = 100000;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(upperbound);
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]" + " ");
        }
        System.out.print("\n");
    }

    static void fillDigitsArray(int[] source, int[] target) {
        for (int i = 0; i < source.length; i++) {
            target[i] = howManyDigits(source[i]);
        }
    }

    static int howManyDigits(int n) {
        int digits = 1;
        while (n >= 10) {
            n = n / 10;
            digits++;
        }
        return digits;
    }

    static void printDigits(int[] array) {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;

        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
            }
        }
        System.out.println("Números de 1 dígito: " + one);
        System.out.println("Números de 2 dígitos: " + two);
        System.out.println("Números de 3 dígitos: " + three);
        System.out.println("Números de 4 dígitos: " + four);
        System.out.println("Números de 5 dígitos: " + five);
    }
}
