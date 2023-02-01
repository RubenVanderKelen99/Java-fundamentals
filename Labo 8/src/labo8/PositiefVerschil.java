/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo8;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class PositiefVerschil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoeveel getallen wil je ingeven ?");
        int aantalGetallen = scan.nextInt();
        int i = 0;
        int grootsteGetal = 0;
        int kleinsteGetal = 0;
        
        while( i < aantalGetallen){
            System.out.println("Geef het " + (i+1) + " de getal in:");
            int getal = scan.nextInt();
            if (i == 0){
                grootsteGetal = getal;
                kleinsteGetal = getal;
            }
            else{
                if(getal > grootsteGetal){
                    grootsteGetal = getal;
                }
                else if(getal < kleinsteGetal){
                    kleinsteGetal = getal;
                }
                else{
                    
                }
            }
            i++;
        }
        int verschil = grootsteGetal - kleinsteGetal;
        System.out.println("Het verschil tussen het grootste getal (" + grootsteGetal + ") en het kleinste (" + kleinsteGetal + ") is: " + verschil);
    }
}
