package com.iescomercio.tema5.cuentasbancarias;

public class NumeroDeCuenta {
    private int banco, sucursal, dControl; 
    private long nCuenta;
    
    public NumeroDeCuenta (int aBanco, int aSucursal, int aDControl, long aNCuenta){
        banco=aBanco;
        sucursal=aSucursal;
        dControl=aDControl;
        nCuenta=aNCuenta;
    }
    
    public int getBanco(){
        return banco;
    }
    public int getSucursal(){
        return sucursal;
    }
    public int getDControl(){
        return dControl;
    }
    public long getCuenta(){
        return nCuenta;
    }
    
    public void setBanco(int nBanco){
        banco=nBanco;
    }
    public void setSucursal(int nSucursal){
        sucursal=nSucursal;
    }
    public void setDControl(int nDControl){
        dControl=nDControl;
    }
    public void setBanco(long nNCuenta){
        nCuenta=nNCuenta;
    }
    @Override
    public String toString(){
        return banco+"-"+sucursal+"-"+dControl+"-"+(String.valueOf(nCuenta));
    }
}
