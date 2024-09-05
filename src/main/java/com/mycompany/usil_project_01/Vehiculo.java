
package com.mycompany.usil_project_01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {
    private TipoVehiculo tipo;
    private double tarifa;
    
    public Vehiculo(TipoVehiculo tipo){
        this.tipo= tipo;
        this.tarifa= tipo.getTarifa();
    }
}

