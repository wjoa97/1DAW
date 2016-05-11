package com.iescomercio.tema5.hospital;

/**
 *
 * 
 */
public class RunHospital {
    public static void main(String[] args) {
        MedicoDeCabecera lara = new MedicoDeCabecera();
        lara.visitaLasCasas=true;
        lara.tratarPaciente();
        lara.aconsejaPacientes();
        
        Cirujano juan = new Cirujano();
        juan.trabajaEnHospital=true;
        juan.tratarPaciente();
        juan.hacerIncision();
    }
}
