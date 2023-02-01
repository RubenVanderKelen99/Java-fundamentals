/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class GeheimeCode {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arrayGebruiker = new int[5];
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.round(Math.random() * 9));
        }
        System.out.println("De array is " + Arrays.toString(array));
        
        System.out.println("Geef 5 getallen in: ");
        
        for (int i = 0; i < array.length; i++){
            System.out.println("Geef het " + (i+1) + " de getal in: ");
            arrayGebruiker[i] = scan.nextInt();
        }
        
        int aantalCorrect = 0;
        int correcteGetallen = 0;
        int aantalPogingen = 5;
        for (int i = aantalPogingen; i > 0; i--){ 
        for (int j = 0; j < array.length; j++){
           if ( array[i] == arrayGebruiker[i]){
               aantalCorrect++;
               correcteGetallen += array[i];
               }
           else {
               
           }
           if (aantalCorrect == array.length){
               System.out.println("Proficiat u heeft de code ontcijferd! De code was: " + Arrays.toString(array));
               
           }
           else{
               
           }
         }
    }
    }
}

