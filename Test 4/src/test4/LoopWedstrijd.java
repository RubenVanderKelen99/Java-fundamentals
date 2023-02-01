/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test4;

/**
 *
 * @author ruben.vanderkelen
 * @version januari 2019
 */
public class LoopWedstrijd {
        String naam;                                                            //Variable naam aan maken 
        String[] atleten;                                                       //Array atleten aan maken
        double[] tijden;                                                        //Array tijden aan maken
        
        public LoopWedstrijd(String naam,String[] namen,double[] tijden){       //Niet-default constructor met als parrameters: naam, array namen, array tijden
            this.naam = naam;                                                   //Naam gelijk stellen met gegeven naam
            atleten = namen;                                                    //array atleten gelijkstellen met gegeven array namen
            this.tijden = tijden;                                               //array tijden gelijk stellen met gegeven array tijden
        }
        
        
        String geefWinnaar(){                                                   //methode geefWinnaar
            String gewonnen = "";                                               //Een String variable gewonnen aanmaken
            double minTijd = Double.MAX_VALUE;                                  //Variable minTijd aanmaken en initaliseren
            
            for(int i = 0; i<tijden.length;i++){                                //for lus om de tijden te vergelijken
                if(minTijd>(tijden[i])){                                        //Als de tijd in de array kleiner is dan de kleinste waarde 
                    minTijd = tijden[i];                                        //wordt de tijd uit de array de kleinste waarde
                    gewonnen = atleten[i];                                      //kijk welke atleet deze waarde heeft behaald en onthoud deze
                }
            }
            return gewonnen;                                                    //Geef de beste atleet terug
        }
        
        
        void voegExtraPrestatieToe(String atleet,double tijd){                  //Methode voegExtraPrestatieToe
            int alGebruikt = 0;                                                 //Maak een variable alGebruikt aan
            for(int i = 0;i<atleten.length;i++){                                //Een for lus die de megegeven atleet vergelijkt met de atleten in de array
                if(atleet.equals(atleten[i])){                                  //Kijk of de alteet op plaats i in de array gelijk is aan de atleet die wordt toegevoegd
                    alGebruikt = 1;                                             //als dit zo is zet de variable alGebruikt op 1
                }
            }
            if(alGebruikt != 1){                                                //Als de variable alGebruikt op 1 staat
                
                String[] hulpAtleet = new String[atleten.length+1];             //maak een nieuwe array aan 1 groter dan de vorige array
                hulpAtleet = atleten;                                           //zet de nieuwe array gelijk aan de vorige array
                hulpAtleet[hulpAtleet.length-1] = atleet;                       //voeg de atleet toe aan de nieuwe array
                atleten = hulpAtleet;                                           //zet de vorige array gelijk aan de hulpArray 
            
            
                double[] hulpTijden = new double[tijden.length+1];              //Idem als bij de alteet maar dan met de tijden
                hulpTijden = tijden;                                            //..
                hulpTijden[hulpTijden.length-1] = tijd;                         //..
                tijden = hulpTijden;                                            //..
            }
        }
    
}
