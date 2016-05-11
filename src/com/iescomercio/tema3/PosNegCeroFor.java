/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class PosNegCeroFor {

    public static void main(String[] args) {
        int num, pos = 0, neg = 0, cero = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            num = teclado.nextInt();
//            if (num != 0) {
//                if (num > 0) {
//                    pos++;
//                } else {
//                    neg++;
//                }
//            } else {
//                cero++;
//            }
            if (num == 0) {
                cero++;
            }else if (num > 0) {
                pos++;
             
            } else {
                neg++;  
            }
        }

        System.out.printf("Hay %d positivos, %d negativos y %d ceros.", pos, neg, cero);
    }
}
