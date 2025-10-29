package com.backend.musicalta.model.evento;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String logradouro;
    private String tipoLogradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
}
