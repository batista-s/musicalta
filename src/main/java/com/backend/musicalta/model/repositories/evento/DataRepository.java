package com.backend.musicalta.model.repositories.evento;

import com.backend.musicalta.model.entities.evento.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data,Integer> {
}
