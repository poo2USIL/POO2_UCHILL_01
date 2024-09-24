
package com.mycompany.usil_s5_practica_xyz.repository;

import com.mycompany.usil_s5_practica_xyz.model.Evento;
import com.mycompany.usil_s5_practica_xyz.model.Invitado;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InvitadoRepository {
    private static final String FILE_PATH = "invitado.txt";
    
    public static void guardarInvitado(Invitado invitado) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(invitado.getNombreI() + ";" +
                    invitado.getNumeroC() + ";" +
                    invitado.getGenero() + ";" +
                    invitado.getFdia() + ";" +
                    invitado.getFmes() + ";" +
                    invitado.getFanho() + ";" +
                    invitado.getDireccion() + ";" +
                    invitado.isCondiciones() + ";" +
                    invitado.getEvento().getNombreE());
            writer.newLine();
        }
    }

    public static List<Invitado> cargarInvitado() throws IOException {
        List<Invitado> invitados = new ArrayList<>();
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            return invitados;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 9) { // Asegúrate de que el número de partes coincida
                    String nombreI = parts[0];
                    int numeroC = Integer.parseInt(parts[1]);
                    String genero = parts[2];
                    int fdia = Integer.parseInt(parts[3]);
                    String fmes = parts[4];
                    int fanho = Integer.parseInt(parts[5]);
                    String direccion = parts[6];
                    boolean condiciones = Boolean.parseBoolean(parts[7]);
                    Evento evento = new Evento(parts[8]);

                    invitados.add(new Invitado(nombreI, numeroC, genero, fdia, fmes, fanho, direccion, condiciones, evento));
                }
            }
        }
        return invitados;
    }
    
    public static boolean revisarInvitado(String nombreI, int numeroC) throws IOException {
        List<Invitado> invitados = cargarInvitado();
        for (Invitado invitado : invitados) {
            if (invitado.getNombreI().equalsIgnoreCase(nombreI) && invitado.getNumeroC() == numeroC) {
                return true;
            }
        }
        return false;
    }
    
}

