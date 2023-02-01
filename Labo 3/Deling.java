/**
* Schrijf een programma waarin het product van 2 ingelezen gehele
getallen wordt weergegeven op het scherm.
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class Deling{
    public static void main(String[] args){
        double getal1, getal2, getal3, resultaat, resultaat2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een reeël getal in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        getal1 = scan.nextDouble(); 

        System.out.println("Geef een reeël getal in: ");
        getal2 = scan.nextDouble();

        System.out.println("Geef een reeël getal in: ");
        getal3 = scan.nextDouble();
        
        resultaat = getal1 / getal2;
        resultaat2 = resultaat / getal3;

        System.out.println("De deling van deze twee getallen is: " + resultaat);
        System.out.println("Door nogmaals te delen door een derde getal bekom je: " + resultaat2);
    }
}