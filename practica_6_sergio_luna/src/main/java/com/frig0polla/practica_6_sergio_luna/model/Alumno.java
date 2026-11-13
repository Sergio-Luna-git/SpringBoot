package com.frig0polla.practica_6_sergio_luna.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;

@Table(name = "alumno")
@Entity
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Data

public class Alumno {
    @Id
    @Column( unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nia;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true, precision = 4, scale = 2)
    private BigDecimal notaMediaCursoAnterior;

    @Transient
    private Curso curso = new Curso();

    public Alumno (String nombre,  String apellidos, String email, double notaMediaCursoAnterior) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.email = email;
            this.notaMediaCursoAnterior=  BigDecimal.valueOf(notaMediaCursoAnterior);
    }

}
