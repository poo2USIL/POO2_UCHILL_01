
package com.mycompany.usil_pc1.Controller;

import com.mycompany.usil_pc1.Model.Alimento;
import com.mycompany.usil_pc1.Repository.AlimentoRepository;
import com.mycompany.usil_pc1.Model.UsuarioCalorias;
import com.mycompany.usil_pc1.Repository.UsuarioRepository;
import java.io.IOException;
import java.util.List;
public class CaloriasController {
    
    public void guardarAlimento(Alimento alimento) throws IOException {
        AlimentoRepository.guardarAlimento(alimento);
    }
    
    public List<Alimento> cargarAlimentos() throws IOException {
        return AlimentoRepository.cargarAlimentos();
    }
    
    public void guardarUsuario(UsuarioCalorias UC) throws IOException {
        UsuarioRepository.guardarUsuario(UC);
    }
    
    public List<UsuarioCalorias> cargarUsuarios() throws IOException {
        return UsuarioRepository.cargarUsuarios();
    }
    
}
