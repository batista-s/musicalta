package com.backend.musicalta.model.entities.financeiro;

import com.backend.musicalta.model.entities.evento.Ingresso;
import com.backend.musicalta.model.entities.usuario.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
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
    @OneToOne
    @JoinColumn(name = "reserva_id")
    private Pagamento pagamento;
}
