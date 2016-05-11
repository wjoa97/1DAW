package com.iescomercio.tema4.garaje;

/**
 *
 * 
 */
public class Taller {
    private Coche coche;
    private String averia;
    private int cochesAtendidos;
    
    public Taller (){
        coche= null;
        averia = null;
        cochesAtendidos=0;
    }
    
    public boolean aceptarCoche (Coche nuevoCoche, String nuevaAveria){
        
        if (coche==null){
            coche=nuevoCoche;
            averia=nuevaAveria;
            if(averia=="Aceite."){
                coche.leerMotor().escribirAceite(coche.leerMotor().leerAceite()+10);
            }
            return true;
        }else{
            return false;
        }
    }
    
    public void devolverCoche (){
        cochesAtendidos++;
        coche= null;
        averia = null;
    }
    
    public String leerAveria(){
        return averia;
    }
}
