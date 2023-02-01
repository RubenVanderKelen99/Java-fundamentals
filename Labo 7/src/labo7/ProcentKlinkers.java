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
public class ProcentKlinkers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een willekeurige woord in:");
        String woord = scan.next();
        double aantalLetters = woord.length() - 1;
        int letterPlaats = 0;
        double aantalKlinkers = 0;
        do{
            char letter = woord.charAt(letterPlaats);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y'){
                aantalKlinkers++;
            }
            else{
                
            }
            letterPlaats++; 
        }while(letterPlaats < aantalLetters);
        System.out.println(aantalKlinkers);
        System.out.println(woord.length());
        double percentage = ((aantalKlinkers / woord.length()) *100);
        System.out.println("Het percentage aan klinkers is: " + percentage + " %");
    }
}
