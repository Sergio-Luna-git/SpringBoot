package com.frig0polla.practica_6_sergio_luna.model;


import com.frig0polla.practica_6_sergio_luna.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Table( name = "curso")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Curso {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String ciclo;

    @Column(nullable = true)
    private String aula;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private Turno turno;

    @Transient
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    @Transient
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();

    public Curso(int id, String nombre, String ciclo, String aula, Turno turno) {
        this.id = id;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.aula = aula;
        this.turno = turno;
    }

}
