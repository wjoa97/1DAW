package com.iescomercio.tema04.fraccion;

/**
 *
 * 
 */
public class RunFraccion {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2,4);
        Fraccion f2 = new Fraccion(3,2);
        Fraccion f3;
        
        
        f3 = f1.sumar(f2);
        f3.print();
        
        f3= f1.multiplicar(f2);
        f3.print();
        
        f3= f1.dividir(f2);
        f3.print();
        
        System.out.printf("El resultado es: %.2f ",f3.calculaReal());
        
        Fraccion f4 = new Fraccion (5,4);
        
        System.out.println("\n¿Son iguales? "+f4.compararFraccion(f3));
    }
}
