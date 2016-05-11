/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.tema12.borderlayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Departamento
 */
public class Profundo extends JFrame {
    private static final int RUEDAS = 50;
    private ArrayList<Color> colores;
    private String[] zonas;

    public Profundo() {
        zonas = new String[5];
        colores = new ArrayList();

        // Definimos paneles        
        zonas[0] = BorderLayout.NORTH;
        zonas[1] = BorderLayout.SOUTH;
        zonas[2] = BorderLayout.EAST;
        zonas[3] = BorderLayout.WEST;
        zonas[4] = BorderLayout.CENTER;

        // Definimos colores
        colores.add(Color.YELLOW);
        colores.add(Color.BLUE);
        colores.add(Color.ORANGE);
        colores.add(Color.GREEN);
        colores.add(Color.RED);

        // Metemos primero el inicial
        JPanel p = null, aux=null;
        for (int i = 0; i < 5; i++) {
            p = new JPanel();
            p.setBackground(colores.get(i));
            getContentPane().add(p, zonas[i]);
        }        
        p.setLayout(new BorderLayout());

        // Definimos zonas                
        for (int j = 0; j < RUEDAS; j++) {
            // Modificamos secuencia de colores
            Color c = colores.remove(0);
            colores.add(c);
            for (int i = 0; i < 5; i++) {
                aux = new JPanel();
                aux.setBackground(colores.get(i));
                if (i == 4) { // Panel de center
                    aux.setLayout(new BorderLayout());
                }
                p.add(aux, zonas[i]);
            }
            p=aux;
            
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        Profundo profundo = new Profundo();
    }

}
