package com.iescomercio.tema5.punto2d;

/**
 *
 * 
 */
public class RunPunto {
    public static void main(String[] args) {
        
        Punto punto1= new Punto(2, 6);
        Punto punto2= new Punto(3, 3);
        
        System.out.println("Punto 1: "+punto1);
        System.out.println("Punto 2: "+punto2.toString());
        System.out.println("-----------------------");
        System.out.println("¿Son iguales?");
        if(punto1.equals(punto2))
            System.out.println("Si, son iguales.");
        else
            System.out.println("No, no son iguales.");
        System.out.println("--------------------------");
        System.out.println("La coordenada mayor de Punto1 es: "+punto1.equals());
        System.out.println("La coordenada mayor de Punto2 es: "+punto2.equals());
    }
}
