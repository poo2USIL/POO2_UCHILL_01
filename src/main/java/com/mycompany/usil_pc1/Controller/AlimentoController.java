
package com.mycompany.usil_pc1.Controller;

import com.mycompany.usil_pc1.Model.Alimento;
import com.mycompany.usil_pc1.Repository.AlimentoRepository;
import java.io.IOException;
import java.util.List;

public class AlimentoController {
    
    public void guardarAlimento(Alimento alimento) throws IOException {
        AlimentoRepository.guardarAlimento(alimento);
    }
    
    public List<Alimento> cargarAlimentos() throws IOException {
        return AlimentoRepository.cargarAlimentos();
    }
    
}
