package com.frig0polla.practica_6_sergio_luna.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "modulo")

public class Modulo {
    @Id
    @Column( unique = true )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column( length = 4 )
    private String codigo;

}
