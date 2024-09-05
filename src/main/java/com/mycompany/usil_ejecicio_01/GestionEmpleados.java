
package com.mycompany.usil_ejecicio_01;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class GestionEmpleados {
    private List<Empleado> empleados;
    
    public GestionEmpleados(){
        empleados = new ArrayList<>();
    }
    
    public void AgregarEmpleados(Empleado empleado){
        empleados.add(empleado);
    }
    
    public double calcularSalarioTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalarioTotal();
        }
        return total;
    }
    
    
    public void generarReporteEmpleados(){
    for (Empleado empleado : empleados) {
        System.out.println(empleado);
    }
        System.out.println("Total a pagar: S/."+calcularSalarioTotal());
    }
}
