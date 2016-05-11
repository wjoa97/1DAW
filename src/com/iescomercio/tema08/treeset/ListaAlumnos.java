package com.iescomercio.tema08.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ListaAlumnos {
    private TreeSet lista;

    public ListaAlumnos() {
        lista = new TreeSet();
    }
    
    public boolean guardaAlumno(Alumno a) {
        if (!lista.add(a)) {
            System.out.println("Alumno " + a.toString() +" esta repetido");
            return false;
        }
        return true;        
    }
    
    public void muestraPorNumeroDeExpediente() {
        Iterator i = lista.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorNombre() {
        AlumnoOrdenadoPorNombre ordenNombre = new AlumnoOrdenadoPorNombre();
        TreeSet aux = new TreeSet(ordenNombre);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso de otro orden
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorNota() {
        AlumnoOrdenaPorNota ordenNota = new AlumnoOrdenaPorNota();
        TreeSet aux = new TreeSet(ordenNota);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorTelefono() {
        AlumnoOrdenaPorTelefono ordenTelefono = new AlumnoOrdenaPorTelefono();
        TreeSet aux = new TreeSet(ordenTelefono);
        aux.addAll(lista);
        
        Iterator i = aux.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }    
    
}