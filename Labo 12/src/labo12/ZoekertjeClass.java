/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo12;

/**
 *
 * @author Ruben
 * @version januari 2019
 */

public class ZoekertjeClass {

    String tekst;
    

    public ZoekertjeClass(String tekst) {
        this.tekst = tekst;
    }

    public String vertaal() {
        String returnTekst = "";
        int woordSpatie = tekst.indexOf(" ");

        while ((tekst.indexOf(" ")) != -1) {

            woordSpatie = tekst.indexOf(" ");
            String woord = tekst.substring(0, woordSpatie);
            tekst = tekst.substring(woordSpatie + 1);

            for (int index = 0; index < woord.length(); index++) {
                char letter = woord.charAt(index);

                boolean a = letter == 'a';
                boolean e = letter == 'e';
                boolean u = letter == 'u';
                boolean i = letter == 'i';
                boolean o = letter == 'o';

                if ((a) | (e) | (u) | (i) | (o)) {
                    String woordDeel1 = woord.substring(0, index);
                    String woordDeel2 = woord.substring(index + 1);
                    woord = woordDeel1 + woordDeel2;
                    index--;
                }
            }

            returnTekst += woord + " ";

        }
        

            String woord = tekst;

            for (int index = 0; index < woord.length(); index++) {
                char letter = woord.charAt(index);

                boolean a = letter == 'a';
                boolean e = letter == 'e';
                boolean u = letter == 'u';
                boolean i = letter == 'i';
                boolean o = letter == 'o';

                if ((a) | (e) | (u) | (i) | (o)) {
                    String woordDeel1 = woord.substring(0, index);
                    String woordDeel2 = woord.substring(index + 1);
                    woord = woordDeel1 + woordDeel2;
                    index--;
                }
            }
            
            

        return (returnTekst+" "+woord);

    }

}
