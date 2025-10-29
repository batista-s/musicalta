package com.backend.musicalta.model.financeiro;

import com.backend.musicalta.model.evento.Ingresso;
import com.backend.musicalta.model.usuario.Cliente;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Temporal(TemporalType.DATE)
    private Date dataReserva;
    private double valorTotal;
    @ManyToOne
    private Cliente cliente;
    @OneToMany
    private List<Ingresso> ingressos = new ArrayList<>();
}
