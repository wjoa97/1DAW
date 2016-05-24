package com.iescomercio.blackjack;

public class Baraja {

    final static int TAMAÑO_BARAJA = 52;

    private Carta[] cartas;
    private int N;

    public Baraja() {
        N = TAMAÑO_BARAJA;
        cartas = new Carta[N];
        for (int i = 0; i < N; i++) {
            cartas[N - i - 1] = new Carta(i);
        }
    }

    public Carta dealFrom() {
        return cartas[--N];
    }

    public boolean estaVacio() {
        return (N == 0);
    }

    public int size() {
        return N;
    }

    public void barajar() {
        for (int i = 0; i < N; i++) {
            int r = (int) (Math.random() * i);
            Carta cambiar = cartas[i];
            cartas[i] = cartas[r];
            cartas[r] = cambiar;
        }
    }

    public String toString() {
        String s = "Baraja  ";
        for (int i = N - 1; i >= 0; i--) {
            s += cartas[i] + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        System.out.println(baraja);
        baraja.barajar();
        System.out.println(baraja);
    }

}
