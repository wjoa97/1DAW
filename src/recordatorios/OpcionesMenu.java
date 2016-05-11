package recordatorios;

import java.util.Scanner;

public class OpcionesMenu {

    private Scanner t;
    private Archivador archivador;
    private Carpeta carpeta;
    private Apunte apunte;

    public void añadirCarpeta() {
        String nombre;
        boolean bool;
        System.out.println("Escriba el nombre de la carpeta:");
        do {
            nombre = t.nextLine();
            bool = archivador.añadirCarpeta(nombre);
            if (bool) {
                System.out.println("La carpeta se ha creado.");
            } else {
                System.out.println("La carpeta ya existe.");
            }
        } while (!bool);
    }

    public void carpetaDefecto() {

        String nombre;
        System.out.println("Escriba el nombre de la carpeta:");
        do {
            nombre = t.nextLine();
            this.carpeta = archivador.getCarpeta(nombre);
            if (carpeta == null) {
                System.out.println("La carpeta no existe");
            } else {
                System.out.println("Se ha establecido por defecto la carpeta" + this.carpeta.getNombre());
            }
        } while (carpeta == null);
    }

    public void añadirApunte() {
        String asunto, texto;
        boolean bool;
        System.out.println("Escriba el asunto de la nota que desea añadir.");
        do {
            asunto = t.nextLine();
            texto = t.nextLine();
            bool = carpeta.añadirApunte(asunto, texto);
            if (bool) {
                System.out.println("El apunte ha sido creado.");
            } else {
                System.out.println("El apunte ya existe.");
            }
        } while (!bool);
    }
    
    public void verApunte(){
        String asunto;
        System.out.println("Escriba el asunto de la nota que desea ver.");
        do {
            asunto = t.nextLine();
            apunte = carpeta.getApunte(asunto);
            if (apunte ==null) {
                System.out.println("El apunte no existe.");
            } else {
                System.out.println(apunte.toString());
            }
        } while (apunte==null);
    }

    public void borrarApunte() {
        String asunto;
        boolean bool;
        System.out.println("Escriba el asunto de la nota que desea borrar.");
        do {
            asunto = t.nextLine();
            bool = carpeta.borrarApunte(asunto);
            if (bool) {
                System.out.println("El apunte se ha borrado.");
            } else {
                System.out.println("El apunte no existe.");
            }
        } while (!bool);
    }

    public boolean salir() {
        return false;
    }
}
