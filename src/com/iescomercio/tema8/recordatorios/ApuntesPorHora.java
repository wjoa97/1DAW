package com.iescomercio.tema8.recordatorios;

import java.util.Calendar;
import java.util.Comparator;

public class ApuntesPorHora implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Apunte a1 = (Apunte)o1;
        Apunte a2 = (Apunte)o2;
        
        int aux;
        aux=a2.getFechaHora().get(Calendar.HOUR_OF_DAY)-
                a1.getFechaHora().get(Calendar.HOUR_OF_DAY);
        // http://lineadecodigo.com/java/obtener-la-hora-en-java/
        return aux;
    }
}