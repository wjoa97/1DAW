package com.iescomercio.tema9.excepciones;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class ProvocandoError {

    public ProvocandoError(File aFile) {
        try {
            if (aFile == null) {

                throw new IOException("No existe el fichero.");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
