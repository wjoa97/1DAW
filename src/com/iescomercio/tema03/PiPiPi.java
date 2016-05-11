package com.iescomercio.tema03;

import java.util.Scanner;

public class PiPiPi {

    public static void main(String[] args) {

        int hora = 0, minuto = 0, segundo = 0;
        int dia, emisoras, diaEmisora, resultado;
        Scanner t = new Scanner(System.in);

        System.out.println("Introduzca los días:");
        dia = t.nextInt();
        System.out.println("Introduzca el nº de emisoras:");
        emisoras = t.nextInt();

        diaEmisora = dia * emisoras;

        resultado = diaEmisora * 144;

        dia = resultado / 86400;

        hora = resultado / 3600;

        minuto = (resultado - (3600 * hora)) / 60;

        segundo = resultado - ((hora * 3600) + (minuto * 60));

        if (segundo == 60) {
            segundo = 0;
        } else if (minuto == 60) {
            minuto = 0;
        } else if (hora == 24) {
            hora = 0;
        }
        
        if(segundo<10){
            if(minuto<10){
                if(hora<10){
                    System.out.printf("\n%d:0%d:0%d:0%d \n", dia, hora, minuto, segundo);
                }else{
                    System.out.printf("\n%d:%d:0%d:0%d \n", dia, hora, minuto, segundo);
                }
            } else {
                if(hora<10){
                    System.out.printf("\n%d:0%d:%d:0%d \n", dia, hora, minuto, segundo);
                }else{
                    System.out.printf("\n%d:%d:%d:0%d \n", dia, hora, minuto, segundo);
                }
            }
        } else {
            if(minuto<10){
                if(hora<10){
                    System.out.printf("\n%d:0%d:0%d:%d \n", dia, hora, minuto, segundo);
                }else{
                    System.out.printf("\n%d:%d:0%d:%d \n", dia, hora, minuto, segundo);
                }
            } else {
                if(hora<10){
                    System.out.printf("\n%d:0%d:%d:%d \n", dia, hora, minuto, segundo);
                }else{
                    System.out.printf("\n%d:%d:%d:%d \n", dia, hora, minuto, segundo);
                }
            }
        }
    }
}
