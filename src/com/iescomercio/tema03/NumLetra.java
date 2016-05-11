package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *13.	Pedir una nota numérica por pantalla (entera positivo más cero 
 * entre 0 y 10) y muestra por pantalla “cero”, “uno”, “dos”...
 */
public class NumLetra {
    public static void main(String[] args) {
        int numero;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduzca un número: ");
        numero=teclado.nextInt();
        System.out.println("");
        
        if (numero<0||numero>10){
            System.out.println("La nota no es correcta. \n");
        } else{
            switch (numero){
            case 0:
                System.out.println("Cero \n");
            break;
            case 1:
                System.out.println("Uno \n");
            break;
            case 2:
                System.out.println("Dos \n");
            break;
            case 3:
                System.out.println("Tres \n");
            break;
            case 4:
                System.out.println("Cuatro \n");
            break;
            case 5:
                System.out.println("Cinco \n");
            break;
            case 6:
                System.out.println("Seis \n");
            break;
            case 7:
                System.out.println("Siete \n");
            break;
            case 8:
                System.out.println("Ocho \n");
            break;
            case 9:
                System.out.println("Nueve \n");
            break;
            case 10:
                System.out.println("Diez \n");
            break;
            }
        }
    }
}
