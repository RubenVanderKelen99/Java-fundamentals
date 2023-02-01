/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class ZoekGetal {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int input = 0;
        Scanner scan = new Scanner(System.in);
        boolean verderGaan = true;
        
        do {
            System.out.println("Geef een getal in: ");
            input = scan.nextInt();
            boolean komtVoor = false;
            
            for (int i = 0; i < array.length; i++) {
                if (array[i] == input) {
                    komtVoor = true;
                } else {
                }
            }
            if (komtVoor == true){
                    System.out.println("Het ingegeven getal: " + input + " komt voor in de array");
                    }
                    else{
                    System.out.println("Het ingegeven getal: " + input + " komt NIET voor in de array");
                    }
            System.out.println("Verdergaan? (Y/N)");
            String antwoord = scan.next().toUpperCase();
            
            if (antwoord.equals("Y")) {
                verderGaan = true;
            } else if (antwoord.equals("N")) {
                verderGaan = false;
            } else {
                verderGaan = false;
            }
        } while (verderGaan == true);
    }
}
