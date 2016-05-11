package com.iescomercio.tema6.cadenas;

public class Contraseña {

    public static String reemplazar(String cadena1) {
        cadena1 = cadena1.replaceAll("[a|A]", "@");
        cadena1 = cadena1.replaceAll("[e|E]", "3");
        cadena1 = cadena1.replaceAll("[i|I]", "1");
        cadena1 = cadena1.replaceAll("[o|O]", "0");
        cadena1 = cadena1.replaceAll("[u|U]", "\\/");
        return cadena1;
    }
}
