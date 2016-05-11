package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *
 * 
 */
public class Cifras {
    public static void main(String[] args) {
        int numero;
        Scanner teclado= new Scanner(System.in);
        
        do {
            System.out.println("Introducir un número del 0 al 99999: ");
            numero=teclado.nextInt();
        } while (numero<0||numero>99999);
        
        if (numero<0||numero>99999){
            System.out.println("Número no válido.");
        } else if (numero<10){
            System.out.printf("El número %d tiene una cifra.\n", numero);
        } else if (numero<100){
            System.out.printf("El número %d tiene dos cifras.\n", numero);
        } else if (numero<1000){
            System.out.printf("El número %d tiene tres cifras.\n", numero);
        } else if (numero<10000){
            System.out.printf("El número %d tiene cuatro cifras.\n", numero);
        } else {
            System.out.printf("El número %d tiene cinco cifras.\n", numero);
        }
    }
}
