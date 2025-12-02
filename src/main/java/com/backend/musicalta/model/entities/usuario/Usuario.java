package com.backend.musicalta.model.entities.usuario;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
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
