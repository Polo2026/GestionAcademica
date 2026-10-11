package com.example.gestion_academica.presentation.controller;



import com.example.gestion_academica.aplicaciones.services.TelefonoService;
import com.example.gestion_academica.domain.model.Telefono;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/telefonos")
public class TelefonoController {

    private final TelefonoService telefonoService;

    public TelefonoController(TelefonoService telefonoService) {
        this.telefonoService = telefonoService;
    }

    @GetMapping
    public List<Telefono> findAll() {
        return telefonoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Telefono> findById(@PathVariable Integer id) {
        return telefonoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Telefono telefono) {
        telefonoService.save(telefono);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        telefonoService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody Telefono telefono) {
        telefonoService.update(telefono);
    }
}