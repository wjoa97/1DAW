package com.iescomercio.tema3;

import java.util.Scanner;

/**
 * 12.	Realizar un programa que pida un número entero y calcule muestre por
 * pantalla ese mismo número pero con letras. +-9.999 Ejemplo: -214 → memos
 * doscientos catorce
 */
public class NumLetraNeg {

    public static void main(String[] args) {

        // Declaración de variables
        int numero, uni = 0, dece = 0, cente = 0, uniMil = 0;
        String unidad = null, decena = null, centena = null, unidadMillar = null;
        Scanner teclado = new Scanner(System.in);

        // Pedir datos        
        System.out.println("Introduzca un número: ");
        numero = teclado.nextInt();
        System.out.println("");

        // Si numero menor que -9999 y mayor que 9999 -> Advertencia y fin.
        // Sino seguir adelante.
        if (numero < -9999 || numero > 9999) {
            System.out.println("El número es demasiado largo. \nDebe tener cuatro cifras como máximo. \n");
        } else {

        // Calcular unidades de mil, centenas, decenas y unidades.
            if (numero < 0) {
                uniMil = (int) ((numero * -1) / 1000);
                cente = (int) ((numero * -1) % 1000 / 100);
                dece = (int) ((numero * -1) % 100 / 10);
                uni = ((numero * -1) % 10);
            } else {
                uniMil = (int) (numero / 1000);
                cente = (int) (numero % 1000 / 100);
                dece = (int) (numero % 100 / 10);
                uni = (numero % 10);
            }
        // Convertir datos

            switch (uni) {
                case 0:
                    unidad = "";
                    break;
                case 1:
                    unidad = "Uno";
                    break;
                case 2:
                    unidad = "Dos";
                    break;
                case 3:
                    unidad = ("Tres");
                    break;
                case 4:
                    unidad = ("Cuatro");
                    break;
                case 5:
                    unidad = ("Cinco");
                    break;
                case 6:
                    unidad = ("Seis");
                    break;
                case 7:
                    unidad = ("Siete");
                    break;
                case 8:
                    unidad = ("Ocho");
                    break;
                default :
                    unidad = ("Nueve");                    
            }
            switch (dece) {
                case 0:
                    decena = ("");
                    break;
                case 1:
                    decena = "Diez";
                    break;
                case 2:
                    decena = "Veinte";
                    break;
                case 3:
                    decena = ("Trenta");
                    break;
                case 4:
                    decena = ("Cuarenta");
                    break;
                case 5:
                    decena = ("Cincuenta");
                    break;
                case 6:
                    decena = ("Sesenta");
                    break;
                case 7:
                    decena = ("Setenta");
                    break;
                case 8:
                    decena = ("Ochenta");
                    break;
                case 9:
                    decena = ("Noventa");
                    break;
            }
            switch (cente) {
                case 0:
                    centena = ("");
                    break;
                case 1:
                    centena = ("Ciento");
                    break;
                case 2:
                    centena = ("Doscientos");
                    break;
                case 3:
                    centena = ("Trescientos");
                    break;
                case 4:
                    centena = ("Cuatrocientos");
                    break;
                case 5:
                    centena = ("Quinientos");
                    break;
                case 6:
                    centena = ("Seiscientos");
                    break;
                case 7:
                    centena = ("Setecientos");
                    break;
                case 8:
                    centena = ("Ochocientos");
                    break;
                case 9:
                    centena = ("Novecientos");
                    break;
            }
            switch (uniMil) {
                case 1:
                    unidadMillar = ("");
                    break;
                case 2:
                    unidadMillar = ("Dos");
                    break;
                case 3:
                    unidadMillar = ("Tres");
                    break;
                case 4:
                    unidadMillar = ("Cuatro");
                    break;
                case 5:
                    unidadMillar = ("Cinco");
                    break;
                case 6:
                    unidadMillar = ("Seis");
                    break;
                case 7:
                    unidadMillar = ("Siete");
                    break;
                case 8:
                    unidadMillar = ("Ocho");
                    break;
                case 9:
                    unidadMillar = ("Nueve");
                    break;
            }

        // Mostrar datos dependiendo de si el numero es positivo, negativo o cero
            if (numero == 0) {
                System.out.println("Cero \n");
            } else if (numero > 0) {
                if (dece == 1 && uni == 1) {
                    System.out.println("Once \n");
                } else if (dece == 1 && uni == 2) {
                    System.out.println("Doce \n");
                } else if (dece == 1 && uni == 3) {
                    System.out.println("Trece \n");
                } else if (dece == 1 && uni == 4) {
                    System.out.println("Catorce \n");
                } else if (dece == 1 && uni == 5) {
                    System.out.println("Quince \n");
                } else if (numero == 100) {
                    System.out.println("Cien \n");
                } else if (uniMil != 0) {
                    if (dece != 0 && uni != 0) {
                        System.out.printf("%s Mil %s %s y %s \n", unidadMillar, centena, decena, unidad);
                    } else {
                        System.out.printf("%s Mil %s %s %s \n", unidadMillar, centena, decena, unidad);
                    }
                } else {
                    if (dece != 0 && uni != 0) {
                        System.out.printf("%s %s y %s \n", centena, decena, unidad);
                    } else {
                        System.out.printf("%s %s %s \n", centena, decena, unidad);
                    }
                }
            } else {
                if (dece == 1 && uni == 1) {
                    System.out.println("Menos Once \n");
                } else if (dece == 1 && uni == 2) {
                    System.out.println("Menos Doce \n");
                } else if (dece == 1 && uni == 3) {
                    System.out.println("Menos Trece \n");
                } else if (dece == 1 && uni == 4) {
                    System.out.println("Menos Catorce \n");
                } else if (dece == 1 && uni == 5) {
                    System.out.println("Menos Quince \n");
                } else if (numero == 100) {
                    System.out.println("Menos Cien \n");
                } else if (uniMil != 0) {
                    if (dece != 0 && uni != 0) {
                        System.out.printf("Menos %s Mil %s %s y %s \n", unidadMillar, centena, decena, unidad);
                    } else {
                        System.out.printf("Menos %s Mil %s %s %s \n", unidadMillar, centena, decena, unidad);
                    }
                } else {
                    if (dece != 0 && uni != 0) {
                        System.out.printf("Menos %s %s y %s \n", centena, decena, unidad);
                    } else {
                        System.out.printf("Menos %s %s %s \n", centena, decena, unidad);
                    }
                }
            }
        }
    }
}
