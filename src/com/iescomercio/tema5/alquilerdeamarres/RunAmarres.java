package com.iescomercio.tema5.alquilerdeamarres;

/**
 * 1. En un puerto se alquilan amarres para barcos de distinto tipo. Para cada
 * ALQUILER se guarda el nombre y DNI del cliente, las fechas inicial y final de
 * alquiler, la posición del amarre y el barco que lo ocupará. Un BARCO se
 * caracteriza por su matrícula, su eslora en metros y año de fabricación.
 *
 * Un alquiler se calcula multiplicando el número de días de ocupación
 * (incluyendo los días inicial y final) por un módulo función de cada barco
 * (obteniendo simplemente multiplicando por 10 los metros de eslora) y por el
 * valor fijo (2 € en la actualidad).
 *
 * Sin embargo ahora se pretende diferenciar la información de algunos tipos de
 * barcos:
 *
 *  Número de mástiles para veleros. El precio de amarre de los veleros será el
 * precio de un barco general, mas la suma de número de mástiles 5€.
 *
 *  Potencia de CV para embarcaciones deportivas a motor. El precio delamarre
 * para este tipo de embarcaciones será la heredada mas la potencia en CV 1€.
 *
 *  Potencia de CV y número de camarotes para yates de lujo. El precio del
 * amarre para este tipo de embarcaciones seŕa igual al de embarbaciones
 * deportivas a motor, pero además le sumaremos el no de camarotes 20 €.
 *
 * Nota 1:
 *
 *  Las fechas serán de tipo GregorianCalendar.
 *
 *  Se sobrescribirá el cálculo del alquiler en las tres clases hijas.
 */
public class RunAmarres {

    public static void main(String[] args) {
        Barco titanic = new Deportivo(500, "1565-FHD", 8, 2003);
        
        Cliente gerardo = new Cliente("Gerardo", "18088821-B", 63453673);

        Alquiler alquilerGerardo = new Alquiler(gerardo, 23, 5, 2015, 29, 5, 2015, 23, titanic);

        System.out.println(alquilerGerardo.toString() + "\n");

        System.out.println(titanic.toString());

        alquilerGerardo.calculaPrecioAlquiler(titanic);
                
        System.out.println("\n----------------------------------------------");

        System.out.printf("Precio del amarre: %.2f€\n", titanic.calculaPrecioAmarre());
        
        System.out.printf("Precio del alquiler: %.2f€\n", alquilerGerardo.getPrecioAlquiler());
    }
}
