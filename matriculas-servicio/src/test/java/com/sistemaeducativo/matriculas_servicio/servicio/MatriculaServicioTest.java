package com.sistemaeducativo.matriculas_servicio.servicio;

import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;
import com.sistemaeducativo.matriculas_servicio.repositorio.MatriculaRepositorio;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import com.sistemaeducativo.matriculas_servicio.servicio.impl.MatriculaServicioImpl;

public class MatriculaServicioTest {

    @Test
    void testObtenerMatriculaPorId() {
        // Arrange
        MatriculaRepositorio repoMock = Mockito.mock(MatriculaRepositorio.class);
        MatriculaServicio servicio = new MatriculaServicioImpl(repoMock); // 👈 ahora sí

        Matricula matricula = new Matricula();
        matricula.setUsuarioId(1L);
        matricula.setAsignaturaId(1L);

        Mockito.when(repoMock.findById(1L)).thenReturn(Optional.of(matricula));

        // Act
        Matricula resultado = servicio.obtenerMatriculaPorId(1L);

        // Assert
        assertThat(resultado).isNotNull();
        assertThat(resultado.getUsuarioId()).isEqualTo(1L);
    }
}
