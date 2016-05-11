package com.iescomercio.tema03;

import java.util.Scanner;

/**
 * 4. Realizar un programa en java que pida un numero entero positivo N mayor de
 * 0 y calcula y muestra por pantalla un cuadrado de tamaño NxN con asteriscos.
 *
 * @author Gerardo
 */
public class CuadradoAsteriscos {

    public static void main(String[] args) {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca un numero para el tamaño:");
            n = teclado.nextInt();
            System.out.println("\n-------------------\n");
        } while (n <= 0);
        for (int i = 1; i <= n; i++) { // Altura
            for (int j = 1; j <= n; j++) { // Ancho
                if (j == 1 || j == n || i == 1 || i == n) // Sin relleno
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

//        for (int i = 0; i < n; i++) { // Altura
//            for (int j = 1; j < n; j++) { // Ancho
//                System.out.printf("* "); // Cuadrado relleno
//            }
//            System.out.println("*"); 
//        }
//        System.out.println("");
    }
}
