package com.iescomercio.tema8.treeset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Menu {

    private Scanner sc; ;
    private HashSet alumnos;
//    Iterator it = alumnos.iterator();

    public Menu() {
        sc = new Scanner(System.in);
        alumnos = new HashSet();
    }
  
    public void mostrarMenu() {
        System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Mostrar listado \n 4. Salir del programa");
    }
    
    public void mostrarSubMenu() {
        System.out.println("\n 1. Orden natural \n 2. Ordenar por nombre"
                + " \n 3. Ordenar por nota \n 4. Ordenar por telefono");
    }

    public void ejecutaOpcion(int x) {
        switch (x) {
            case 1:
                ingresar();
                System.out.println("El alumno ha sido añadido.");
                break;
            case 2:
                borrar();
                System.out.println("El alumno ha sido eliminado.");
                break;
            case 3:
                mostrarSubMenu();                
        }
    }

    private void ingresar() {
        Alumno alum = new Alumno();
        System.out.print("Introduce el nombre del alumno: ");
        alum.setNombre(sc.next());
        System.out.print("Introduce el apellido del alumno: ");
        alum.setApellido(sc.next());
        System.out.print("Introduce el telefono del alumno: ");
        alum.setTelefono(sc.nextInt());
        System.out.print("Introduce la nota del alumno: ");
        alum.setNota(sc.nextInt());
        if (alumnos.add(alum)==false) 
            System.out.println("El alumno ya esta introducido");
    }
    
    private void ingresarSubMenu(int x) {
        x = sc.nextByte();
    }    

    private void borrar() {
        Iterator it = alumnos.iterator();
        int numero, count = 0;

        System.out.println("¿Qué elemento quieres borrar?");
        numero = sc.nextInt();

        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
        while (it.hasNext()) {
            if (count == numero) {
                alumnos.remove(it.next());
                break;
            }
            count++;
        }
    }

    private void mostrar() {
        Iterator it = alumnos.iterator();
        int count = 0;
        Alumno aux;
        while (it.hasNext()) {
            aux = (Alumno)it.next();
            System.out.println(count + ".-" + aux.toString());
            count++;
        }
    }
}