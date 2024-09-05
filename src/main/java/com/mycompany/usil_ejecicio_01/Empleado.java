
package com.mycompany.usil_ejecicio_01;

import lombok.Data;

@Data
public class Empleado {
    private int id;
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int horasExtras;
    
    public Empleado(int id, String nombre, String cargo, double salarioBase, int horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }
    
    public double calcularSalarioTotal() {
        double tarifaExtra = salarioBase / 160 * 1.5; // Asumiendo 160 horas al mes
        return salarioBase + (horasExtras * tarifaExtra);
    }
}
