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
public class PascalToJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een zin in: ");
        String zin = scan.next();
        System.out.println("De ingegeven zin is: " + zin);
        String nieuweZin = "";
        int indexSpatie = 0;
        int volgendeIndexSpatie = 0;

        int lastIndexSpatie = zin.lastIndexOf(" ");
        while (indexSpatie != lastIndexSpatie) {
            if(indexSpatie != 0){
                volgendeIndexSpatie = zin.indexOf(" ", indexSpatie);
            }
            else{
                
            }
            String woord = zin.substring(indexSpatie, volgendeIndexSpatie);
            
            if (woord.toLowerCase().equals("pascal")){
                woord = "Java";
            }
            else {
            }
            nieuweZin += woord;
            indexSpatie = volgendeIndexSpatie;
        }

        String laatsteWoord = zin.substring(lastIndexSpatie);
        nieuweZin += laatsteWoord;
        System.out.println("De nieuwe zin is: " + nieuweZin);
    }
}
