/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 * Realizar un programa en JAVA que pida el radio de un circulo y calcule
 * y muestre por pantalla el area y perimetro de dicho circulo
 */
public class Circulo {

    public static void main(String[] args) {
        // Declaración variables
        double radio;
        Scanner teclado = new Scanner(System.in);
        
        // Intrucciones de programación
        
        // Pedir datos
        System.out.println("Introduzca el radio:");
        radio = teclado.nextDouble();
        
        // Realizar calculos
        double perimetroCirculo = PI*2*radio;
        double areaCirculo = PI*radio*radio;
        
        // Mostrar los datos con dos decimales
        System.out.printf("El perímetro es: %.2f \n", perimetroCirculo );
        System.out.printf("El area es: %.2f \n", areaCirculo);
    }
}
