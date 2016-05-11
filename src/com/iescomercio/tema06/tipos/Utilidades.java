package com.iescomercio.tema06.tipos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Gerardo
 */
public class Utilidades {

    public static boolean copiaArrays(int[] v1, int[] v2) {
        if (v1.length!= v2.length) return false; 
        for (int i = 0; i < v1.length; i++) {
            v2[i]=v1[i];
        }
        return true;
    }
    public static int cuentaPalabras(String a) {

        int n;

        StringTokenizer st = new StringTokenizer(a);

        n = st.countTokens();

        return n;
    }

    public static int cuentaFrases(String a) {

        int n;

        StringTokenizer st = new StringTokenizer(a, ".");

        n = st.countTokens();

        return n;
    }

    public static int[] rellenarArray(int[] array, int max, int min) {

        for (int i = 0; i < array.length; i++) {
            array[i] = NumAleatorio.muestraAleatorio(max, min);
        }

        return array;
    }

    public static int calculaMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i:array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static int calculaIndiceMinimo(int[] array) {
        int min = Integer.MAX_VALUE, indice = 0;

        for (int i = 0; i<array.length;i++) {
            if (min > array[i]) {
                min = array[i];
                indice = i;
            }
        }
        return indice;
    }

    public static int calculaMax(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static double calculaMedia(int[] array) {
        float media, suma = 0;

        for (float i : array) {
            suma = suma + i;
        }
        media = suma / array.length;

        return media;
    }

    public static boolean compruebaRepetido(int[] array, int numero) {
        for (int s : array) {
            if (s == numero) {
                return true;
            }
        }
        return false;
    }

    public static boolean comparaArray(int[] array1, int[] array2) {
        boolean iguales = false;
        int i = 0, j = 0;
        do {
            iguales = array1[i] == array2[j];
            if (iguales == true) {
                i++;
                j = 0;
            } else {
                iguales = false;
                j++;
                if (iguales == false && j == array2.length) {
                    return false;
                }
            }
        } while (j < array1.length && i < array2.length);
        return iguales;
    }

    public static boolean compruebaRepetidoArray(int[] array1, int[] array2) {

        // Rellenar código
        return false;
    }

    public static int[] ordenaArrayDiferente(int[] array) {

        int[] aux = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            aux[i] = calculaMin(array);
            array[calculaIndiceMinimo(array)] = Integer.MAX_VALUE;
        }
        
        return aux;
    }
    
     public static void ordenaArray(int[] array) {

        int[] aux = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            aux[i] = calculaMin(array);
            array[calculaIndiceMinimo(array)] = Integer.MAX_VALUE;
        }
        System.arraycopy(aux, 0, array, 0, array.length);   
    }
}
