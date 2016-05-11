package com.iescomercio.tema6.tipos;

import java.util.Arrays;
import java.util.Scanner;

public class EED {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x,y,n;
        
        System.out.println("Introduzca los datos.");
        System.out.println("N:");
        n = t.nextInt();
        int[] array = new int[n];
        System.out.println("Max:");
        x = t.nextInt();
        System.out.println("Min:");
        y = t.nextInt();
        
        Utilidades.rellenarArray(array, x, y);
        
        System.out.println(Arrays.toString(array));
        System.out.println("El mínimo es:"+Utilidades.calculaIndiceMinimo(array));
        System.out.println("El mínimo es:"+Utilidades.calculaMin(array));
        System.out.println("El máximo es:"+Utilidades.calculaMax(array));
        System.out.printf("La media es: %.2f",Utilidades.calculaMedia(array));
        
        
        System.out.println("\n"+Arrays.toString(Utilidades.ordenaArrayDiferente(array)));
        
        
//        int[] ganador = new int[6];
//        int[] participacion = new int[6];
//        int[] participacion1 = {2, 14, 24, 27, 36, 38};
//        int[] participacion2 = {27, 24, 38, 14, 2, 36};
//        
//        Utilidades.RellenarArray(ganador, 1, 49);
//        
//        System.out.println(Arrays.toString(ganador));
//        
//        System.out.println("Introduzca los 6 números con los que desea participar.");
//        participacion [0] = t.nextInt();
//        participacion [1] = t.nextInt();
//        participacion [2] = t.nextInt();
//        participacion [3] = t.nextInt();
//        participacion [4] = t.nextInt();
//        participacion [5] = t.nextInt();
//        
//        
//        
//        if(Utilidades.comparaArray(participacion, ganador)){
//            System.out.println("Enhorabuena. La participación es la ganadora.");
//        } else{
//            System.out.println("Lo sentimos no ha habido suerte. Vuelvalo a intentar.");
//        }
//        
    }
}
