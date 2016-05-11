package com.iescomercio.tema03;

/**
 * Tablas de mulitplicar
 *
 */
public class TablaMultiplicar {

    public static void main(String[] args) {
        int t, r = 0, m;

        for (t = 1; t < 10; t++) {
            System.out.println("\nTabla del " + t);
            System.out.println("------------");
            for (m = 0; m < 10; m++) {
                r = t * m;
                System.out.println(t + " x " + m + " = " + r);
            }
        }
    }
}
