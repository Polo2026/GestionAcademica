package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoRepository extends JpaRepository<Telefono, Integer> {
}
