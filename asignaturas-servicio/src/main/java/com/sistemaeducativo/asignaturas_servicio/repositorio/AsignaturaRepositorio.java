package com.sistemaeducativo.asignaturas_servicio.repositorio;

import com.sistemaeducativo.asignaturas_servicio.entidad.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AsignaturaRepositorio extends MongoRepository<Asignatura, Long> {
}
