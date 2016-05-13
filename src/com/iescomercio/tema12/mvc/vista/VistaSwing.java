package com.iescomercio.tema12.mvc.vista;

import com.iescomercio.tema12.mvc.controlador.CalculadoraControlador;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class VistaSwing extends JFrame implements InterfazVistas{
    private JLabel jlOperando1, jlOperando2, jlOperandor, jlResultado, jlMuestraResultado, jlVacio;
    private JButton jbCalcular, jbSalir;
    private JComboBox jcOperandor;
    private JTextField jtfOperando1, jtfOperando2;

    public VistaSwing() {
        jlOperando1 = new JLabel("Operando 1:");
        jlOperando2 = new JLabel("Operando 2:");
        jlOperandor = new JLabel("Operandor:");
        jlResultado = new JLabel("Resultado:");
        jlVacio = new JLabel("");
        jlMuestraResultado = new JLabel("");
        jbCalcular = new JButton("Calcular");
        jbSalir = new JButton("Salir");
        jcOperandor = new JComboBox();
        jtfOperando1 = new JTextField();
        jtfOperando2 = new JTextField();
        
        setLayout(new GridLayout(4, 4));
        
        jcOperandor.addItem("+");
        jcOperandor.addItem("-");
        jcOperandor.addItem("*");
        jcOperandor.addItem("/");
        
        add(jlOperando1);
        add(jtfOperando1);
        add(jlVacio);
        add(jlOperandor);
        add(jcOperandor);
        add(jbCalcular);
        add(jlOperando2);
        add(jtfOperando2);
        add(jbSalir);
        add(jlResultado);
        add(jlMuestraResultado);
        
        Dimension d = new Dimension(300, 130);
        setMinimumSize(d);
        setTitle("Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        VistaSwing v = new VistaSwing();
    }


    @Override
    public String getOperando1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOperando2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOperador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setResultado(String dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setControlador(CalculadoraControlador aThis) {
        // suscibir
        jbCalcular.addActionListener(aThis);
        jbSalir.addActionListener(aThis);
        // Configurar los comandos
        jbCalcular.setActionCommand("calcular");
        jbSalir.setActionCommand("salir");
    }
    
    
}
