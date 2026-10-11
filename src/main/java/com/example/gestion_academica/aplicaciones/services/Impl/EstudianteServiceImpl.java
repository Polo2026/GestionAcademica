package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.EstudianteService;
import com.example.gestion_academica.domain.model.Estudiante;
import com.example.gestion_academica.infraestructura.repositorio.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Integer id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public void update(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }
}