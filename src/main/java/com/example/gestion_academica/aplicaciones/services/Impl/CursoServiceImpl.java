package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.CursoService;
import com.example.gestion_academica.domain.model.Curso;
import com.example.gestion_academica.infraestructura.repositorio.CursoRepository;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public void save(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Optional<Curso> findById(Integer id) {
        return cursoRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public void update(Curso curso) {
        cursoRepository.save(curso);
    }
}