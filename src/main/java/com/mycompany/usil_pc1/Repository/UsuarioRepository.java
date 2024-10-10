
package com.mycompany.usil_pc1.Repository;

import com.mycompany.usil_pc1.Model.UsuarioCalorias;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static final String FILE_PATH = "calorias.txt";

    public static void guardarUsuario(UsuarioCalorias UC) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {  // 'true' para agregar al archivo
            writer.write(UC.getNombre() + ";" +
                    UC.getCaloriasDesayuno() + ";" +
                    UC.getCaloriasAlmuerzo() + ";" +
                    UC.getCaloriasCena() + ";" +
                    UC.getTotalCalorias() + ";" +
                    UC.getEstadoConsumo() + ";" +
                    UC.getRecomendacion());
            writer.newLine();
        }
    }

    public static List<UsuarioCalorias> cargarUsuarios() throws IOException {
        List<UsuarioCalorias> usuarios = new ArrayList<>();
        File file = new File(FILE_PATH);

        if (!file.exists()) {
            return usuarios;  
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");  
                UsuarioCalorias usuario = new UsuarioCalorias();
                usuario.setNombre(datos[0]);
                usuario.setCaloriasDesayuno(Integer.parseInt(datos[1]));
                usuario.setCaloriasAlmuerzo(Integer.parseInt(datos[2]));
                usuario.setCaloriasCena(Integer.parseInt(datos[3]));
                usuario.setTotalCalorias(Integer.parseInt(datos[4]));
                usuario.setEstadoConsumo(datos[5]);
                usuario.setRecomendacion(datos[6]);

                usuarios.add(usuario);  
            }
        }
        
        return usuarios;
    }

}