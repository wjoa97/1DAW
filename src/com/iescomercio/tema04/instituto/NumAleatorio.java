package com.iescomercio.tema04.instituto;

/**
 * Crear una clase llamada Aleatorios
 * 
 * Propiedades inicial y final de tipo entero
 * 
 * Constructor que pase el inicial [10] y final [25]
 * 
 * Metodo muestraAleatrorios que reciba un entero N indicando la cantidad de 
 * números y calcule y muestre N numeros entre [inicial y final]
 * 
 */
public class NumAleatorio {
    
    private int i, f;
    
    public NumAleatorio(int inicio, int fin){
        i=inicio;
        f=fin;
    }
    
    public int muestraAleatorio () {
        
        int numero = (int)Math.floor(Math.random()*(f-i+1)+i);

        // int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);
        return numero;
    }
    
    public void muestraAleatorios (int vueltas) {
        
        for (int c=0; c < vueltas; c++) {
            
            int numero = (int)Math.floor(Math.random()*(f-i+1)+i);
            
            // int num=(int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);
            
            System.out.print(numero+"|");
        }
    }
    
}
