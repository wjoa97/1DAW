/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema03;

/**
 *
 * @author VESPERTINO
 */
public class VariablesTest1 
{
    static boolean unBoolean;
    static byte unByte;
    static short unShort;
    static int unInt;
    static long unLong;
    static float unFloat;
    static double unDouble;
    static char unChar;
    static String unString;
    static char unicode='\u0416';
    
    public static void main(String[] args) 
    {
        System.out.println("Averigua cuál es el valor por defecto que toman los datos primitivos vistos en clase. \n");
        System.out.println("El boolean vale: "+unBoolean);
        System.out.println("El byte vale: "+unByte);
        System.out.println("El short vale: "+unShort);
        System.out.println("El int vale: "+unInt);
        System.out.println("El long vale: "+unLong);
        System.out.println("El float vale: "+unFloat);
        System.out.println("El double vale: "+unDouble);
        System.out.println("El char vale: "+unChar);
        System.out.println("El String vale: "+unString);
        System.out.println();
        System.out.println("El caracter unicode es: "+unicode);
    }
}
