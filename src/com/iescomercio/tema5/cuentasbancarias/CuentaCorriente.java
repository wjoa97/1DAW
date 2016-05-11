package com.iescomercio.tema5.cuentasbancarias;

public class CuentaCorriente {
    private Titular titular;
    private NumeroDeCuenta numeroCuenta;
    private double saldo;
    
    public CuentaCorriente (Titular aTitular, NumeroDeCuenta aNCuenta, double aSaldo){
        titular=aTitular;
        numeroCuenta=aNCuenta;
        saldo=aSaldo;
    }
    
    public CuentaCorriente(Titular aTitular, NumeroDeCuenta aNCuenta){
        titular=aTitular;
        numeroCuenta=aNCuenta;
        saldo=15.3;
    }
    
    public Titular getTitular(){
        return titular;
    }
    public NumeroDeCuenta getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double nSaldo){
        saldo=nSaldo;
    }
    
    public void ingresar (double ingreso){
        saldo=saldo+ingreso;
    }
    
    public void reintegro (double reintegro){
        saldo=saldo-reintegro;
    }
    public String cuentaSaldo(){
        return numeroCuenta.toString()+" "+saldo;
    }
    
    public boolean equals(CuentaCorriente a){
        return a.getNumeroCuenta()==numeroCuenta;
    }
    
    public String toString(){
        return titular.toString()+" "+numeroCuenta.toString()+" "+saldo;
    }
}
