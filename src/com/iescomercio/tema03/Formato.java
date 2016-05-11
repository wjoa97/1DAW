/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema03;

/**
 * Realizar programa que declare una variable de termino entero, inicializada
 * con el número 878953 y que muestre en pantalla ese número en hexadecimal,
 * decimal y octal.
 *
 * Sacar nombre, edad y sueldo.
 */
public class Formato {

    public static void main(String[] args) {
        int numero = 878953;
        String n = "Pepe";
        byte e = 27;
        float s = (float) 1240.5;

        System.out.printf(
                "Decimal: %d Octal: %o Hexadeciaml: %h", numero, numero, numero);
        System.out.printf(
                "\nNombre: %s Edad: %d Sueldo: %.2f", n, e, s);
    }
}
