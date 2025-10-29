package com.backend.musicalta.model.financeiro;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String status;
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    @OneToOne
    private Reserva reserva;
    @OneToOne
    private FormaDePagamento formaDePagamento;
}
