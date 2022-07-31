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
@CrossOrigin(origins = "http://localhost:4200/")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id ){
        Usuario usuario=usuarioServicio.buscarUsuario(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario actualizarUsuario=usuarioServicio.editarUsuario(usuario);
        return new ResponseEntity<>(actualizarUsuario,HttpStatus.OK);
    }

}
