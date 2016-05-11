package com.iescomercio.tema4.matematicas;

public class Mates {

    private int numero;

    public Mates(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esPerfecto() {
        int suma = 0;

        for (int divisor = 1; divisor < numero; divisor++) { // Divide desde 1 hasta numero-1
            if (numero % divisor == 0) { // Si es divisible se suma a la varibale "suma"
                suma += divisor;
            }
        }
        return suma == numero;
    }

    public boolean esPrimo() {
        int contador = 0;

        for (int divisor = 1; divisor <= numero; divisor++) { // Divide desde 1 hasta numero-1
            if (numero % divisor == 0) {
                contador++;
            }
        }
        return contador == 2;
    }

    public void listaPerfectos() {

        int aux = numero;

        for (numero = 1; numero < aux; numero++) {
            if (esPerfecto()) {
                System.out.printf(numero + "|");
            }
        }
        numero = aux;
    }

    public void listaPrimos() {

        int aux = numero;

        for (numero = 1; numero < aux; numero++) {
            if (esPrimo()) {
                System.out.printf(numero + "|");
            }
        }
        numero = aux;
    }

    public void listaNumeros() {

        for (int i = 0; i <= numero; i++) {
            System.out.printf(i + "|");
        }
    }

    public int sumaCifras() {
        int aux = numero;
        int resultado = 0;

        while (numero > 0) {
            resultado += numero % 10; // Suma la última cifra del número
            numero = numero / 10; // Quita los números que vayamos sumando a resultado
        }
        numero = aux;
        return resultado;
    }

    public int numDivisores() {
        int cont = 0;

        for (int i = 1; i <= numero; i++) { // Divide desde 1 hasta numero-1
            if (numero % i == 0) { // Si es divisible el contador aumenta en 1.          
                cont++;
            }
        }
        return cont;
    }
    
    public String base2(){
        String binario="";
        int resto, num;
        num=numero;
        while (num!=0){
            resto=(int)(num%2);
            binario=resto+binario;
            num/=2;
        }
        return binario;
    }
}
