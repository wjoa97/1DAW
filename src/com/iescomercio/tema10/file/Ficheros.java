package com.iescomercio.tema10.file;

import java.io.File;

public class Ficheros {
    
    private File fichero;
    
    public void recibeFichero(String path){
        fichero = new File(path);
        System.out.println(fichero.getName());
        System.out.println(fichero.getPath());
        System.out.println(fichero.getTotalSpace());
    }
    
    public static void main(String[] args) {
        Ficheros f = new Ficheros();
        f.recibeFichero("E:/ejecutable.exe");
    }
}
