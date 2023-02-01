/**
* Herschrijf je programma’s NumeriekeWaarden en Gemiddelde van zonet opnieuw, maar nu zorg je ervoor dat de input van elk programma ingelezen wordt van het scherm.
* @author Ruben De Oliveira Silva
* @version September 2018
*/

import java.util.Scanner;

public class Gemiddelde2 {
	public static void main(String[] args) {
		
		//Declaraties van de variabelen
		System.out.println("Voer het eerste getal in: ");
		Scanner scanner = new Scanner(System.in);
		int getal1 = scanner.nextInt();
		System.out.println("Voer het tweede getal in: ");
		int getal2 = scanner.nextInt();
		System.out.println("Voer het derde getal in: ");
		int getal3 = scanner.nextInt();
		System.out.println("Voer het vierde getal in: ");
		int getal4 = scanner.nextInt();

		//Uitprinten van resultaat
		System.out.println("De gehele getallen zijn: " + getal1 +", " + getal2 +", "+ getal3 +", " + getal4);
 	
	}
}