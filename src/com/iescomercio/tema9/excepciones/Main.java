package com.iescomercio.tema9.excepciones;

/**
 *
 * 
 */
public class Main {
    public static void main(String[] args) {
        ControlDeErrores.lanzar(6);
        ControlDeErrores.lanzar(4);
        ControlDeErrores.lanzar(3);
        ControlDeErrores.lanzar(0);
        
        ControlDeErrores.metodo6('0');
    }
}
