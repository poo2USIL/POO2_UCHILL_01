
package com.mycompany.usil_project_01;

import static com.mycompany.usil_project_01.TipoVehiculo.LIVIANO;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Caseta {
    private List<Vehiculo> vehiculos;
    
    public Caseta(){
        //composicion
        vehiculos = new ArrayList<>();
    }
    
    public void AgregarVehiculo(Vehiculo vehiculo){
    vehiculos.add(vehiculo);
    }
    
    public void GenerarReporte(){
        int LivianoCount = 0;
        int MedianoCount = 0;
        int PesadoCount = 0;
        int MotoCount = 0;
        double TotalRecaudado = 0.0;
        
            for (Vehiculo vehiculo : vehiculos){
                TotalRecaudado+= vehiculo.getTarifa();
                switch(vehiculo.getTipo()){
                    case LIVIANO -> LivianoCount++;
                    case MEDIANO -> MedianoCount++;
                    case PESADO -> PesadoCount++;
                    case MOTO -> MotoCount++;
                }
        }   
            
            System.out.println("Reporte de Vehiculos");
            System.out.println("Liviano "+ LivianoCount);
            System.out.println("Mediano "+ MedianoCount);
            System.out.println("Pesado "+ PesadoCount);
            System.out.println("Motos "+ MotoCount);
            System.out.println("Total del monto recaudado S/."+ TotalRecaudado);
    }
    
    
}
