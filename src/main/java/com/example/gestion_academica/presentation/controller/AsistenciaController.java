package com.example.gestion_academica.presentation.controller;


import com.example.gestion_academica.aplicaciones.services.AsistenciaService;
import com.example.gestion_academica.domain.model.Asistencia;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaController {

    private final AsistenciaService asistenciaService;

    public AsistenciaController(AsistenciaService asistenciaService) {
        this.asistenciaService = asistenciaService;
    }

    @GetMapping
    public List<Asistencia> findAll() {
        return asistenciaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Asistencia> findById(@PathVariable Integer id) {
        return asistenciaService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Asistencia asistencia) {
        asistenciaService.save(asistencia);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        asistenciaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Asistencia asistencia) {
        asistenciaService.update(asistencia);
    }
}