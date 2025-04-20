package com.sistemaeducativo.matriculas_servicio.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;
import com.sistemaeducativo.matriculas_servicio.repositorio.MatriculaRepositorio;
import com.sistemaeducativo.matriculas_servicio.servicio.MatriculaServicio;

@Service
public class MatriculaServicioImpl implements MatriculaServicio {

    private final MatriculaRepositorio matriculaRepositorio;

    @Autowired
    public MatriculaServicioImpl(MatriculaRepositorio matriculaRepositorio) {
        this.matriculaRepositorio = matriculaRepositorio;
    }
    
    
    @Override
    public Matricula guardarMatricula(Matricula matricula) {
        return matriculaRepositorio.save(matricula);
    }

    @Override
    public List<Matricula> listarMatriculas() {
        return matriculaRepositorio.findAll();
    }

    @Override
    public Matricula obtenerMatriculaPorId(Long id) {
        Optional<Matricula> optional = matriculaRepositorio.findById(id);
        return optional.orElse(null);
    }
}
