package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *
 * 
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double numero, factorial=1;
        
        do {
            System.out.println("Introduce un número: ");
            numero= n.nextDouble();
        } while (numero <0);
        while (numero!=0){
            factorial=factorial*numero;
            numero--;
        }
        System.out.println("Factorial: "+factorial);
    }
}
