package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.DocenteService;
import com.example.gestion_academica.domain.model.Docente;
import com.example.gestion_academica.infraestructura.repositorio.DocenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteServiceImpl implements DocenteService {

    private final DocenteRepository docenteRepository;

    public DocenteServiceImpl(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    @Override
    public void save(Docente docente) {
        docenteRepository.save(docente);
    }

    @Override
    public List<Docente> findAll() {
        return docenteRepository.findAll();
    }

    @Override
    public Optional<Docente> findById(Integer id) {
        return docenteRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public void update(Docente docente) {
        docenteRepository.save(docente);
    }
}