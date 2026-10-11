package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Integer> {
}
