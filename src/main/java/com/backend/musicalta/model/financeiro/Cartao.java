package com.backend.musicalta.model.financeiro;

import jakarta.persistence.Entity;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "Cartao")
public class Cartao extends  FormaDePagamento {
    private String numero;
    private String titular;
    private int cvv;
    private Date validade;
    private String metodo;
    private int parcelas;
}