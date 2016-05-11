package com.iescomercio.tema03;

import java.util.Scanner;

/**
 * 10.	Pedir 15 números y escribir la suma y la media de todos ellos, salvo
 * aquellos que sean 0.
 */
public class SumaMedia15 {

    public static void main(String[] args) {

        int num, suma = 0, veces = 1, denominador = 15;
        double media;
        Scanner teclado = new Scanner(System.in);

        while (veces <= 15) {
            System.out.println("Introduzca un número:");
            num = teclado.nextInt();
            if (num == 0) {
                denominador = denominador - 1;
            }
            veces++; // Contador
            suma = suma + num; // Acumulador (suma = + num)
        }

        media = (double) suma / denominador;

        System.out.println("------------------------");
        System.out.println("\nLa suma es: \n" + suma);
        System.out.println("La media es: \n" + media);
        System.out.println("El denomianador es: " + denominador);
    }
}
