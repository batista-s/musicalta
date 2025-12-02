package com.backend.musicalta.exceptions;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(int id) {
        super("Data " + id + " não encontrada!");
    }
}
