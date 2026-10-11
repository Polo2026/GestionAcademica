package com.example.gestion_academica.presentation.controller;

import com.example.gestion_academica.aplicaciones.services.DocenteService;
import com.example.gestion_academica.domain.model.Docente;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

    private final DocenteService docenteService;

    public DocenteController(DocenteService docenteService) {
        this.docenteService = docenteService;
    }

    @GetMapping
    public List<Docente> findAll() {
        return docenteService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Docente> findById(@PathVariable Integer id) {
        return docenteService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Docente docente) {
        docenteService.save(docente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        docenteService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Docente docente) {
        docenteService.update(docente);
    }
}