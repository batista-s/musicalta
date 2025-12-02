package com.backend.musicalta.model.entities.financeiro;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "Pix")
public class Pix extends FormaDePagamento {
    private String codigo;
    @Temporal(TemporalType.DATE)
    private Date validadeCodigo;
}

