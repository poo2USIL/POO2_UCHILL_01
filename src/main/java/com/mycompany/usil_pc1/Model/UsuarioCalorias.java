
package com.mycompany.usil_pc1.Model;

import java.util.ArrayList;
import lombok.Data;
import java.util.List;

@Data
public class UsuarioCalorias {
    private String nombre;
    private int caloriasDesayuno;
    private int caloriasAlmuerzo;
    private int caloriasCena;
    private int totalCalorias;
    private String estadoConsumo;
    private String recomendacion;
    private List<Alimento> alimentosConsumidos;
    
    public UsuarioCalorias() {
        this.alimentosConsumidos = new ArrayList<>();  
    }
}
