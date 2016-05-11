package com.iescomercio.tema6.ahorcado;

/**
 *
 * 
 */
public class Arbol {
 public static void main(String[] args) {
        String c = "* ";
        String b = "  ";
        int altura = 20;
        int ancho = 1;
        String n = "/";
        String x= "";
        String y = " ";
        for (int i = 0; i < 1; i++){
        if(i==0){
           for (int k = 0; k < altura - i-1; k++)System.out.print(b);
            	System.out.print(" /\\ \n");
            }
            for (int k = 0; k < altura - i-1; k++)
            System.out.print(b);
            System.out.print(""+x+n+""+y+""+y+"\\");x+=" ";y+=" ";
           System.out.print("\n");
        }
        for (int k = 0; k < altura-3; k++)
        System.out.print(b);
        System.out.println("~~~~"+"    "+"~~~~");
        for (int k = 0; k < altura-3; k++)System.out.print(b);
        System.out.println("\\          /");
        for (int k = 0; k < altura-3; k++)System.out.print(b);
        System.out.println("/          \\");
        for (int k = 0; k < altura-4; k++)System.out.print(b);
        System.out.println(" /____    ____\\");
        for (int i = 0; i < altura/4; i++){
            for (int k = 0; k < altura - i; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + ancho; j++){
                System.out.print(c);
            } 
            System.out.print("\n");
        }
         for (int i = 0; i < altura/4; i++){
            for (int k = 0; k < (altura - i) - 2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 5; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < altura/4; i++){
            for (int k = 0; k < (altura - i) - 4; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 9; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < altura/4; i++){
            for (int k = 0; k < (altura - i) - 6; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 13; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < altura/4; i++){
            for (int k = 0; k < altura -2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < 5; j++){
                System.out.print(c);
            } 
            System.out.print("\n");
        }
    }
}