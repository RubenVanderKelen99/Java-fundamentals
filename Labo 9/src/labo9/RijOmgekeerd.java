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
public class RijOmgekeerd {
    public static void main(String[] args) {
        int[] getallenArray = new int[10];
        int[] getallenArrayOmgekeerd = new int[getallenArray.length];
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef 10 getallen in: ");
        
        for (int i = 0; i < getallenArray.length; i++){
            System.out.println("Geef het " + (i+1) + " de getal in: ");
            getallenArray[i] = scan.nextInt();
        }
        int i = 0;
        for (int j = getallenArray.length - 1; j >= 0; j--){
            getallenArrayOmgekeerd[i] = getallenArray[j];
            i++;
        }
        System.out.println("De getallen array is: " + Arrays.toString(getallenArray));
        System.out.println("De omgekeerde getallen array is: " + Arrays.toString(getallenArrayOmgekeerd));
}
}
    
