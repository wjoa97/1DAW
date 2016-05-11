package com.iescomercio.tema4.cuenta;

/**
 *
 * 
 */
public class RunCuenta {
    public static void main(String[] args) {
        
        // Cuenta cJulia=new Cuenta(700.0);
        
        Cuenta cJulia; // Declaración
        
        cJulia=new Cuenta(700.0); // Instanciación
        
        System.out.println("El saldo es: "+cJulia.dameSaldo());
        
        cJulia.reintegro(150.5);
        
        System.out.println("El saldo es: "+cJulia.dameSaldo());
        
        cJulia.ingresar(7000);
        
        System.out.println("El saldo es: "+cJulia.dameSaldo());
        
        cJulia.reintegro(8000);
    }
}
