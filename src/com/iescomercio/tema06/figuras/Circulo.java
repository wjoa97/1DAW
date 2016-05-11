package com.iescomercio.tema06.figuras;

/**
 *
 *
 */
public class Circulo extends Figura {

    private double r;

    public Circulo(double r) {
        this.r = r;
    }

    public void calcularArea() {
        area = Math.PI * Math.pow(r, 2);
    }

    public void calcularPerimetro() {
        perimetro = (r * 2) * Math.PI;
    }
}
