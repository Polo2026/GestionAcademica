package com.example.gestion_academica.aplicaciones.services;


import com.example.gestion_academica.domain.model.Matricula;

import java.util.List;
import java.util.Optional;

public interface MatriculaService {
    void save(Matricula matricula);
    List<Matricula> findAll();
    Optional<Matricula> findById(Integer id);
    void delete(Integer id);
    void update(Matricula matricula);

}