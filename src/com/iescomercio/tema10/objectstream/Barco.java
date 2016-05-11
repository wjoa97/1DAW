package com.iescomercio.tema10.objectstream;


public class Barco {
    //Declarar variables
    private int metrosEslora, añoFabricacion, camarote;
    private String matricula;
    private double precio;

    //Constructor completo
    public Barco(String matricula, int metrosEslora, int añoFabricacion, int camarote) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.añoFabricacion = añoFabricacion;
        this.camarote = camarote;
    }
    
    //Metodo calcularAlquiler, que devuelde el precio del alquiler
    public double calcularAlquiler(int numeroDias){
        precio = (metrosEslora*10)*numeroDias+2;
        return precio;
    }

    //Sobrescribir el metodo "toString()" pasa mostrar los datos del barco
    @Override
    public String toString(){
        return "Matricula: "+matricula+"\nMetros de eslora: "+metrosEslora+"\nAño de fabricación: "+añoFabricacion;
    }

    public int getMetrosEslora() {
        return metrosEslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public int getCamarote() {
        return camarote;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
