package com.iescomercio.tema6.tipos;

import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String a = "sol,playa,arena,";
        
        StringTokenizer st = new StringTokenizer(a, ",");
        
        System.out.println(st.nextToken());
        System.out.println(st.nextElement());
        System.out.println(st.nextToken());
        System.out.println("Número de palabras:"+st.countTokens());
        System.out.println("Número de delimitadores:"+st.hasMoreElements());
        System.out.println("Número de delimitadores:"+st.hasMoreTokens());
    }
}
