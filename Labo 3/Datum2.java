/**
*@author Ruben Van der Kelen
*@version januari 2019
*/

import java.util.Scanner;

public class Datum2{
	public static void main (String[] args){
		int dag, maand, jaar;
		String dd, mm, jjjj;
		String nulToevoegen;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Geef de dag van vandaag in: ");
		dag = scan.nextInt();
		System.out.println("Geef de huidige maand in: ");
		maand = scan.nextInt();
		System.out.println("Geef het huidige jaar in: ");
		jaar = scan.nextInt();

		nulToevoegen = (dag <= 9 ? "0" : "");
		dd = "" + nulToevoegen + dag;
		nulToevoegen = (maand <= 9 ? "0" : "");
		mm = "" + nulToevoegen + maand;
		nulToevoegen = (jaar <= 999 ? "0" : "");
		jjjj = "" + nulToevoegen + jaar;
		
		System.out.println("De opgegeven datum is :" + dd + "-" + mm + "-" + jjjj);
	}
}