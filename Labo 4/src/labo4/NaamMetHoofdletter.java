/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;
        
/**Schrijf een programma dat vraagt naar je voornaam, 
 * de eerste letter omzet naar een hoofdletter en vervolgens de voornaam afdrukt. 
 * Betrouw erop dat de gebruiker kleine letters ingeeft.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class NaamMetHoofdletter {
    public static void main(String[] args) {
        //declaring variables
        String naam;
        String hoofdletter;
        
        Scanner myScan = new Scanner(System.in);
        
        //assigning variables
        System.out.println("Geef je naam in kleine letters: ");
        naam = myScan.nextLine();
        
        hoofdletter = (naam.substring(0, 1)).toUpperCase();

        //output
        System.out.println("Hallo " + hoofdletter + (naam.substring(1)));
    }
    
}
