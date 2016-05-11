package com.iescomercio.tema03;

import java.util.Scanner;

/**
 * 3. Realizar un programa en Java que pida un número e indique si este 
 * es par o impar.
 */
public class NumeroPar {
    public static void main(String[] args) {
        int num;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Introduza un número:");
        num=teclado.nextInt();
        
        if (num!=0){
            if (num%2==0)
            System.out.println("El número es par.");
            else
            System.out.println("El número es impar.");
        } else{
            System.out.println("El 0 no es par ni impar.");
        }
    }
}
