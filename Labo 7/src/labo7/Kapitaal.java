/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class Kapitaal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("geef een begin kapitaal in");
        int kapitaal = s.nextInt();
        System.out.println("geef een rentevoet in");
        double rente = s.nextDouble();
        double kapitaal2 = (kapitaal * 2);

        while (kapitaal <= kapitaal2) {
            kapitaal += (kapitaal * (rente/100));
            System.out.println("nieuwe kapitaal:" + kapitaal);
        }
    }
}
