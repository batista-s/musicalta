package com.backend.musicalta.controller.evento;

import com.backend.musicalta.model.entities.evento.Atracao;
import com.backend.musicalta.model.services.evento.AtracaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atracoes")
public class AtracaoController {
    private final AtracaoService atracaoService;

    public AtracaoController(AtracaoService atracaoService) {
        this.atracaoService = atracaoService;
    }

    @PostMapping
    public ResponseEntity<Atracao> create(@RequestBody @Valid Atracao atracao) {
        atracao = atracaoService.create(atracao);
        return new ResponseEntity<>(atracao, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Atracao> update(@PathVariable int id, @RequestBody @Valid Atracao atracao) {
        Atracao atracaoNew = atracaoService.update(id, atracao);
        return new ResponseEntity<>(atracaoNew, HttpStatus.OK);
    }


    @GetMapping
    public List<Atracao> list(){
        return atracaoService.get();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Atracao> get(@PathVariable int id){
        Atracao atracao = atracaoService.get(id);
        return new ResponseEntity<>(atracao, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        atracaoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
