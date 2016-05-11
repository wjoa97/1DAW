package com.iescomercio.tema8.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Cola {

    private LinkedList link;
    private int tamaño;

    public Cola(int tam) {
        link = new LinkedList();
        tamaño = tam;
    }

    public Cola() {
        link = new LinkedList();
    }

    public boolean estaLlena() {
        return link.size() == tamaño;
    }

    public boolean estaVacio() {
        return link.size() == 0;

    }

    public Object pop() {
        return link.pollLast();
    }

    public boolean push(int meter) {
        if (estaLlena()) {
            return false;
        } else {
            link.addLast(meter);
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
        return link.getFirst();
    }

    public int size() {
        return link.size();
    }
}
