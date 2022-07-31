package com.backen.backenAP.servicio;

import com.backen.backenAP.modelo.Usuario;
import com.backen.backenAP.repositorio.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class UsuarioServicio {
    @Autowired
    private UsuarioRepo usuarioRepo;

    public Usuario guardaUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public List<Usuario> listaUsuario(){
        return usuarioRepo.findAll();
    }
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void borrarUsuario(Long id){
        usuarioRepo.deleteById(id);
    }

    public Usuario buscarUsuario(Long id){
        return usuarioRepo.findById(id).orElse(null);
    }

}
