package com.iescomercio.tema05.cuentasbancarias;

public class RunCuentaBancaria {
    public static void main(String[] args) {
        Titular gerardo = new Titular("Gerardo", "Arteaga Bernal", 20);
        
        NumeroDeCuenta gerardoNumero = new NumeroDeCuenta(6878, 8954, 32, 568513141);
        
        CuentaCorriente gerardoCorriente = new CuentaCorriente(gerardo, gerardoNumero, 500);
        
        System.out.println(gerardoCorriente.toString());
        
        CuentaAhorro gerardoAhorro = new CuentaAhorro(gerardo, gerardoNumero, 1500, 1.7);
        
        gerardoAhorro.calcularInteres();
        
        System.out.printf("Saldo de la cuenta de ahorros: %.2f€ \n",gerardoAhorro.getSaldo());
    }
}
