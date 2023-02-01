/**
*Bepaal hoeveel in totaal betaald moet worden. Bepaal hoeveel de groepsverantwoordelijke aan elk groepslid moet aanrekenen.
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class Tentoonstelling{
    public static void main(String[] args){
        int aantal;
        double toegangsPrijs = 10.0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Met hoeveel personen zijn jullie?: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        aantal = scan.nextInt();

        double totaal = aantal * toegangsPrijs;
        int aantalKaartjes = aantal / 10;
        double resultaat = totaal - (aantalKaartjes*10);
        double resultaatPerPersoon = resultaat / aantal;
        double afgerondresultaat = Math.round(resultaatPerPersoon*100.0)/100.0;

        System.out.println("Het aantal gratis tickets bedraagt: " + aantalKaartjes);
        System.out.println("In totaal moet er " + resultaat + " euro betaalt worden");
        System.out.println("De groepsverantwoordelijke moet " + afgerondresultaat + " euro betalen aan elk groepslid");
    }
}