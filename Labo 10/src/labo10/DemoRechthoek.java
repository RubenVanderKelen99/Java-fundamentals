/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class DemoRechthoek {
    public static void main(String[] args) {
        Rechthoek Rechthoek = new Rechthoek(2, 2, 4, 4);
        
        System.out.println("Is de rechthoek een vierkant? " + Rechthoek.isVierkant());
        System.out.println("De omtrek van de rechthoek is: " + Rechthoek.berekenOmtrek());
        System.out.println("Het oppervlakte van de rechthoek is: " + Rechthoek.berekenOppervlakte());
        System.out.println("Geef een punt in: x waarde & y waarde");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Is deze coordinaat in de rechthoek? " + Rechthoek.isIn(x,y));
        
    }
}
