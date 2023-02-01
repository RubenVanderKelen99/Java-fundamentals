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
public class MetHoofdLetter {
      public static void main(String[] args) {
 
   Scanner scan= new Scanner(System.in);
   
   System.out.println("Geef een woord in");
        String woord =scan.next();
     
       char letter= woord.charAt(0);
       System.out.println(letter);
       
         if(letter>=65 && letter<=90){
         System.out.println("Hoofdletter");
     }
     else if (letter>=97 && letter<=122){
        System.out.println("Kleine letter");
    }
     else if (letter>=48 && letter<=57)
          System.out.println("Cijfer");
        
             }
}
