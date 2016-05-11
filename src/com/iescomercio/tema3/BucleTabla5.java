package com.iescomercio.tema3;

/**
 * 2.	Realizar un programa que muestre los números de la tabla del 5 hasta 500.
 * Empezando en 100.
 */
public class BucleTabla5 {
    public static void main(String[] args) {
        int resul=0, num=0;

        System.out.println("\nTabla del 5");
        System.out.println("-------------");
        
        while (resul<500){
            resul=num*5;
            if (resul>=100){System.out.println(num +" x 5 = "+ resul);}
            num++;
        }
    }
}