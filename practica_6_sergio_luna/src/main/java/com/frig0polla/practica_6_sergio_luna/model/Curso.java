package com.frig0polla.practica_6_sergio_luna.model;


import com.frig0polla.practica_6_sergio_luna.model.enums.Turno;
import jakarta.persistence.*;
import lombok.Data;

@Table( name = "curso")
@Entity
@Data

public class Curso {
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String ciclo;

    @Column
    @Enumerated(EnumType.STRING)
    private Turno turno;

}
