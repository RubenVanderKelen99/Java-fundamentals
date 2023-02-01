/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class WoordSpelDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WoordSpel woordSpel = new WoordSpel();
        System.out.println("Het te zoeken woord is " + woordSpel.huidigWoord);
        
        do{
        System.out.println("Doe een gok, geef oftewel 1 karakter in oftewel het volledige woord");
        
        String input = scan.next();
        
        char c = '\0';
        String str = "";
        
        if(input.length() < 2){
        c = input.charAt(0);
        System.out.println("Beurt " + woordSpel.beurten + ": " + woordSpel.gok(c));
            System.out.println("U heeft nog " + (woordSpel.MAXBEURTEN - woordSpel.beurten) + " beurten over.");
        }
        else {
         str = input;
         System.out.println("Beurt " + woordSpel.beurten + ": " + woordSpel.gok(str));
            System.out.println("U heeft nog " + (woordSpel.MAXBEURTEN - woordSpel.beurten) + " beurten over.");
        }
        
        }while(woordSpel.beurten < woordSpel.MAXBEURTEN && woordSpel.isGeraden() == false);
        
        if(woordSpel.isGeraden() == true){
            System.out.println("Proficiat! U heeft het woord: " + woordSpel.huidigWoord + " in " + woordSpel.beurten);
        }
        else{
            System.out.println("Spijtig u heeft het woord niet gevonden, het te raden woord was: " + woordSpel.huidigWoord);
        }
    }
}
