package com.iescomercio.tema12.actionlistener;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 *
 */
public class Encuesta extends JFrame {

    private JLabel jlbPregunta, jlbSies, jlbNoes;
    private JButton jbSi, jbNo;
    private JPanel jpSiNo;
    private int si, no;
    private Image icon;

    public Encuesta() throws HeadlessException {
        si = no = 0;
        jlbPregunta = new JLabel("¿Sabes programar?");
        jlbSies = new JLabel("Sies: ");
        jlbNoes = new JLabel("Noes: ");
        icon = new ImageIcon(getClass().getResource("/resources/eventos.png")).getImage();

        jbSi = new JButton("Si:");
        jbNo = new JButton("No: ");

        jpSiNo = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // Meter botones dentro del panel
        jpSiNo.add(jbSi);
        jpSiNo.add(jbNo);

        //Configurar ventana
        getContentPane().setLayout(new java.awt.GridLayout(4, 1, 10, 10));

        getContentPane().add(jlbPregunta);
        getContentPane().add(jpSiNo);
        getContentPane().add(jlbSies);
        getContentPane().add(jlbNoes);

        // Empaqueta los botones en el JFrame
        pack();

        //Creación de eventos
        jbSi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                metodoPulsarBoton1();
            }
        });

        jbNo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                metodoPulsarBoton2();
            }
        });

        // Visualizar la ventana
        setIconImage(icon);
        setVisible(true);
        setTitle("Uso de eventos");
        setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void metodoPulsarBoton1() {
        si++;
        jlbSies.setText("Sies: " + si);
    }

    private void metodoPulsarBoton2() {
        no++;
        jlbNoes.setText("Noes: " + no);
    }

    public static void main(String[] args) {
        Encuesta encuesta = new Encuesta();
    }
}
