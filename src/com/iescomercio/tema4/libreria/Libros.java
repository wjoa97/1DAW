package com.iescomercio.tema4.libreria;

/**
 *
 * 
 */
public class Libros {
    
    // Atributos
    
    long isbn;
    String titulo;
    int pag;
    double precio;
    
    // Constructores
    
    public Libros(){
        isbn=1;
        titulo= "Sin Titulo";
    }
    public Libros (long pIsbn){
        isbn=pIsbn;
    }
    
    // Metodos set (pon)
    
    public void ponTitulo (String nuevoTitulo){
        titulo=nuevoTitulo;
    }
    
    public void ponIsbn (long nuevoIsbn){
        isbn=nuevoIsbn;
    }
    
    public void ponPag (int nuevaPag){
        pag=nuevaPag;
    }
    
    public void ponPrecio (double nuevoPrecio){
        precio=nuevoPrecio;
    }
    
    // Metodos get (dame)
    
    public long dameIsbn (){
        return isbn;
    }
    
    public String dameTitulo (){
        return titulo;
    }
    
    public int damePag (){
        return pag;
    }
    
    public double damePrecio (){
        return precio;
    }
}
