
package com.mycompany.usil_pc1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alimento {
    private String nombreU;
    private String tipoComida;
    private String nombreAlimento;
    private int porcion;
    private int calorias;
    
}
