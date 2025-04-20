package com.sistemaeducativo.matriculas_servicio.modelo;

import lombok.Data;

@Data
public class Usuario {
    private Long id;
    private String nombre;
    private String correo;
    private String tipo; // estudiante o docente
}
