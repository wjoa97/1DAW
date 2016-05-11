package com.iescomercio.tema6.tipos;

import java.util.Arrays;

public class RunTiempoEjecucion {
    public static void main(String[] args) {
         
        int indice = 0;
        int[] array = new int[10000];
        int[] array2 = new int[10000];
        Utilidades.rellenarArray(array, 5000, 0);
        array2=Arrays.copyOf(array, array.length);
                
        Cronometro tiempo = new Cronometro();
        
        System.out.println(Arrays.toString(array));
        
        tiempo.star();
        
        Utilidades.ordenaArray(array);
        
        tiempo.stop();
        
        System.out.println("Tiempo metodo propio: "+tiempo.total());
        
        tiempo.restart();
        
        tiempo.star();
        
        Arrays.sort(array2);
        
        tiempo.stop();
        
        System.out.println("Tiempo sort: "+tiempo.total());
        
        System.out.println(Arrays.toString(array));
        
        System.out.println(Arrays.toString(array2));
        
        tiempo.restart();
        
        tiempo.star();
        
        System.out.println(Arrays.binarySearch(array, 9));
        
        tiempo.stop();
    }
}
