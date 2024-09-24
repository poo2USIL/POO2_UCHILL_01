
package com.mycompany.usil_s5_practica_xyz.controller;

import com.mycompany.usil_s5_practica_xyz.model.Invitado;
import com.mycompany.usil_s5_practica_xyz.repository.InvitadoRepository;
import java.io.IOException;
import java.util.List;
public class InvitadoController {
    
    public void guardarInvitado(Invitado invitado) throws IOException {
        InvitadoRepository.guardarInvitado(invitado);
    }
    public List<Invitado> cargarInvitado() throws IOException {
        return InvitadoRepository.cargarInvitado();
    }
    public boolean revisarInvitado(String nombreI, int numeroC) throws IOException {
        return InvitadoRepository.revisarInvitado(nombreI, numeroC);
    }
}
