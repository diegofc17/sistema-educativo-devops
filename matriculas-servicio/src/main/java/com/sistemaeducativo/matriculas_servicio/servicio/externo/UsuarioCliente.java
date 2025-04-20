package com.sistemaeducativo.matriculas_servicio.servicio.externo;

import com.sistemaeducativo.matriculas_servicio.modelo.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-servicio")
public interface UsuarioCliente {

    @GetMapping("/api/usuario/{id}")
    Usuario obtenerUsuarioPorId(@PathVariable("id") Long id);
}
