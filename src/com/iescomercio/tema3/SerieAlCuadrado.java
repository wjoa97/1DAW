package com.iescomercio.tema3;

/**
 *7. Realizar un programa en Java que calcula y muestra por pantalla el 
 * resultado de la serie: 2*4*8*16...1024 salvo el número 128 y 512
 */
public class SerieAlCuadrado {
    public static void main(String[] args) {
        int n=1, contador=0;
        long acumulador=1;
        
        while (contador<1024){
            contador=(int)Math.pow(2,n);
            if (contador!=128&& contador!=512){
                acumulador=acumulador*contador;
            }
            n++;
        }
        System.out.println("El resultado es: "+acumulador);
    }
}
