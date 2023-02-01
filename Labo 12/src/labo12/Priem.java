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
public class Priem {

    public boolean isPriem(int priemGetal) {

        int i = priemGetal;
        if ((i == 2) | (i == 3) | (i == 5) | (i == 7)) {
            return true;
        }

        double vw1Double = i / 2.0;
        double vw2Double = i / 3.0;
        double vw3Double = i / 4.0;
        double vw4Double = i / 5.0;
        double vw5Double = i / 6.0;
        double vw6Double = i / 7.0;
        double vw7Double = i / 8.0;

        boolean vw1 = vw1Double == (int) vw1Double;
        boolean vw2 = vw2Double == (int) vw2Double;
        boolean vw3 = vw3Double == (int) vw3Double;
        boolean vw4 = vw4Double == (int) vw4Double;
        boolean vw5 = vw5Double == (int) vw5Double;
        boolean vw6 = vw6Double == (int) vw6Double;
        boolean vw7 = vw7Double == (int) vw7Double;

        return !((vw1) | (vw2) | (vw3) | (vw4) | (vw5) | (vw6) | (vw7));

    }

    public int aantalPriem(int minBerijk, int maxBerijk) {
        int aantal = 0;
        for (int i = minBerijk; i < maxBerijk; i++) {
            switch (i) {
                case 2:
                    aantal++;
                    break;
                case 3:
                    aantal++;
                    break;
                case 5:
                    aantal++;
                    break;
                case 7:
                    aantal++;
                    break;

            }

            double vw1Double = i / 2.0;
            double vw2Double = i / 3.0;
            double vw3Double = i / 4.0;
            double vw4Double = i / 5.0;
            double vw5Double = i / 6.0;
            double vw6Double = i / 7.0;
            double vw7Double = i / 8.0;

            boolean vw1 = vw1Double == (int) vw1Double;
            boolean vw2 = vw2Double == (int) vw2Double;
            boolean vw3 = vw3Double == (int) vw3Double;
            boolean vw4 = vw4Double == (int) vw4Double;
            boolean vw5 = vw5Double == (int) vw5Double;
            boolean vw6 = vw6Double == (int) vw6Double;
            boolean vw7 = vw7Double == (int) vw7Double;

            if (!((vw1) | (vw2) | (vw3) | (vw4) | (vw5) | (vw6) | (vw7))) {
                if (i != 1) {
                    aantal++;
                }
            } else {

            }
        }
        return aantal;
    }

    public int[] geefPriem(int minBerijk, int maxBerijk) {

        int[] priemGetallen = new int[aantalPriem(minBerijk, maxBerijk)];
        int arrayPlaats = 0;
        for (int i = minBerijk; i < maxBerijk; i++) {
            switch (i) {
                case 2:
                    priemGetallen[arrayPlaats] = i;
                    arrayPlaats++;
                    break;
                case 3:
                    priemGetallen[arrayPlaats] = i;
                    arrayPlaats++;
                    break;
                case 5:
                    priemGetallen[arrayPlaats] = i;
                    arrayPlaats++;
                    break;
                case 7:
                    priemGetallen[arrayPlaats] = i;
                    arrayPlaats++;
                    break;

            }

            double vw1Double = i / 2.0;
            double vw2Double = i / 3.0;
            double vw3Double = i / 4.0;
            double vw4Double = i / 5.0;
            double vw5Double = i / 6.0;
            double vw6Double = i / 7.0;
            double vw7Double = i / 8.0;

            boolean vw1 = vw1Double == (int) vw1Double;
            boolean vw2 = vw2Double == (int) vw2Double;
            boolean vw3 = vw3Double == (int) vw3Double;
            boolean vw4 = vw4Double == (int) vw4Double;
            boolean vw5 = vw5Double == (int) vw5Double;
            boolean vw6 = vw6Double == (int) vw6Double;
            boolean vw7 = vw7Double == (int) vw7Double;

            if (!((vw1) | (vw2) | (vw3) | (vw4) | (vw5) | (vw6) | (vw7))) {
                if (i != 1) {
                    priemGetallen[arrayPlaats] = i;
                    arrayPlaats++;
                }
            } else {

            }
        }
        return priemGetallen;
    }

}
