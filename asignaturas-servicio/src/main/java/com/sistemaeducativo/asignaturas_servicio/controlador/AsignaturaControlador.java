package com.sistemaeducativo.asignaturas_servicio.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaeducativo.asignaturas_servicio.entidad.Asignatura;
import com.sistemaeducativo.asignaturas_servicio.repositorio.AsignaturaRepositorio;

@RestController
@RequestMapping("/api/asignaturas")
public class AsignaturaControlador {

    private final AsignaturaRepositorio asignaturaRepositorio;

    public AsignaturaControlador(AsignaturaRepositorio asignaturaRepositorio) {
        this.asignaturaRepositorio = asignaturaRepositorio;
    }

    @GetMapping
    public List<Asignatura> listarAsignaturas() {
        return asignaturaRepositorio.findAll();
    }

    @PostMapping
    public Asignatura crearAsignatura(@RequestBody Asignatura asignatura) {
        return asignaturaRepositorio.save(asignatura);
    }

    @GetMapping("/{id}")
    public Asignatura obtenerAsignatura(@PathVariable Long id) {
        return asignaturaRepositorio.findById(id).orElse(null);
    }
}
