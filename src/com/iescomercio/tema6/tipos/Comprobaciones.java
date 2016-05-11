package com.iescomercio.tema6.tipos;

public class Comprobaciones {
    public static boolean longitud (String a, int n){
        return a.length() % n == 0;
    }
    
    public static boolean mismoTamaño(String a, String b){
        return a.length() == b.length();
    }
    
    public static boolean compruebaNumeroPositivoCero (int a){
        
        return (a <= 0);
    }
}
