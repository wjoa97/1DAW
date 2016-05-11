package com.iescomercio.tema03;

/**
 * Resultado de las dos series con for:
 * 6*9*12...60
 * 5+50+500...500000
 */
public class SerieTresCincoFor {

    public static void main(String[] args) {
        long i, acumulador2=0;
        double acumulador1=1;
        System.out.print("Serie 1:\t");
        
        for (i = 6; i <= 60; i+=3) {
            System.out.print(""+i+"\t");  
            acumulador1=acumulador1*i;
        }
        
        System.out.println("\n\nEl resultado es: " + acumulador1);
        
        System.out.print("\nSerie 2: \t");
        
        for (i = 5; i <= 5000000; i=i*10) {
            System.out.print(""+i+"\t");
            acumulador2 = acumulador2 + i;
        }
        System.out.println("\n\nEl resultado es: " + acumulador2);
        System.out.println("");
    }
}
