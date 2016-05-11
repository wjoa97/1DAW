package com.iescomercio.tema3;

/**
 * 7.	Realizar un programa en Java que calcula y muestra por pantalla el
 * resultado de la serie: 2*4*8*16...1024 salvo el número 128 y 512
 */
public class SerieAlCuadradoDo {

    public static void main(String[] args) {
        int n = 0, contador = 1;
        long acumulador = 1;

        do {
            n = (int) Math.pow(2, contador);
            if (n != 128 && n != 512) {
                acumulador = acumulador * n;
            }
            contador++;
        } while (n < 1024);
        {
            System.out.println("El resultado es: " + acumulador);
        }
    }
}
