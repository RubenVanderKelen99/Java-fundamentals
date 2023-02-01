/**
* Gebruik de Scanner klasse om een hele zin in te lezen en die vervolgens te echoen naar het scherm.
* @author Ruben Van der Kelen
* @version September 2018
*/

import java.util.Scanner;

public class Echo {
	public static void main(String[] args) {
		
		//Declaraties van de variabelen VOOR permutatie
		Scanner scan = new Scanner(System.in);
		System.out.println("Geef een zin in: ");
		String zin = scan.nextLine(); 

		System.out.println("De ingelezen zin is " + zin +".");
 	
	}
}