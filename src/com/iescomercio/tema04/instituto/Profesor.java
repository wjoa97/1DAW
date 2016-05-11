package com.iescomercio.tema04.instituto;

/**
 *
 * 
 */
public class Profesor {
    public void ponerNotas(Alumno a){
        NumAleatorio nota= new NumAleatorio(0, 9);
        a.getAsi1().setCalificacion(nota.muestraAleatorio()+Math.random());
        a.getAsi2().setCalificacion(nota.muestraAleatorio()+Math.random());
        a.getAsi3().setCalificacion(nota.muestraAleatorio()+Math.random());
    }
    public double calcularMedia(Alumno a){
        double aux;
        aux=(a.getAsi1().getCalificacion()
            +a.getAsi2().getCalificacion()
            +a.getAsi3().getCalificacion())/3;
        return aux;
    }
}
