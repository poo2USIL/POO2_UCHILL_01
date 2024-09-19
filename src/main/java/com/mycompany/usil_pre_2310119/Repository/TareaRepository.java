
package com.mycompany.usil_pre_2310119.Repository;

import com.mycompany.usil_pre_2310119.model.Proyecto;
import com.mycompany.usil_pre_2310119.model.Tarea;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class TareaRepository {
    private static final String FILE_PATH = "tarea.txt";

    public static void registrarTarea(Tarea tarea) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(tarea.getNombreT() + "; " +
                    tarea.getResponsable() + "; " +
                    tarea.getEstado() + "; " +
                    tarea.getProyecto().getNombreP());
            writer.newLine();
        }
    }

    public static List<Tarea> listarTareas() throws IOException {
        return cargarTareas();
    }

    public static List<Tarea> filtrarTareasPorProyecto(String nombreProyecto) throws IOException {
        List<Tarea> tareas = cargarTareas();
        List<Tarea> resultado = new ArrayList<>();

        for (Tarea tarea : tareas) {
            if (tarea.getProyecto().getNombreP().equalsIgnoreCase(nombreProyecto)) {
                resultado.add(tarea);
            }
        }
        return resultado;
    }

    private static List<Tarea> cargarTareas() throws IOException {
        List<Tarea> tareas = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return tareas;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 4) {
                    String nombreTarea = parts[0];
                    String responsable = parts[1];
                    String estado = parts[2];
                    String nombreProyecto = parts[3];

                    Proyecto proyecto = buscarProyectoPorNombre(nombreProyecto);
                    Tarea tarea = new Tarea(nombreTarea, responsable, estado, proyecto);
                    tareas.add(tarea);
                }
            }
        }
        return tareas;
    }

    private static Proyecto buscarProyectoPorNombre(String nombreProyecto) {
        return new Proyecto(nombreProyecto);
    }
}