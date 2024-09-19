
package com.mycompany.usil_pre_2310119.Repository;

import com.mycompany.usil_pre_2310119.model.Proyecto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ProyectoRepository {
    private static final String FILE_PATH = "proyecto.txt";
    
     public static void guardarProyecto(Proyecto proyecto) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(proyecto.getNombreP());
            writer.newLine();
        }
    }
    public static List<Proyecto> cargarProyectos() throws IOException {
        List<Proyecto> proyectos = new ArrayList<>();
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            return proyectos;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                proyectos.add(new Proyecto(line));
            }
        }
        return proyectos;
    }
}