package com.iescomercio.tema08.menu;

public class Run {

    public static final void main(String[] args) {
        // Inicializamos menu
        Menu menu = Menu.init();
        
        OpcionesMenu op = new OpcionesMenu();
        
        // Añadimos las opciones 
        menu.addOpcionMenu("Crear carpeta", () -> op.añadirCarpeta());
        menu.addOpcionMenu("Añadir Apunte", () -> op.añadirApunte());
        menu.addOpcionMenu("Apunte predterminado", () -> op.carpetaPredeterminada());
	menu.addOpcionMenu("Borrar Apunte", () -> op.borrarApunte());
        menu.addOpcionMenu("Ver Apunte", () -> op.verApunte());
        menu.addOpcionMenu("Modificar Apunte", () -> op.modificarApunte());
        menu.addOpcionMenu("Ordenar Apunte por Hora", () -> op.ordenarHora());
        menu.addOpcionMenu("Salir del Menu", () -> op.salir());
        
        // Mostrar menu
        menu.mostrarMenu();
    }
}