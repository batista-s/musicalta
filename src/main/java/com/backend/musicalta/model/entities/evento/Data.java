package com.backend.musicalta.model.entities.evento;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date data;
    @Temporal(TemporalType.TIME)
    private Time horaAbertura;
    @Temporal(TemporalType.TIME)
    private Time horaEncerramento;
    @OneToOne
    private Atracao atracao;
}
