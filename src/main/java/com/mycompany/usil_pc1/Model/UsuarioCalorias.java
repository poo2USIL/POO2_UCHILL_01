
package com.mycompany.usil_pc1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioCalorias {
    private String nombre;
    private int caloriasDesayuno;
    private int caloriasAlmuerzo;
    private int caloriasCena;
    private int totalCalorias;
    private String estadoConsumo;
    private String recomendacion;
    private List<Alimento> alimentosConsumidos;
}
