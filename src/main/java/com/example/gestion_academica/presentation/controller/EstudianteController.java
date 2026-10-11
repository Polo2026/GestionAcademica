package com.example.gestion_academica.presentation.controller;



import com.example.gestion_academica.aplicaciones.services.EstudianteService;
import com.example.gestion_academica.domain.model.Estudiante;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping
    public List<Estudiante> findAll() {
        return estudianteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Estudiante> findById(@PathVariable Integer id) {
        return estudianteService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Estudiante estudiante) {
        estudianteService.save(estudiante);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        estudianteService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Estudiante estudiante) {
        estudianteService.update(estudiante);
    }
}