package com.iescomercio.tema4.instituto;

/**
 *
 * 
 */
public class Alumno {
    private int nExpediente;
    private String nombreAlumno;
    private Asignatura asi1,asi2,asi3;
    
    public Alumno(int aNExpediente){
        nExpediente=aNExpediente;
        asi1=new Asignatura(1);
        asi2=new Asignatura(2);
        asi3=new Asignatura(3);
    }
    public Alumno(int aNExpediente, String aNombreAlumno){
        nExpediente=aNExpediente;
        nombreAlumno=aNombreAlumno;
        asi1=new Asignatura(1);
        asi2=new Asignatura(2);
        asi3=new Asignatura(3);
    }
    
    public int getNExpediente(){
        return nExpediente;
    }
    public String getNombreAlumno(){
        return nombreAlumno;
    }
    public Asignatura getAsi1(){
        return asi1;
    }
    public Asignatura getAsi2(){
        return asi2;
    }
    public Asignatura getAsi3(){
        return asi3;
    }
    
    public void setNombreAlumno(String nNombreAlumno){
        nombreAlumno=nNombreAlumno;
    }
    public void setAsi1(Asignatura nAsi1){
        asi1=nAsi1;
    }
    public void setAsi2(Asignatura nAsi2){
        asi2=nAsi2;
    }
    public void setAsi3(Asignatura nAsi3){
        asi3=nAsi3;
    }
}
