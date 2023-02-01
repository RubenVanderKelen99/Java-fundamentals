/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;
/** Schrijf een programma dat een zin in één keer inleest als een String,
 * en deze zin zonder het eerste woord terug schrijft naar het scherm.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class ButFirst {
    public static void main(String[] args) {
        //declaring variables
        String mijnZin;
        Scanner myScan = new Scanner(System.in);
        
        //assigning variables
        System.out.println("Geef een zin in: ");
        mijnZin = myScan.nextLine();
        
        mijnZin = mijnZin.substring(mijnZin.indexOf(' ')+ 1);
        
        //output
        System.out.println("Zin zonder eerste woord: " + mijnZin);
    }
}
