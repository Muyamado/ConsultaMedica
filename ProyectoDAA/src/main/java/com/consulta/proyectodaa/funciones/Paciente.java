
package com.consulta.proyectodaa.funciones;
/**
 *
 * @author Jose
 */
public class Paciente {
    protected String nombre;
    protected char genero;
    protected int edadSemana;
    protected String direccion;
    protected String comentario;
    
    public Paciente(String nombre, char genero, int edadSemana, String direccion, String comentario){
        super();
        this.nombre = nombre;
        this.genero = genero;
        this.edadSemana = edadSemana;
        this.direccion = direccion;
        this.comentario = comentario;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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
