package com.backend.musicalta.model.services.evento;

import com.backend.musicalta.exceptions.EventoNotFoundException;
import com.backend.musicalta.model.entities.evento.Evento;
import com.backend.musicalta.model.repositories.evento.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public Evento create(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<Evento> get() {
        return eventoRepository.findAll();
    }

    public Evento get(int id) {
        Optional<Evento> evento = eventoRepository.findById(id);

        if (!evento.isPresent()) {
            throw new EventoNotFoundException(id);
        }
        return evento.get();
    }

    public Evento update(int id, Evento evento) {
        Evento eventoCad = get(id);
        eventoCad.setTitulo(evento.getTitulo());
        eventoCad.setDescricao(evento.getDescricao());
        eventoCad.setLocal(evento.getLocal());
        eventoCad.setFuncionario(evento.getFuncionario());
        eventoCad.setDatas(evento.getDatas());
        eventoRepository.save(eventoCad);
        return eventoCad;
    }

    public void delete(int id) {
        if (!eventoRepository.existsById(id)) {
            throw new EventoNotFoundException(id);
        }
        eventoRepository.deleteById(id);
    }
}
