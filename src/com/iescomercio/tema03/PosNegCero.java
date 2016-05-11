package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *5.	Realizar un programa en Java que pida un número entero y calcule 
 * y muestre por pantalla si es positivo, negativo o cero.
 */
public class PosNegCero {
    public static void main(String[] args) {
        int numero;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        numero=teclado.nextInt();
        
        if (numero==0){
            System.out.println("El número es cero. \n");
        }
        else if (numero<0){
            System.out.println("El número es negativo. \n");
        } else {
            System.out.println("El número es positivo. \n");
        }
    }
}
