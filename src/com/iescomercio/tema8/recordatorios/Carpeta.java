package com.iescomercio.tema8.recordatorios;

import java.util.ArrayList;
import java.util.Objects;

public class Carpeta {
    private String nombreCarpeta;
    private ArrayList <Apunte> coleccionNotas;
    private Apunte apunte;

    public Carpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        coleccionNotas = new ArrayList();
    }

    public void agregarNota(String nombre) {
        apunte = new Apunte();
        this.coleccionNotas.add(apunte);
    }

    public ArrayList<Apunte> getColeccionNotas() {
        return coleccionNotas;
    }

    public boolean borrarNota(String asunto) {
        Apunte aux = new Apunte(asunto);
        int aux2;
        aux2 = coleccionNotas.indexOf(aux);
        if (aux2==-1) {
            return false;
        } else {
            coleccionNotas.remove(aux2);
            return true;
        }
    }
    
    public Apunte verNota(String asunto) {
        Apunte aux = new Apunte(asunto);
        int aux2;
        aux2 = coleccionNotas.indexOf(aux);
        if (aux2==-1) {
            return null;
        } else {
            return coleccionNotas.get(aux2);
        }
    }
    
    public void modificarNota(String asuntoBuscar, String nuevoAsunto, String nuevoTexto){
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carpeta other = (Carpeta) obj;
        if (!Objects.equals(this.nombreCarpeta, other.nombreCarpeta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carpeta " + nombreCarpeta;
    }
}