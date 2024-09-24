
package com.mycompany.usil_s5_practica_xyz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invitado {
    private String NombreI;
    private int NumeroC;
    private String genero;
    private int Fdia;
    private String Fmes;
    private int Fanho;
    private String Direccion;
    private boolean Condiciones;
    private Evento evento;
}
