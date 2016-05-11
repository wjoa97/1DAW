package com.iescomercio.tema5.punto2d;

public class Punto {
    public int x, y;
    
    // Constructor completa
    public Punto (int pX, int pY){
        x=pX;
        y=pY;
    }
    // Sobrecarga
    public Punto (int pX){
        x=pX;
        y=1;
    }
    // Sobreescribir
    @Override
    public String toString (){
        return "("+x+","+y+")";
    }
    // Sobreescribe
    @Override
    public boolean equals(Object obj){
        
        Punto p = (Punto)obj; // Downcasting
        if(x==p.x&&y==p.y)
            return true;
        else
            return false;
    }
    // Sobrecargando
    public int equals(){
        if (x>y){
            return x;
        } else {
            return y;
        }
        
    }  
}
