/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class KwadraatEnGemiddelde {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alleGetallen = 0;
        for (int i = 1; i < 8; i++){
            System.out.println("Geef het " + i + " de getal in");
            int getal = scan.nextInt();
            int kwadraat = (int) Math.pow(getal, 2);
            System.out.println("Het Kwadraat van het " + i + " de getal is: " + kwadraat);
            alleGetallen = alleGetallen + getal;
            int gemiddelde = alleGetallen / i;
            System.out.println("Het gemiddelde bedraagt nu: " + gemiddelde);
        }
    }
    
}
