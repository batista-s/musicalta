package com.backend.musicalta.model.entities.evento;

import com.backend.musicalta.model.entities.usuario.Funcionario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String titulo;
    private String descricao;
    @ManyToOne
    private Local local;
    @ManyToOne
    private Funcionario funcionario;
    @OneToMany
    @JoinColumn(name = "evento_id")
    private List<Data> datas = new ArrayList<>();
}
