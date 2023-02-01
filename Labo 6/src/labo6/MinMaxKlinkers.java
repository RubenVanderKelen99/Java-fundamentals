/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class MinMaxKlinkers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoeveel woorden wil je ingegeven: ");
        final int aantalWoorden = scan.nextInt();
        String kleinsteWoord = "";
        String grootsteWoord = "";
        int kleinsteAantalKlinkers = 0;
        int grootsteAantalKlinkers = 0;
        
        for (int i = 0; i < aantalWoorden; i++){
            System.out.println("Geef een woord in: ");
            String woord = scan.next();
            int aantalKlinkers = 0;
            int woordLengte = woord.length();
            
            if (i == 0){
                kleinsteWoord = woord;
                grootsteWoord = woord;
                for (int j = 0; j <= woordLengte - 1; j++){
                char Letter = woord.charAt(j);
                if (Letter == 'a' || Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u' || Letter == 'y'){
                    aantalKlinkers++;
                }
                else{
                }
                }
                aantalKlinkers = kleinsteAantalKlinkers;
                aantalKlinkers = grootsteAantalKlinkers;
            }
            else{
            for (int j = 0; j <= woordLengte - 1; j++){
                char Letter = woord.charAt(j);
                if (Letter == 'a' || Letter == 'e' || Letter == 'i' || Letter == 'o' || Letter == 'u' || Letter == 'y'){
                    aantalKlinkers++;
                }
                else{
                }
                }
            if (aantalKlinkers < kleinsteAantalKlinkers){
                kleinsteWoord = woord;
            }
            else if (aantalKlinkers > grootsteAantalKlinkers){
                grootsteWoord = woord;
            }
            else{
                
            }
            }
        }
        System.out.println("Het woord met het minst aantal klinkers is: " + kleinsteWoord);
        System.out.println("Het woord met het grootste aantal klinkers is: " + grootsteWoord);
    }
}
