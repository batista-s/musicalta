package com.backend.musicalta.model.evento;

import com.backend.musicalta.model.usuario.Funcionario;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
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
