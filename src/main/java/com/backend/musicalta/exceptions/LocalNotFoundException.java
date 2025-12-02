package com.backend.musicalta.exceptions;

public class LocalNotFoundException extends RuntimeException {
    public LocalNotFoundException(int id) {
        super("Local " + id + " não encontrado!");
    }
}

