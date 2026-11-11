package com.frig0polla.practica_6_sergio_luna.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "alumno")
@Entity
@NoArgsConstructor
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

    @Column(nullable = true)
    private BigDecimal notaMediaCurso;



}
