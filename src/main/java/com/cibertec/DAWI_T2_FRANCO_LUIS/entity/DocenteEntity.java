package com.cibertec.DAWI_T2_FRANCO_LUIS.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Entity
@Table(name = "docente")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;

    private String apellidos;

    private String correo;

    private String telefono;

    private String especialidad;

    private LocalDate fechaIngreso;

}