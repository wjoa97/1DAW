package recordatorios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Apunte implements Comparable{
    private String asunto, texto;
    private GregorianCalendar fecha;

    public Apunte(String asunto, String texto) {
        this.asunto = asunto;
        this.texto = texto;
        this.fecha = new GregorianCalendar();
    }

    public Apunte(String asunto) {
        this.asunto = asunto;
        this.texto = "";
        this.fecha = new GregorianCalendar();
    }
    
    public void setAsunto(String nuevoAsunto) {
        this.asunto = nuevoAsunto;
    }

    public void setTexto(String nuevoTexto) {
        this.texto = nuevoTexto;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }
    
    public String formatearFecha(){
        StringBuilder fecha = new StringBuilder();
        fecha.append(this.fecha.get(Calendar.DAY_OF_MONTH));
        fecha.append("/");
        fecha.append(this.fecha.get(Calendar.MONTH));
        fecha.append("/");
        fecha.append(this.fecha.get(Calendar.YEAR));
        return fecha.toString();
    }

    @Override
    public String toString() {
        return "Apunte{" + "asunto=" + asunto + ", texto=" + texto + ", fecha=" + formatearFecha() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        Apunte apunte = (Apunte)t;
        
        return apunte.fecha.compareTo(this.fecha);  
    }
}
