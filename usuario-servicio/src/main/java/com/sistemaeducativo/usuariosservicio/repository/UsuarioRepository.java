package com.sistemaeducativo.usuariosservicio.repository;

import com.sistemaeducativo.usuariosservicio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
