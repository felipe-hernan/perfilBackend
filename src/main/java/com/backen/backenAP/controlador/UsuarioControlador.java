package com.backen.backenAP.controlador;

import com.backen.backenAP.modelo.Usuario;
import com.backen.backenAP.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuario")
@CrossOrigin(origins = "https://perfilpersonal-52e49.web.app/")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id ){
        Usuario usuario=usuarioServicio.buscarUsuario(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/actualizar/{idUsuario}")
    public ResponseEntity<Usuario> editarUsuario(@PathVariable("idUsuario") Long id,
                                                 @RequestParam ("nombre") String nuevoNombre,
                                                 @RequestParam("apellido") String nuevoApellido,
                                                 @RequestParam("titulo") String nuevoTitulo,
                                                 @RequestParam("profecion") String nuevaProfecion,
                                                 @RequestParam("origen") String nuevaOrigen,
                                                 @RequestParam("descripcion") String nuevaDescripcion,
                                                 @RequestParam("imagen") String nuevaImagen
                                                    ){
        Usuario usuarioNuevo = usuarioServicio.buscarUsuario(id);
        usuarioNuevo.setNombre(nuevoNombre);
        usuarioNuevo.setApellido(nuevoApellido);
        usuarioNuevo.setTitulo(nuevoTitulo);
        usuarioNuevo.setProfecion(nuevaProfecion);
        usuarioNuevo.setOrigen(nuevaOrigen);
        usuarioNuevo.setDescripcion(nuevaDescripcion);
        usuarioNuevo.setImagen(nuevaImagen);
        usuarioServicio.guardaUsuario(usuarioNuevo);
        return new ResponseEntity<>(usuarioNuevo,HttpStatus.OK);
    }

}
