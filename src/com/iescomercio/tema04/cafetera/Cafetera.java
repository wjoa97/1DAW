package com.iescomercio.tema04.cafetera;

/**
 *
 *
 */
public class Cafetera {

    private int capacidadMax, cantidadActual;

    public Cafetera() {
        capacidadMax = 100;
        cantidadActual = 0;
    }

    public Cafetera(int aCapacidadMax) {
        aCapacidadMax = capacidadMax;
        cantidadActual=aCapacidadMax;
    }

    public Cafetera(int aCantidadActual, int aCapacidadMax) {
        if (aCantidadActual > aCapacidadMax) {
            cantidadActual = aCapacidadMax;
            capacidadMax = aCapacidadMax;
        } else {
            cantidadActual = aCantidadActual;
            capacidadMax = aCapacidadMax;
        }
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int nCantidadActual) {
       
        if (nCantidadActual > capacidadMax) {
            cantidadActual = capacidadMax;
        } else {
            cantidadActual = nCantidadActual;
        }
    }

    public void setCapacidadMaxima(int nCapacidadMax) {
        capacidadMax = nCapacidadMax;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMax;
    }

    public void servirTaza(int capacidadTaza) {
        if (capacidadTaza > cantidadActual) {
            cantidadActual = 0;
        } else {
            cantidadActual = cantidadActual - capacidadTaza;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidadCafe) {

        if (cantidadCafe > capacidadMax) {
            cantidadActual = cantidadActual + cantidadCafe;
        }
    }

}
