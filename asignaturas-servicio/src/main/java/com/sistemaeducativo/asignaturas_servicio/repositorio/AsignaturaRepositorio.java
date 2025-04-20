package com.sistemaeducativo.asignaturas_servicio.repositorio;

import com.sistemaeducativo.asignaturas_servicio.entidad.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepositorio extends JpaRepository<Asignatura, Long> {
}
