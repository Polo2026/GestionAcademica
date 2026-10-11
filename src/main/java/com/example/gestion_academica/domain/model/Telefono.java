package com.example.gestion_academica.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TELEFONO")
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefono")
    private Integer id;

    @Column(name = "numero", nullable = false, length = 15)
    private String numero;

    @Column(name = "tipo", length = 20)
    private String tipo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_estudiante", nullable = false)
    private Estudiante estudiante;

    public Telefono() {
    }

    public Telefono(Integer id, String numero, String tipo, Estudiante estudiante) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.estudiante = estudiante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estudiante=" + estudiante +
                '}';
    }
}
