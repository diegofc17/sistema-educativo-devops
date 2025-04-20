package com.sistemaeducativo.matriculas_servicio.servicio;

import java.util.List;

import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;

public interface MatriculaServicio {
    Matricula guardarMatricula(Matricula matricula);
    List<Matricula> listarMatriculas();
    Matricula obtenerMatriculaPorId(Long id);
}
