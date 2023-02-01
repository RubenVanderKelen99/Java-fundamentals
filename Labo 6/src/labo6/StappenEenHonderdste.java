/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;

/**
 *
 * @author Ruben
 */
public class StappenEenHonderdste {

    public static void main(String[] args) {
        for (double getal = -6.01; getal <= 9.01; getal += 0.01) {
            System.out.println("Het getal is: " + Math.round(getal * 100.00) / 100.00);
        }
    }
}
