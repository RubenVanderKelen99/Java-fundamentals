/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class Max25VerschilMetGetal {
    public static void main(String[] args) {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.round(Math.random() * 100));
            System.out.println("Het " + (i+1) + "de getal van de array is: " + array[i]);
        }
        System.out.println("Geef een getal in: ");
        Scanner scan = new Scanner(System.in);
        int getal = scan.nextInt();
        int Max25Verschil = 0;
        
        for (int i = 0; i < array.length; i++){
            if(array[i] > (getal + 25) || array[i] < (getal -25)){
                Max25Verschil++;
            }
            else{
                
            }
        }
        System.out.println("Er zijn " + Max25Verschil + " getallen die 25 of meer verschillen met het ingegeven getal = (" + getal +")");
    }
    
}
