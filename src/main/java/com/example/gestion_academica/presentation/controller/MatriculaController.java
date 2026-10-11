package com.example.gestion_academica.presentation.controller;


import com.example.gestion_academica.aplicaciones.services.MatriculaService;
import com.example.gestion_academica.domain.model.Matricula;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    public MatriculaController(MatriculaService matriculaService) {
        this.matriculaService = matriculaService;
    }

    @GetMapping
    public List<Matricula> findAll() {
        return matriculaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Matricula> findById(@PathVariable Integer id) {
        return matriculaService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Matricula matricula) {
        matriculaService.save(matricula);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        matriculaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Matricula matricula) {
        matriculaService.update(matricula);
    }
}