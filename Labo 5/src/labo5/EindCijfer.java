/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class EindCijfer {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        
    System.out.println("Geef cijfer theorie-examen");
        double theorie=scan.nextDouble();
    System.out.println("Geef cijfer practicum");
        double practicum=scan.nextDouble();
    double gemiddelde =(theorie + practicum)/2;
    
    if(practicum < theorie){
        System.out.println("eindcijfer is: " + practicum);
    }
    else{
        System.out.println("eindcijfer is: " + gemiddelde);
    }
 
 }
    
}
