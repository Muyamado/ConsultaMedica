package com.consulta.proyectodaa.funciones;

import com.consulta.proyectodaa.funciones.Paciente;

/**
 *
 * @author Jose
 */
public class PacienteyVista {
    
    Paciente paciente;
    
    public PacienteyVista(){
        paciente = new Paciente();
    }
    
    public void getInfoPaciente(String nombre, String genero, int edadSemana, String direccion, String comentarios){
        paciente.setNombre(nombre);
        paciente.setGenero(genero);
        paciente.setEdadSemana(edadSemana);
        paciente.setDireccion(direccion);
        paciente.setComentario(comentarios);
    
        System.out.println("Paciente: "+ paciente.getNombre() +"-" + paciente.getGenero() + "-" + paciente.getEdadSemana() +"-" + paciente.getDireccion() + "-" + paciente.getComentario());
    }
    
}


