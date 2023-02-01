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
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een getal tussen 1 en 20");
        int getal = scan.nextInt();
        int F1 = 1;
        int F2 = 1;
        if (getal > 1 && getal < 20){
            if (getal == 1 || getal == 2){
                int fibonacci = 1;
            }
            else if (getal == 3){
               int fibonnaci = 1 + 1;
            }
        }
        else{
            System.out.println("Fout: het getal moet tussen de 1 en 20 liggen.");
        }
    }
}
