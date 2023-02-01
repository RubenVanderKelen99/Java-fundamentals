/**
* Schrijf een programma dat het volume van een cilinder berekent
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class CilinderVolume{
    public static void main(String[] args){
        double straal, hoogte, resultaat;
        double pi = 3.14159265359;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef de straal van de cilinder in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        straal = scan.nextDouble(); 
        
        System.out.println("Geef de hoogte van de cilinder in: ");
        hoogte = scan.nextDouble(); 

        resultaat = pi * Math.pow(straal, 2) * hoogte ;

        System.out.println("Het volume van de cilinder bedraagt: " + resultaat);
    }
}