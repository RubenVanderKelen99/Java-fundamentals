/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;
/** Schrijf een programma dat het kleinste van 2 in te lezen getallen bepaalt.
 * Maak gebruik van de methode min van de Math klasse.
 * @author ruben.vanderkelen
 * @version oktober 2018 
 */
public class KleinsteGetal {

    public static void main(String[] args) {
        int getal1,
                getal2,
                resultaat;
        
        Scanner myScan = new Scanner(System.in);
        
        System.out.println("geef een getal in: ");
        getal1 = myScan.nextInt();
        System.out.println("geef een tweede getal in: ");
        getal2 = myScan.nextInt();
        
        resultaat = Math.subtractExact(getal1,getal2);
        System.out.println("het verschil van deze twee getallen is: " + resultaat);
        // TODO code application logic here
    }
    
}
