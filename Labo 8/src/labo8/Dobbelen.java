/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo8;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class Dobbelen {

    public static void main(String[] args) {
        System.out.println("Hoeveel ogen wil je werpen: ");
        Scanner scan = new Scanner(System.in);
        int doelAantal = scan.nextInt();
        int willAantal = (int) (Math.round(Math.random() * 5)) + 1;
        int i = 1;
        System.out.println("Worp " + i + ": " + willAantal);

        while (doelAantal != willAantal) {
            i++;
            willAantal = (int) (Math.round(Math.random() * 6));
            System.out.println("Worp " + i + ": " + willAantal);
        }
        System.out.println("Doel aantal ogen bereikt na " + i + " worpen");
    }
}
