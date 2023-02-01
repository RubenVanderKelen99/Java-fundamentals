/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;

/** Schrijf een programma dat een zin inleest van minimum 2 woorden en er vraagzin van maakt. 
 * Dit doe je door de eerste 2 woorden van plaats 
 * te wisselen en achteraan een vraagteken toe te voegen.
 * Denk ook aan het gebruik van de hoofdletter! Print de vraagzin uit naar het scherm.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class VraagZin {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Geef een zin van minimum 2 woorden.");
        String zin = scan.nextLine();
        String woord1 = zin.substring(0, zin.indexOf(" ")); //zin.indexOf(" ") gaat tot aan de eerst volgende spatie
        String restzin = zin.substring(zin.indexOf(" ") + 1);
        String woord2 = restzin.substring(0, restzin.indexOf(" "));
        woord2 = woord2.substring(0,1).toUpperCase() + woord2.substring(1);
        String restrestzin = restzin.substring(restzin.indexOf(" ") + 1);
        
        System.out.println(woord2 + " "+ woord1 + " " + restrestzin + " ?");
        
    }
    
}
