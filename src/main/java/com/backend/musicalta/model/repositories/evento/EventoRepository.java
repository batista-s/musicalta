package com.backend.musicalta.model.repositories.evento;

import com.backend.musicalta.model.entities.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Integer> {
}
