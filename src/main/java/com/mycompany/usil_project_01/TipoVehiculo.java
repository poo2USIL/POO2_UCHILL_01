
package com.mycompany.usil_project_01;

public enum TipoVehiculo {
    LIVIANO(6.50),
    MEDIANO(7.20),
    PESADO(11.40),
    MOTO(0.00);
    
    private final double tarifa;
    
    TipoVehiculo(double tarifa){
        this.tarifa = tarifa;
    }
    public double getTarifa(){
        return tarifa;
    }
}
