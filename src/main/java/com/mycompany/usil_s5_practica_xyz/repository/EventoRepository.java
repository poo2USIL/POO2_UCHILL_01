
package com.mycompany.usil_s5_practica_xyz.repository;

import com.mycompany.usil_s5_practica_xyz.model.Evento;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EventoRepository {
    private static final String FILE_PATH = "evento.txt";
    
    public static void guardarEvento(Evento evento) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.newLine();
            writer.write(evento.getNombreE());  
        }
    }
 
    public static List<Evento> cargarEvento() throws IOException {
        List<Evento> eventos = new ArrayList<>();
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            return eventos;  
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                eventos.add(new Evento(line));
            }
        }
        
        return eventos;
    }
    
    public static boolean RevisionEvento(String nombreEvento) throws IOException {
        List<Evento> eventos = cargarEvento();

        for (Evento evento : eventos) {
            if (evento.getNombreE().equalsIgnoreCase(nombreEvento)) {
                return true;
            }
        }

        return false;
}
    
}
