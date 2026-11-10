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
    @Column( unique = true )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nia;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String email;

    @Column
    private BigDecimal notaMediaCurso;



}
