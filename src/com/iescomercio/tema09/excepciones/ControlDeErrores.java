package com.iescomercio.tema9.excepciones;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

public class ControlDeErrores {

    public static int[] metodo1(int dividento, int divisor) {

        int[] resultado = new int[2];
        if (divisor == 0) {
            System.out.println("Error: No divida el numero entre 0.");
            return null;
        }
        resultado[0] = dividento / divisor;
        resultado[1] = dividento % divisor;
        return resultado;
    }

    public static int[] metodo2(int dividento, int divisor) {
        int[] resultado;
        try {
            resultado = new int[2];
            resultado[0] = dividento / divisor;
            resultado[1] = dividento % divisor;
            return resultado;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Este bloque es para capturar los errores por dividir entre cero.
            System.out.println("Error: No divida el numero entre 0.");
        } finally {
            System.out.println("Esto se ejecuta.");
            return null;
        }
    }

    public static Integer metodo3(int indice) {

        try {
            LinkedList<Integer> coleccion = new LinkedList();
            for (int i = 0; i < 100; i++) {
                Integer n = (int) (Math.random() * 100);
                coleccion.add(n);
            }
            return coleccion.get(indice);
        } catch (IndexOutOfBoundsException a) {
            System.out.println("El indice esta fuera del rango.");
            return null;
        }
    }
    
    // Realizar un metodo llamado lanzar, que reciba un entero, si el entero es 
    // mayor de 5 mostraremos la tabla de multiplicar de ese número. 
    // Si es 1 o 3 provocaremos una excepción mostrando el mensaje 
    // No quiero impares pequeños". Si es 2 o 4 mostraremos "Pares tampoco" 
    // y si es 0 lanzaremos una excepcion de tipo SQLException.
    public static void lanzar(int n) {
        int r, m = 0;
        try { 
            if (n == 0) {
                throw new SQLException("Error de tipo SQL");
            } else if (n == 1 || n == 3) {
                throw new Exception("No quiero impares pequeños");
            } else if (n == 2 || n == 4) {
                throw new Exception("Pares tampoco");
            } else {
                // Tabla de ultiplicar
                System.out.println("\nTabla del " + n);
                System.out.println("------------");
                for (m = 0; m < 10; m++) {
                    r = n * m;
                    System.out.println(n + " x " + m + " = " + r);
                }
            }
        }catch (SQLException ea){
            System.out.println(ea.getMessage());
        } catch (Exception ea) {
            System.out.println(ea.getMessage());
        }
    }
    
    public static void metodo6(char a){
        try {
            if (a=='0') { 
                throw new MiExcepcion(a);
            }
        } catch (MiExcepcion ea) {
            System.out.println(ea.getMessage());
        }
    }

    public static void main(String[] args) {
        metodo2(5, 0);
        metodo1(5, 0);
    }
}
