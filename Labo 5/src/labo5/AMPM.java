/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class AMPM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een tijd in om te converteren: ");
        String tijd = scan.next();
        if (tijd.length() < 3){
            int tijdInt = Integer.parseInt(tijd);
            switch (tijdInt){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11: tijd += "AM";
                break;
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23: tijdInt = tijdInt - 12;
                tijd = tijdInt + "PM";
                break;
            }
           System.out.println("De tijd na conversie (Europees > Amerikaans) is: " + tijd); 
        }
        else {
            String anteOfPost = tijd.substring(2, 4).toUpperCase();
            String tijdUitString = tijd.substring(0, 2);
            int tijdInt = Integer.parseInt(tijdUitString);
             switch (anteOfPost){
                 case "AM": tijd = "" + tijdInt;
                 break;
                 case "PM": tijdInt = tijdInt + 12;
                 tijd = "" + tijdInt;
                 break;
            }
             System.out.println("De tijd na conversie (Amerikaans > Europees) is: " + tijd);
        }
    }
}
