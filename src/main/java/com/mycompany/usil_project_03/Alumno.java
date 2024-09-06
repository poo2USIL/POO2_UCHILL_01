
package com.mycompany.usil_project_03;

import java.util.List;
import java.util.ArrayList;

public class Alumno extends Persona{
    private String codigoAlumno;
    private List<Curso> listaCursos;
    
    public Alumno(String codigo, String nombre, String dni, String codigoAlumno){
        super(codigo, nombre, dni);
        this.codigoAlumno = codigoAlumno;
        this.listaCursos = new ArrayList<>();
    }
    
    public void leerCursoAlumno(String nombreArchivo){
        //Todo
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }
    public void setCodigoAlumno(String codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }
    public List<Curso> getListaCursos() {
        return listaCursos;
    }
    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }
    
    
    
}
