package com.example.gestion_academica.infraestructura.repositorio;

import com.example.gestion_academica.domain.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    Optional<Estudiante> findById(Long estudianteId);

    Estudiante save(Estudiante estudiante);

    List<Estudiante> findAll();

    void deleteById(Estudiante id);

    Estudiante findyByEmail();
}
