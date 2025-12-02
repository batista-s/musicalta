package com.backend.musicalta.model.entities.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
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
