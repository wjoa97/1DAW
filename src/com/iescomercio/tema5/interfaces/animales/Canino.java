package com.iescomercio.tema5.interfaces.animales;

public abstract class Canino extends Animal{

    public Canino(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }
    
    public abstract boolean hacerRuido();
}
