/**
*Deze klasse berekent mijn zwaartekracht op de maan
* en print die op het scherm
* @author Ruben Van der Kelen
* @version september 2018
*/

public class GewichtOpMaan { 
	public static void main (String [] args){
		final double g=1.622; // valversnelling op de maan
		double m=68; // mijn massa op de maan in Kg
		
		// bereken zwaartekracht en druk resultaat af 
		double fz= (m*g); 
		System.out.println("Mijn gewicht op de maan is "+fz+"N"); 
	}
}
