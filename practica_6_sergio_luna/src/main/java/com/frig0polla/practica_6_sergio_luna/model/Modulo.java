package com.frig0polla.practica_6_sergio_luna.model;


import com.frig0polla.practica_6_sergio_luna.model.enums.Curso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "modulo")

public class Modulo {
    @Id
    @Column( unique = true )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( nullable = false )
    private String nombre;

    @Column( length = 4, nullable = false)
    private String codigo;

    @Column( nullable = true)
    private int horasSemanales;

    @Column( nullable = true)
    private int horasTotales;

    @Column( nullable = false)
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Column(nullable = true)
    private boolean optativo;

    @Column(nullable = true)
    private boolean activo;
}
