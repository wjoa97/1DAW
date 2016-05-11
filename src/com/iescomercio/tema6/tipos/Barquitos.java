package com.iescomercio.tema6.tipos;

/**
 *
 * 
 */
public class Barquitos {
    
    // Metodo que recibe tabla de 8x8  
    
    public void rellenaAgua(char[][] tabla, char c){
        
        for (char[] tabla1 : tabla) {
            for (int j = 0; j < tabla.length; j++) {
                tabla1[j] = c;
            }
        }
    }
    
    public void colocaBarcos(char [][] tabla, int nBarcos){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
//                tabla[i][j]=nBarcos;
            }
        }
    }

}
