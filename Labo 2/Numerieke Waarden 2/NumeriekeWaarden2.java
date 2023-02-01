/**
* Herschrijf je programma’s NumeriekeWaarden en Gemiddelde van zonet opnieuw, maar nu zorg je ervoor dat de input van elk programma ingelezen wordt van het scherm.
* @author Ruben De Oliveira Silva
* @version September 2018
*/

import java.util.Scanner;

public class NumeriekeWaarden2 {
	public static void main(String[] args) {
		
		//Declaraties van de variabelen
		System.out.println("Voer een karakter in: ");
		Scanner scanner = new Scanner(System.in);
		String karakter = scanner.next();

		//Uitprinten van resultaat
		System.out.println("Het karakter dat u type is " + karakter +".");
 	
	}
}