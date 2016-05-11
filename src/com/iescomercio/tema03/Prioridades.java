package com.iescomercio.tema3;

/**
 *5. Calcula e indica el resultado de las siguientes operaciones, teniendo
 * en cuenta el orden de prioridad de los operadores explicado en clase. 
 * Posteriormente comprueba el resultado  realizando un programa en Java 
 * con las mismas expresiones.
 * 
 * NOTA: En el ejercicios de prioridad de operadores indicados abajo, el 
 * operador ^ de java (XOR) no está indicando la XOR si no la potenciación
 * Recuerda que para calcular la potenciación necesitarás usar el método 
 * pow de la clase Math.
 * 7 % 5 + 2 * 3
 * 9 / 2 * 2 * 9 / 2
 * (2 * 3 + (4 * 8 + 4) / 6) ^ 2 + 6
 * 118 + 12 – 5 * 2 * 10 / 5 % 5
 * 3 * 2 ^ 4 – 5 * 2 ^ 3 + 2 * 12 – 17
 * (15 - 4) + 3 – (12 – 5 * 2) + (5 + 16 / 4) – 5 + (10 – 2 ^ 3)
 */
public class Prioridades {
    public static void main(String[] args) {
        
        // Declarar las variables y calcular
        // Recuerda que para calcular la potenciación necesitarás usar el método 
        // pow de la clase Math.
        // Math.pow(a, b) donde a es la base y b el exponente.
        
        int op1=(7%5+2*3);
        int op2=(9/2*2*9/2);
        int op3_base=(2*3+(4*8+4)/6);
        int op3=(int)(Math.pow(op3_base, 2)+6);
        int op4=(118+12-5*2*10/5%5);
        int op5=(int)(3*Math.pow(2, 4)-5*Math.pow(2, 3)+2*12-17);
        int op6=(int)((15-4)+3-(12-5*2)+(5+16/4)-5+(10-Math.pow(2, 3)));
        
        // Mostrar los datos
        System.out.println("Resultado operación 1: "+op1);
        System.out.println("Resultado operación 2: "+op2);
        System.out.println("Resultado operación 3: "+op3);
        System.out.println("Resultado operación 4: "+op4);
        System.out.println("Resultado operación 5: "+op5);
        System.out.println("Resultado operación 5: "+op6);
    }
}
