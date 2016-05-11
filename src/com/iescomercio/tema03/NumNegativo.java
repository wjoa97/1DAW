package com.iescomercio.tema03;

import java.util.Scanner;

/**
 * 6. Realizar un programa que pide números al usuarios hasta que introduzca un
 * 0 y calcula y muestra por pantalla cuantos pares y cuantos impares ha leído.
 *
 */
public class NumNegativo {

    public static void main(String[] args) {
        int cont = 0, num; // Declaración de variables contador y número
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número:"); //Pedir los datos fuera del while para no tener que poner la variable num=0
        num = teclado.nextInt();

        while (num >= 0) { // Bucle para números positivos
            cont++;
            System.out.println("Introduzca un número:");
            num = teclado.nextInt();
        }

        System.out.println("--------------------");
        System.out.println("Números positivos: " + cont);
    }
}
