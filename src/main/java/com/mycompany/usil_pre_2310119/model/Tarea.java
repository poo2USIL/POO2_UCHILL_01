package com.mycompany.usil_pre_2310119.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {
    private String nombreT;
    private String responsable;
    private String estado;
    private Proyecto proyecto;    
}
