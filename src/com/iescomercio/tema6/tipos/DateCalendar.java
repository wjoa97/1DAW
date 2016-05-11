package com.iescomercio.tema6.tipos;

import java.text.NumberFormat;

/**
 * Hacer un formata personalizado para SimpleDateFormat
 * Logroño a 29 de Enero de 2016 
 */
public class DateCalendar {
    public static void main(String[] args) {
//        GregorianCalendar fechaActual = new GregorianCalendar();
//        
//        SimpleDateFormat formatoHora = new SimpleDateFormat("'Son las 'HH 'horas y 'mm' minutos y' ss 'segundos'");
//        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE' a 'dd' de' MMMM' de 'yyyy");
//        
//        
//        System.out.println(formatoFecha.format(fechaActual));
//        System.out.println(formatoHora.format(fechaActual));
        
        NumberFormat formateador = NumberFormat.getCurrencyInstance();
        
        System.out.println(formateador.format(827456.37));
    }
}
