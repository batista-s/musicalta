package com.backend.musicalta.model.evento;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private Time horaAbertura;
    private Time horaEncerramento;
    @OneToOne
    private Atracao atracao;
}
