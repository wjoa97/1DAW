package com.iescomercio.tema5.interfaces.animales;

/**
 *
 * 
 */
public class Perro extends Canino implements Mascota{

    public Perro(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }
    
    public String comer(){
        return "Soy un perro y estoy comiendo "+super.getTipo_comida();
    }
    
    public boolean hacerRuido(){
        return rugir()==null;
    }
    
    public String rugir(){
        return "Grrrr";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Rugen: "+rugir()+" Comen: "+comer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String jugar() {
        return "Jugando como un perro.";
    }

    @Override
    public String vacunar() {
        return "Vacunado como un perro.";
    }
}
