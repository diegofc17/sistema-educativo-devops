package com.sistemaeducativo.matriculas_servicio.controlador;

import com.sistemaeducativo.matriculas_servicio.modelo.Asignatura;
import com.sistemaeducativo.matriculas_servicio.modelo.Usuario;
import com.sistemaeducativo.matriculas_servicio.servicio.externo.AsignaturaCliente;
import com.sistemaeducativo.matriculas_servicio.servicio.externo.UsuarioCliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestIntegracionController {

    private final UsuarioCliente usuarioCliente;
    private final AsignaturaCliente asignaturaCliente;

    public TestIntegracionController(UsuarioCliente usuarioCliente, AsignaturaCliente asignaturaCliente) {
        this.usuarioCliente = usuarioCliente;
        this.asignaturaCliente = asignaturaCliente;
    }

    @GetMapping("/usuario/{id}")
    public Usuario obtenerUsuario(@PathVariable Long id) {
        return usuarioCliente.obtenerUsuarioPorId(id);
    }

    @GetMapping("/asignatura/{id}")
    public Asignatura obtenerAsignatura(@PathVariable Long id) {
        return asignaturaCliente.obtenerAsignaturaPorId(id);
    }
}
