/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;

/**
 *
 * @author Ruben
 */
public class WoordSpel {

    final int MAXBEURTEN;

    String[] woorden = {"donan", "appel", "peer", "tentoonstelling", "vijf", "zes", "zeven", "acht", "negen", "tien"};

    String huidigWoord;

    boolean[] isGeraden;

    int beurten;

    public WoordSpel() {
        this.MAXBEURTEN = 10;
        this.huidigWoord = woorden[(int) (Math.random() * 10)];
        isGeraden = new boolean[huidigWoord.length()];
        int beurten = 0;

    }

    public boolean isGeraden() {
        boolean isGeraden = false;
        int aantalGeraden = 0;
        for (int i = 0; i < huidigWoord.length(); i++) {
            if (this.isGeraden[i] == true) {
                aantalGeraden++;
            } else {

            }
        }
        if (aantalGeraden == huidigWoord.length()) {
            isGeraden = true;
        } else {

        }
        return isGeraden;
    }

    public String gok(char c) {
        String show = "";
        this.beurten++;
        for (int i = 0; i < huidigWoord.length(); i++) {

            if (huidigWoord.charAt(i) == c) {
                isGeraden[i] = true;
            } else {
            }
        }
        for (int i = 0; i < huidigWoord.length(); i++) {

            if (isGeraden[i] == true) {
                show += huidigWoord.charAt(i);
            } else {
                show += "_";
            }
        }
        return show;
    }

    public String gok(String str) {
        String show = "";
        this.beurten++;

        if (huidigWoord.equals(str)){
            for (int i = 0; i < huidigWoord.length(); i++){
            isGeraden[i] = true;
            }
        } else {
        }

        for (int i = 0; i < huidigWoord.length(); i++) {

            if (isGeraden[i] == true) {
                show += huidigWoord.charAt(i);
            } else {
                show += "_";
            }
        }
        return show;
    }

}
