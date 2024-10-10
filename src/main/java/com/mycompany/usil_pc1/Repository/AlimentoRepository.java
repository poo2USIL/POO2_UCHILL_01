
package com.mycompany.usil_pc1.Repository;

import com.mycompany.usil_pc1.Model.Alimento;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlimentoRepository {
    private static final String FILE_PATH = "alimentos.txt";
    
    public static void guardarAlimento(Alimento alimento) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(alimento.getNombreU()+ ";" +
                    alimento.getTipoComida()+ ";" +
                    alimento.getNombreAlimento()+ ";" +
                    alimento.getPorcion()+ ";" +
                    alimento.getCalorias());  
            writer.newLine();
        }
    }
    
    public static List<Alimento> cargarAlimentos() throws IOException {
        List<Alimento> alimentos = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return alimentos;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String usuarioC = parts[0];

                    String tipoComida = parts[1]; 
                    String nombreAlimento = parts[2];
                    int porcion = Integer.parseInt(parts[3]);
                    int calorias = Integer.parseInt(parts[4]);

                    alimentos.add(new Alimento(usuarioC, tipoComida, nombreAlimento, porcion, calorias));
                }
            }
        }

        return alimentos;
    }
    
}

