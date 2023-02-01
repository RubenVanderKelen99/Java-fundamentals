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
public class LengteNWoorden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoeveel woorden wil je ingeven?");
        int aantalWoorden = scan.nextInt();
        String woorden = "";
        for (int i = 0; i < aantalWoorden; i++){
            System.out.println("Geef een woord in:");
            String woord = scan.next();
            woorden += woord;
        }
        int lengte = woorden.length();
        System.out.println("De totale lengte van alle woorden bedraagt: " + lengte);
    }
}
