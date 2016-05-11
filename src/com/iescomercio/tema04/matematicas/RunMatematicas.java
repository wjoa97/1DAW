package com.iescomercio.tema04.matematicas;

/**
 *
 * @author Gerardo
 */
public class RunMatematicas {
    public static void main(String[] args) {
        Mates numero=new Mates(10);
        
        System.out.println(numero.esPerfecto());
        System.out.println(numero.esPrimo());
        
        numero.listaPerfectos();
        System.out.println("");
        numero.listaPrimos();
        System.out.println("");
        System.out.println(numero.sumaCifras());
        System.out.println(numero.numDivisores());
        System.out.println(numero.base2());
    }
}
