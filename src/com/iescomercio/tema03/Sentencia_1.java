package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * 2.	Realizar un programa en Java que pida dos números enteros positivos 
 * y los muestre por pantalla ordenados.
 */
public class Sentencia_1 {
    public static void main(String[] args) {
        
        // Declaración de variables
        
        int num1, num2;
        Scanner teclado= new Scanner(System.in);
        
        // Pedir datos
        System.out.println("Introduzca dos números positivos: ");
        num1=teclado.nextInt();
        num2=teclado.nextInt();
        
        // Bifurcación en caso de que el número sea negativo (Control de flujo)
        
        if (num1<=0||num2<=0){
            System.out.println("Los números deben ser positivos \n");}
        else {
            System.out.println("");
            if (num1<num2){
                System.out.printf("Los números son: %d y %d \n", num1, num2);
            } else {
                System.out.printf("Los números son: %d y %d \n", num2, num1);
            }
        }  
    }   
}
