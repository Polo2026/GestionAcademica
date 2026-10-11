package com.example.gestion_academica.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "MATRICULA")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_matricula")
    private Integer id;

    @Column(name = "fecha_matricula", nullable = false)
    private LocalDate fechaMatricula;

    @Column(name = "numero_salon", nullable = false)
    private Integer numeroSalon;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso curso;

    public Matricula() {
    }

    public Matricula(Integer id, LocalDate fechaMatricula, Integer numeroSalon,
                     Estudiante estudiante, Curso curso) {
        this.id = id;
        this.fechaMatricula = fechaMatricula;
        this.numeroSalon = numeroSalon;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(LocalDate fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public Integer getNumeroSalon() {
        return numeroSalon;
    }

    public void setNumeroSalon(Integer numeroSalon) {
        this.numeroSalon = numeroSalon;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", fechaMatricula=" + fechaMatricula +
                ", numeroSalon=" + numeroSalon +
                ", estudiante=" + (estudiante != null ? estudiante.getId() : null) +
                ", curso=" + (curso != null ? curso.getId() : null) +
                '}';
    }
}