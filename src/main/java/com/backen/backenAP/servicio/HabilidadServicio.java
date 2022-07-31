package com.backen.backenAP.servicio;

import com.backen.backenAP.modelo.Habilidad;
import com.backen.backenAP.repositorio.HabilidadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class HabilidadServicio {
    @Autowired
    private HabilidadRepo habilidadRepo;

    public Habilidad guardaHabilidad(Habilidad habilidad){
        return habilidadRepo.save(habilidad);
    }

    public List<Habilidad> listaHabilidad(){
        return habilidadRepo.findAll();
    }
    public Habilidad editarHabilidad(Habilidad habilidad){
        return habilidadRepo.save(habilidad);
    }
    public void borrarHabilidad(Long id){
        habilidadRepo.deleteById(id);
    }
}
