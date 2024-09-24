
package com.mycompany.usil_s5_practica_xyz.controller;

import com.mycompany.usil_s5_practica_xyz.model.Evento;
import com.mycompany.usil_s5_practica_xyz.repository.EventoRepository;
import java.io.IOException;
import java.util.List;
public class EventoController {
    
    public void guardarEvento(Evento evento) throws IOException {
        EventoRepository.guardarEvento(evento);
    }
    public List<Evento> cargarEvento() throws IOException{
        return EventoRepository.cargarEvento();
    }
    public boolean revisarEvento(String nombreEvento) throws IOException {
        return EventoRepository.RevisionEvento(nombreEvento);
    }
}
