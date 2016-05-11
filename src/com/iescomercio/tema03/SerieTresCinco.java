package com.iescomercio.tema03;

/**
 * Resultado de las dos series:
 * 6*9*12...60
 * 5+50+500...500000
 */
public class SerieTresCinco {

    public static void main(String[] args) {
        long contador = 6, acumulador2 = 0;
        double acumulador = 1;

        System.out.print("Serie 1:\t");
        while (contador <= 60) {
            System.out.print(contador + "\t");
            acumulador = acumulador * contador;
            contador = contador + 3;
        }

        System.out.println("\n\nEl resultado es: " + acumulador);
        contador = 5;
        System.out.println("");

        System.out.print("Serie 2: \t");

        do {
            System.out.print(contador + "\t");
            acumulador2 = acumulador2 + contador;
            contador = contador * 10;
        } while (contador < 5000000);
        {
            System.out.println("\n\nEl resultado es: " + acumulador2);
        }
    }
}
