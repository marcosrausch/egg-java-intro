/*
    Considera que estás desarrollando una web para una empresa que fabrica
    motores (suponemos que se trata del tipo de motor de una bomba para mover
    fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese
    un valor entre 1 y 4. El programa debe mostrar lo siguiente:

    > Si el tipo de motor es 1, mostrar un mensaje indicando
        “La bomba es una bomba de agua”.

    > Si el tipo de motor es 2, mostrar un mensaje indicando
        “La bomba es una bomba de gasolina”.

    > Si el tipo de motor es 1, mostrar un mensaje indicando
        “La bomba es una bomba de hormigón”.

    > Si el tipo de motor es 1, mostrar un mensaje indicando
        “La bomba es una bomba de pasta alimenticia”.
 */
package javaintro07;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class JavaIntro07 {

    public static void main(String[] args) {
        int option;
        String motor;
        Scanner scanFor;
        
        System.out.println("Por favor, ingrese un número del 1 al 4"
                + " (inclusive) para seleccionar un tipo de motor");

        scanFor = new Scanner(System.in);
        option = scanFor.nextInt();
        
        switch (option) {
            case 1:
                motor = "agua";
                break;
            case 2:
                motor = "gasolina";
                break;
            case 3:
                motor = "hormigón";
                break;
            case 4:
                motor = "pasta alimenticia";
                break;
            default:
                throw new Error("Esa no es una opción válida");
        }
        
        System.out.println("La bomba es una bomba de " + motor);
    }

}
