    package com.sistemaeducativo.matriculas_servicio.controlador;

    import java.util.List;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    import com.sistemaeducativo.matriculas_servicio.entidad.Matricula;
    import com.sistemaeducativo.matriculas_servicio.repositorio.MatriculaRepositorio;

    import com.sistemaeducativo.matriculas_servicio.modelo.Asignatura;
    import com.sistemaeducativo.matriculas_servicio.modelo.Usuario;
    import com.sistemaeducativo.matriculas_servicio.servicio.externo.AsignaturaCliente;
    import com.sistemaeducativo.matriculas_servicio.servicio.externo.UsuarioCliente;
    import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api/matriculas")
    public class MatriculaControlador {

        @Autowired
        private MatriculaRepositorio matriculaRepositorio;

        @GetMapping
        public List<Matricula> listarMatriculas() {
            return matriculaRepositorio.findAll();
        }

        @PostMapping
        public Matricula crearMatricula(@RequestBody Matricula matricula) {
            return matriculaRepositorio.save(matricula);
        }
    }
