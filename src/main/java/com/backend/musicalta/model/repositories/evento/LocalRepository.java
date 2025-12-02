package com.backend.musicalta.model.repositories.evento;

import com.backend.musicalta.model.entities.evento.Local;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalRepository extends JpaRepository<Local, Integer> {
}

