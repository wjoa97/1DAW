package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * 5.	Realizar un programa en Java que visualiza el resultado de 
 *  la serie 8+10+12+14+....+50
 * 
 */
public class SumaDosEnDos {
    public static void main(String[] args) {
        int num=8, suma=0, n=8;
        
        while (n<=50){
            suma=suma+num;
            n=n+2;
            num=num+2;
        }
        System.out.println("El resultado de la serie 8+10+12+14+....+50 es: "+suma);
    }
}
