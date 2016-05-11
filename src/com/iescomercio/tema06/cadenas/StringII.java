package com.iescomercio.tema06.cadenas;

public class StringII {

    public static String reverse(String a) {
        if (a.length() <= 1) {
            return a;
        } else {
            String reverse = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                reverse = reverse + a.charAt(i);
            }
            return reverse;
        }
    }

    public static boolean Palindromo(String palabra) {
        String c1, c2;
        int indiceMitad = palabra.length() / 2;
        c1 = palabra.substring(0, indiceMitad);
        if (palabra.length() % 2 == 0) {
            c2 = palabra.substring(indiceMitad, palabra.length());
        } else {
            c2 = palabra.substring(indiceMitad + 1, palabra.length());
        }
        c2 = reverse(c2);
        return c1.equals(c2);
    }

    public static boolean orden(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) < '9') {
                System.out.println("Solo se permiten números enteros positivos o el cero.");
                return false;
            }
        }
        if (a.length() % 2 == 0) {
            StringBuilder c1 = new StringBuilder(a.substring(0, (a.length() / 2)));
            StringBuilder c2 = new StringBuilder(a.substring(a.length() / 2));
            StringBuilder cadena = new StringBuilder();
            c2.reverse();
            for (int i = 0; i < c1.length(); i++) {
                cadena.append(c1.charAt(i));
                cadena.append(c2.charAt(i));
            }
            System.out.println("El resultado es: " + cadena);
        } else {
            System.out.println("El número debe ser par.");
            return false;
        }
        return true;
    }

    public static String ordenCadenas(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) < '0' || a.charAt(i) > '9' || b.charAt(i) < '0' || b.charAt(i) > '9') {
                    return "Solo se permiten números enteros positivos o el cero.";
                }
            }
            StringBuilder c1 = new StringBuilder(a);
            StringBuilder c2 = new StringBuilder(b);
            StringBuilder cadena = new StringBuilder();
            for (int i = 0; i < c1.length(); i++) {
                cadena.append(c1.charAt(i));
                cadena.append(c2.charAt(i));
            }
            return "El resultado es: " + cadena;
        } else {
            return "Los dos números tienen que tener la misma longitud.";
        }
    }

    public static String ordenCadenasTres(String a, String b) {
//        if (a.length() == b.length()) {
//            for (int i = 0; i < a.length(); i++) {
//                if (a.charAt(i) < '0' || a.charAt(i) > '9' || b.charAt(i) < '0' || b.charAt(i) > '9' || b.charAt(i) < '0' || b.charAt(i) > '9') {
//                    return "Solo se permiten números enteros positivos o el cero.";
//                }
//            }
//            if (a.length() % 3 == 0) {
//                StringBuilder c1 = new StringBuilder(a);
//                StringBuilder c2 = new StringBuilder(b);
//                StringBuilder c3 = new StringBuilder(c);
//                StringBuilder cadena = new StringBuilder();
//                for (int i = 0; i < c1.length(); i++) {
//                    cadena.append(c1.charAt(i));
//                    cadena.append(c2.charAt(i));
//                    cadena.append(c3.charAt(i));
//                }
//                return "El resultado es: " + cadena;
//            } else {
//                return "La longitud de los números debe ser multiplo de 3.";
//            }
//        } else {
//            return "Los dos números tienen que tener la misma longitud.";
//        }
        StringBuilder sb = new StringBuilder();

        // Comprueba la entrada
        if (Comprobaciones.longitud(a, 3)) {
            if (Comprobaciones.compruebaNumeroPositivoCero(a) || Comprobaciones.compruebaNumeroPositivoCero(b)) {
                if (Comprobaciones.mismoTamaño(a, b)) {
                    for (int i = 0; i < a.length(); i += 3) {
                        sb.append(a.substring(i, i + 3));
                        sb.append(b.substring(i, i + 3));
                    }
                    return sb.toString();
                } else {
                    return "Deben tener la misma longitud";
                }
            } else {
                return "Deben ser números positivos o cero.";
            }
        } else {
            return "La longitud debe ser multiplo de 3";
        }
    }

    public static boolean rendimientoStrings(long nVueltas) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();
        long d1 = 0, d2 = 0, d3 = 0, d4 = 0;

        d1 = System.currentTimeMillis();
        for (int i = 0; i < nVueltas; i++) {
            sb.append("Hola");
        }
        d2 = System.currentTimeMillis();
        System.out.println("El StringBuilder tarda en concatenar " + nVueltas + " " + (d2 - d1) + " ms");

        d3 = System.currentTimeMillis();
        for (int i = 0; i < nVueltas; i++) {
            sbf.append("Hola");
        }
        d4 = System.currentTimeMillis();
        System.out.println("El StringBuilder tarda en concatenar " + nVueltas + " " + (d4 - d3) + " ms");
        return true;
    }

    public static String asteriscos(int n, int m) {
        StringBuilder numeros = new StringBuilder();
        StringBuilder cadena = new StringBuilder();
        // Comprobamos que sea positivo
        if (n < 0 || m < 0) {
            System.out.println("No se permiten números negativos");
            return null;
        }
        if (m > 9) {
            System.out.println("m tiene que estar comprendido entre 0 y 9.");
            return null;
        }

        // Generamos un numero de diez cifras añadiendo numeros aleatorios
        for (int i = 0; i <= 10; i++) {
            numeros.append((int) Math.floor(Math.random() * 10));
        }
        for (int i = 0; i <= m; i++) {
            cadena.append(numeros.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            cadena.append("*");
        }
        for (int i = n + 1; i < numeros.length(); i++) {
            cadena.append(numeros.charAt(i));
        }

        return cadena.toString();
    }

    public static String numeroRepetido(int n) {
        StringBuilder tabla = new StringBuilder();

        if (n < 0 || n > 9) {
            System.out.println("N tiene que estar comprendido entre 0 y 9.");
            return null;
        }

        for (int i = 0; i < n; i++) {
            tabla.append(i);
        }
        tabla.append(n);
        for (int i = n; i < 10; i++) {
            tabla.append(i);
        }

        return tabla.toString();
    }

    // Ejercicio 10
    //Realizar un método que recibe un número N (entero + 0) y devuelve un String. El
    //método creará inicialmente un String con números entre 1 y 100 y posteriormente
    //eliminará el número N del String retornándolo.
    public static String unoCien(int n) {

        StringBuilder cadena = new StringBuilder();
        String aux, aux2;

        if (!Comprobaciones.compruebaNumeroPositivoCero(n + "")) {
            // Crea una cadena con números del 1 al 100
            for (int i = 0; i <= 10; i++) {
                cadena.append(i);
            }
            aux = cadena.toString(); // Convierte El StringBuilder a 
            aux2 = aux.replaceAll(n + "", ""); // Elimina de la cadena el número N
            return aux2;
        } else {
            System.out.println("El numero no puede ser negativa");
            return null;
        }
    }

    // Ejercicio 12
    // Realizar un método que recibe dos String con números de una cifra ordenados y
    // retorna un String con la fusión de ambos String recibidos también ordenados.
    public static String ordenNumeros(String a, String b) {

        StringBuilder aux = new StringBuilder();
        int aC = 0, bC = 0;

        do{
            if (a.charAt(aC) == b.charAt(bC)) {
                aux.append(a.charAt(aC));
                aux.append(b.charAt(bC));
                aC++;
                bC++;
            } else if (a.charAt(aC) < b.charAt(bC)) {
                aux.append(a.charAt(aC));
                aC++;
            } else {
                aux.append(b.charAt(bC));
                bC++;
            }
        } while (aC != a.length() && bC != b.length());
            
        if (aC==a.length()){
            aux.append(b.substring(bC, b.length()));
        } else {
            aux.append(a.substring(aC, a.length()));
        }
        return aux.toString();
    }
}
