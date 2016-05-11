package com.iescomercio.tema5.interfaces.animales;

import java.util.Objects;

public abstract class  Animal {
    private String foto, tipo_comida, localizacion, tamaño;

    public Animal(String foto, String tipo_comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.tipo_comida = tipo_comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }
    
    public void dormir(){
        System.out.println("ZZZzzzzz");
    }
    
    public abstract String comer();
    
    public abstract String rugir();

    public String getFoto() {
        return foto;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    public String toString(){
        return "Animal "+localizacion+""+tamaño;
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.localizacion, other.localizacion)) {
            return false;
        }
        if (!Objects.equals(this.tamaño, other.tamaño)) {
            return false;
        }
        return true;
    }
}
