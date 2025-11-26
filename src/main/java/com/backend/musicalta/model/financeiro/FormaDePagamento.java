package com.backend.musicalta.model.financeiro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
public class FormaDePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}

