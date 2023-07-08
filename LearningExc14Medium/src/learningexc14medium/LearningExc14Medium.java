/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros
y la moneda a converir que será una cadena, este no devolverá ningún valor
y mostrará un mensaje indicando el cambio.

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
package learningexc14medium;

import java.util.Scanner;

public class LearningExc14Medium {
    static final double POUND = 0.86;
    static final double DOLLAR = 1.28611;
    static final double YEN = 129.852;
    
    static final char € = '\u20AC';
    static final char $ = '\u0024';
    static final char £ = '\u00A3';
    static final char ￥ = '\uFFE5';
    

    public static void main(String[] args) {
        Scanner scanFor = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double euros = scanFor.nextDouble();
        
        System.out.println("¿A qué moneda desea convertir?"
                + "\n ￥ - Yenes"
                + "\n £ - Libra esterlina"
                + "\n $ - Dólar estadounidense");
        String currency = scanFor.next();
        
        print(euros, currency.charAt(0));
        
    }
    
    static void print(double euro, char currency) {
        double conversion = 0;
        switch (currency) {
            case ￥:
                conversion = convert(euro, YEN);
                break;
            case $:
                conversion = convert(euro, DOLLAR);
                break;
            case £:
                conversion = convert(euro, POUND);
                break;
            default:
                throw new Error(currency + " it's not valid");
        }
        System.out.println(
                "Tus " + € + euro + " equivalen a " + currency + conversion);
    }
   
    static double convert(double amount, double currency) {
        return amount * currency;
    }
}
