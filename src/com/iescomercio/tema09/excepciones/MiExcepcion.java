package com.iescomercio.tema9.excepciones;

/**
 *
 * 
 */
public class MiExcepcion extends Exception {

    public MiExcepcion(char a) {
        super("El caracter "+a+" no es valido.");
    }
}
