/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo11;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Werking2DimArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef het aantal rijen in: ");
        int rij = scan.nextInt();
        System.out.println("Geef het aantal kolommen in: ");
        int kol = scan.nextInt();
        int[][] array2Dim = new int[rij][kol];
        String rijString = "";
        for (int i = 0; i < rij; i++) {
            rijString = "";
            for (int j = 0; j < kol; j++) {
                array2Dim[i][j] = i;
                rijString = " " + array2Dim[i][j] + rijString;
            }
            System.out.println(rijString + "\n");
        }
    }
}
