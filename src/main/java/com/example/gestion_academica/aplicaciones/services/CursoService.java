package com.example.gestion_academica.aplicaciones.services;


import com.example.gestion_academica.domain.model.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    void save(Curso curso);
    List<Curso> findAll();
    Optional<Curso> findById(Integer id);
    void delete(Integer id);
    void update(Curso curso);

}
