/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class KortsteTekst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String kortsteString = "";
        String stop = "stop";
        int i = 0;
        
        do{
        System.out.println("Geef een zin in (of stop om te stoppen): ");
        s1  = scan.next();
        if (s1.toLowerCase().equals(stop)){
        }
        else if(i == 0){
            kortsteString = s1;
        }
        else{
            if(s1.length() < kortsteString.length()){
                kortsteString = s1;
            }
            else{
                
            }
        }
        i++;
        }while(!s1.equals(stop));
        System.out.println(kortsteString + " is de kortste string");
    }
}
