package com.iescomercio.tema3;

import java.util.Scanner;

public class HorasMinutosSegundos {

    public static void main(String[] args) {
        byte hora, minuto, segundo;
        Scanner t = new Scanner(System.in);

        System.out.println("Introduzca la hora:");
        hora = t.nextByte();
        System.out.println("Introduzca los minutos:");
        minuto = t.nextByte();
        System.out.println("Introduzca los segundos:");
        segundo = t.nextByte();

        if (segundo == 59) {
            minuto++;
            segundo = 0;
            if (minuto == 60) {
                hora++;
                minuto = 0;
                if (hora == 24) {
                    hora = 0;
                }
            }
        } else{
            segundo++;
        }
        System.out.printf("\n%dH:%dM:%dS \n", hora, minuto, segundo);
    }
}
