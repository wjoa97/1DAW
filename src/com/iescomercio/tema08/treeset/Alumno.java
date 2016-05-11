package com.iescomercio.tema08.treeset;

public class Alumno implements Comparable {
    private int nExpediente;
    private String nombre, apellido;
    private int edad;
    private int nota;
    private long telefono;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }    
    
    public int getnExpediente() {
        return nExpediente;
    }

    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nExpediente=" + nExpediente + " nombre=" + nombre + ", nota=" + nota + ", telefono=" + telefono + '}';
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
        final Alumno other = (Alumno) obj;
        if (this.nExpediente != other.nExpediente) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) { // Yujuuuu he establecido el "orden natural" de Alumno
        int aux;
        Alumno alumno = (Alumno)o;
        
        aux = alumno.getnExpediente() - this.getnExpediente();
        return aux;        
    }
}