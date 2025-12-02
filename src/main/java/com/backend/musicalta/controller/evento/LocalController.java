package com.backend.musicalta.controller.evento;

import com.backend.musicalta.model.entities.evento.Local;
import com.backend.musicalta.model.services.evento.LocalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais")
public class LocalController {
    private final LocalService localService;

    public LocalController(LocalService localService) {
        this.localService = localService;
    }

    @PostMapping
    public ResponseEntity<Local> create(@RequestBody @Valid Local local) {
        local = localService.create(local);
        return new ResponseEntity<>(local, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Local> update(@PathVariable int id, @RequestBody @Valid Local local) {
        Local localNew = localService.update(id, local);
        return new ResponseEntity<>(localNew, HttpStatus.OK);
    }

    @GetMapping
    public List<Local> list(){
        return localService.get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Local> get(@PathVariable int id){
        Local local = localService.get(id);
        return new ResponseEntity<>(local, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        localService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

