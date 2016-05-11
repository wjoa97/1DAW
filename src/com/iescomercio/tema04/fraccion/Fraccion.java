package com.iescomercio.tema04.fraccion;

/**
 *
 *
 */
public class Fraccion {

    private int numerador, denominador;

    public Fraccion() {
        numerador = 0;
        denominador = 0;
    }

    public Fraccion(int num, int den) {
        numerador = num;
        denominador = den;
    }

    // Setter
    public void cambiarNumerador(int nNumerador) {
        numerador = nNumerador;
    }

    public void cambiarDenominador(int nDenominador) {
        denominador = nDenominador;
    }

    // Getter
    public int dameNumerador() {
        return numerador;
    }

    public int dameDenominador() {
        return denominador;
    }

    // Metodo suma
    public Fraccion sumar(Fraccion f) {

        Fraccion aux = new Fraccion();
        int n = 0, d = 0;

        if (denominador == f.denominador) {
            n = numerador + f.numerador; // Sumas homogeneas
            d = denominador;
        } else {
            n = numerador * f.dameDenominador() + denominador * f.dameNumerador();
            d = denominador * f.dameDenominador(); // Sumas heterogeneas
        }
        aux.cambiarNumerador(n);
        aux.cambiarDenominador(d);

        return aux;
    }

    // Metado resta
    public Fraccion restar(Fraccion f) {

        Fraccion aux = new Fraccion();
        int n = 0, d = 0;

        if (denominador == f.denominador) {
            n = numerador - f.numerador;  // Restas homogeneas
            d = denominador;
        } else {
            n = numerador * f.dameDenominador() - denominador * f.dameNumerador();
            d = denominador * f.dameDenominador(); // Restas heterogeneas
        }
        aux.cambiarNumerador(n);
        aux.cambiarDenominador(d);

        return aux;
    }

    // Metodo de multiplicación
    public Fraccion multiplicar(Fraccion f) {

        Fraccion aux = new Fraccion();
        int n = 0, d = 0;

        n = numerador * f.dameNumerador();
        d = denominador * f.dameDenominador();

        aux.cambiarNumerador(n);
        aux.cambiarDenominador(d);

        return aux;
    }

    public Fraccion dividir(Fraccion f) {

        Fraccion aux = new Fraccion();
        int n = 0, d = 0;

        n = numerador * f.dameDenominador();
        d = denominador * f.dameNumerador();

        aux.cambiarNumerador(n);
        aux.cambiarDenominador(d);

        return aux;
    }

    // Metodo Comparación
    public boolean compararFraccion(Fraccion f) {
        double f1, f2;
        f1 = (double) numerador / denominador;
        f2 = (double) f.dameNumerador() / f.dameDenominador();

        boolean comp = f1 == f2;

        return comp;
    }
    
    // Metodo fraccional
    
    public Fraccion copia(){
        Fraccion aux= new Fraccion(numerador, numerador);
        return aux;
    }
    
    // Metodo setFraccion
    
    public void cambiarFraccion(int nNumerador, int nDenominador){
        numerador=nNumerador;
        denominador=nDenominador;
    }

    // Metodo calcula número real
    
    public double calculaReal() {

        double real;

        real = (double) numerador / denominador;

        return real;
    }

    // Metodo Print
    
    public void print() {
        System.out.println(numerador);
        System.out.println("----");
        System.out.println(denominador);

    }
}
