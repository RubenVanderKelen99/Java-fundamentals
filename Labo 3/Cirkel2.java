/**
* Breid je eerdere Cirkel oefening uit zo dat, voor een ingegeven straal, naast de omtrek nu ook de oppervlakte van de cirkel berekend wordt.
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class Cirkel2{
    public static void main(String[] args){
        double straal, resultaat;
        double pi = 3.14159265359;
        double resultaatomtrek, resultaatoppervlakte;
        double omtrek, oppervlakte;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef de straal van de cilinder in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        straal = scan.nextDouble(); 

        resultaatomtrek = 2 * pi * straal ;
        omtrek = Math.round(resultaatomtrek * 100.0) / 100.0;

        resultaatoppervlakte = straal * straal * pi;
        oppervlakte = Math.round(resultaatoppervlakte * 100.0) / 100.0;

        System.out.println("De omtrek van de cirkel bedraagt: " + omtrek);
        System.out.println("De oppervlakte van de cirkel bedraagt: " + oppervlakte);
    }
}