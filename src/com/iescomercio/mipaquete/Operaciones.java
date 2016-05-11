package com.iescomercio.mipaquete;

import java.io.IOException;

/**
 * Esta clase contiene metodos para el calculo de operaciones de suma y resta
 * entre dos números y multiplicacion de tres números.
 *
 * @author: Gerardo A. Bernal
 * @version: 23/02/2016/A
 * @since JDK 1.7.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/api/index.html">API Java
 * SE 7.0</a>
 * @deprecated A partir de JDK 1.8.0
 * @serial
 */
public class Operaciones {

    private int a, b;

    /**
     * Atributo de tipo {@code double} constante que indica el sueldo minimo
     * interprofesional que asciende a la cifra de {@value} €.
     *
     * @serialField SMI double Salario minimo interprofesional
     * @since JDK 1.8.0
     * @see "Salario Minimo Interprofesional"
     */
    public static final double SMI = 5322.23;

    /**
     * Constructor para la clase operaciones que recibe dos parametros de tipo
     * entero
     *
     * @param a Define la primera propiedad de tipo entero
     * @param b Define la segunda propiedad de tipo entero
     */
    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Constructor que inicializa dos paramateros {@link a} y {@link b} por
     * defecto con el valor {@code 0}.
     */
    public Operaciones() {
        this.a = 0;
        this.b = 0;
    }

    /**
     * Método que devuelve el resultado de sumar {@code a} y {@code b}
     *
     * @return El producto resultado de la suma
     * @deprecated A partir de JDK 1.1, sustituido por {@link #calculaResta()}
     */
    public int calculaSuma() {
        return a + b;
    }

    /**
     * Método que devuelve el resultado de restar dos números
     *
     * @return El producto resultado de la resta
     */
    public int calculaResta() {
        return a - b;
    }

    /**
     * Método que devuelve el resultado de multiplicar tres números
     *
     * @param p El tercer valor que queremos añadir a la ecuación
     * @return El producto resultado de la multiplicación
     * @since JDK 1.8.0
     * @serialData Resultado multiplicación
     */
    public int multiplicaNumero(int p) {
        return a * b * p;
    }

    /**
     * @throws IOException Si ocurre una excepción de entrada o salida.
     */
    public void f() throws IOException {
        // body
    }
}
