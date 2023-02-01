/**
* Schrijf een programma dat de conversie van Celsius
naar Fahrenheit doet. 
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class CelsiusNaarFahrenheit{
    public static void main(String[] args){
        double temperatuur, resultaat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een temperatuur in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        temperatuur = scan.nextDouble();

        resultaat = (9.0/5.0) * temperatuur + 32.0;

        System.out.println("Het aantal Fahrenheit bedraagt: " + resultaat + "°F");
    }
}