/**
* Schrijf een programma dat een gegeven aantal seconden omzet naar de vorm HH:MM:SS. 
* @author Ruben Van der Kelen
* @version September 2018
*/
import java.util.Scanner;

public class HHMMSS {
    public static void main (String [] args){
        double totaalseconden;
        int seconden;
        int minuten;
        int uren;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een aantal seconden in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        totaalseconden = scan.nextDouble();

        uren = (int)(totaalseconden / 3600);
        minuten = (int)((totaalseconden / 60) - (uren * 60));
        seconden = (int)(totaalseconden - (minuten * 60) - (uren * 3600));
        String nulVoorUur = (uren <= 9 ? "0" : "");
        String nulVoorMinuten = (minuten <= 9 ? "0" : "");
        String nulVoorSeconden = (seconden <= 9 ? "0" : "");

         System.out.println("De tijd is: " + nulVoorUur + uren + ":" + nulVoorMinuten + minuten + ":" + nulVoorSeconden +seconden);
}
} 