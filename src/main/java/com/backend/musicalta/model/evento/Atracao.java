package com.backend.musicalta.model.evento;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Atracao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private List<String> integrantes;
    private String website;
}
