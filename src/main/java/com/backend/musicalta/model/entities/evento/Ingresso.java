package com.backend.musicalta.model.entities.evento;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String codigo;
    private double valor;
    @Enumerated(EnumType.STRING)
    private StatusIngresso status;
    @ManyToOne
    private Evento evento;
    @ManyToOne
    @JoinColumn(name = "assento_id")
    private Assento assento;
}
