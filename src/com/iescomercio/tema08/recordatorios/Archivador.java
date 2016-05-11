package com.iescomercio.tema08.recordatorios;

import java.util.ArrayList;
import java.util.Iterator;

public class Archivador {

    private ArrayList<Carpeta> coleccionCarpetas;
    private Carpeta carpeta;

    public Archivador() {
        coleccionCarpetas = new ArrayList();
    }

    public void agregaCarpeta(String nombre) {
        Carpeta aux = new Carpeta(nombre);
        int aux2;
        aux2 = coleccionCarpetas.indexOf(aux);
        if (aux2 == -1) {
            carpeta = new Carpeta(nombre);
        this.coleccionCarpetas.add(carpeta);
        } else {
            System.out.println("La carpeta ya existe.");
        }
    }

    public void verCarpetas() {
        Iterator<Carpeta> nombreIterator = coleccionCarpetas.iterator();
        while (nombreIterator.hasNext()) {
            Carpeta elemento = nombreIterator.next();
            System.out.print(elemento + " / ");
        }
    }

    public void compruebaCarpeta() {
        Iterator<Carpeta> nombreIterator = coleccionCarpetas.iterator();
        while (nombreIterator.hasNext()) {
            Carpeta elemento = nombreIterator.next();
            System.out.print(elemento + " / ");
        }
    }

    public Carpeta getCarpeta(String nombre) {
        Carpeta aux = new Carpeta(nombre);
        int aux2;
        aux2 = coleccionCarpetas.indexOf(aux);
        if (aux2 == -1) {
            return null;
        } else {
            return coleccionCarpetas.get(aux2);
        }
    }
}
