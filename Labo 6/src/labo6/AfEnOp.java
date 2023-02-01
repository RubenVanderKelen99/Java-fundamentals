/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo6;
import java.util.Scanner;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class AfEnOp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een woord in: ");
        String woord = scan.next();
        char leeg = '\0';
        String woordAfbouwen = "";
        for (int i = woord.length() - 1; i > 0; i--){        
                woordAfbouwen = woord.substring(0, i);
                System.out.println(woordAfbouwen);
        }
        String woordOpbouwen = "";
          for (int i = 1; i <= woord.length(); i++){         
              woordOpbouwen = woord.substring(0, i);
              if (woordOpbouwen.length() > 1 ){ 
                System.out.println(woordOpbouwen);
              }
              else{
                  
              }
        }
    }
    
}
