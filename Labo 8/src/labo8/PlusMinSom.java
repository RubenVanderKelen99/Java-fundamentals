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
 * @version januari 2019
 */
public class PlusMinSom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een getal in: ");
        int getal = scan.nextInt();
        int s = 0;
        int i = 1;
        do{
            if((i%2) == 0){
            s -= i;
        }
            else if ((i%2) != 0){
                s += i;
            }
            i++;
        }while( i <= getal);
        System.out.println("s van het getal is: " + s);
    }
}
