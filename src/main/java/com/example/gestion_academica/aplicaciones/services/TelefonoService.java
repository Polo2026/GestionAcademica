package com.example.gestion_academica.aplicaciones.services;


import com.example.gestion_academica.domain.model.Telefono;

import java.util.List;
import java.util.Optional;

public interface TelefonoService {
    void save(Telefono telefono);
    List<Telefono> findAll();
    Optional<Telefono> findById(Integer id);
    void delete(Integer id);
    void update(Telefono telefono);

}
