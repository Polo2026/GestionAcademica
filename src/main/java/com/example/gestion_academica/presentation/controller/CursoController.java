package com.example.gestion_academica.presentation.controller;


import com.example.gestion_academica.aplicaciones.services.CursoService;
import com.example.gestion_academica.domain.model.Curso;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> findAll() {
        return cursoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Curso> findById(@PathVariable Integer id) {
        return cursoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Curso curso) {
        cursoService.save(curso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        cursoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Curso curso) {
        cursoService.update(curso);
    }
}