/**
* Deze klasse bevat een 4 variabelen van type int
* en berekent het gehele gemiddelde, de gehele rest en
* het reële gemiddelde. 
* @author Ruben Van der Kelen
* @version oktober 2018
*/
public class Gemiddelde {
	public static void main(String[] args) {
		int var1 = 7;
		int var2 = 3;
		int var3 = 6;
		int var4 = 2;
		int geheelGemiddelde = (var1+var2+var3+var4)/4;
		int rest = (var1+var2+var3+var4)%4;
		double gemiddelde = (var1+var2+var3+var4)/4.0;
		System.out.println("De waarden van je variabelen zijn: " + var1 + ", " + var2 + ", " + var3 + " en " + var4);
		System.out.println("Het gehele gemiddelde is: "  + geheelGemiddelde);
		System.out.println("Het gehele gemiddelde is: "  + rest);
		System.out.println("Het gehele gemiddelde is: "  + gemiddelde);
	}  
}