/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class MatrixDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geef het aantal rijen in voor een matrix: ");
        int rijen = scan.nextInt();
        System.out.println("Geef het aantal kolommen in voor een matrix: ");
        int kolommen = scan.nextInt();
        int[][] dimensies = new int[rijen][kolommen];
        Matrix matrix = new Matrix(dimensies);

        for (int i = 0; i < dimensies.length; i++) {
            for (int j = 0; j < dimensies[i].length; j++) {
                System.out.println("Geef het getal in voor de " + (i + 1) + "e rij en de " + (j + 1) + "e kolom");
                int waarde = scan.nextInt();
                dimensies[i][j] = waarde;
            }
        }

        System.out.println("De matrix ziet er zo uit: \n" + matrix.printMatrix(dimensies));
        System.out.println("De som van de rijen is: " + Arrays.toString(matrix.rijSommen(dimensies)));
        System.out.println("De som van de kolommen is: " + Arrays.toString(matrix.kolomSommen(dimensies)));

        System.out.println("Test de aftoppen methode: ");

        Matrix matrix2 = new Matrix(dimensies);
        for (int i = 0; i < dimensies.length; i++) {
            for (int j = 0; j < dimensies[i].length; j++) {
                dimensies[i][j] = (int) (Math.random() * 1000.0 - 500.0);
            }
        }
        System.out.println("De matrix ziet er zo uit: \n" + matrix.printMatrix(dimensies));
        
        int[][] nieuweMatrix = matrix.aftoppen(dimensies, 100);
        
        System.out.println("Na het aftoppen zo: \n" + matrix.printMatrix(nieuweMatrix));
    }
}
