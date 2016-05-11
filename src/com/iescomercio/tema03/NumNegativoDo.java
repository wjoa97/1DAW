package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 *
 */
public class NumNegativoDo {

    public static void main(String[] args) {
        int cont = 0, num; // Declaración de variables contador y número
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Introduzca un número:");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("Número no valido.");
            } else {
                cont++;
            }
        } while (num > 0);
        {
            System.out.println("--------------------");
            System.out.println("Números positivos: " + cont);
        }

    }
}
