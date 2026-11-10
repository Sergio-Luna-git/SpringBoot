package com.frig0polla.practica_6_sergio_luna.model;


import com.frig0polla.practica_6_sergio_luna.model.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table( name = "curso")
@Entity
@NoArgsConstructor
@AllArgsConstructor
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
