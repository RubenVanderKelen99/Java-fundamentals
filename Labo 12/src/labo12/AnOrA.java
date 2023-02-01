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
public class AnOrA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String woord = s.next();
        
        String letter = woord.substring(0,1);
        letter = letter.toLowerCase();
        boolean a = letter.equals("a");
        boolean e = letter.equals("e");
        boolean u = letter.equals("u");
        boolean i = letter.equals("i");
        boolean o = letter.equals("o");
        if((a)|(e)|(u)|(i)|(o)){
            System.out.println("Dit wordt: an "+woord.toLowerCase());
        } else{
            System.out.println("Dit wordt: a "+woord.toLowerCase());
        }
    }
    
}
