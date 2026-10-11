package com.example.gestion_academica.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ASISTENCIA")
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia")
    private Integer id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "estado", nullable = false, length = 20)
    private String estado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_matricula", nullable = false)
    private Matricula matricula;

    public Asistencia() {
    }

    public Asistencia(Integer id, LocalDate fecha, String estado, Matricula matricula) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", matricula=" + (matricula != null ? matricula.getId() : null) +
                '}';
    }
}