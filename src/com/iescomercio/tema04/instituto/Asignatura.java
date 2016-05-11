package com.iescomercio.tema04.instituto;

/**
 *
 *
 */
public class Asignatura {

    private int idAsignatura;
    private double calificacion;

    public Asignatura(int aIdAsignatura) {
        idAsignatura = aIdAsignatura;
        calificacion = 0.0;
    }
    
    public int getIdAsignatura() {
        return idAsignatura;
    }
    public double getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(double nCalificacion){
        calificacion=nCalificacion;
    }
}
