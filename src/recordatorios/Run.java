/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recordatorios;

/**
 *
 * @author PROF_VESPERTINO
 */
public class Run {

    public static final void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        OpcionesMenu op = new OpcionesMenu();
        
        // Añadimos las opciones 
        menu.addOpcionMenu("Añadir Apunte", () -> op.añadirApunte());
	menu.addOpcionMenu("Borrar Apunte", () -> op.borrarApunte());
        menu.addOpcionMenu("Salir del Menu", () -> op.salir());
        
        // Mostrar menu
        menu.mostrarMenu();
        
    }
}
