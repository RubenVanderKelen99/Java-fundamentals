/**
* Schrijf een programma dat de omtrek van een cirkel berekent
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class Cirkel{
    public static void main(String[] args){
        double straal, resultaat;
        double pi = 3.14159265359;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef de straal van de cilinder in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        straal = scan.nextDouble(); 

        resultaat = 2 * pi * straal ;

        System.out.println("De omtrek van de cirkel bedraagt: " + resultaat);
    }
}