/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;

/**
 *
 * @author Ruben
 */
public class GeheimeCode2 {

    int[] code = new int[5];

    public GeheimeCode2(int code1, int code2, int code3, int code4, int code5) {
        int[] input = {code1, code2, code3, code4, code5};
        for (int i = 0; i < code.length; i++) {
            code[i] = input[i];
        }

    }

    public int juistePlaats(int[] gok) {
        int aantalJuist = 0;

        for (int i = 0; i < code.length; i++) {
            if (code[i] == gok[i]) {
                aantalJuist++;
            } else {

            }
        }
        return aantalJuist;
    }

    public int somJuisteGetallen(int[] gok) {
        String plaatsJuist = "0";

        for (int i = 0; i < code.length; i++) {
            if (code[i] == gok[i]) {
                plaatsJuist += " " + Integer.toString(code[i]);
            } else {

            }
        }

        String[] juisteGetallen = plaatsJuist.split(" ");
        int somJuiste = 0;
        
        for (int i = 0; i < juisteGetallen.length; i++) {
            somJuiste += Integer.parseInt(juisteGetallen[i]);
        }
        
        return somJuiste;
    }
}
