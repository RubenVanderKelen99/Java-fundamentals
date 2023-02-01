package bewerkingen;

import java.util.Scanner;

/**
 * Documenteren van programma BewerkingenDemo2 : parameters van de main
 * @author katja.verbeeck
 * @version november 2016
 */

public class BewerkingenDemo2 {
  
  /**
  * Het hoofdprogramma.
  * De input voor het programma wordt als parameter meegegeven:
  *
  * @param args de input voor het programma :
  * <ul>
  * <li>Eerste woord is een operator
  * <li>Tweede woord is een eerste getal
  * <li>Derde woord is een tweede getal
  * </ul>
  * 
  * @see BinaireBewerking#berekenResultaat(char) 
  * @see #druk(java.lang.String) 
  *
  */

    public static void main(String[] args) {
               
        if (args.length != 3) {
            System.out.println("Gebruik het programma als volgt: ");
            System.out.println("java.exe <klasse> <operator> <eerste getal> <tweede getal>");
	    System.out.println("Het programma zal de bewerking uitvoeren op de twee getallen");
            System.out.println("en het resultaat op het scherm drukken");
	return;
        }

        
        char operator = args[0].charAt(0);
        int getal1 = Integer.parseInt(args[1]);
        int getal2 = Integer.parseInt(args[2]);

        BinaireBewerking object = new BinaireBewerking(getal1,getal2);
        int resultaat = object.berekenResultaat(operator);

        druk(getal1 + " " + operator + " " + getal2 + " = " + resultaat);
    }
    
    
     /**
     * Drukt de gegeven info
     *
     * @param info de af te drukken informatie
     * @see java.io.PrintStream#println()
     */
    public static void druk(String info) {
        System.out.println(info);
    }
}
