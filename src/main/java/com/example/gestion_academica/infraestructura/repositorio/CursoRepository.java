package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
