package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * 2.	Realizar un programa en Java que pida dos números enteros positivos 
 * y los muestre por pantalla ordenados.
 */
public class Sentencia {
    public static void main(String[] args) {
        
        // Declaración de variables
        
        int num1, num2;
        Scanner teclado= new Scanner(System.in);
        
        // Pedir primer dato
        System.out.println("Introduzca el primer número: ");
        num1=teclado.nextInt();
        
        // Bifurcación en caso de que el número sea negativo (Control de flujo)
        
        if (num1<=0){
            System.out.println("El número debe ser positivo \n");}
        
        // Pedir segundo dato
        
        System.out.println("Introduzca el segundo número: ");
        num2=teclado.nextInt();
        
        // Bifurcación en caso de que el número sea negativo (Control de flujo)
            
        if (num2<=0){
            System.out.println("El número debe ser positivo \n");}
       
        // Mostrar los datos
        
        System.out.println("");
        System.out.printf("Los números son: %d y %d \n", num1, num2);
        
    }   
}
