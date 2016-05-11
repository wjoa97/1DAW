package com.iescomercio.tema04.instituto;

/**
 *
 *
 */
public class Practica7 {

    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura entornos = new Asignatura(2);
        Asignatura sistemasInformaticos = new Asignatura(3);
        
        Alumno gerardo = new Alumno(154, "Gerardo Arteaga");
        gerardo.setAsi1(programacion);
        gerardo.setAsi2(entornos);
        gerardo.setAsi3(sistemasInformaticos);

        Profesor david = new Profesor();

        david.ponerNotas(gerardo);

        System.out.println("Nombre: " + gerardo.getNombreAlumno());
        System.out.println("----------------------");
        System.out.println("Programación");
        System.out.println("ID: " + gerardo.getAsi1().getIdAsignatura());
        System.out.printf("Nota: %.2f \n", gerardo.getAsi1().getCalificacion());

        System.out.println("............");
        System.out.println("Entornos de desarrollo");
        System.out.println("ID: " + gerardo.getAsi2().getIdAsignatura());
        System.out.printf("Nota: %.2f \n", gerardo.getAsi2().getCalificacion());

        System.out.println("............");
        System.out.println("Sistemas Informáticos");
        System.out.println("ID: " + gerardo.getAsi3().getIdAsignatura());
        System.out.printf("Nota: %.2f \n", gerardo.getAsi3().getCalificacion());

        System.out.println("----------------------");

        System.out.printf("Media del alumno: %.2f\n", david.calcularMedia(gerardo));
    }
}
