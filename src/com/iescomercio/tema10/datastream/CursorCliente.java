package com.iescomercio.tema10.datastream;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursorCliente {

    private ArrayList<Cliente> clientes;
    private Ventana v;
    private File f;
    private DataInputStream leer;
    private DataOutputStream escribir;
    private FileInputStream leerFichero;
    private FileOutputStream escribirFichero;

    public CursorCliente() {
        this.clientes = new ArrayList<>();
        f = new File(getClass().getResource("/resources/clientes.dat").getPath());

        try {
            leerFichero = new FileInputStream(f);
            escribirFichero = new FileOutputStream(f);
            leer = new DataInputStream(leerFichero);
            escribir = new DataOutputStream(escribirFichero);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente alta() {
        Cliente c = new Cliente();
        return c;
    }

    public boolean baja(Cliente c) {
        if (clientes.contains(c)) {
            return clientes.remove(c);
        } else {
            return false;
        }
    }

    public boolean modificar(Cliente c) {
        if (clientes.contains(c)) {
            c.setNombre(v.getJtfNombre());
            c.setApellido1(v.getJtfApellido1());
            c.setApellido2(v.getJtfApellido2());
            c.setDni(v.getJtfDni());
            c.setDireccion(v.getJtfDireccion());
            c.setTelefono(v.getJtfTelefono());
            return true;
        } else {
            return false;
        }
    }

    public Cliente buscar(String nBusqueda) {
        Cliente aux = new Cliente();
        aux.setNombre(nBusqueda);
        int pos = clientes.indexOf(aux);
        if (pos != -1) {
            return clientes.get(pos);
            
        } else {
            return null;
        }
    }

    public boolean guardar(Cliente c) {
        return false;
    }

    public boolean anterior(Cliente c) {
        return false;
    }

    public boolean siguiente(Cliente c) {
        return false;
    }

    public void verClientes() {
        System.out.println("---Ver arrayList--");
        for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public boolean leerRegistro() {
        Cliente cliente = null;
        boolean aux = true;
        try {
            do {
                int idCliente = leer.readInt();
                String nombre, dni, apellido1, apellido2, direccion;
                nombre = leer.readUTF();
                dni = leer.readUTF();
                apellido1 = leer.readUTF();
                apellido2 = leer.readUTF();
                direccion = leer.readUTF();
                long telefono = leer.readLong();
                cliente = new Cliente(idCliente, nombre, dni, apellido1, apellido2, direccion, telefono);
                clientes.add(cliente);
            } while (true);

        } catch (EOFException e) {
            try {
                System.out.println("Todos los datos cargados en el arrayList");
                verClientes();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            aux = false;
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
            aux = false;
        }

        return aux;
    }

    public boolean escribirRegistro() {
        boolean aux = true;
        try {
            for (Iterator iterator = clientes.iterator(); iterator.hasNext();) {
                Cliente next = (Cliente) iterator.next();
                escribir.writeInt(next.getIdcliente());
                escribir.writeUTF(next.getNombre());
                escribir.writeUTF(next.getDni());
                escribir.writeUTF(next.getApellido1());
                escribir.writeUTF(next.getApellido2());
                escribir.writeUTF(next.getDireccion());
                escribir.writeLong(next.getTelefono());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CursorCliente.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException e) {
            System.out.println("Fallo al guardar los datos");
            aux = false;
        }
        return aux;
    }
}
