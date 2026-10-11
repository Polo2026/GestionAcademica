package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Integer> {
}
