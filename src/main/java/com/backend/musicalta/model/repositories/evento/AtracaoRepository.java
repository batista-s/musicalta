package com.backend.musicalta.model.repositories.evento;

import com.backend.musicalta.model.entities.evento.Atracao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtracaoRepository extends JpaRepository<Atracao, Integer> {
}
