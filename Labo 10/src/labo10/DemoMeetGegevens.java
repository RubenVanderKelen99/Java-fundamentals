
import java.util.Scanner;

/**
*Schrijf een testprogramma (DemoMeetGegevens)
*dat een array van 20 meetwaarden, voorgesteld door positieve gehele getallen,
*inleest. Het programma moet controleren of deze waarden allemaal onderling
*verschillend zijn. Als dat het geval is, moet bepaald worden welke twee meetwaarden het dichtst bij elkaar liggen en het positieve verschil hiertussen moet
*uitgeschreven worden. Bvb. voor de rij (4, 2, 6, 1) is de output 1.
* @author ruben
*/
public class DemoMeetGegevens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] parameterArray = new int[5];
        
        for (int i = 0; i < parameterArray.length; i++) {
            System.out.println("Welk getal wil je in de array invoeren");
            int getal = scan.nextInt();
            parameterArray[i] = getal;
        }
        MeetGegevens meetgegevens = new MeetGegevens(parameterArray);
        
        System.out.println("De gegevens zijn onderling verschillend: " + meetgegevens.zijnAlleElementenOnderlingVerschillend());
        System.out.println("Het kleinste onderlinge verschil is: " + meetgegevens.bepaalKleinstePositiefVerschil());
    }
}

