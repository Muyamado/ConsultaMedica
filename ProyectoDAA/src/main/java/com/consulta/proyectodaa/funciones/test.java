package com.consulta.proyectodaa.funciones;

import com.consulta.proyectodaa.vista.vistaConsulta;

/**
 *
 * @author Jose
 */
//import com.consulta.proyectodaa.funciones.Paciente;
public class test {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Luis",'M',9,"mi casa","sin comentario");
        System.out.println("Paciente: " + paciente1);
       
        vistaConsulta vista = new vistaConsulta();
        vista.setVisible(true);
    }
    
}
