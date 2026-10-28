package com.example.gestion_academica.exception;

public class EstudianteNullException extends RuntimeException {

    public EstudianteNullException(String message) {
        super(message);//Aquí lee el msj - se puede modificar
    }
}
