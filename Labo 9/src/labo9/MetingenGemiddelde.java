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
 */
public class MetingenGemiddelde {
    public static void main(String[] args) {
        double[] array = new double[72];
        for (int i = 0; i < array.length; i++){
            array[i] = (Math.random()* 10.00);
            System.out.println("De meting op het " + (i+1) + " de uur is: " + array[i]);
        }
        double totaal = 0;
        for (int i = 0; i < array.length; i++){
            totaal += array[i];
        }
        double gemiddelde = totaal / (array.length);
        
        for (int i = 0; i < array.length; i++){
            if ( (array[i]) > (gemiddelde + (gemiddelde * 0.10)) || (array[i]) < (gemiddelde - (gemiddelde * 0.10))){
                System.out.println("Op het " + (i+1) + " de uur verschilt de meting meer dan 10% van het gemiddelde (=" + gemiddelde + ")");
            }
            else {
                
            }
        }
    }
    
}
