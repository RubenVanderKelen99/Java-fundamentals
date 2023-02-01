/**
* Schrijf een programma waarin een double variabele ge´ınitialiseerd wordt en vervolgens wordt omgezet naar respectievelijk een float variabele, een long variabele, 
een int variabele, een short variabele, een char variabele
en een byte variabele. 
* @author Ruben De Oliveira Silva
* @version September 2018
*/
public class Casts{
    public static void main(String[] args){
        double mijnDouble = 2.1;

        float mijnFloat = (float)mijnDouble;
        long mijnLong = (long)mijnDouble;
        int mijnInt = (int)mijnDouble;
        short mijnShort = (short)mijnDouble;
        char mijnChar = (char)mijnDouble;
        byte mijnByte = (byte)mijnDouble;

        System.out.println("Dit is de waarde van de double: " + mijnDouble);
        System.out.println("Dit is de waarde van de float: " + mijnFloat);
        System.out.println("Dit is de waarde van de long: " + mijnLong);
        System.out.println("Dit is de waarde van de integer: " + mijnInt);
        System.out.println("Dit is de waarde van de short: " + mijnShort);
        System.out.println("Dit is de waarde van de char: " + mijnChar);
        System.out.println("Dit is de waarde van de byte: " + mijnByte);
    }
}