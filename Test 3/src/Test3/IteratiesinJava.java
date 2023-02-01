/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test3;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author ruben.vanderkelen
 * @version december 2018
 */
public class IteratiesinJava {
    public static void main(String[] args) {
        System.out.println("Hoeveel studenten zitten er in de klas?");
        Scanner scan = new Scanner(System.in);
        int aantalStudenten = scan.nextInt();
        
        int i;
        String puntenlijst = "";
        String voornaamen = "";
        String achternaamen = "";
        String scoresString = "";
        int score = 0;
        int hoogsteScore = 0;
        
        System.out.println("Geef de puntenlijst: ");
        for (i = 0; i< aantalStudenten; i++){
        
        String puntenlijstVolgende = scan.next();
        puntenlijst = puntenlijst + puntenlijstVolgende + "\n";
        voornaamen = voornaamen + puntenlijstVolgende.substring(0, puntenlijstVolgende.indexOf(";")) + "\n";
        achternaamen = achternaamen + puntenlijstVolgende.substring(0, puntenlijstVolgende.lastIndexOf(";")) + "\n";
        int lengte = puntenlijstVolgende.length();
        scoresString = scoresString + puntenlijstVolgende.substring(puntenlijstVolgende.lastIndexOf(";") + 1, lengte) + "\n";
        score = Integer.parseInt(scoresString);
        
        if (score < 0 || score > 20){
            System.out.println("De Puntenlijst is onvolledig \n Ongeldige score in lijst gevonden");  
        }
        else if (score > hoogsteScore) {
            hoogsteScore = score;
        }
        else {
            hoogsteScore = hoogsteScore;
        }
        }
        
        System.out.println(voornaamen);
    }

}
