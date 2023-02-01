/**
* Maak, naar analogie van vorige oefening, een programma
dat de conversie van Fahrenheit naar Celsius doet
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class FahrenheitNaarCelsius{
    public static void main(String[] args){
        double fahrenheit, resultaat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een Fahrenheit in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        fahrenheit = scan.nextDouble();

        resultaat = (fahrenheit - 32.0) / (9.0/5.0);

        System.out.println("Het aantal Celsius bedraagt: " + resultaat + "°C");
    }
}