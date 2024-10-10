
package com.mycompany.usil_pc1.Repository;

import com.mycompany.usil_pc1.Model.UsuarioCalorias;
import com.mycompany.usil_pc1.Model.Alimento;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsuarioRepository {
    private static final String FILE_PATH = "calorias.txt";

    public static void guardarUsuario(UsuarioCalorias UC) throws IOException {
        int totalCalorias = UC.getCaloriasDesayuno() + UC.getCaloriasAlmuerzo() + UC.getCaloriasCena();
        UC.setTotalCalorias(totalCalorias);

        String estadoConsumo = calcularEstadoConsumo(totalCalorias);
        UC.setEstadoConsumo(estadoConsumo);

        String recomendacion = generarRecomendacion(estadoConsumo);
        UC.setRecomendacion(recomendacion);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String alimentos = UC.getAlimentosConsumidos().stream()
                    .map(Alimento::getNombreAlimento)
                    .collect(Collectors.joining(","));

                    writer.write(UC.getNombre() + ";" +
                    UC.getCaloriasDesayuno() + ";" +
                    UC.getCaloriasAlmuerzo() + ";" +
                    UC.getCaloriasCena() + ";" +
                    UC.getTotalCalorias() + ";" +
                    UC.getEstadoConsumo() + ";" +
                    UC.getRecomendacion() + ";" +
                    alimentos);
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
                String[] parts = line.split(";");
                if (parts.length == 8) {
                    String nombre = parts[0];
                    int caloriasDesayuno = Integer.parseInt(parts[1]);
                    int caloriasAlmuerzo = Integer.parseInt(parts[2]);
                    int caloriasCena = Integer.parseInt(parts[3]);
                    int totalCalorias = Integer.parseInt(parts[4]);
                    String estadoConsumo = parts[5];
                    String recomendacion = parts[6];

                    List<Alimento> alimentosConsumidos = Arrays.stream(parts[7].split(","))
                            .map(nombreAlimento -> new Alimento(null, null, nombreAlimento, 0, 0))
                            .collect(Collectors.toList());

                    usuarios.add(new UsuarioCalorias(nombre, caloriasDesayuno, caloriasAlmuerzo, caloriasCena, totalCalorias, estadoConsumo, recomendacion, alimentosConsumidos));
                }
            }
        }

        return usuarios;
    }

    public static String calcularEstadoConsumo(int totalCalorias) {
        if (totalCalorias < 1500) {
            return "Bajo Consumo";
        } else if (totalCalorias <= 2000) {
            return "Consumo Adecuado";
        } else {
            return "Exceso de Calorías";
        }
    }

    public static String generarRecomendacion(String estadoConsumo) {
        switch (estadoConsumo) {
            case "Bajo Consumo":
                return "Sugerir aumentar la ingesta de proteínas y carbohidratos.";
            case "Exceso de Calorías":
                return "Sugerir reducir el consumo de grasas o aumentar la actividad física.";
            case "Consumo Adecuado":
                return "Felicitar al usuario por mantener un balance adecuado.";
            default:
                return "";
        }
    }
    
    public static UsuarioCalorias buscarUsuarioPorNombre(String nombreUsuario) throws IOException {
        List<UsuarioCalorias> usuarios = UsuarioRepository.cargarUsuarios();

        for (UsuarioCalorias usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombreUsuario)) {
                return usuario;
            }
        }

        return null;
    }
}