package com.iescomercio.tema8.traduccion;

import java.util.Scanner;

/**
 *
 *
 */
public class Vista {

    Scanner t = new Scanner(System.in);

    public void juego(ListaPalabras lp) {
        String ingles, frances;
        
        System.out.println("La palabra se dicen en: ");
        System.out.println("Ingles: ");
        ingles = t.nextLine();
        System.out.println("Frances: ");
        frances = t.nextLine();
    }
}
