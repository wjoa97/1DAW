package recordatorios;

import java.util.ArrayList;
import java.util.Objects;

class Carpeta implements Comparable {

    private ArrayList<Apunte> coleccionApuntes;
    private String nombre;

    public Carpeta(String nombre) {
        this.coleccionApuntes = new ArrayList<>();
        this.nombre = nombre;
    }

    public boolean añadirApunte(String asunto, String texto) {
        Apunte aux = new Apunte(asunto);
        int indice;
        indice = coleccionApuntes.indexOf(aux);
        if (indice == -1) {
            return false;
        } else {
            Apunte apunte = new Apunte(asunto, texto);
        coleccionApuntes.add(apunte);
            return true;
        }
    }

    public boolean borrarApunte(String asunto) {
        Apunte aux = new Apunte(asunto);
        return coleccionApuntes.remove(aux);
    }

    public String getNombre() {
        return nombre;
    }

    public Apunte getApunte(String asunto) {
        Apunte aux = new Apunte(asunto);
        int indice;
        indice = coleccionApuntes.indexOf(aux);
        if (indice == -1) {
            return null;
        } else {
            return coleccionApuntes.get(indice);
        }
    }

    public boolean modificarNota(String asunto, String nuevoAsunto, String nuevoTexto) {
        Apunte aux = new Apunte(asunto);
        int indice;
        indice = coleccionApuntes.indexOf(aux);
        if (indice == -1) {
            return false;
        } else {
            coleccionApuntes.get(indice).setAsunto(nuevoAsunto);
            coleccionApuntes.get(indice).setTexto(nuevoTexto);
            return true;
        }
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        Carpeta carpeta = (Carpeta)t;
        return carpeta.nombre.compareTo(this.nombre);
    }
}
