package com.iescomercio.tema5.alquilerdeamarres;

public class Cliente {
    
    private String nombre, dni;
    private long telefono;

    public Cliente(String nombre, String dni, long telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}    