package com.backen.backenAP.repositorio;

import com.backen.backenAP.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
}
