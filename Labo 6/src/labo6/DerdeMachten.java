/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class DerdeMachten {

    public static void main(String[] args) {
        int derdemacht;
        for (int i = 1; i <= 10; i++) {
            derdemacht = (int) (Math.pow(i, 3));
            System.out.println("De derde macht is: " + derdemacht);
        }
    }

}
