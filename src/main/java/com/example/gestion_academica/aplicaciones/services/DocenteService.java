package com.example.gestion_academica.aplicaciones.services;

import com.example.gestion_academica.domain.model.Docente;


import java.util.List;
import java.util.Optional;

public interface DocenteService {

    void save(Docente docente);
    List<Docente> findAll();
    Optional<Docente> findById(Integer id);
    void delete(Integer id);
    void update(Docente docente);

}