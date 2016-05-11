package com.iescomercio.tema08.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Pila {

    private LinkedList link;
    private int tamano;

    public Pila(int tam) {
        link = new LinkedList();
        tamano = tam;
    }

    public Pila() {
        this.tamano = -1;
        link = new LinkedList();
    }

    public boolean estaLlena() {
        if (tamano == -1) {
            return false;
        }

        return link.size() == tamano;
    }

    public boolean estaVacio() {
        return link.size() == 0;

    }

    public Object pop() {
        return link.pollFirst();
    }

    public boolean push(Object meter) {
        if (estaLlena()) {
            return false;
        } else {
            link.addFirst(meter);
            return true;
        }
    }

    public void imprimir() {
        Iterator it = link.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public Object cima() {
        return link.peekFirst();
    }

    public int size() {
        return link.size();
    }
}
