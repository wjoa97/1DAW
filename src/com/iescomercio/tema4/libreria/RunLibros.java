package com.iescomercio.tema4.libreria;

/**
 *
 * 
 */
public class RunLibros {
    public static void main(String[] args) {
        Libros miLibro; // Declarar el objeto
        
        miLibro=new Libros(265468); // Instanciar el objeto
        
        // Rellenar con información el objeto
        
        miLibro.ponTitulo("El Quijote");
        miLibro.ponPag(315);
        miLibro.ponPrecio(10.35);
        miLibro.ponIsbn(168486);
        
        // Mostrar los datos
        
        System.out.println("El titulo es: "+miLibro.dameTitulo());
        System.out.println("El ISBN es: "+miLibro.dameIsbn());
        System.out.println("El número de páginas son: "+miLibro.damePag());
        System.out.println("El precio es: "+miLibro.damePrecio()+"€");
    }
}
