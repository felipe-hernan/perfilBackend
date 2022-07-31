package com.backen.backenAP.servicio;

import com.backen.backenAP.modelo.Proyecto;
import com.backen.backenAP.repositorio.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ProyectoServicio {
    @Autowired
    private ProyectoRepo proyectoRepo;

    public Proyecto guardaProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }

    public List<Proyecto> listaProyecto(){
        return proyectoRepo.findAll();
    }
    public Proyecto editarProyecto(Proyecto proyecto){
        return proyectoRepo.save(proyecto);
    }
    public void borrarProyecto(Long id){
        proyectoRepo.deleteById(id);
    }
}

