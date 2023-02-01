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
 */
public class ProduktViaPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Geef 2 positieve getallen in: ");
        System.out.println("Getal 1: ");
        int getal1 = scan.nextInt();
        System.out.println("Getal 2: ");
        int getal2 = scan.nextInt();
        int uitkomst = 0;
        
        for (int i = 1; i <= getal2; i++){
            uitkomst += getal1;
            System.out.println("Getal bedraagt na " + i + " keer optellen: " + uitkomst);
    }
    }
}
