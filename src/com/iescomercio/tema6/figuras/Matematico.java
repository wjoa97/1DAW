package com.iescomercio.tema6.figuras;

/**
 *
 *
 */
public class Matematico {

    public double averiguaPerimetro(Figura figura) {
        figura.calcularPerimetro();

        return figura.perimetro;
    }

    public double averiguaArea(Figura figura) {
        figura.calcularArea();

        return figura.area;
    }
}
