package com.iescomercio.tema04.cafetera;

/**
 *
 * 
 */
public class RunCafetera {
    public static void main(String[] args) {
        Cafetera oficinaCafetera = new Cafetera(5000, 3000);
        
        oficinaCafetera.servirTaza(250);
        
        System.out.println("Queda: "+ oficinaCafetera.getCantidadActual());
        
        oficinaCafetera.agregarCafe(200);
        
        System.out.println("Queda: "+ oficinaCafetera.getCantidadActual());
        
        Cafetera cafeteraGerardo = new Cafetera(1000, 600);
        
        cafeteraGerardo.setCantidadActual(1200);
        
        System.out.println("Queda: "+ cafeteraGerardo.getCantidadActual());
       

    }
}
