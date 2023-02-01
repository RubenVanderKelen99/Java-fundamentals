/**
* Lees een bedrag en een winstpercentage in. Geef als resultaat
het bedrag dat met het percentage werd verhoogd.
* @author Ruben De Oliveira Silva
* @version September 2018
*/
import java.util.Scanner;

public class VerkoopBedrag{
    public static void main(String[] args){
        double bedrag, winstpercentage, bedragnawinst, resultaat;

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een bedrag in: ");
        //!!! HEEL BELANGRIJK OM nextDouble te plaatsen ipv nextINT anders zal hij een reeël getal inlezen als een geheel getal
        bedrag = scan.nextDouble();

        System.out.println("Geef een winstpercentage in: ");
        winstpercentage = scan.nextDouble();  

        bedragnawinst = (bedrag * winstpercentage) / 100;
        resultaat = bedrag + bedragnawinst;

        System.out.println("Het bedrag bedraagt: " + resultaat);
    }
}