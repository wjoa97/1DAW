package com.iescomercio.tema06.figuras;

/**
 *
 *
 */
public class Triangulo extends Figura {

    private double b, h;

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public void calcularArea() {
        area = (b * h) / 2;
    }

    public void calcularPerimetro() {
        perimetro = b * 3;
    }
}
