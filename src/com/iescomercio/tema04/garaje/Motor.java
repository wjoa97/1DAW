package com.iescomercio.tema04.garaje;

/**
 *
 * 
 */
public class Motor {
    private int litrosAceite, cv;
    
    public Motor (int caballos){
        cv=caballos;
        litrosAceite=25;
    }
    
    public int leerCV(){
        return cv;
    }
    
    public int leerAceite(){
        return litrosAceite;
    }
    
    public void escribirCV(int nCv){
        cv=nCv;
    }
    
    public void escribirAceite(int nLitros){
        litrosAceite=nLitros;
    }
    
    
}
