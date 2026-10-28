package com.example.gestion_academica.aplicaciones.services;


import com.example.gestion_academica.domain.model.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {
    Estudiante save(Estudiante estudiante);
    List<Estudiante> findAll();
    Optional<Estudiante> findById(Integer id);
    void delete(Integer id);
    void update(Estudiante estudiante);

}
