package com.iescomercio.tema08.menu;

import com.iescomercio.tema08.recordatorios.Apunte;
import com.iescomercio.tema08.recordatorios.Archivador;
import com.iescomercio.tema08.recordatorios.Carpeta;
import java.util.Scanner;

public class OpcionesMenu {
    private Scanner t;
    private Archivador archivador;
    private Carpeta carpeta;
    private Apunte apunte;
    

    public OpcionesMenu() {
        t = new Scanner(System.in);
        archivador = new Archivador();
    }
    public void añadirCarpeta() {
        System.out.println("Escriba el nombre de la carpeta:");
        archivador.agregaCarpeta(t.nextLine());
    }
    public void carpetaPredeterminada(){
        archivador.verCarpetas();
        System.out.println("/nEscriba el nombre de la carpeta:");
        this.carpeta = archivador.getCarpeta(t.nextLine());
    }
    public void añadirApunte() {
        System.out.println("Escriba el nombre del apunte:");
        this.carpeta.agregarNota(t.nextLine());
    }
    public void borrarApunte() {
        System.out.println("Escriba el asunto de la nota que quiere borrar:");
        carpeta.borrarNota(t.nextLine());
    }
    public void verApunte() {
        System.out.println("Escriba el asunto de la nota que quiere ver:");
        this.apunte=carpeta.verNota(t.nextLine());
        this.apunte.toString();
    }
    public void modificarApunte() {
        System.out.println("Escriba el nombre la carpeta de la que desea ver el asunto");
        this.carpeta = archivador.getCarpeta(t.nextLine());
        System.out.println("Escriba el asunto de la nota que quiere modificar:");
//        carpeta.modificarNota(null, null, null);
    }
    public void ordenarHora() {
        
    }
    public boolean salir() {
        return false;
    }
}