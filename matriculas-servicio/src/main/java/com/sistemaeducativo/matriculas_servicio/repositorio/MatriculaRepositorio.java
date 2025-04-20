package com.sistemaeducativo.matriculas_servicio.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;

@Repository
public interface MatriculaRepositorio extends MongoRepository<Matricula, Long> {
}
