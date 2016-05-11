package com.iescomercio.tema04.alumno;

/**
 *
 * 
 */
public class Alumnos {
    
    // Atributos
    
    private long expediente;
    private String nombre, apellido;
    private int edad;
    
    // Constructores
    
    public Alumnos (){ // Constructor por defecto
    }
    public Alumnos (long aExpediente, String aNombre, String aApellido, int aEdad){
        expediente=aExpediente;
        nombre=aNombre;
        apellido=aApellido;
        edad=aEdad;
    } // Constructor completo

    // Metodos mutadores (Setter)
    
    public void sExpediente(long pExpediente){
        expediente=pExpediente;
    }
    public void sNombre(String pNombre){
        nombre=pNombre;
    }
    public void sApellido(String pApellido){
        apellido=pApellido;
    }
    public void sEdad(int pEdad){
        edad=pEdad;
    }
    
    // Metodos Accesores (Getter)
    
    public long dExpediente (){
        return expediente;
    }
    public String dNombre (){
        return nombre;
    }
    public String dApellido (){
        return apellido;
    }
    public int dEdad (){
        return edad;
    }
}
