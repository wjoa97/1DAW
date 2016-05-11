package com.iescomercio.tema3.losdalton;

import java.util.Scanner;

/**
 * http://www.programa-me.com/documents/ProblemsSets/2015/ProgramaMe-2015-MadridOlot.pdf
 */
public class RunLosDalton {

    public static void main(String[] args) {

        // Cremaos tres variables para guardar los números introducidos, otras dos
        // para guarda las diferencia n1-n2, n2-n3 y n1-n3 y un contador.
        int n1 = 0, n2 = 0, n3 = 1, dif1, dif2, i = 0, h = 0;
        boolean id = true; // Indicará si la comparación entre diferencias se cumple.
        Scanner t = new Scanner(System.in);
        
        System.out.println("¿Cúantos hermanos son?");
        do{
        h = t.nextInt();
        } while(h<2);
        h -= 2;
        // Pide dos números, si algúno es 0 o menor vuelve a pedir los números.
        do {
            System.out.println("\n¿Cúanto miden?");
            n1 = t.nextInt();
            n2 = t.nextInt();
        } while (n1 <= 0 && n2 <= 0);

        // Calcula la diferencia entre los dos números introducidos
        dif1 = n2 - n1;

        // Mientras que el primer número(lo vamos a reutilizar), el tercero 
        // y la diferencia entre numeros se cumpla seguirá pidiendo datos.
        while (h != i) {

            n1 = t.nextInt(); // Pide el tercer número(impares en adelante) 
            //y lo guarda en n1(reutiliza)

            // La primera vez que entre, calculará la diferencia del 
            // tercer dato introducido(n1) y el segundo(n2)
            // Todas las demás calculará n1-n3
            if (i == 0) {
                dif2 = n1 - n2;
            } else {
                dif2 = n1 - n3;
            }
            i++; // Contador más 1
            // Si las diferencias son iguales entonces id=true
            id = (dif1 == dif2)&&id;

            // Si se cumplen las diferencias sigue adelante. Sino id=false
            if (id && h != i) {
                n3 = t.nextInt(); // Pide el cuarto número(pares en adelante)
                i++;
                if (n3 > 0) { //Si n3 mayor que 0 sigue adelante, sino termina
                    dif2 = n3 - n1; // Calcula la diferencia  con el número introducido anteriormente
                    id = (dif1 == dif2)&&id; // Si las diferencias son iguales entonces id=true
                }
            }
        }
        if (id) {
            System.out.println("\nDALTON");
        } else {
            System.out.println("\nDESCONOCIDOS");
        }
    }
}
