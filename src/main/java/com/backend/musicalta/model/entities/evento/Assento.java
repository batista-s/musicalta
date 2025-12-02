package com.backend.musicalta.model.entities.evento;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int numero;
    private int fileira;
    private int setor;
    private int status;
}
