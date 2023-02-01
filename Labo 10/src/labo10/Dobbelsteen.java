/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;

/**
 *
 * @author Ruben
 */
public class Dobbelsteen {

    int minAantal;
    int maxAantal;

    public Dobbelsteen() {
        minAantal = 1;
        maxAantal = 6;
    }

    public Dobbelsteen(int min, int max) {
        this.minAantal = min;
        this.maxAantal = max;
    }
    
    int worp;
    public int gooi(){
        worp = (int)(minAantal + (Math.round(Math.random() * (maxAantal - minAantal))));
      return worp;
}
}
