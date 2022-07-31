package com.backen.backenAP.servicio;

import com.backen.backenAP.modelo.Educacion;
import com.backen.backenAP.repositorio.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class EducacionServicio {

    @Autowired
    private EducacionRepo educacionRepo;

    public Educacion guardaEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public List<Educacion> listaEducacion(){
        return educacionRepo.findAll();
    }
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }

}
