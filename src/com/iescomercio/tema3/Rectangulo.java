package com.iescomercio.tema3;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        int n=0, m=0;
        Scanner t = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca la altura: ");
            n = t.nextInt();
            System.out.println("Introduzca la anchura: ");
            m = t.nextInt();
            
            System.out.println("---------------------");
        } while (n<0||m<0);
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < m; j++) {
                if (i==1||i==n||j==1||j==m){ // Ancho
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        System.out.println("*");
        }
    }
    
    
}
