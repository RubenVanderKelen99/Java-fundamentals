/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class DemoGeheimeCode2 {

    public static void main(String[] args) {
        GeheimeCode2 geheimeCode = new GeheimeCode2(1, 2, 3, 4, 5);
        int[] gok = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef 5 getallen in: ");
        int pogingen = 5;

        do {

            for (int i = 0; i < gok.length; i++) {
                System.out.println("Geef het " + (i + 1) + " de getal in:");
                gok[i] = scan.nextInt();
            }
            pogingen--;
            System.out.println("Er staan " + geheimeCode.juistePlaats(gok) + " getallen op de juiste plaats.");
            System.out.println("De som van de juiste getallen is: " + geheimeCode.somJuisteGetallen(gok));
            System.out.println("U heeft nog " + pogingen + " pogingen over.");
        } while (pogingen != 0 && geheimeCode.juistePlaats(gok) != 5);
        System.out.println("Proficiat u heeft de code geraden, de code was: " + Arrays.toString(gok));
    }
}
