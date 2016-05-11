package com.iescomercio.tema10.datastream;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
        
        String nombre1 = o1.getNombre().toUpperCase();
        String nombre2 = o1.getNombre().toUpperCase();
        
        return  nombre1.compareTo(nombre2);
        
        // return  nombre2.compareTo(nombre1); //Descendente
    }
    
}
