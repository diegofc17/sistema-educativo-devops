package com.sistemaeducativo.matriculas_servicio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;

@Repository
public interface MatriculaRepositorio extends JpaRepository<Matricula, Long> {
}
