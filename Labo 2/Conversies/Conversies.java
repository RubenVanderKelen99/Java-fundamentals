/**
* Deze klasse intialiseerd een short variabele 
* en die wordt vervolgens toegekend aan respectievelijk een int variabele, 
* een long variabele, een float variabele en een double variabele.
* Deze waarden worden dan uitgeprint.
* @author Ruben Van der Kelen
* @version oktober 2018
*/
public class Conversies {
	public static void main(String[] args) {
		short myShort = 4;
		int myInt = myShort;
		long myLong = myInt;
		float myFloat = myLong;
		double myDouble = myFloat;

		System.out.println("De waarde van de short variabele is: " + myShort);
		System.out.println("De waarde van de int variabele is: " + myInt);
		System.out.println("De waarde van de long variabele is: " + myLong);
		System.out.println("De waarde van de float variabele is: " + myFloat);
		System.out.println("De waarde van de double variabele is: " + myDouble);
	}
}