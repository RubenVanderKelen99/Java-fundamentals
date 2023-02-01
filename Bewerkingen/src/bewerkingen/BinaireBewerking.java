
package bewerkingen;

import java.util.Scanner;

/**
 * Documenteren van de klasse
 *
 * @author Katja Verbeeck
 * @version september 2014
 */
public class BinaireBewerking {
    /**
     * in dit veld wordt een eerste getal opgeslaan
     */
    int term1;
    /**
     * in dit veld wordt een tweede getal opgeslaan
     */

    int term2;
    
    
    /**
     * default constructor methode
     * 
     */
    public BinaireBewerking(){
        term1 = 0;
        term2 = 0;
    }

    /**
     * constructor methode
     * @param t1 de eerste term van de bewerking
     * @param t2 de tweede term van de bewerking
     */
    public BinaireBewerking(int t1, int t2){
        term1 = t1;
        term2 = t2;
    }

    /**
     * Voert een gegeven rekenkundige bewerking uit op term1 en term2
     *
     * @param operator De operator (+, -, *, / of %)
     * @return Het resultaat van de berekening
     */
    public int berekenResultaat(char operator) {
        int res = -1;

        switch (operator) {
            case '+':
                res = term1 + term2;
                break;
            case '-':
                res = term1 - term2;
                break;
            case '*':
                res = term1 * term2;
                break;
            case '/':
                res = term1 / term2;
                break;
            case '%':
                res = term1 % term2;
                break;
            default:
                break;
        }

        return res;
    }

}
