/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

/** Schrijf een programma dat iedere keer een ander willekeurig 
 * geheel getal genereert in het interval[50 150].
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class WillekeurigeGetal {
    public static void main(String[] args) {
        int randomNummer;

        randomNummer = (int) ( Math . round (( Math . random () * 101) + 50 )) ;

        System.out.println(" uitvoer :" + randomNummer);

    }
}
