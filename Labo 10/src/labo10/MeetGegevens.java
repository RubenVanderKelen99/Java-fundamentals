
/**
 *Schrijf een testprogramma (DemoMeetGegevens)
 *dat een array van 20 meetwaarden, voorgesteld door positieve gehele getallen,
 *inleest. Het programma moet controleren of deze waarden allemaal onderling
 *verschillend zijn. Als dat het geval is, moet bepaald worden welke twee meetwaarden het dichtst bij elkaar liggen en het positieve verschil hiertussen moet
 *uitgeschreven worden. Bvb. voor de rij (4, 2, 6, 1) is de output 1.
 *
 * @author ruben
 */
public class MeetGegevens {

    int[] array = new int[5];

    public MeetGegevens(int[] array) {
        this.array = array;
    }

    public boolean zijnAlleElementenOnderlingVerschillend() {
        boolean zijnAlleElementenOnderlingVerschillend = false;
        int aantalVerschillend = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {

                } else {
                    if (array[j] == array[i]) {

                    } else {
                        aantalVerschillend++;
                    }
                }

            }
        }
        if (aantalVerschillend == 0) {
            zijnAlleElementenOnderlingVerschillend = false;
        } else {
            zijnAlleElementenOnderlingVerschillend = true;
        }
        return zijnAlleElementenOnderlingVerschillend;
    }

    public int bepaalKleinstePositiefVerschil() {
        int kleinste = Integer.MAX_VALUE;
        int verschil = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {

                } else {
                    if (i < j) {
                       verschil = array[j] - array[i];
                    } else {
                       verschil = array[i] - array[j];
                        
                        if (verschil < kleinste) {
                            kleinste = verschil;
                        }
                    }
                }
                
            }
        }
        return verschil;
    }
}
