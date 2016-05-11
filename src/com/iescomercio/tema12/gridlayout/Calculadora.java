package com.iescomercio.tema12.gridlayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{

    private static final int COLUMNAS = 3;
    private static final int FILAS = 4;
    private JButton[] botones;
    private JLabel jlbPantalla;
    private JPanel[] paneles;
    private final StringBuilder digitos;
    private Image icon;
    private Dimension tamaño;
    private Dimension tamaño2;

    public Calculadora() {
        tamaño = new Dimension(200, 300);
        tamaño2 = new Dimension(150, 200);
        digitos = new StringBuilder("0");
        paneles = new JPanel[3];
        botones = new JButton[13];
        jlbPantalla = new JLabel(digitos.toString());
        icon = new ImageIcon(getClass().getResource("/resources/eventos.png")).getImage();

        getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        setPreferredSize(tamaño);

        // Panel de pantalla
        paneles[0] = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        paneles[0].add(jlbPantalla);

        // Teclado númerico
        paneles[1] = new JPanel(new GridLayout(FILAS, COLUMNAS, 5, 5));
        paneles[1].setPreferredSize(tamaño2);

        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("" + (i + 1));
            paneles[1].add(botones[i]);
        }
        botones[9] = new JButton("+");
        botones[10] = new JButton("0");
        botones[11] = new JButton("-");
        botones[12] = new JButton("=");

        paneles[1].add(botones[9]);
        paneles[1].add(botones[10]);
        paneles[1].add(botones[11]);

        // Botón igual
        paneles[2] = new JPanel(new GridLayout(1, 1, 5, 5));
        paneles[2].add(botones[12]);

        // Añadir paneles al principal
        add(paneles[0]);
        add(paneles[1]);
        add(paneles[2]);

        // Empaqueta los botones en el JFrame
        pack();

        //Creación de eventos
        for (int i = 0; i <= 12; i++) {
            botones[i].addActionListener(this);
        }
        // Visualizar la ventana
        setIconImage(icon);
        setVisible(true);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object fuente = e.getSource();
        for (int j = 0; j <= 12; j++) {
            if (fuente.equals(botones[j])) {
                jlbPantalla.setText(botones[j].getText());
            }
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }
}
