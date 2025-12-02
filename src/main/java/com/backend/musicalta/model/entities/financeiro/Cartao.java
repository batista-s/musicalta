package com.backend.musicalta.model.entities.financeiro;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "Cartao")
public class Cartao extends  FormaDePagamento {
    private String numero;
    private String titular;
    private int cvv;
    private Date validade;
    private String metodo;
    private int parcelas;
}