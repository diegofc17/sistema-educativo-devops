package com.sistemaeducativo.matriculas_servicio.servicio.externo;

import com.sistemaeducativo.matriculas_servicio.modelo.Asignatura;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "asignaturas-servicio", url = "http://localhost:8081")
public interface AsignaturaCliente {

    @GetMapping("/api/asignaturas/{id}")
    Asignatura obtenerAsignaturaPorId(@PathVariable("id") Long id);
}
