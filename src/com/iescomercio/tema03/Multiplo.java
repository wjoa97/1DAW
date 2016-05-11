package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *6.	Realizar un programa en Java que pida dos números y calcule 
 * y muestre por pantalla si el primero es múltiplo del segundo.
 */
public class Multiplo {
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
        
        if (num1%num2==0){
            System.out.println("El primer número es multiplo del segundo.");
        }else{
            System.out.println("El primer número no es multiplo del segundo.");
        }
    }
}
