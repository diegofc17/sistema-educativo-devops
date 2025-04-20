package com.sistemaeducativo.usuariosservicio.service;

import com.sistemaeducativo.usuariosservicio.model.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario guardarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorId(Long id);
}
