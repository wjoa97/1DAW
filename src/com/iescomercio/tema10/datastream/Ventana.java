package com.iescomercio.tema10.datastream;
//Iconos http://siim.municipiopucara.gob.ec:8080/SIIM/images/iconos/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener, WindowListener {

    private final JPanel jpSuperior, jpDatos, jpInferior;
    private final GridBagConstraints gridSuperior, gridDatos;
    private final JLabel jlNombre, jlApellido1, jlApellido2, jlDni, jlDireccion, jlTelefono;
    private final JTextField jtfBusqueda, jtfNombre, jtfApellido1, jtfApellido2, jtfDni, jtfDireccion, jtfTelefono;
    private final JButton jbNuevo, jbModificar, jbEliminar, jbAnterior, jbSiguiente, jbBuscar, jbAceptar, jbCancelar;
    private JButton jbPulsado;
    private final ImageIcon iNuevo, iModificar, iEliminar, iAnterior, iSiguiente, iBuscar, iAceptar, iCancelar;
    private final Image iVentana;
    private CursorCliente cursor;
    private Cliente cliente;

    public Ventana() {

        cursor = new CursorCliente();

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

        jlNombre = new JLabel("Nombre:");
        jlApellido1 = new JLabel("Primer Apellido:");
        jlApellido2 = new JLabel("Segundo Apellido:");
        jlDni = new JLabel("DNI:");
        jlDireccion = new JLabel("Dirección:");
        jlTelefono = new JLabel("Teléfono:");
        jtfBusqueda = new JTextField("");
        jtfNombre = new JTextField("");
        jtfApellido1 = new JTextField("");
        jtfApellido2 = new JTextField("");
        jtfDni = new JTextField("");
        jtfDireccion = new JTextField("");
        jtfTelefono = new JTextField("");
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
        jpSuperior.add(jtfBusqueda, gridSuperior);
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
        jpDatos.add(jlNombre, gridDatos);

        //Etiqueta Apellido1
        gridDatos.gridy = 1;
        jpDatos.add(jlApellido1, gridDatos);

        //Etiqueta Apellido2
        gridDatos.gridy = 2;
        jpDatos.add(jlApellido2, gridDatos);

        gridDatos.insets = new Insets(0, 0, 0, 0); //Reseteamos los valores

        //Txt Nombre
        gridDatos.gridx = 1;
        gridDatos.gridy = 0;
        gridDatos.weightx = 1.0;
        gridDatos.insets = new Insets(10, 10, 10, 10);
        jpDatos.add(jtfNombre, gridDatos);

        //Txt Apellido1
        gridDatos.gridy = 1;
        jpDatos.add(jtfApellido1, gridDatos);

        //Txt Apellido2
        gridDatos.gridy = 2;
        jpDatos.add(jtfApellido2, gridDatos);
        gridDatos.weightx = 0;

        gridDatos.insets = new Insets(0, 0, 0, 0);
        //--------------------------------------------

        //Etiqueta DNI
        gridDatos.gridx = 2;
        gridDatos.gridy = 0;
        gridDatos.insets = new Insets(10, 35, 10, 10);
        jpDatos.add(jlDni, gridDatos);

        //Etiqueta Direccion
        gridDatos.gridy = 1;
        jpDatos.add(jlDireccion, gridDatos);

        //Etiqueta Telefono
        gridDatos.gridy = 2;
        jpDatos.add(jlTelefono, gridDatos);

        gridDatos.insets = new Insets(0, 0, 0, 0);

        //Txt DNI
        gridDatos.gridx = 3;
        gridDatos.gridy = 0;
        gridDatos.weightx = 1.0;
        gridDatos.insets = new Insets(10, 10, 10, 35);
        jpDatos.add(jtfDni, gridDatos);

        //Txt Direccion
        gridDatos.gridy = 1;
        jpDatos.add(jtfDireccion, gridDatos);

        //Txt Telefono
        gridDatos.gridy = 2;
        jpDatos.add(jtfTelefono, gridDatos);

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
        setLocationRelativeTo(null);
        setTitle("Cliente");
        setIconImage(iVentana);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
    
    public void vaciarTexto(){
        jtfNombre.setText("");
        jtfApellido1.setText("");
        jtfApellido2.setText("");
        jtfDni.setText("");
        jtfDireccion.setText("");
        jtfTelefono.setText("");
    }
    
    public void rellenarTexto(){
        jtfNombre.setText(cliente.getNombre());
        jtfApellido1.setText(cliente.getApellido1());
        jtfApellido2.setText(cliente.getApellido2());
        jtfDni.setText(cliente.getDni());
        jtfDireccion.setText(cliente.getDireccion());
        jtfTelefono.setText(Long.toString(cliente.getTelefono()));
    }
    
    public void rellenarCliente(){
        cliente.setNombre(getJtfNombre());
        cliente.setApellido1(getJtfApellido1());
        cliente.setApellido2(getJtfApellido2());
        cliente.setDni(getJtfDni());
        cliente.setDireccion(getJtfDireccion());
        cliente.setTelefono(getJtfTelefono());
    }

    public void textoEditable(boolean b) {
        jtfNombre.setEditable(b);
        jtfApellido1.setEditable(b);
        jtfApellido2.setEditable(b);
        jtfDni.setEditable(b);
        jtfDireccion.setEditable(b);
        jtfTelefono.setEditable(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbNuevo) {
            jbPulsado = jbNuevo;
            vaciarTexto();
            textoEditable(true);
            cliente = cursor.alta();
        } else if (e.getSource() == jbModificar) {
            textoEditable(true);
            cursor.modificar(cliente);
        } else if (e.getSource() == jbEliminar) {
            cursor.baja(cliente);
            vaciarTexto();
            aviso("Cliente eliminado");
        } else if (e.getSource() == jbBuscar) {
            textoEditable(false);
            cliente = cursor.buscar(jtfBusqueda.getText());
            rellenarTexto();
        } else if (e.getSource() == jbAceptar) {
            if (jbPulsado==jbNuevo) {
                rellenarCliente();
                aviso("Cliente creado correctamente");
                textoEditable(false);
            }
            cursor.guardar(cliente);
        } else if (e.getSource() == jbCancelar) {
            if (jbPulsado==jbNuevo) {
                vaciarTexto();
                cursor.baja(cliente);
                cliente = null;
            }
            cliente = null;
        } else if (e.getSource() == jbAnterior) {
            textoEditable(false);
            cursor.anterior(cliente);
        } else if (e.getSource() == jbSiguiente) {
            textoEditable(false);
            cursor.siguiente(cliente);
        }
    }

    public String getJtfBusqueda() {
        return jtfBusqueda.getText();
    }

    public void setJtfBusqueda(String a) {
        this.jtfBusqueda.setText(a);
    }

    public String getJtfNombre() {
        return jtfNombre.getText();
    }

    public void setJtfNombre(String a) {
        this.jtfNombre.setText(a);
    }

    public String getJtfApellido1() {
        return jtfApellido1.getText();
    }

    public void setJtfApellido1(String a) {
        this.jtfApellido1.setText(a);
    }

    public String getJtfApellido2() {
        return jtfApellido2.getText();
    }

    public void setJtfApellido2(String a) {
        this.jtfApellido2.setText(a);
    }

    public String getJtfDni() {
        return jtfDni.getText();
    }

    public void setJtfDni(String a) {
        this.jtfDni.setText(a);
    }

    public String getJtfDireccion() {
        return jtfDireccion.getText();
    }

    public void setJtfDireccion(String a) {
        this.jtfDireccion.setText(a);
    }

    public long getJtfTelefono() {
        long l = Long.parseLong(jtfTelefono.getText());
        return l;
    }

    public void setJtfTelefono(String a) {
        this.jtfTelefono.setText(a);
    }
    
    public void aviso(String s) {
        JOptionPane.showMessageDialog(this, s);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        cursor.leerRegistro();
    }

    @Override
    public void windowClosing(WindowEvent we) {
        cursor.escribirRegistro();
        aviso("Guardado todo en los registros.");
    }

    @Override
    public void windowClosed(WindowEvent we) {}

    @Override
    public void windowIconified(WindowEvent we) {}

    @Override
    public void windowDeiconified(WindowEvent we) {}

    @Override
    public void windowActivated(WindowEvent we) {}

    @Override
    public void windowDeactivated(WindowEvent we) {}
}
