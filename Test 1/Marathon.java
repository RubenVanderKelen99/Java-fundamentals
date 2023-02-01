/** Klasse die voor lopers het aantal calorieën en
* de nodige liters sportdrank voor de marathon afstand
* kan berekenen.
* @author Ruben Van der Kelen
* @version oktober 2018
*/
import java.util.Scanner;

public class Marathon {
	public static void main (String[] args){
		final int marathonAfstand = 42;
		double kilometers, kiloCalorieen,
		kcalMarathon, vochtInname, vochtInnameMarathon, b;
		char a;

		System.out.println("Hoeveel kilometers werden er getraind ?");
		Scanner scan = new Scanner(System.in);
		kilometers = scan.nextInt(); 

		System.out.println("Hoeveel kilocalorieen werden daarbij verbrand ?");
		kiloCalorieen = scan.nextInt();

		kcalMarathon = Math.round ((kiloCalorieen/kilometers) * marathonAfstand);
		System.out.println("Tijdens de marathonafstand zal je " + kcalMarathon + " kcal \n verbruiken.");

		System.out.println("Heb je langer dan een uur gelopen ? (Antwoord \n met \'j\'' of \'n\') ?");
		a = scan.next().charAt(0);
		String c = "j";
		b = (a == c.charAt(0) ? 0.35 : 0 );

		vochtInname = (b * (kiloCalorieen/462.00)); // *10 /10
		vochtInnameMarathon = (b * (kcalMarathon/462.00)); //*10 /10

		System.out.println("Tijdens deze training had je " + vochtInname + " liter moeten \n drinken.");
		System.out.println("Tijdens een marathon zal je " + vochtInnameMarathon + " liter moeten \n drinken.");


	}
}
