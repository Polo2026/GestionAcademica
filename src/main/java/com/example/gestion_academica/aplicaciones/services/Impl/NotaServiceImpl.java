package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.NotaService;
import com.example.gestion_academica.domain.model.Nota;
import com.example.gestion_academica.infraestructura.repositorio.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaServiceImpl implements NotaService {

    private final NotaRepository notaRepository;

    public NotaServiceImpl(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @Override
    public void save(Nota nota) {
        notaRepository.save(nota);
    }

    @Override
    public List<Nota> findAll() {
        return notaRepository.findAll();
    }

    @Override
    public Optional<Nota> findById(Integer id) {
        return notaRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        notaRepository.deleteById(id);
    }

    @Override
    public void update(Nota nota) {
        notaRepository.save(nota);
    }
}