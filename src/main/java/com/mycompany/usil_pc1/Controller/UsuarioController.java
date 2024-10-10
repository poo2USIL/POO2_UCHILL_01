
package com.mycompany.usil_pc1.Controller;

import com.mycompany.usil_pc1.Model.UsuarioCalorias;
import com.mycompany.usil_pc1.Repository.UsuarioRepository;
import java.io.IOException;
import java.util.List;

public class UsuarioController {
    
    public void guardarUsuario(UsuarioCalorias UC) throws IOException {
        UsuarioRepository.guardarUsuario(UC);
    }
    
    public List<UsuarioCalorias> cargarUsuarios() throws IOException {
        return UsuarioRepository.cargarUsuarios();
    }
    
    public static UsuarioCalorias buscarUsuarioPorNombre(String nombreUsuario) throws IOException {
        return UsuarioRepository.buscarUsuarioPorNombre(nombreUsuario);
    }
    
    public static String calcularEstadoConsumo(int totalCalorias) {
        return UsuarioRepository.calcularEstadoConsumo(totalCalorias);
    }
    
    public static String generarRecomendacion(String estadoConsumo) {
        return UsuarioRepository.generarRecomendacion(estadoConsumo);
    }
    
}
