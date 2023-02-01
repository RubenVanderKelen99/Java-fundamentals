/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;

import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class TestDobbelen {

    public static void main(String[] args) {
        Dobbelsteen Dobbelsteen = new Dobbelsteen(3, 10);

        Scanner scan = new Scanner(System.in);
        int doel;

        do {
            System.out.println("Hoeveel ogen wil je werpen? [3, 10]");
            doel = scan.nextInt();
        } while (!(doel >= 3 && doel <= 10));

        int worp;
        int i = 0;

        do {
            worp = Dobbelsteen.gooi();
            System.out.println("Dobbelsteen heeft " + worp + " gegooid");
            i++;
        } while (worp != doel);
        
        System.out.println("In " + i + " pogingen werd een " + doel + " gegooid.");
    }
}
