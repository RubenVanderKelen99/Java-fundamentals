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
public class UpperLowerCase {
        public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         
    System.out.println("Geef een woord");
        String woord=scan.next();
     
   int lengte = woord.length();
   System.out.println("De lengte is: " + lengte);
   String hoofdletters = woord.toUpperCase();
   String kleineletters = woord.toLowerCase();
   if(lengte%2==0){
       System.out.println(hoofdletters);
   }
   else if (lengte%2!=0){
       System.out.println(kleineletters);
   }
}
}
