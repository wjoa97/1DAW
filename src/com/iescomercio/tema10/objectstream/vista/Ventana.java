package com.iescomercio.tema10.objectstream.vista;
//Iconos http://siim.municipiopucara.gob.ec:8080/SIIM/images/iconos/

import com.iescomercio.tema10.objectstream.Barco;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class Ventana extends JInternalFrame implements ActionListener, InternalFrameListener {

    private final JPanel jpSuperior, jpDatos, jpInferior;
    private final GridBagConstraints gridSuperior, gridDatos;
    private final JLabel jlMatricula, jlMetroEslora, jlAñoFabricacion, jlCamarotes;
    private final JTextField jtfMatricula, jtfMetroEslora, jtfAñoFabricacion, jtfCamarotes;
    private final JButton jbNuevo, jbModificar, jbEliminar, jbAnterior, jbSiguiente, jbBuscar, jbAceptar, jbCancelar;
    private JButton jbPulsado;
    private final ImageIcon iNuevo, iModificar, iEliminar, iAnterior, iSiguiente, iBuscar, iAceptar, iCancelar;
    private final Image iVentana;
//    private CursorCliente cursor;
    private Barco barco;

    public Ventana() {

//        cursor = new CursorCliente();

        getContentPane().setLayout(new BorderLayout());

        jpSuperior = new JPanel(new GridBagLayout());
        jpDatos = new JPanel(new GridBagLayout());
        jpInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5, 5));

        gridSuperior = new GridBagConstraints();
        gridDatos = new GridBagConstraints();

        iVentana = new ImageIcon(getClass().getResource("/resources/propietario.png")).getImage();
        iNuevo = new ImageIcon(getClass().getResource("/resources/nuevo.png"));
        iModificar = new ImageIcon(getClass().getResource("/resources/editar.png"));
        iEliminar = new ImageIcon(getClass().getResource("/resources/eliminar.png"));
        iAnterior = new ImageIcon(getClass().getResource("/resources/anterior.png"));
        iSiguiente = new ImageIcon(getClass().getResource("/resources/siguiente.png"));
        iBuscar = new ImageIcon(getClass().getResource("/resources/busquedaAvanzada.png"));
        iAceptar = new ImageIcon(getClass().getResource("/resources/aceptar.png"));
        iCancelar = new ImageIcon(getClass().getResource("/resources/cancelar.png"));

        jlMatricula = new JLabel("Matricula:");
        jlMetroEslora = new JLabel("Metros eslora:");
        jlAñoFabricacion = new JLabel("Año fabricación:");
        jlCamarotes = new JLabel("Camarotes:");
        jtfMatricula = new JTextField("");
        jtfMetroEslora = new JTextField("");
        jtfAñoFabricacion = new JTextField("");
        jtfCamarotes = new JTextField("");
        jbNuevo = new JButton("Nuevo", iNuevo);
        jbModificar = new JButton("Modificar", iModificar);
        jbEliminar = new JButton("Eliminar", iEliminar);
        jbAnterior = new JButton(iAnterior);
        jbSiguiente = new JButton(iSiguiente);
        jbBuscar = new JButton("Buscar", iBuscar);
        jbAceptar = new JButton("Aceptar", iAceptar);
        jbCancelar = new JButton("Cancelar", iCancelar);
        jbPulsado = new JButton();

        add(jpSuperior, BorderLayout.NORTH);
        add(jpDatos, BorderLayout.CENTER);
        add(jpInferior, BorderLayout.SOUTH);

        // Panel de botones superior -----------------------------------------
        //Botón nuevo
        gridSuperior.gridx = 0;
        gridSuperior.gridy = 0;
        gridSuperior.insets = new Insets(5, 5, 5, 5);
        jpSuperior.add(jbNuevo, gridSuperior);

        //Botón eliminar
        gridSuperior.gridx = 1;
        jpSuperior.add(jbModificar, gridSuperior);

        //Botón eliminar
        gridSuperior.gridx = 2;
        jpSuperior.add(jbEliminar, gridSuperior);

        //Botón anterior
        gridSuperior.gridx = 3;
        jpSuperior.add(jbAnterior, gridSuperior);

        //Botón siguiente
        gridSuperior.gridx = 4;
        jpSuperior.add(jbSiguiente, gridSuperior);

        //TextField busqueda
        gridSuperior.fill = GridBagConstraints.HORIZONTAL;
        gridSuperior.weightx = 1.0;
        gridSuperior.gridx = 5;
        jpSuperior.add(jtfMatricula, gridSuperior);
        gridSuperior.weightx = 0;

        //Botón buscar
        gridSuperior.gridx = 6;
        jpSuperior.add(jbBuscar, gridSuperior);

        // Panel de datos ----------------------------------------------------
        gridDatos.fill = GridBagConstraints.HORIZONTAL;
        //Etiqueta Nombre
        gridDatos.gridx = 0;
        gridDatos.gridy = 0;
        gridDatos.insets = new Insets(10, 35, 10, 10);
        jpDatos.add(jlMatricula, gridDatos);

        //Etiqueta Apellido1
        gridDatos.gridy = 1;
        jpDatos.add(jlMetroEslora, gridDatos);

        gridDatos.insets = new Insets(0, 0, 0, 0); //Reseteamos los valores

        //Txt Nombre
        gridDatos.gridx = 1;
        gridDatos.gridy = 0;
        gridDatos.weightx = 1.0;
        gridDatos.insets = new Insets(10, 10, 10, 10);
        jpDatos.add(jtfMetroEslora, gridDatos);
        
        //Txt Nombre
        gridDatos.gridy = 1;
        jpDatos.add(jtfMetroEslora, gridDatos);
        gridDatos.insets = new Insets(0, 0, 0, 0);
        gridDatos.weightx = 0;
        
        //--------------------------------------------

        //Etiqueta DNI
        gridDatos.gridx = 2;
        gridDatos.gridy = 0;
        gridDatos.insets = new Insets(10, 35, 10, 10);
        jpDatos.add(jlCamarotes, gridDatos);

        //Etiqueta Apellido2
        gridDatos.gridy = 1;
        jpDatos.add(jlAñoFabricacion, gridDatos);
        
        //Txt Apellido1
        gridDatos.gridx = 3;
        gridDatos.gridy = 1;
        gridDatos.weightx = 1.0;
        gridDatos.insets = new Insets(10, 10, 10, 35);
        jpDatos.add(jtfAñoFabricacion, gridDatos);

        //Txt Apellido2
        gridDatos.gridy = 2;
        jpDatos.add(jtfCamarotes, gridDatos);
        gridDatos.weightx = 0;
        gridDatos.insets = new Insets(0, 0, 0, 0);

        // Panel de botones inferior -----------------------------------------
        //Botón aceptar
        jpInferior.add(jbAceptar);
        //Botón cancelar
        jpInferior.add(jbCancelar);

        jbNuevo.addActionListener(this);
        jbModificar.addActionListener(this);
        jbEliminar.addActionListener(this);
        jbAnterior.addActionListener(this);
        jbSiguiente.addActionListener(this);
        jbBuscar.addActionListener(this);
        jbAceptar.addActionListener(this);
        jbCancelar.addActionListener(this);

        jpDatos.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Datos cliente"), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        textoEditable(false);

        Dimension d = new Dimension(700, 300);
        setMinimumSize(d);
