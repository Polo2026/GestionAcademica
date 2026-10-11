package com.example.gestion_academica.presentation.controller;

import com.example.gestion_academica.aplicaciones.services.NotaService;
import com.example.gestion_academica.domain.model.Nota;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    private final NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public List<Nota> findAll() {
        return notaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Nota> findById(@PathVariable Integer id) {
        return notaService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Nota nota) {
        notaService.save(nota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        notaService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Nota nota) {
        notaService.update(nota);
    }
}