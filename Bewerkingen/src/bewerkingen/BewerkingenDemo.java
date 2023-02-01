
package bewerkingen;

import java.util.Scanner;

/**
 * Documenteren van programma BewerkingenDemo
 *
 * @author Katja Verbeeck
 * @version november 2016
 */
public class BewerkingenDemo {

    /**
     * Documenteren van de hoofdmethode
     *
     * @param args
     * @see #vraagBewerking(java.lang.String) 
     * @see BinaireBewerking#berekenResultaat(char) 
     * @see #druk(java.lang.String) 
     */
   
    public static void main(String[] args) {
        BinaireBewerking b = new BinaireBewerking(7, -8);
        char operator;
        operator = vraagBewerking("Welke bewerking wil je uitvoeren? ");
        while(operator == '+' || 
              operator == '-' || 
              operator == '*' || 
              operator == '/' || 
              operator == '%'){  
            int resultaat = b.berekenResultaat(operator);
            druk(b.term1 + " " + operator + " " + b.term2 + " = " + resultaat);
            operator = vraagBewerking("Welke bewerking wil je uitvoeren? ");
        };
        druk("Einde");
    }
    
    
     /**
     * Vraagt een bewerking
     *
     * @param vraag de vraag
     * @return de ingelezen bewerking
     * @see Scanner#next() 
     * @see String#charAt(int) 
     */
    public static char vraagBewerking(String vraag) {
        Scanner scan = new Scanner(System.in);
        System.out.print(vraag);
        char kar = scan.next().charAt(0);
        return kar;
    }
    
     /**
     * Drukt de gegeven info
     *
     * @param info de af te drukken informatie
     * @see java.io.PrintStream#println(java.lang.String) 
     */
    public static void druk(String info) {
        System.out.println(info);
    }
    
    
    
}
