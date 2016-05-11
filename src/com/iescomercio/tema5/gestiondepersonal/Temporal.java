package com.iescomercio.tema5.gestiondepersonal;

import java.util.GregorianCalendar;

public class Temporal {
    private GregorianCalendar fechaAlta, fechaBaja;

    public Temporal(int dA, int mA, int aA, int dB, int mB, int aB) {
        fechaAlta = new GregorianCalendar(dA, mA, aA);
        fechaBaja = new GregorianCalendar(dB, mB, aB);
    }

    public GregorianCalendar getFechaAlta() {
        return fechaAlta;
    }

    public GregorianCalendar getFechaBaja() {
        return fechaBaja;
    }
    
    
}
