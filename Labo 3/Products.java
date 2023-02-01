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
        getal1 = scan.nextInt();

        System.out.println("Geef een reeël geheel getal in: ");
        getal2 = scan.nextInt();

        System.out.println("Geef een reeël geheel getal in: ");
        getal3 = scan.nextInt();
        
        resultaat = getal1 / getal2;
        resultaat2 = resultaat / getal3;

        System.out.println("De deling van deze twee getallen is: " + resultaat);
        System.out.println("Door nogmaals te delen door een derde getal bekom je: " + resultaat2);
    }
}