package com.backend.musicalta.model.financeiro;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

@Entity
@DiscriminatorValue(value = "Pix")
public class Pix extends FormaDePagamento {
    private String codigo;
    @Temporal(TemporalType.DATE)
    private Date validadeCodigo;
}

