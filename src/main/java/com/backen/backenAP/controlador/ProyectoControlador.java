package com.backen.backenAP.controlador;

import com.backen.backenAP.modelo.Proyecto;
import com.backen.backenAP.servicio.ProyectoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/proyecto")
@CrossOrigin(origins = "https://perfilpersonal-52e49.web.app/")
public class ProyectoControlador {
    @Autowired
    private ProyectoServicio proyectoServicio;

    @PutMapping("/actualizar")
    public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto ){
        Proyecto actualizarProyecto = proyectoServicio.editarProyecto(proyecto);
        return new ResponseEntity<>(actualizarProyecto, HttpStatus.OK);
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Proyecto>> listaProyecto(){
        List<Proyecto> proyectos = proyectoServicio.listaProyecto();
        return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    @PostMapping("/guardar")
    public ResponseEntity<Proyecto> crearProyecto(@RequestBody Proyecto proyecto){
        Proyecto nuevoProyecto = proyectoServicio.guardaProyecto(proyecto);
        return new ResponseEntity<>(nuevoProyecto,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarProyecto(@PathVariable("id") Long id){
        proyectoServicio.borrarProyecto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
