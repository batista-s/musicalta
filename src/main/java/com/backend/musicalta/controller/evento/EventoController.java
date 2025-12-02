package com.backend.musicalta.controller.evento;

import com.backend.musicalta.model.entities.evento.Evento;
import com.backend.musicalta.model.services.evento.EventoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @PostMapping
    public ResponseEntity<Evento> create(@RequestBody @Valid Evento evento) {
        evento = eventoService.create(evento);
        return new ResponseEntity<>(evento, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> update(@PathVariable int id, @RequestBody @Valid Evento evento) {
        Evento eventoNew = eventoService.update(id, evento);
        return new ResponseEntity<>(eventoNew, HttpStatus.OK);
    }

    @GetMapping
    public List<Evento> list(){
        return eventoService.get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> get(@PathVariable int id){
        Evento evento = eventoService.get(id);
        return new ResponseEntity<>(evento, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        eventoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
