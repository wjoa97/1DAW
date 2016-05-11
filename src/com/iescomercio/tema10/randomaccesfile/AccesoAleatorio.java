package com.iescomercio.tema10.randomaccesfile;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.*;

public class AccesoAleatorio extends JFrame implements ActionListener {

    private final JLabel jlOrigen, jlDestino, jlTamaño;
    private final JTextField jtfOrigenRuta, jtfDestinoRuta, jtfTamaño;
    private final JFileChooser jfOrigen, jfDestino;
    private final JButton jbEnviar, jbOrigen, jbDestino;
    private File fileLectura, fileEscritura;
    private RandomAccessFile raLeer, raEscribir;
    private final Image icono;

    public AccesoAleatorio() {
        getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        jlOrigen = new JLabel("Origen:");
        jlDestino = new JLabel("Destino:");
        jlTamaño = new JLabel("Tamaño:");
        jtfOrigenRuta = new JTextField("");
        jtfDestinoRuta = new JTextField("");
        jtfTamaño = new JTextField(10);
        jfOrigen = new JFileChooser();
        jfDestino = new JFileChooser();
        jbEnviar = new JButton("Copiar Archivo");
        jbDestino = new JButton("Cambiar...");
        jbOrigen = new JButton("Examinar...");
        fileLectura = new File("");
        fileEscritura = new File("");
        icono = new ImageIcon(getClass().getResource("/resources/eventos.png")).getImage();

        //Fila 1
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(20, 35, 0, 10);
        getContentPane().add(jlOrigen, c);
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(20, 10, 0, 10);
        getContentPane().add(jtfOrigenRuta, c);
        c.weightx = 0.0;
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset

        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(20, 10, 0, 40);
        getContentPane().add(jbOrigen, c);
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset
        jbOrigen.addActionListener(this);

        // Fila 2
        c.insets = new Insets(10, 40, 0, 10);
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        getContentPane().add(jlDestino, c);
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset

        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.4;
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(10, 10, 0, 10);
        getContentPane().add(jtfDestinoRuta, c);
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset
//        c.weightx = 0.0;

        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(10, 10, 0, 40);
        getContentPane().add(jbDestino, c);
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset
        jbDestino.addActionListener(this);

        // Fila 3
        c.insets = new Insets(10, 40, 0, 10);
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        getContentPane().add(jlTamaño, c);
        c.insets = new Insets(0, 0, 0, 0);// Restablece el Inset

//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.weightx = 0.4;
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.insets = new Insets(10, 10, 0, 10);
        jtfTamaño.setHorizontalAlignment(JTextField.RIGHT);
        getContentPane().add(jtfTamaño, c);
        c.insets = new Insets(0, 0, 0, 0);
//        c.weightx = 0.0;

        // Fila 4
        c.insets = new Insets(20, 10, 20, 10);
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        getContentPane().add(jbEnviar, c);
        c.fill = GridBagConstraints.NONE;

        Dimension d = new Dimension(600, 240);
        setMinimumSize(d);
        setLocationRelativeTo(null);
        setTitle("Copiar archivos");
        setIconImage(icono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int returnVal;
        if (e.getSource() == jbOrigen) {
            returnVal = jfOrigen.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                fileLectura = jfOrigen.getSelectedFile();
                jtfOrigenRuta.setText(fileLectura.getPath());
                try {
                    raLeer = new RandomAccessFile(fileLectura, "r");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jtfOrigenRuta.setText("Ningún archivo seleccionado");                 
            }
            //System.out.println(returnVal);
        }else if(e.getSource() == jbDestino){     
            returnVal = jfDestino.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
               fileEscritura = jfDestino.getSelectedFile();
                jtfDestinoRuta.setText(fileEscritura.getPath());
                try {
                    raEscribir = new RandomAccessFile(fileEscritura, "rw");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AccesoAleatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jtfDestinoRuta.setText("Ningún archivo seleccionado.");                 
            }
           // System.out.println(returnVal);
        } else {
            if ((jtfOrigenRuta.getText() != "") && (jtfDestinoRuta.getText() != "")) {
                try {
                    if (fileLectura.length() >= fileEscritura.length()) {
                        int aux = Integer.parseInt(jtfTamaño.getText());
                        byte datos[] = new byte[aux];

                        //posicionar y leer
                        raLeer.seek(fileEscritura.length());
                        raLeer.read(datos);
                        //posicionar y escribir
                        raEscribir.seek(fileEscritura.length());
                        raEscribir.write(datos);

                    } else {
                        System.out.println("El fichero esta completo puedes copiar " + (fileLectura.length() - fileEscritura.length()) + "byte más ");
                    }
                } catch (FileNotFoundException ex) {
                    System.out.println("Fichero no encontrado");
                } catch (IOException ex) {
                    System.out.println("Fallo de la IO");
                }
            }
        }
    }

    public static void main(String[] args) {
        AccesoAleatorio a = new AccesoAleatorio();
    }
}