package com.backen.backenAP.controlador;

import com.backen.backenAP.modelo.Experiencia;
import com.backen.backenAP.servicio.ExperienciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://perfilpersonal-52e49.web.app/")
public class ExperienciaControlador {
    @Autowired
    private ExperienciaServicio experienciaServicio;

    @PutMapping("/actualizar")
    public ResponseEntity<Experiencia> editarProyecto(@RequestBody Experiencia experiencia ){
        Experiencia actualizarExperiencia = experienciaServicio.editarExperiencia(experiencia);
        return new ResponseEntity<>(actualizarExperiencia, HttpStatus.OK);
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Experiencia>> listaProyecto(){
        List<Experiencia> experiencias = experienciaServicio.listaExperiencia();
        return new ResponseEntity<>(experiencias,HttpStatus.OK);
    }
    @PostMapping("/guardar")
    public ResponseEntity<Experiencia> crearProyecto(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia = experienciaServicio.guardaExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id){
        experienciaServicio.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
