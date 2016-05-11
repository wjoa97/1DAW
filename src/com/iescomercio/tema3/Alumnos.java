package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * Realizar un programa en JAVA, que pida a 3 alumnos su edad y calcule 
 * y muestre la media de edad de esos tres alumnos.
 */
public class Alumnos {
    public static void main(String[] args) {
        //Declaración de variables
        int edadAlumno1;
        int edadAlumno2;
        int edadAlumno3;
        Scanner teclado = new Scanner(System.in);
        
        //Pedir datos
        System.out.println("Alumno 1, introduzca la edad:");
        edadAlumno1 = teclado.nextInt();
        System.out.println("Alumno 2, introduzca la edad:");
        edadAlumno2 = teclado.nextInt();
        System.out.println("Alumno 3, introduzca la edad:");
        edadAlumno3 = teclado.nextInt();
        
        //Realizar calculos
        float mediaAlumnos=(float)(edadAlumno1+edadAlumno2+edadAlumno3)/3;
        
        //Mostrar los datos
        System.out.printf("La media de edad es de: %.2f años \n", mediaAlumnos);
    }
}
