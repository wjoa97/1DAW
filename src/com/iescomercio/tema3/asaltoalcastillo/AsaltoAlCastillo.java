package com.iescomercio.tema3.asaltoalcastillo;

import java.util.Scanner;

//http://www.programa-me.com/documents/ProblemsSets/2015/ProgramaMe-2015-MadridOlot.pdf

public class AsaltoAlCastillo {  
    public static void main(String[] args) {
        int n=-1, contador=0;
        Scanner t = new Scanner(System.in);
        
        while (n!=0){
            System.out.println("¿De cuántos hombres dispone Jaime?");
            n = t.nextInt();
            
            for (int i = 1; i <= n; i++) {
                if(n%i==0){
                    contador++;
                }
            }
            System.out.println("El número de configuraciones posibles es: "+contador+"\n");
            contador=0;
        }
    }
}
