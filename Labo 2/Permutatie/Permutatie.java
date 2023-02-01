/**
*@author Ruben Van der Kelen
*@version januari 2019
*/

import java.util.Scanner;

public class Permutatie {
public static void main (String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Geef 3 double getallen");
String input = scan.nextLine();
Scanner s = new Scanner(input);
double a = s.nextDouble();
double b = s.nextDouble();
double c = s.nextDouble();
System.out.println("Variabele a is : " + a);
System.out.println("Variabele b is : " + b);
System.out.println("Variabele c is : " + c);
System.out.println("Na permutatie");

System.out.println("Variabele a is : " + c);
System.out.println("Variabele b is : " + a);
System.out.println("Variabele c is : " + b);
}
}
