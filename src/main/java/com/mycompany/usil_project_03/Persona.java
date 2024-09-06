
package com.mycompany.usil_project_03;


public class Persona {
    private String codigo;
    private String nombre;
    private String dni;

    public Persona(String codigo, String nombre, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }   
}
