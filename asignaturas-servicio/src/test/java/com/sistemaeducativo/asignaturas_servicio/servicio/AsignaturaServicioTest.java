package com.sistemaeducativo.asignaturas_servicio.servicio;

import com.sistemaeducativo.asignaturas_servicio.entidad.Asignatura;
import com.sistemaeducativo.asignaturas_servicio.repositorio.AsignaturaRepositorio;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class AsignaturaServicioTest {

    @Test
    void testObtenerAsignaturaPorId() {
        // Arrange
        AsignaturaRepositorio repoMock = Mockito.mock(AsignaturaRepositorio.class);
        AsignaturaServicio servicio = new AsignaturaServicio(repoMock);

        Asignatura asignatura = new Asignatura();
        asignatura.setId(1L);
        asignatura.setNombre("Matemáticas");

        Mockito.when(repoMock.findById(1L)).thenReturn(Optional.of(asignatura));

        // Act
        Asignatura resultado = servicio.obtenerAsignaturaPorId(1L);

        // Assert
        assertThat(resultado).isNotNull();
        assertThat(resultado.getNombre()).isEqualTo("Matemáticas");
    }
}
