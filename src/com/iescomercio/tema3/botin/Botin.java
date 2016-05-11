package com.iescomercio.tema3.botin;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class Botin {

    public static void main(String[] args) {
        int billetes, j = 1, i=1, participantes, valor = 0, p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0, p7 = 0, p8 = 0, p9 = 0, p10 = 0;

        String t1 = "", t2 = "", t3 = "", t4 = "", t5 = "", t6 = "", t7 = "", t8 = "", t9 = "", t10 = "";

        Scanner t = new Scanner(System.in);

        System.out.println("¿Cúantos billetes?");
        billetes = t.nextInt();

        System.out.println("¿Cúantos participaron?");
        participantes = t.nextInt();

        System.out.println("Introduzca el valor de los billetes: ");
        do {
            for (; j <= participantes&&i!=billetes+1; j++) {
                valor = t.nextInt();
                if (j == 1) {
                    p1 += valor;
                    t1 += valor + "|";
                    i++;
                } else if (j == 2) {
                    p2 += valor;
                    t2 += valor + "|";
                    i++;
                } else if (j == 3) {
                    p3 += valor;
                    t3 += valor + "|";
                    i++;
                } else if (j == 4) {
                    p4 += valor;
                    t4 += valor + "|";
                    i++;
                } else if (j == 5) {
                    p5 += valor;
                    t5 += valor + "|";
                    i++;
                } else if (j == 6) {
                    p6 += valor;
                    t6 += valor + "|";
                    i++;
                } else if (j == 7) {
                    p7 += valor;
                    t7 += valor + "|";
                    i++;
                } else if (j == 8) {
                    p8 += valor;
                    t8 += valor + "|";
                    i++;
                } else if (j == 9) {
                    p9 += valor;
                    t9 += valor + "|";
                    i++;
                } else if (j==10) {
                    p10 += valor;
                    t10 += valor + "|";
                    i++;
                }
            }
            if (j == participantes+1) {
                    j = 1;  
                }
        } while (i <= billetes);
        System.out.println("----------------");
        System.out.println("1- " + p1 + ": " + t1);
        System.out.println("2- " + p2 + ": " + t2);
        System.out.println("3- " + p3 + ": " + t3);
        System.out.println("4- " + p4 + ": " + t4);
        System.out.println("5- " + p5 + ": " + t5);
        System.out.println("6- " + p6 + ": " + t6);
        System.out.println("7- " + p7 + ": " + t7);
        System.out.println("8- " + p8 + ": " + t8);
        System.out.println("9- " + p9 + ": " + t9);
        System.out.println("10- " + p10 + ": " + t10);

    }
}
