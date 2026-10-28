package com.example.gestion_academica.presentation.controller;



import com.example.gestion_academica.aplicaciones.services.EstudianteService;
import com.example.gestion_academica.domain.model.Estudiante;
import com.example.gestion_academica.exception.EstudianteEncontradoException;
import com.example.gestion_academica.exception.EstudianteInvalidoException;
import com.example.gestion_academica.exception.EstudianteNoEncontradoException;
import com.example.gestion_academica.exception.EstudianteNullException;
import org.springframework.web.bind.annotation.*;

import java.util.IdentityHashMap;
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
        try {
            estudianteService.save(estudiante);
        }catch (EstudianteInvalidoException exception){
            System.out.println(exception.getMessage());
        }catch (EstudianteNoEncontradoException exception){
            System.out.println(exception.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        try {
            estudianteService.delete(id);
        }catch (EstudianteNullException exception){
            System.out.println(exception.getMessage());
        }catch (EstudianteNoEncontradoException exception){
            System.out.println(exception.getMessage());
        }
    }

    @PutMapping
    public void update(@RequestBody Estudiante estudiante) {
        estudianteService.update(estudiante);
    }
}