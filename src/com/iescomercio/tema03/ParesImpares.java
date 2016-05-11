package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *6. Realizar un programa que pide números al usuarios hasta que introduzca 
 *  un 0 y calcula y muestra por pantalla cuantos pares y cuantos impares 
 *  ha leído.
 * 
 */
public class ParesImpares {
    public static void main(String[] args) {
        int num=-1, par=0, impar=0;
        Scanner teclado = new Scanner(System.in);
        
        while (num!=0) {
            System.out.println("Introduzca un número:");
            num=teclado.nextInt();
            if(num!=0){
                if(num%2==0){
                    par++;
                }else{
                    impar++;
                }
            }
        }
        System.out.println("--------------------");
        System.out.println("Número de pares: "+par);
        System.out.println("Número de impares: "+impar);
    }
}
