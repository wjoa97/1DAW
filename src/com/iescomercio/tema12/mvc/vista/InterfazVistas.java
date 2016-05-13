package com.iescomercio.tema12.mvc.vista;

import com.iescomercio.tema12.mvc.controlador.CalculadoraControlador;


public interface InterfazVistas {
    public abstract String getOperando1();

    public abstract String getOperando2();

    public abstract String getOperador();

    public abstract void setResultado(String dato);

    public void setControlador(CalculadoraControlador aThis);
}
