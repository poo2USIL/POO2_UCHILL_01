
package com.mycompany.usil_pre_2310119.controller;

import com.mycompany.usil_pre_2310119.model.Tarea;
import com.mycompany.usil_pre_2310119.Repository.TareaRepository;
import java.io.IOException;
import java.util.List;
public class TareaController {

    public void registrarTarea(Tarea tarea) throws IOException {
        TareaRepository.
                registrarTarea(tarea);
    }

    public List<Tarea> listarTareas() throws IOException {
        return TareaRepository.listarTareas();
    }

    public List<Tarea> filtrarTareasPorProyecto(String nombreProyecto) throws IOException {
        return TareaRepository.filtrarTareasPorProyecto(nombreProyecto);
    }
}
