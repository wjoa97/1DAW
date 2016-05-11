package com.iescomercio.tema06.tipos;

public class Conversion {
    
    public static Datos aPositivo(Datos a){
        
        if (!Comprobaciones.compruebaNumeroPositivoCero(a.getN1())||
                !Comprobaciones.compruebaNumeroPositivoCero(a.getN2())||
                !Comprobaciones.compruebaNumeroPositivoCero(a.getN3())) {
            System.out.println("Los números deben ser negativos");
            return null;
        }
        
        a.setN1(Math.abs(a.getN1()));
        a.setN2(Math.abs(a.getN2()));
        a.setN3(Math.abs(a.getN3()));
        
        return a;
    }
    
    public static void calculaMediaSuma(String a){
        
    }
}
