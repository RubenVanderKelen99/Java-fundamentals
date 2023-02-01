/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4;

import java.util.Scanner;

/**Schrijf een programma dat een zin in één keer inleest als een String, 
 * en deze zin zonder het tweede woord terug schrijft naar het scherm.
 * @author ruben.vanderkelen
 * @version oktober 2018
 */
public class ButSecond {
    public static void main(String[] args) {
         //declaring variables
        String mijnZin;
        String eersteWoord;
        String tweedeWoord;
        Scanner myScan = new Scanner(System.in);
        
        //assigning variables
        System.out.println("Geef een zin in: ");
        mijnZin = myScan.nextLine();
        
        String[] zin = mijnZin.split(" ");
        mijnZin = zin[0] + " " +zin[2];
        /*eersteWoord = mijnZin.substring(0,mijnZin.indexOf(' '));
        tweedeWoord = mijnZin.substring((lastIndexOf(eersteWoord)),mijnZin.indexOf(' '));*/
        
        //output
        System.out.println("Zin zonder tweede woord: " + mijnZin);
    }
    
}
