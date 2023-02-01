package labo6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class CelsiusFahrenheit {

    public static void main(String[] args) {
        double gradenCelsius, gradenFahrenheit;
        for (double i = -20; i <= 50; i += 5) {
            gradenCelsius = i;
            gradenFahrenheit = (1.8 * i) + 32;
            System.out.println("Graden in celsius: " + gradenCelsius + " °C");
            System.out.println("Graden in fahrenheit: " + gradenFahrenheit + " F");
        }
    }

}
