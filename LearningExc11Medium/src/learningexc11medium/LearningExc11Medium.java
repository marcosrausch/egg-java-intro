/*
Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje
de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario
selecciona el carácter ‘S’ se sale del programa, caso contrario
se vuelve a mostrar el menú.
 */
package learningexc11medium;

import java.util.Scanner;

public class LearningExc11Medium {

    public static Scanner scanFor = new Scanner(System.in);
    public static boolean exit;

    public static int n, m, option, result;
    public static String menu, opt;

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Por favor, ingrese dos números");
        n = assignValue();
        m = assignValue();
        exit = false;

        do {
            showMenu();
            option = assignValue();
            if (option == 5) {
                exit = confirmExit();
                if (exit) break;
            } else {
                result = pickOption(option, n, m);
                System.out.println("El resultado es: " + result + "\n");
            }
        } while (!exit);
        System.out.println("Adiós");
    }

    public static int assignValue() {
        return scanFor.nextInt();
    }

    public static void showMenu() {
        menu
                = "MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n"
                + "Elija opción: ";

        System.out.println(menu);
    }

    public static int pickOption(int o, int n, int m) {
        switch (o) {
            case 1:
                result = sum(n, m);
                break;
            case 2:
                result = subs(n, m);
                break;
            case 3:
                result = mult(n, m);
            case 4:
                result = div(n, m);
                break;
            default:
                throw new Error("Sorry, " + o + " is not a valid option");
        }
        return result;
    }

    public static boolean confirmExit() {
        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
        opt = scanFor.next().toUpperCase();

        switch (opt) {
            case "S":
                exit = true;
                break;
            case "N":
                exit = false;
                break;
            default:
                throw new Error("Sorry, " + opt + " it's not a valid option");
        }
        return exit;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subs(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new Error("can't divide by zero.");
        }
        return a / b;
    }

}
