package com.iescomercio.tema08.treeset;

import java.util.Comparator;

public class AlumnoOrdenaPorTelefono implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;        
        int aux;
        
        aux = (int) (a2.getTelefono()-a1.getTelefono());
        return aux;    
    }
}
