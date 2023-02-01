/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo8;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class ForToWhile {

    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        int i = 0;
        while(i < 5){
            s = s + i;
            System.out.println("S is " + s);
            int j = i;
            while(j > 0){
                t = t * (i - j + 1);
                j--;
            }
            i++;
            System.out.println("T is " + t);
        }
        s = s * t;
        System.out.println("S is " + s);
 
    }
}

