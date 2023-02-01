/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo12;

/**
 *
 * @author Ruben
 * @version  januari 2019
 */
public class BubbleSort {
    public int[] sort(int[] array){
        int[] arraySort;
        arraySort =  array;
        boolean swap;
        do{
        swap = false;
        
        for (int i = 0; i < arraySort.length-1; i++) {
            if(arraySort[i]>arraySort[i+1]){
                int getal1 = arraySort[i];
                int getal2 = arraySort[i+1];
                arraySort[i] = getal2;
                arraySort[i+1] = getal1;
                swap = true;
            }
        }
        }while(swap);
        return arraySort;
    }
    
}
