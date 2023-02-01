/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;
/**Schrijf een programma dat de BMI van een persoon kan berekenen door 
 * vooraf zijn lengte (in m) en gewicht (in kg) te vragen.  De formule voor de BMI berekening is als volgt : 
 * BMI = gewicht/lengte². 
 * Gebruik de Math klasse.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class BMI {
    public static void main(String[] args) {
        //declaring variables
        double lengte,
               gewicht,
               bmi;
        
        Scanner myScan = new Scanner(System.in);
        
        //operations
        System.out.println("Geef je lengte in meter: ");
        lengte = myScan.nextDouble();
        System.out.println("Geef je gewicht in kg: ");
        gewicht = myScan.nextDouble();

        bmi = gewicht / Math.pow(lengte, 2);

        System.out.printf("Jouw bmi is: %n%.2f", bmi);
    }
    
}
