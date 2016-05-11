package com.iescomercio.tema10.datastream;

import java.util.Objects;

public class Cliente {
    
    private int idCliente;
    private String nombre, dni, apellido1, apellido2, direccion;
    private long telefono;

    public Cliente() {
        this.idCliente = 0;
        this.nombre = "";
        this.dni = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.direccion = "";
        this.telefono = 0;
    }
    
    public Cliente(int idcliente, String nombre, String dni, String apellido1, String apellido2, String direccion, long telefono) {
        this.idCliente = idcliente;
        this.nombre = nombre;
        this.dni = dni;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdcliente() {
        return idCliente;
    }

    public void setIdcliente(int idcliente) {
        this.idCliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombre);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
}