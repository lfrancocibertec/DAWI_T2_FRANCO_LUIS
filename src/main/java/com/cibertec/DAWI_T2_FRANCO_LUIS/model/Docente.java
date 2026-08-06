package com.cibertec.DAWI_T2_FRANCO_LUIS.model;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Docente {

    private Long id;

    @NotBlank(message = "Los nombres son obligatorios")
    @Size(max = 100)
    private String nombres;

    @NotBlank(message = "Los apellidos son obligatorios")
    @Size(max = 100)
    private String apellidos;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo inválido")
    @Size(max = 150)
    private String correo;

    @NotBlank(message = "El teléfono es obligatorio")
    @Size(max = 20)
    private String telefono;

    @NotBlank(message = "La especialidad es obligatoria")
    @Size(max = 100)
    private String especialidad;

    @NotNull(message = "La fecha de ingreso es obligatoria")
    private LocalDate fechaIngreso;

}