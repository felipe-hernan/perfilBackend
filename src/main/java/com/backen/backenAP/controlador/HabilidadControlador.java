package com.backen.backenAP.controlador;

import com.backen.backenAP.modelo.Habilidad;
import com.backen.backenAP.servicio.HabilidadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/habilidad")
@CrossOrigin(origins = "http://localhost:4200/")
public class HabilidadControlador {
    @Autowired
    private HabilidadServicio habilidadServicio;

    @PutMapping("/actualizar")
    public ResponseEntity<Habilidad> editarEducacion(@RequestBody Habilidad habilidad ){
        Habilidad actualizarHabilidad = habilidadServicio.editarHabilidad(habilidad);
        return new ResponseEntity<>(actualizarHabilidad, HttpStatus.OK);
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Habilidad>> listaEducacion(){
        List<Habilidad> habilidades = habilidadServicio.listaHabilidad();
        return new ResponseEntity<>(habilidades,HttpStatus.OK);
    }
    @PostMapping("/guardar")
    public ResponseEntity<Habilidad> crearEducacion(@RequestBody Habilidad habilidad){
        Habilidad nuevaHabilidad = habilidadServicio.guardaHabilidad(habilidad);
        return new ResponseEntity<>(nuevaHabilidad,HttpStatus.CREATED);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        habilidadServicio.borrarHabilidad(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
