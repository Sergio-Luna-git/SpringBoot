package com.frig0polla.practica_6_sergio_luna.model;



import com.frig0polla.practica_6_sergio_luna.enums.Curso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "modulo")

public class Modulo {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column( nullable = false )
    private String nombre;

    @Column( length = 4, nullable = false)
    private String codigo;

    @Column( nullable = true)
    private int horas_semanales;

    @Column( nullable = true)
    private int horas_totales;

    @Column( nullable = false)
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @Column(nullable = true)
    private boolean optativo;

    @Column(nullable = true)
    private boolean activo;

    @Transient
    private ArrayList<Curso> cursos =  new ArrayList<Curso>();
}
