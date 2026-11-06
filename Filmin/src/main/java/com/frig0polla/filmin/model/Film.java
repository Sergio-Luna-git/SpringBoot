package com.frig0polla.filmin.model;

import java.time.LocalDate;
import java.util.Objects;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFilm;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column
    private int anyo;

    @Column
    private String pais;

    @Column
    private String sinopsis;

    @Column
    private float nota;

    @Transient
    private boolean vista;

    @UpdateTimestamp
    private LocalDate ultimaModificacion;

    @CreationTimestamp
    private LocalDate dataCreacion;

    public Film(String titulo, int anyo, String pais, String sinopsis, float nota) {
        this.titulo = titulo;
        this.anyo = anyo;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.nota = nota;
    }

    public Film() {

    }

    public Long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Long idFilm) {
        this.idFilm = idFilm;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Film [idFilm=" + idFilm + ", titulo=" +
                titulo + ", anyo=" + anyo + ", pais=" +
                pais + ", sinopsis=" + sinopsis + ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(anyo, idFilm, nota, pais, sinopsis, titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Film other = (Film) obj;

        return anyo == other.anyo
                && Objects.equals(idFilm, other.idFilm)
                && Float.floatToIntBits(nota) == Float.floatToIntBits(other.nota)
                && Objects.equals(pais, other.pais)
                && Objects.equals(sinopsis, other.sinopsis)
                && Objects.equals(titulo, other.titulo);
    }
}