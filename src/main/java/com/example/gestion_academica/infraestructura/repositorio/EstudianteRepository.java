package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
