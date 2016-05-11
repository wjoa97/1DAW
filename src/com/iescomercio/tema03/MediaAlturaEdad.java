package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * Dadas la edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
 * la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden
 * más de 1,75.
 *
 */
public class MediaAlturaEdad {

    public static void main(String[] args) {
        
        int edad, contEdad = 0, contEstatura = 0;
        double estatura = 0.0, mediaEdad, mediaEstatura, acuEdad = 0, acuEstatura = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Edad: ");
            edad = teclado.nextInt();

            System.out.println("Estatura: ");
            estatura = teclado.nextDouble();
            
            System.out.println("----------------------");

            if (edad > 18) {
                contEdad++;
            }
            if (estatura > 1.75) {
                contEstatura++;
            }

            acuEdad = acuEdad + edad;
            acuEstatura = acuEstatura + estatura;
        }
        
        mediaEdad = acuEdad/5;
        mediaEstatura = acuEstatura/5;
        
        System.out.println("------------------");
        System.out.printf("La edad media es %.2f y la ultura media es %.2f .\n", mediaEdad, mediaEstatura);
        System.out.println("La cantidad de alumnos mayores de 18 años es: "+ contEdad);
        System.out.println("La cantidad de alumnos que miden 1,75 es: "+ contEstatura+"\n");
    }
}
