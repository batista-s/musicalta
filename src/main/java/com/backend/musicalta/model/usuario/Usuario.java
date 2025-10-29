package com.backend.musicalta.model.usuario;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    @Column(unique = true)
    private String email;
    private String senha;
    private String telefone;
    @Temporal(TemporalType.DATE)
    private Date dataDeCriacao;
    private String cpf;
}
