/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;

/** Schrijf een programma dat op basis van een ingelezen achternaam 
 * en voornaam van een klant een klantcode genereert op volgende manier :
 * 1 De key begint steeds met de prefix ”ODISEE”
 * 2 De key bestaat alleen uit hoofdletters
 * 3 Het volgende karakter bepaal je als volgt: neem de decimale waarde van de derde letter 
 * van de voornaam (in hoofdletters) tel hier 5 bij op en zet terug om naar een letter (let op: zorg ervoor dat je nog steeds een 
 * hoofdletter bekomt, dus als je karakter > ‘Z’ moet je er 26 aftrekken)
 * 4 Voor het volgende karakter neem je de laatste letter van de familienaam (als hoofdletter)
 * 5 Tenslotte eindig je de code door het volgende :  neem de eerste letters 
 * van de voor en achternaam (als hoofdletter). Vermenigvuldig hun numerieke waarden, 
 * dit getal zet je om naar een string en plak je aan de code.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class KlantKey {
    public static void main(String[] args) {
        String naam, naamHoofdLetters, voorNaam, achterNaam,klantKey;
        String c1, c2, c3;
        char c1x, c1y, c1z, c5, c6;
        int i1, i2, i3;
        
        klantKey = "ODISEE";
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef je voor- en achternaam: ");
        naam = scan.nextLine();
        naamHoofdLetters = naam.toUpperCase();
        voorNaam = naamHoofdLetters.substring(0, naam.indexOf(" "));
        achterNaam = naamHoofdLetters.substring(naam.indexOf(" "), naam.length());
        
        c1 = naamHoofdLetters.substring(2, 3);
        c1x = c1.charAt(0);
        c1y = (char) (c1x + 5);
        c1z = (c1y > 'Z' ? (char)(c1y - 26) : c1y);
        c2 = achterNaam.substring(achterNaam.length() - 1, achterNaam.length());
        c5 = voorNaam.charAt(0);
        c6 = achterNaam.charAt(0);
        i1 = (int) c5;
        i2 = (int) c6;
        i3 = i1 * i2;
        c3 = "" + i3;
        klantKey = klantKey + c1z + c2 + c3;
              
        System.out.println(klantKey);
    }
    
}
