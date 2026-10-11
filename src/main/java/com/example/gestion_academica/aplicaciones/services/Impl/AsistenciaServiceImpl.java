package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.AsistenciaService;
import com.example.gestion_academica.domain.model.Asistencia;
import com.example.gestion_academica.infraestructura.repositorio.AsistenciaRepository;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaServiceImpl implements AsistenciaService {

    private final AsistenciaRepository asistenciaRepository;

    public AsistenciaServiceImpl(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    @Override
    public void save(Asistencia asistencia) {
        asistenciaRepository.save(asistencia);
    }

    @Override
    public List<Asistencia> findAll() {
        return asistenciaRepository.findAll();
    }

    @Override
    public Optional<Asistencia> findById(Integer id) {
        return asistenciaRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        asistenciaRepository.deleteById(id);
    }

    @Override
    public void update(Asistencia asistencia) {
        asistenciaRepository.save(asistencia);
    }
}