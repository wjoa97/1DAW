package com.iescomercio.tema05.alquilerdeamarres;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Un BARCO se caracteriza por su matrícula, su eslora en metros y año de
 * fabricación.
 */

public class Barco {

    private String matricula;
    private int eslora;
    private GregorianCalendar añoFabricacion;
    private double precioAmarre;

    public Barco(String matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = new GregorianCalendar(añoFabricacion, 12, 31);
        precioAmarre = 0.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion.get(Calendar.YEAR);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = new GregorianCalendar(añoFabricacion, 12, 31);
    }

    public void impuestoTipoBarco(double precioAmarre) {
        this.precioAmarre = this.precioAmarre + precioAmarre;
    }

    public double calculaPrecioAmarre() {
        precioAmarre = eslora * 10;
        return precioAmarre;
    }

    @Override
    public String toString() {
        return "***** Barco ******\n" + "Matrícula: " + matricula 
                + " | Metros de eslora: " + eslora 
                + "\nAño de fabricación: " + getAñoFabricacion();
    }

}
