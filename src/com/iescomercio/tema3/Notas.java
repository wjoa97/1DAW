package com.iescomercio.tema3;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Notas {
    public static void main(String[] args) {
        int nota;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Dime la nota: ");
        nota=sc.nextInt();
        
        if (nota<0||nota>0){
            System.out.println("La nota no es correcta. \n");
        } else {
            switch (nota){
            case 1:
                System.out.println("Deficiente");
            break;
            case 2:
                System.out.println("Insuficiente");
            break;
            case 3:
                System.out.println("Insuficiente");
            break;
            case 4:
                System.out.println("Insuficiente");
            break;
            case 5:
                System.out.println("Suficiente");
            break;
            case 6:
                System.out.println("Bien");
            break;
            case 7:
                System.out.println("Notable");
            break;
            case 8:
                System.out.println("Notable");
            break;
            case 9:
                System.out.println("Sobresaliente");
            break;
            case 10:
                System.out.println("Sobresaliente");
            break;
            }
        
        }
    }
}
