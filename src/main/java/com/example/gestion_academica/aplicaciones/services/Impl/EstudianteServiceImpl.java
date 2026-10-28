package com.example.gestion_academica.aplicaciones.services.Impl;

import com.example.gestion_academica.aplicaciones.services.EstudianteService;
import com.example.gestion_academica.domain.model.Estudiante;
import com.example.gestion_academica.exception.EstudianteEncontradoException;
import com.example.gestion_academica.exception.EstudianteInvalidoException;
import com.example.gestion_academica.exception.EstudianteNoEncontradoException;
import com.example.gestion_academica.exception.EstudianteNullException;
import com.example.gestion_academica.infraestructura.repositorio.EstudianteRepository;
import com.sun.org.apache.bcel.internal.generic.IfInstruction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    //Codigo correcto

    public Estudiante save (Estudiante estudiante){
        if (estudiante==null){
            throw new EstudianteInvalidoException("Los datos del estudiante son Obligatorios");
        }
        Estudiante estudianteEncontrado = estudianteRepository.findById(estudiante.getId()).orElse(null);

        if (estudianteEncontrado != null){
            throw new EstudianteEncontradoException("El estudiante con ID "+ estudiante.getId()+" ya existe");
        }
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> findAll() {

        return estudianteRepository.findAll();



    }

    @Override
    public Optional<Estudiante> findById(Integer id) {
        return estudianteRepository.findById(id);
    }

    @Override
    //hacer validaciones con findById
    public void delete(Estudiante estudiante) {

        if (estudiante == null){
            throw new EstudianteNullException("Los datos del estudiante son Obligatorios");
        }

        Estudiante estudianteEncontrado = estudianteRepository.findById(estudiante.getId()).orElse(null);
        if(estudianteEncontrado == null){
            throw new EstudianteNoEncontradoException("Estudiante No encontrado");
        }
        estudianteRepository.deleteById(estudianteEncontrado);
    }

    @Override
    public void update(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }
}