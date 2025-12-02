package com.backend.musicalta.exceptions;

public class EventoNotFoundException extends RuntimeException {
    public EventoNotFoundException(int id) {
        super("Evento " + id + " não encontrado!");
    }
}
