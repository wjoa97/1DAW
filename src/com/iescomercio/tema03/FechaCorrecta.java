package com.iescomercio.tema03;

import java.util.Scanner;

/**
 *10.	 Pedir el día, mes y año de una fecha e indicar si esta 
 * es correcta (no tendremos en cuenta meses bisiestos)
 */
public class FechaCorrecta {
    public static void main(String[] args) {
        int dia, mes, año;
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduzca el dia: ");
        dia=teclado.nextInt();
        System.out.println("Introduzca el mes: ");
        mes=teclado.nextInt();
        System.out.println("Introduzca el año: ");
        año=teclado.nextInt();
        
        if (dia >= 1 && dia <=30)
            if (mes >= 1 && mes <= 12)
                if (año != 0)
                 System.out.println ("Fecha correcta");
                else
                System.out.println ("Año incorrecto");
            else
            System.out.println("Mes incorrecto");
        else
        System.out.println("Día incorrecto");
    }
}
