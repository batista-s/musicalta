package com.backend.musicalta.model.evento;

import jakarta.persistence.*;

@Entity
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numero;
    private int fileira;
    private int setor;
    private int status;
}
