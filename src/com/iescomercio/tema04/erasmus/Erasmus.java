package com.iescomercio.tema04.erasmus;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class Erasmus {

    public static void main(String[] args) {
        int paises, alumnos, aux;
        String resultado = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Pasame el numero de paises");
            paises = sc.nextInt();
            aux = 0;
            for (int i = 0; i < paises; i++) {
                System.out.println("Pasame el numero de alumnos");
                alumnos = sc.nextInt();
                if (aux <= alumnos) {
                    aux = alumnos;
                }
            }
            resultado = "Combinaciones: " + (int) Math.pow(aux, paises) + "\n" + resultado;
        } while (paises != 0);
        System.out.println(resultado);
    }
}
