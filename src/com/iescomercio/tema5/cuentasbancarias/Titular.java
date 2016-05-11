package com.iescomercio.tema5.cuentasbancarias;

/**
 *
 * 
 */
public class Titular {
    private String nombre, apellidos;
    private int edad;
    
    public Titular (String aNombre, String aApellidos, int aEdad){
        nombre=aNombre;
        apellidos= aApellidos;
        edad=aEdad;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nNombre){
        nombre=nNombre;
    }
    public void setApellidos(String nApellidos){
        apellidos=nApellidos;
    }
    public void setEdad(int nEdad){
        edad=nEdad;
    }
    
    public String toString(){
        return nombre+" "+apellidos+" "+edad;
    }
}
