package com.backend.musicalta.model.entities.usuario;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue(value = "Funcionario")
public class Funcionario extends Usuario {
}
