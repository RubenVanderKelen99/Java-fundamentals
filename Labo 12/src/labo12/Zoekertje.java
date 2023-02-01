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
import java.util.Scanner;

public class Zoekertje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Type je zoekertje hier\n");
        Scanner s = new Scanner(System.in);
        String line = " ";
        while (!line.equals("")) {
            line = s.nextLine();
            ZoekertjeClass zoekertje = new ZoekertjeClass(line);
            System.out.println(zoekertje.vertaal());
        }
    }

}
