/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo10;

/**
 *
 * @author Ruben
 * @version januari 2019
 */
public class Rechthoek {
    int x;
    int y;
    int breedte;
    int lengte;
    
    /**
     * default constructor
     */
    public Rechthoek() {
    x = 0;
    y = 0;
    breedte = 0;
    lengte = 0;
}
    
    /**
     *
     * niet default constructor
     */
    public Rechthoek(int x, int y, int breedte, int lengte){
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.lengte = lengte;
    }
    
    public boolean isVierkant(){
        boolean vierkant;
        
        if(breedte == lengte){
            vierkant = true;
        }
        else{
        vierkant = false;
    }
        return vierkant;
    }
    
    public int berekenOmtrek(){
        return (2 * (breedte + lengte));
    }
    
    public int berekenOppervlakte(){
        return (lengte * breedte);
    }
    
    public boolean isIn (int x, int y){
        boolean inRechthoek;
        if (x >= (this.x) && x <= (this.x + lengte) && y >= (this.y) && y <= (this.y + breedte)){
            inRechthoek = true;
        }
        else{
            inRechthoek = false;
        }
        return inRechthoek;
    }
}

