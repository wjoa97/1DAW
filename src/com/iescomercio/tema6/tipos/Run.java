package com.iescomercio.tema6.tipos;

public class Run {
    public static void main(String[] args) {
        
        Datos numeros = new Datos(-5, -8, -45);
        
        System.out.println(numeros.getN1()+", "+numeros.getN2()+" y "+numeros.getN3());
        Conversion.aPositivo(numeros);
        System.out.println(numeros.getN1()+", "+numeros.getN2()+" y "+numeros.getN3());
        
        
        
        System.out.println(Utilidades.cuentaFrases("La vaca esta comiendo hierba. El perro est escondiendo un hueso."));
        
        
    }
}
