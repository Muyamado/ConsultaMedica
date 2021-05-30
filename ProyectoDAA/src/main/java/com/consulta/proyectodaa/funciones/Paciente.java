
package com.consulta.proyectodaa.funciones;
/**
 *
 * @author Jose
 */
public class Paciente {
    protected String nombre;
    protected String genero;
    protected int edadSemana;
    protected String direccion;
    protected String comentario;  
    
    public Paciente(){
        this.nombre = "";
        this.genero = "";
        this.edadSemana = 0;
        this.direccion = "";
        this.comentario = "";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdadSemana() {
        return edadSemana;
    }

    public void setEdadSemana(int edadSemana) {
        this.edadSemana = edadSemana;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    @Override
    public String toString(){
        return "Paciente: ["+ nombre +"]\nGenero: ["+ genero +"]\nEdad:["+ edadSemana +"]\nDireccion:["+ direccion +"]\nComentario:["+ comentario +"]\n";
     }
}
