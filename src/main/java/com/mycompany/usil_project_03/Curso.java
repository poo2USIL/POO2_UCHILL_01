
package com.mycompany.usil_project_03;

public class Curso {
    private String codigoCurso;
    private String nombreCurso;

    public Curso(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }
    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    public String toString() {
        return nombreCurso;
    }
    
    
    
}
