package com.iescomercio.tema4.cuenta;

/**
 *
 *
 */
public class Cuenta {
    
    // Atributos

    double saldo;

    // Constructores
    
    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(double x) {
        saldo = x;
    }

    // Metodos
    
    public void ingresar(double pasta) {
        saldo = saldo + pasta;
    }

    public boolean reintegro(double pastaSacar) {
        if (saldo >= pastaSacar) {
            saldo = saldo - pastaSacar;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
    
    public double dameSaldo (){
        return saldo;
    }
}
