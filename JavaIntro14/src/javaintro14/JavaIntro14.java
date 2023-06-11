/*
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
    de equipo y define su tipo de dato de tal manera que te permita alojar
    sus nombres más adelante.
 */
package javaintro14;

import java.util.Scanner;

public class JavaIntro14 {

    public static void main(String[] args) {
        String[] team;
        Scanner scanFor;
        String name;
        
        team = new String[3];
        scanFor = new Scanner(System.in);
        
        for (int i = 0; i < team.length; i++) {
            System.out.println("Ingrese el nombre de su compañero/a de "
                    + "equipo: ");
            name = scanFor.nextLine();
            team[i] = name;
        }
        
        for (String teammate : team) {
            System.out.println(teammate);
        }
    }
    
}
