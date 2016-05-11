package com.iescomercio.tema05.arboldenavidad;

import java.util.Scanner;

public class arbol {
    public static void main(String[] args) {
        int i=0,j=0,k=0,max=0;
        Scanner t = new Scanner(System.in);
        
        System.out.println("Introduzca el tamaño:");
        max= t.nextInt();
        
        // Si el valor recibido es par, le añadimos uno
        if(max%2==0)
        {
            max++;
        }
 
        // parte superior del rombo
        for(i=1;i<=max;i=i+2)
        {
            // Añadimos los espacios necesarios delante de cada linea
            for(k=max+1;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            // Mostramos los asteriscos
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        for (int l = 0; l < max; l++) {
            for (int m = 0; m < max; m++) {
                if (l==max/2||m==max/2) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}
