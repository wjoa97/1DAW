package com.iescomercio.tema12.borderlayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Border extends JFrame{
    
    private JPanel panelSuperior;
    private JPanel panelInferior;
    private JPanel panelIzquierdo;
    private JPanel panelDerecho;
    private JPanel panelCentro;
    private JButton[] botones;
    private JButton[] botones2;
    private JLabel[] etiquetas;
    private JCheckBox[] checkbox;
    private JRadioButton[] radio;
    private JPanel[] paneles;

    public Border() {
        panelSuperior = new JPanel();
        panelInferior = new JPanel();
        panelIzquierdo = new JPanel();
        panelDerecho = new JPanel();
        panelCentro = new JPanel();
        botones = new JButton[12];
        botones2 = new JButton[3];
        etiquetas = new JLabel[10];
        checkbox = new JCheckBox[10];
        radio = new JRadioButton[10];
        paneles = new JPanel[3];
        
        BorderLayout bl = new BorderLayout();
        
        this.getContentPane().setLayout(bl);
        getContentPane().add(panelSuperior, BorderLayout.NORTH);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);
        getContentPane().add(panelIzquierdo, BorderLayout.WEST);
        getContentPane().add(panelDerecho, BorderLayout.EAST);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        
        panelCentro.setBackground(Color.red);
        panelSuperior.setBackground(Color.blue);
        panelInferior.setBackground(Color.yellow);
        panelIzquierdo.setBackground(Color.ORANGE);
        panelDerecho.setBackground(Color.PINK);
     
        panelSuperior.setLayout(new FlowLayout());
        
        for (int i = 0; i < 10; i++) {
            botones[i] = new JButton(""+(i+1));
            panelSuperior.add(botones[i]);
        }
        
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel("Opción"+(i+1));
            panelIzquierdo.add(etiquetas[i]);
        }
        
        panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));
        
        for (int i = 0; i < 10; i++) {
            checkbox[i] = new JCheckBox("Check"+(i+1));
            panelDerecho.add(checkbox[i]);
        }
        
        panelInferior.setLayout(null);
        
        Dimension dm = new Dimension(80, 25);
        panelInferior.setPreferredSize(dm);
        
        for (int i = 0; i < 10; i++) {
            radio[i] = new JRadioButton("Radio"+(i+1));
            panelInferior.add(radio[i]);
            radio[i].setBounds(i*100, 0, 100, 25);
        }
        
        panelCentro.setLayout(new CardLayout(3, 3));
        
        for (int i = 0; i < 3; i++) {
            botones2[i] = new JButton("Botón"+(i+1));
            panelCentro.add(botones2[i]);
        }
        
         // Empaqueta los botones en el JFrame
        pack();
        
        // Visualizar la ventana
        
        setVisible(true);
        setTitle("Uso del BorderLayout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
