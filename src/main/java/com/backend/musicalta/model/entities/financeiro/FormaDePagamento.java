package com.backend.musicalta.model.entities.financeiro;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "classe")
public class FormaDePagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}

