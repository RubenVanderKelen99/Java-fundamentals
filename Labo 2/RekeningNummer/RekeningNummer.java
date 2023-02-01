/**
*@author Ruben Van der Kelen
*@version januari 2019
*/

import java.util.Scanner;

public class RekeningNummer{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Geef je rekeningnummer met IBAN code: ");
		String input = scan.nextLine();
		scan = new Scanner(input);
		scan.next();
		System.out.println("De IBAN code is: " + scan.next());
		System.out.println("Het rekeningnummer: " + scan.next() + " " + scan.next() + " " + scan.next());
	}
}