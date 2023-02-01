/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo9;

import java.util.Arrays;

/**
 *
 * @author Ruben
 */
public class VulEnDraaiOm {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayOmgekeerd = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.round(Math.random() * 10));
            System.out.println("Het " + (i+1) + "de getal is: " + array[i]);
        }
        int j = array.length - 1;
        for (int i = 0; i < array.length; i++){
            arrayOmgekeerd[i] = array[j];
            j--;
        }
        System.out.println("De array voor het spiegelen is " + Arrays.toString(array));
        System.out.println("De array na het spiegelen is " + Arrays.toString(arrayOmgekeerd));
    }
}
