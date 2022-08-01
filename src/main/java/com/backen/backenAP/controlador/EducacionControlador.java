package com.backen.backenAP.controlador;

import com.backen.backenAP.modelo.Educacion;
import com.backen.backenAP.servicio.EducacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://perfilpersonal-52e49.web.app/")
public class EducacionControlador {
    @Autowired
    private EducacionServicio educacionServicio;

    @PutMapping("/actualizar")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion ){
        Educacion actualizarEducacion = educacionServicio.editarEducacion(educacion);
        return new ResponseEntity<>(actualizarEducacion, HttpStatus.OK);
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Educacion>> listaEducacion(){
        List<Educacion> educaciones = educacionServicio.listaEducacion();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    @PostMapping("/guardar")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionServicio.guardaEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionServicio.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
