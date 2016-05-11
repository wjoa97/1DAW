package com.iescomercio.tema04.garaje;

import com.iescomercio.tema04.instituto.NumAleatorio;

/**
 *
 * 
 */
public class Coche {
    private String marca, modelo;
    private double precioAcumulado;
    private Motor motor;
    
    public Coche (String aMarca, String aModelo){
        marca=aMarca;
        modelo=aModelo;
        motor=new Motor(150);
        precioAcumulado=0.0;
    }
    
    public Motor leerMotor (){
        return motor;
    }
    
    public String leerMarca (){
        return marca;
    }
    
    public String leerModelo (){
        return modelo;
    }
        
    public double leerPrecioAcumulado (){
        return precioAcumulado;
    }
    
    public void escribirMarca (String nMarca){
        marca=nMarca;
    }
    
    public void escribirMotor (Motor nMotor){
        motor=nMotor;
    }
    
    public void escribirModelo (String nModelo){
        modelo=nModelo;
    }
    public void escribirPrecio (double nPrecio){
        precioAcumulado=nPrecio;
    }
    
    public void acumularAveria (){ // Hacer con clase aleatorio
        
        NumAleatorio precioReparacion= new NumAleatorio(50, 350);
        
        precioAcumulado=precioAcumulado+precioReparacion.muestraAleatorio();
        
    }
}
