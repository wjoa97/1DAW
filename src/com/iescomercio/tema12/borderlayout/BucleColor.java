package com.iescomercio.tema12.borderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BucleColor extends JFrame {

    private JPanel[] paneles;
    private JPanel[] paneles2;
    private JPanel[] contenedor;
    private Color[] colores;
    private String[] posicion;
    private BorderLayout bl;

    public BucleColor() {
        paneles = new JPanel[4];
        paneles2 = new JPanel[4];
        contenedor = new JPanel[5];
        colores = new Color[5];
        posicion = new String[5];
        Dimension dm = new Dimension(500, 500);

        colores[0] = Color.YELLOW;
        colores[1] = Color.GREEN;
        colores[2] = Color.ORANGE;
        colores[3] = Color.BLUE;
        colores[4] = Color.BLACK;

        posicion[0] = BorderLayout.NORTH;
        posicion[1] = BorderLayout.EAST;
        posicion[2] = BorderLayout.SOUTH;
        posicion[3] = BorderLayout.WEST;
        posicion[4] = BorderLayout.CENTER;

        bl = new BorderLayout();

        getContentPane().setLayout(bl);
        setPreferredSize(dm);

        for (int i = 0; i < 4; i++) {
            paneles[i] = new JPanel();
            paneles[i].setBackground(colores[i]);
            this.add(paneles[i], posicion[i]);
        }
        contenedor[0] = new JPanel();
//        contenedor[0].setLayout(bl);
        
        this.add(contenedor[0], posicion[4]);
        
        for (int i = 0; i < 4; i++) {
            paneles2[i] = new JPanel();
            paneles2[i].setBackground(colores[i]);
            contenedor[0].add(paneles2[i], posicion[i]);
        }

//        for (int j = 1; j < 5; j++) {
//            contenedor[j] = new JPanel();
//            contenedor[j].add(contenedor[j-1], posicion[4]);
//            for (int i = 0; i < 4; i++) {
//                contenedor[j].add(paneles[i], posicion[i]);
//            }
//        }
        // Empaqueta los botones en el JFrame
        pack();

        // Visualizar la ventana
        setVisible(true);
        setTitle("Uso del BorderLayout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
