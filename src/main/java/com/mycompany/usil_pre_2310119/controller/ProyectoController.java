
package com.mycompany.usil_pre_2310119.controller;

import com.mycompany.usil_pre_2310119.model.Proyecto;
import com.mycompany.usil_pre_2310119.Repository.ProyectoRepository;
import java.io.IOException;
import java.util.List;
public class ProyectoController {

    public void registrarProyecto(Proyecto proyecto) throws IOException {
        ProyectoRepository.guardarProyecto(proyecto);
    }

    public List<Proyecto> listarProyectos() throws IOException {
        return ProyectoRepository.cargarProyectos();
    }
}