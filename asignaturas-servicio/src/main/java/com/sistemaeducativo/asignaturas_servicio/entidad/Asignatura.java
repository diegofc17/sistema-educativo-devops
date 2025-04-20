package com.sistemaeducativo.asignaturas_servicio.entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;
}
