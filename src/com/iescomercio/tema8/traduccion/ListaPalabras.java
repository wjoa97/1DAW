package com.iescomercio.tema8.traduccion;

import java.util.HashMap;

/**
 *
 * 
 */
public class ListaPalabras {
    private HashMap<String, Palabras> lista;

    public ListaPalabras() {
        this.lista = new HashMap<>();
    }

    public void añadir(String clave, Palabras p1) {
        lista.put(clave, p1);
    }
    
    
}
