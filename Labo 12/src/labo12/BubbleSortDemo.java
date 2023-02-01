/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo12;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class BubbleSortDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BubbleSort sort = new BubbleSort();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *11);
        }
        
        array = sort.sort(array);
        for(int getal : array){
            System.out.println(getal);
        }
    }
    
}
