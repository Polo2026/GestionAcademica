package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {
}
