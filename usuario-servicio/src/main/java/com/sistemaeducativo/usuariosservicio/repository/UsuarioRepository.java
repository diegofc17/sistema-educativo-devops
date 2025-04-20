package com.sistemaeducativo.usuariosservicio.repository;

import com.sistemaeducativo.usuariosservicio.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, Long> {
}