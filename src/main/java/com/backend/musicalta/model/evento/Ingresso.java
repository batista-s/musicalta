package com.backend.musicalta.model.evento;

import com.backend.musicalta.model.financeiro.Reserva;
import jakarta.persistence.*;

@Entity
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
}

