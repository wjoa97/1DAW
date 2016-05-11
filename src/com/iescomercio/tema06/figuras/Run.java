package com.iescomercio.tema06.figuras;

/**
 *
 *
 */
public class Run {

    public static void main(String[] args) {
        Figura cir = new Circulo(5);
        Figura cua = new Cuadrado(5);
        Figura tri = new Triangulo(5, 6);
        Figura fig = new Figura();

        Matematico calc = new Matematico();
        System.out.println("**Area**");
        System.out.printf("%.2f\n", calc.averiguaArea(cir));
        System.out.printf("%.2f\n", calc.averiguaArea(cua));
        System.out.printf("%.2f\n", calc.averiguaArea(tri));
        calc.averiguaArea(fig);
        System.out.println("-------");
        System.out.println("**Perímetro**");
        System.out.printf("%.2f\n", calc.averiguaPerimetro(cir));
        System.out.printf("%.2f\n", calc.averiguaPerimetro(cua));
        System.out.printf("%.2f\n", calc.averiguaPerimetro(tri));
        calc.averiguaPerimetro(fig);
    }
}
