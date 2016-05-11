package com.iescomercio.tema06.cadenas;

public class Comprobaciones {
    public static boolean longitud (String a, int n){
        return a.length() % n == 0;
    }
    
    public static boolean mismoTamaño(String a, String b){
        return a.length() == b.length();
    }
    
    public static boolean compruebaNumeroPositivoCero (String a){
        for (int i = 0; i < a.length(); i++) {
            return (a.charAt(i) < '0' || a.charAt(i) > '9');
        }
        return false;
    }
    
    
}
