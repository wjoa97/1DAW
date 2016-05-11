package recordatorios;

import java.util.ArrayList;
import java.util.Iterator;

public class Archivador {

    private ArrayList<Carpeta> coleccionCarpetas;

    public Archivador() {
        this.coleccionCarpetas = new ArrayList<>();
    }

    public boolean añadirCarpeta(String nombreCarpeta) {
        Carpeta carpeta = new Carpeta(nombreCarpeta);
        if (coleccionCarpetas.contains(carpeta)) {
            coleccionCarpetas.add(carpeta);
            return true;
        } else {
            return false;
        }
    }

    public Carpeta getCarpeta(String asunto) {
        Carpeta aux = new Carpeta(asunto);
        int indice;
        indice = coleccionCarpetas.indexOf(aux);
        if (indice == -1) {
            return null;
        } else {
            return coleccionCarpetas.get(indice);
        }
    }

    public void mostrarCarpetas() {
        Iterator<Carpeta> iterator = coleccionCarpetas.iterator();
        while (iterator.hasNext()) {
            Carpeta carpeta = iterator.next();
            System.out.println(carpeta + " / ");
        }
    }
}
