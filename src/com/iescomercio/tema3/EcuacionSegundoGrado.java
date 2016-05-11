package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * Implementar un programa que pida los coeficientes de una ecuación de 2º grado.
 */
public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        
        // Declaracion de variables
        
        int a, b, c;
        float x1, x2, raiz;
        Scanner teclado= new Scanner(System.in);
        
        // Pedir datos
        
        System.out.println("Introduzca el valor para el coeficiente a:");
        a=teclado.nextInt();
        System.out.println("Introduzca el valor para el coeficiente b:");
        b=teclado.nextInt();
        System.out.println("Introduzca el valor para el coeficiente c:");
        c=teclado.nextInt();
        
        // Realizar calculos
        raiz=(float) (Math.pow(b, 2)-4*a*c);
        x1=(float) ((-b+Math.sqrt(raiz))/(2*a));
        x2=(float) ((-b-Math.sqrt(raiz))/(2*a));
        
        // Mostrar datos
        
        if (raiz<0){
            System.out.println("");
            System.out.println("La ecuación no tiene soluciones reales.");}
        else{
            System.out.println("");
            System.out.printf("La solución para x1 es: %.2f \n", x1);
            System.out.printf("La solución para x2 es: %.2f \n", x2);}
    }
}
