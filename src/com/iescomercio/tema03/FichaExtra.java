package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *Crear una ficha a partir de los datos que introduzca el usuario.
 */
public class FichaExtra {

    public static void main(String[] args) {
        
        //Declaracion de variables
        int edad;
        int telefono;
        String nombre, apellidos;
        Scanner teclado = new Scanner(System.in);
        
        //Pedir datos
        System.out.println("Introduzca el nombre:");
        nombre = teclado.nextLine();
        System.out.println("Introduzca los apellidos:");
        apellidos = teclado.nextLine();
        System.out.println("Introduzca el telefono:");
        telefono = teclado.nextInt ();
        System.out.println("Introduzca la edad:");
        edad = teclado.nextInt();
        
        //Mostrar ficha con datos
        System.out.println("");
        System.out.println("**************************");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Apellido: "+apellidos);
        System.out.println("* Teléfono: "+telefono);
        System.out.println("* Edad: "+edad);
        System.out.println("**************************");
        
        

              

    
    }
}
