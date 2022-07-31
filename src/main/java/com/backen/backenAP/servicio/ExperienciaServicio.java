package com.backen.backenAP.servicio;

import com.backen.backenAP.modelo.Experiencia;
import com.backen.backenAP.repositorio.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienciaServicio {
    @Autowired
    private ExperienciaRepo experienciaRepo;

    public Experiencia guardaExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }

    public List<Experiencia> listaExperiencia(){
        return experienciaRepo.findAll();
    }
    public Experiencia editarExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void borrarExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
}
