package com.sistemaeducativo.usuariosservicio.servicio;

import com.sistemaeducativo.usuariosservicio.model.Usuario;
import com.sistemaeducativo.usuariosservicio.repository.UsuarioRepository;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import com.sistemaeducativo.usuariosservicio.service.UsuarioServiceImpl;

public class UsuarioServicioTest {

    @Test
    void testObtenerUsuarioPorId() {
        // Arrange
        UsuarioRepository repoMock = Mockito.mock(UsuarioRepository.class);
        UsuarioServiceImpl servicio = new UsuarioServiceImpl(repoMock);

        // Usar constructor sin parámetros y setear campos manualmente
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Diego");
        usuario.setTipo("Estudiante");
        usuario.setCorreo("Correo");

        Mockito.when(repoMock.findById(1L)).thenReturn(Optional.of(usuario));

        // Act
        Usuario resultado = servicio.obtenerUsuarioPorId(1L);

        // Assert
        assertThat(resultado).isNotNull();
        assertThat(resultado.getNombre()).isEqualTo("Diego");
    }
}
