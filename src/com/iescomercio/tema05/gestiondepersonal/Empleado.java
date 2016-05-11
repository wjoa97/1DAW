package com.iescomercio.tema05.gestiondepersonal;

public class Empleado {
    private String nif, nombre, edad;

    public Empleado(String nif, String nombre, String edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return "**Empleado**"+"NIF: "+nif;
    }
    
    public double calculaSueldo(){
        return 580.00;
    }
}
