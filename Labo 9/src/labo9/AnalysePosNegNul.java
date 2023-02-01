/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class AnalysePosNegNul {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100.0 - 50.0);
            System.out.println("De " + (i+1) + "de waarde is: " + array[i]);
        }
        int aantalKeerNul = 0;
        int aantalKeerPos = 0;
        int aantalKeerNeg = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                aantalKeerNul++;
            }
            else if (array[i] > 0){
                aantalKeerPos++;
            }
            else if (array[i] < 0){
                aantalKeerNeg++;
            }
            else{
                
            }
        }
        System.out.println("Aantal x nul: " + aantalKeerNul);
        System.out.println("Aantal x positieve getallen: " + aantalKeerPos);
        System.out.println("Aantal x negatieve getallen: " + aantalKeerNeg);
    }
    
}
