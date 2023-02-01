/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author ruben.vanderkelen
 * @version januari 2019
 */
import java.util.Scanner;
public class DemoLoopWedstrijd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Wat is de naam van de wedstrijd");                  // Opvragen van de naam van de wedstrijd
        String naam = s.next();                                                 //
        System.out.println("Deelnemers: ");                                     //De namen van de atleten opvragen
        String[] namen = new String[5];                                         // 
        
        for(int i = 0;i<namen.length;i++){                                      //De namen van de atleten opvragen en in een array stekeken
            String deelNemers = s.next();
            namen[i] = deelNemers;
        }
        
        double[] tijden = new double[5];                                        //De tijden van de atleten opvragen en in een array steken
        System.out.println("Tijden: ");
        for(int i = 0;i<tijden.length;i++){
            double t = s.nextDouble();                                          // !!als het niet gaat met e 1.2 probeer met 1,2
            tijden[i] = t;
        }
        
        LoopWedstrijd wedstrijd = new LoopWedstrijd(naam,namen,tijden);         //Object loopWedstrijd aanmaken
        
        System.out.println("En goud gaat naar .... "+wedstrijd.geefWinnaar());  //Kijken wie er goud heeft gewonen
        
        System.out.println("\nWelke atleet wil je toevoegen?");                 //Atneet die moet worden toegevoegd vragen
        String toevoegenAtleet = s.next();
        
        System.out.println("Welke tijd heeft hij/zij gelopen?");                //Tijde van de atleet vragen
        double toevoegenTijd = s.nextDouble();
        
        wedstrijd.voegExtraPrestatieToe(toevoegenAtleet, toevoegenTijd);        //Toevoegen van de prestatie 
        System.out.println("En goud gaat naar .... "+wedstrijd.geefWinnaar());  //Kijken wie er heeft gewonnen met de nieuwe waarden
        
    }
    
}
