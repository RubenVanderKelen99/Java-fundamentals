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
public class PriemDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Priem priem = new Priem();
        System.out.println(priem.isPriem(17));
        
        int min = 0;
        int max = 100;
        
        
        System.out.println(priem.aantalPriem(min, max));
        int[] array = new int[priem.aantalPriem(min,max )];
        array = priem.geefPriem(min, max);
        System.out.println("\n\n");
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println("...\n");

    }
}
