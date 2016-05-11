package hilos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Rebota extends JFrame implements Runnable {

    private JPanel jpPanel;
    private JLabel jlbPelota, jlbFondo;
    private URL urlPelota, urlFondo;
    private ImageIcon imagenPelota, imagenFondo;

    public Rebota() {
        urlPelota = getClass().getResource("/resources/pelota2.gif");
        urlFondo = getClass().getResource("/resources/fondo.gif");
        imagenPelota = new ImageIcon(urlPelota);
        imagenFondo = new ImageIcon(urlFondo);
        
        jpPanel = new JPanel();
        jlbFondo = new JLabel(imagenFondo);
        jlbPelota = new JLabel(imagenPelota);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(jpPanel);
        getContentPane().setPreferredSize(new Dimension(800, 600));
        
        jpPanel.setLayout(null);
        jpPanel.add(jlbPelota);
        jlbPelota.setBounds(350, 250, imagenPelota.getIconWidth(), imagenPelota.getIconHeight());
        jpPanel.add(jlbFondo);
        jlbFondo.setBounds(0, 0, imagenFondo.getIconWidth(), imagenFondo.getIconHeight());
        

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void run() {
        int pelotaX = jlbPelota.getLocation().x, pelotaY = jlbPelota.getLocation().y;
        boolean paredX = true, paredY = true;
        try {
            while (true) {
                if (jlbPelota.getLocation().x == 0) {
                    paredX = true;
                }
                if (jlbPelota.getLocation().y == 0) {
                    paredY = true;
                }
                if (jlbPelota.getLocation().x == (getContentPane().getSize().width - imagenPelota.getIconWidth())) {
                    paredX = false;
                }
                if (jlbPelota.getLocation().y == (getContentPane().getSize().height - imagenPelota.getIconHeight())) {
                    paredY = false;
                }
                if (paredX) {
                    pelotaX++;
                } else {
                    pelotaX--;
                }
                if (paredY) {
                    pelotaY++;
                } else {
                    pelotaY--;
                }
                jlbPelota.setLocation(pelotaX, pelotaY);
                sleep(4);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Rebota.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint();
    }

    public static void main(String[] args) {
        Rebota p = new Rebota();
        Thread hilo = new Thread(p);
        hilo.start();
    }
}
