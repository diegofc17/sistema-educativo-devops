package com.sistemaeducativo.asignaturas_servicio.servicio;

import com.sistemaeducativo.asignaturas_servicio.entidad.Asignatura;
import com.sistemaeducativo.asignaturas_servicio.repositorio.AsignaturaRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AsignaturaServicio {

    private final AsignaturaRepositorio asignaturaRepositorio;

    public AsignaturaServicio(AsignaturaRepositorio asignaturaRepositorio) {
        this.asignaturaRepositorio = asignaturaRepositorio;
    }

    public Asignatura obtenerAsignaturaPorId(Long id) {
        return asignaturaRepositorio.findById(id).orElse(null);
    }
}