//        setLocation(null);
        setTitle("Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

    public void vaciarTexto() {
        jtfMetroEslora.setText("");
        jtfAñoFabricacion.setText("");
        jtfCamarotes.setText("");
        jtfMatricula.setText("");
    }

    public void rellenarTexto() {
//        jtfMetroEslora.setText(barco.getMetrosEslora());
//        jtfAñoFabricacion.setText(cliente.getApellido1());
//        jtfCamarotes.setText(cliente.getApellido2());
        jtfMatricula.setText(barco.getMatricula());
    }

    public void rellenarCliente() {
        barco.setMatricula(getJtfMatricula());
        barco.setAñoFabricacion(getJtfAñoFabricacion());
        barco.setCamarote(getJtfCamarotes());
        barco.setMetrosEslora(getJtfMetroEslora());
    }

    public void textoEditable(boolean b) {
        jtfMetroEslora.setEditable(b);
        jtfAñoFabricacion.setEditable(b);
        jtfCamarotes.setEditable(b);
        jtfMatricula.setEditable(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbNuevo) {
            jbPulsado = jbNuevo;
            vaciarTexto();
            textoEditable(true);
//            cliente = cursor.alta();
        } else if (e.getSource() == jbModificar) {
            textoEditable(true);
//            cursor.modificar(cliente);
        } else if (e.getSource() == jbEliminar) {
//            cursor.baja(cliente);
            vaciarTexto();
            aviso("Cliente eliminado");
        } else if (e.getSource() == jbBuscar) {
            textoEditable(false);
//            cliente = cursor.buscar(jtfMatricula.getText());
            rellenarTexto();
        } else if (e.getSource() == jbAceptar) {
            if (jbPulsado == jbNuevo) {
                rellenarCliente();
                aviso("Cliente creado correctamente");
                textoEditable(false);
            }
//            cursor.guardar(cliente);
        } else if (e.getSource() == jbCancelar) {
            if (jbPulsado == jbNuevo) {
                vaciarTexto();
//                cursor.baja(cliente);
                barco = null;
            }
            barco = null;
        } else if (e.getSource() == jbAnterior) {
            textoEditable(false);
//            cursor.anterior(cliente);
        } else if (e.getSource() == jbSiguiente) {
            textoEditable(false);
//            cursor.siguiente(cliente);
        }
    }

    public String getJtfMatricula() {
        return jtfMatricula.getText();
    }

    public int getJtfMetroEslora() {
        int aux;
        aux = Integer.getInteger(jtfMetroEslora.getText());
        return aux;
    }

    public int getJtfAñoFabricacion() {
        int aux;
        aux = Integer.getInteger(jtfAñoFabricacion.getText());
        return aux;
    }

    public int getJtfCamarotes() {
        int aux;
        aux = Integer.getInteger(jtfCamarotes.getText());
        return aux;
    }
    
    

    public void aviso(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
//        cursor.leerRegistro();
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
//        cursor.escribirRegistro();
        aviso("Guardado todo en los registros.");
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
}
