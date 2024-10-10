
package com.mycompany.usil_pc1.Controller;

import com.mycompany.usil_pc1.Model.Alimento;
import com.mycompany.usil_pc1.Repository.AlimentoRepository;
import com.mycompany.usil_pc1.Model.UsuarioCalorias;
import com.mycompany.usil_pc1.Repository.UsuarioRepository;
import java.io.IOException;
import java.util.List;

public class CaloriasController {
    
    public void registrarUsuarioYAlimentos(UsuarioCalorias usuario, Alimento alimento) throws IOException {
        if (alimento.getPorcion() <= 0 || alimento.getCalorias() <= 0) {
            throw new IllegalArgumentException("La porción y las calorías deben ser valores positivos.");
        }

        usuario.getAlimentosConsumidos().add(alimento);

        switch (alimento.getTipoComida().toLowerCase()) {
            case "desayuno":
                usuario.setCaloriasDesayuno(usuario.getCaloriasDesayuno() + alimento.getCalorias());
                break;
            case "almuerzo":
                usuario.setCaloriasAlmuerzo(usuario.getCaloriasAlmuerzo() + alimento.getCalorias());
                break;
            case "cena":
                usuario.setCaloriasCena(usuario.getCaloriasCena() + alimento.getCalorias());
                break;
            default:
                throw new IllegalArgumentException("Tipo de comida no válido: debe ser 'desayuno', 'almuerzo' o 'cena'.");
        }

        AlimentoRepository.guardarAlimento(alimento);

        calcularTotalCalorias(usuario);

        UsuarioRepository.guardarUsuario(usuario);
    }

    public void calcularTotalCalorias(UsuarioCalorias usuario) {
        int total = usuario.getCaloriasDesayuno() + usuario.getCaloriasAlmuerzo() + usuario.getCaloriasCena();
        usuario.setTotalCalorias(total);

        if (total < 1500) {
            usuario.setEstadoConsumo("Bajo Consumo");
            usuario.setRecomendacion("Sugerencia: aumentar la ingesta de proteínas y carbohidratos.");
        } else if (total >= 1500 && total <= 2000) {
            usuario.setEstadoConsumo("Consumo Adecuado");
            usuario.setRecomendacion("Felicitaciones por mantener un balance adecuado.");
        } else {
            usuario.setEstadoConsumo("Exceso de Calorías");
            usuario.setRecomendacion("Sugerencia: reducir el consumo de grasas o aumentar la actividad física.");
        }
    }

    public UsuarioCalorias buscarUsuarioPorNombre(String nombreUsuario) throws IOException {
        List<UsuarioCalorias> usuarios = UsuarioRepository.cargarUsuarios();
        UsuarioCalorias usuarioAcumulado = null;

        for (UsuarioCalorias usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombreUsuario)) {
                if (usuarioAcumulado == null) {

                    usuarioAcumulado = new UsuarioCalorias();
                    usuarioAcumulado.setNombre(usuario.getNombre());
                }

                usuarioAcumulado.setCaloriasDesayuno(usuarioAcumulado.getCaloriasDesayuno() + usuario.getCaloriasDesayuno());
                usuarioAcumulado.setCaloriasAlmuerzo(usuarioAcumulado.getCaloriasAlmuerzo() + usuario.getCaloriasAlmuerzo());
                usuarioAcumulado.setCaloriasCena(usuarioAcumulado.getCaloriasCena() + usuario.getCaloriasCena());
            }
        }

        if (usuarioAcumulado != null) {

            List<Alimento> alimentos = AlimentoRepository.cargarAlimentos();

            for (Alimento alimento : alimentos) {
                if (alimento.getNombreU().equalsIgnoreCase(nombreUsuario)) {
                    usuarioAcumulado.getAlimentosConsumidos().add(alimento);
                }
            }

            calcularTotalCalorias(usuarioAcumulado);
        }

        return usuarioAcumulado;
    }
}
