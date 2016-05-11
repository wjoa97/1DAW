package com.iescomercio.tema05.cuentasbancarias;

public class CuentaAhorro extends CuentaCorriente {

    private double interes;

    public CuentaAhorro(Titular aTitular, NumeroDeCuenta aNCuenta, double aSaldo, double interes) {
        super(aTitular, aNCuenta, aSaldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular aTitular, NumeroDeCuenta aNCuenta, double aSaldo) {
        super(aTitular, aNCuenta, aSaldo);
        aSaldo = 15.3;
    }

    public CuentaAhorro(Titular aTitular, NumeroDeCuenta aNCuenta) {
        super(aTitular, aNCuenta);
        interes = 2.5;
    }

    public double getInteres() {
        return interes;
    }

    @Override
    public Titular getTitular() {
        return super.getTitular();
    }

    @Override
    public NumeroDeCuenta getNumeroCuenta() {
        return super.getNumeroCuenta();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    public void calcularInteres() {
        super.ingresar(getSaldo()*(interes/100));
    }

}
