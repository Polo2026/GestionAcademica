package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.MatriculaService;
import com.example.gestion_academica.domain.model.Matricula;
import com.example.gestion_academica.infraestructura.repositorio.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository matriculaRepository;

    public MatriculaServiceImpl(MatriculaRepository matriculaRepository) {
        this.matriculaRepository = matriculaRepository;
    }

    @Override
    public void save(Matricula matricula) {
        matriculaRepository.save(matricula);
    }

    @Override
    public List<Matricula> findAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public Optional<Matricula> findById(Integer id) {
        return matriculaRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        matriculaRepository.deleteById(id);
    }

    @Override
    public void update(Matricula matricula) {
        matriculaRepository.save(matricula);
    }
}