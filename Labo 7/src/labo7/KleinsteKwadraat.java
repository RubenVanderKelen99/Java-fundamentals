/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class KleinsteKwadraat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een getal in: ");
        int getal = scan.nextInt();
        int kwadraat;
        int i = 1;
        do {
           kwadraat = (int)Math.pow(i, 2);
           i++;
        }while (kwadraat < getal);
        System.out.println(kwadraat + " is het kleinste kwadraat groter dan het gegeven getal(=" + getal + ")");
    }
}
