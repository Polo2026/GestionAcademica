package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {
}
