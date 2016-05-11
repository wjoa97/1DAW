package com.iescomercio.tema12.boxlayout;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class PruebaBoxLayout extends JFrame {

    private javax.swing.JButton jb1, jb2, jb3, jb4;

    public PruebaBoxLayout() {
        // Se crea la ventana con el BoxLayout
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), MAXIMIZED_HORIZ));

        // Se crea un botón centrado y se añade
        jb1 = new JButton("Boton 1");
        jb2 = new JButton("Boton 2");
        jb3 = new JButton("Boton 3");
        jb4 = new JButton("Boton 4");

        // Se crea una etiqueta centrada y se añade
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);

        // Empaqueta los botones en el JFrame
        pack();

        // Visualizar la ventana
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        PruebaBoxLayout pb = new PruebaBoxLayout();
    }
}
