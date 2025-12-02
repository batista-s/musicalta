package com.backend.musicalta.exceptions;

public class AtracaoNotFoundException extends RuntimeException {
    public AtracaoNotFoundException(int id) {
        super("Atração " + id + " não encontrada!");
    }
}
