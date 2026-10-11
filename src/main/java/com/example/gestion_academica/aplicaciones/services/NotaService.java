package com.example.gestion_academica.aplicaciones.services;


import com.example.gestion_academica.domain.model.Nota;

import java.util.List;
import java.util.Optional;

public interface NotaService {
    void save(Nota nota);
    List<Nota> findAll();
    Optional<Nota> findById(Integer id);
    void delete(Integer id);
    void update(Nota nota);

}
