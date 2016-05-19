package com.iescomercio.blackjack;

public class Carta {

    private int palo;
    private int valor;
    private boolean estado;

    public Carta(int card) {
        this.valor = card % 13;
        this.palo = card / 13;
        estado = false;
    }

    public boolean esUnAs() {
        return valor == 12;
    }

    public int calculaValor() {
        if (valor == 12) {
            return 1;
        }
        if (valor >= 8) {
            return 10;
        }
        return valor + 2;
    }

    public void esconder() {
        estado = true;
    }

    public void revelar() {
        estado = false;
    }

    public String toString() {
        String valores = "23456789TJQKA";
        String palos = new String("\u2663"+"\u2666"+"\u2665"+"\u2660");
        return valores.charAt(valor) + "" + palos.charAt(palo);
    }
}
