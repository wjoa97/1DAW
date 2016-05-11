package com.iescomercio.tema06.figuras;

/**
 *
 *
 */
public class Cuadrado extends Figura {

    private double l;

    public Cuadrado(double l) {
        this.l = l;
    }

    public void calcularArea() {
        area = Math.pow(l, 2);
    }

    public void calcularPerimetro() {
        perimetro = 4 * l;
    }
}
