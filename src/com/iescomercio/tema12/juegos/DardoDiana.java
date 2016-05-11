package com.iescomercio.tema12.juegos;

import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class DardoDiana extends JFrame implements MouseListener {

    private JLabel jlbDiana, jlbDardo;
    private ImageIcon imagenDiana, imagenDardo;
    private URL urlDardo, urlDiana;
    private int coorX, coorY;
    private JPanel panelDardo;

    public DardoDiana() {
        urlDardo = getClass().getResource("/resources/dardo.png");
        urlDiana = getClass().getResource("/resources/diana.jpg");
        imagenDardo = new ImageIcon(urlDardo);
        imagenDiana = new ImageIcon(urlDiana);
        
        jlbDiana = new JLabel(imagenDiana);
        panelDardo = new JPanel();
        
        getContentPane().addMouseListener(this); 
        
        setLayout(null);
        add(jlbDiana);
        jlbDiana.setBounds(0, 0, imagenDiana.getIconHeight(), imagenDiana.getIconHeight());
        setComponentZOrder(jlbDiana, 0);
        
        
        
        repaint();
        
        setSize(imagenDiana.getIconHeight()+15, imagenDiana.getIconHeight()+30);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        JLabel dardos = new JLabel(imagenDardo);
        getContentPane().add(dardos);
        dardos.setBounds(e.getX(), e.getY(), 48, 48);
        this.setComponentZOrder(dardos, 1);
        
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        new DardoDiana();
    }
}
