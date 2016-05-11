package com.iescomercio.tema5.animales;

/**
 *
 * 
 */
public class RunAnimales {
    public static void main(String[] args) {
        Animal animal = new Lobo();
        animal.hacerRuido();
        animal.rugir();
        animal.comer();
        animal.dormir();
        
        Lobo lobo = new Lobo();
        
        // UpCastings
        Canino canino = lobo;
        Object animal2 = new Lobo();
//        animal2.comer();
        
        // DownCastings
        lobo = (Lobo)animal2;
        lobo.comer();
//        Lobo otroLobo = (Lobo)canino;
//        Lobo error = (Lobo) new Canino();
    }
}
