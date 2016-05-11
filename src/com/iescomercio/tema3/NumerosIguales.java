package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *4.	Realizar un programa en Java que pida dos números y calcule 
 * y muestre por pantalla si son iguales o en caso de no serlo cuál es el mayor.
 */
public class NumerosIguales {
    public static void main(String[] args) {
        
        // Declaración de variables
        
        int num1, num2;
        Scanner teclado= new Scanner(System.in);
        
        // Pedir datos
        
        System.out.println("Introduzca el primer número: ");
        num1=teclado.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2=teclado.nextInt();
        
        // Mostrar datos
        
        System.out.println("");
        
        // Bloques if else, dentro de otro bloque if else (Bifurcación encadenada)
        
        if (num1==num2){
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes. \n");
            if (num1>num2){
                System.out.printf("El primer número (%d), es mayor que el segundo número (%d).\n", num1, num2);
            } else {
                System.out.printf("El primer número (%d), es mayor que el segundo número (%d).\n", num2, num1);
            }
        }
    }
}
