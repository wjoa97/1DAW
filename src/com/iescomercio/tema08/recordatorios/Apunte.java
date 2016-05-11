package com.iescomercio.tema08.recordatorios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Apunte implements Comparable {

    private String Asunto, texto;
    private Calendar fechaHora;

    public Apunte(String asunto, String texto) {
        this.Asunto = asunto;
        this.texto = texto;
        this.fechaHora = new GregorianCalendar();
    }
    
     public Apunte(String asunto) {
        this.Asunto = asunto;
        this.fechaHora = new GregorianCalendar();
    }   

    public Apunte() {
        this.Asunto = "";
        this.texto = "";
        this.fechaHora = new GregorianCalendar();
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apunte other = (Apunte) obj;
        if (!Objects.equals(this.Asunto, other.Asunto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nota: " + "/nAsunto - " + Asunto + "/nTexto" + texto + "/nFechaHora=" + fechaHora;
    }

    @Override
    public int compareTo(Object o) { // "orden natural"
        int aux;
        Apunte nota = (Apunte) o;

        aux = nota.fechaHora.compareTo(this.fechaHora);
        return aux;
    }
}